# SSD Template

## 1. Configure Environment on macOS

Set up Java and Testcontainers environment variables:

```bash
sdk use java 25.0.3-tem

export DOCKER_HOST="unix://$HOME/.rd/docker.sock"
export TESTCONTAINERS_DOCKER_SOCKET_OVERRIDE=/var/run/docker.sock
export TESTCONTAINERS_HOST_OVERRIDE=$(rdctl info --field ip-address)
```

To unset the Testcontainers host override:

```bash
unset TESTCONTAINERS_HOST_OVERRIDE
```

---

## 2. Remove the `TestContainersConfiguration` Class

Delete the `TestContainersConfiguration` class if it exists in the project.

---

## 3. Configure Testcontainers in the Main Test Class

Update your main test class:

```java
import org.springframework.boot.SpringApplication;
import org.testcontainers.postgresql.PostgreSQLContainer;

public class TestSkills4shubApplication {

    static final PostgreSQLContainer<?> postgres;

    static {
        postgres = new PostgreSQLContainer<>("postgres:17-alpine");
        postgres.start();

        System.setProperty("spring.datasource.url", postgres.getJdbcUrl());
        System.setProperty("spring.datasource.username", postgres.getUsername());
        System.setProperty("spring.datasource.password", postgres.getPassword());
    }

    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");

        SpringApplication.from(AiupPetclinicApplication::main)
                .run(args);
    }
}
```

---

## 4. Run the Application

```bash
./mvnw spring-boot:test-run
```

---

# Cleanup

## Clean Maven build

```bash
mvn clean
```

## Check running PostgreSQL containers

```bash
docker ps -a | grep postgres
```

## Remove PostgreSQL containers

```bash
docker rm -f $(docker ps -aq --filter ancestor=postgres)
```
