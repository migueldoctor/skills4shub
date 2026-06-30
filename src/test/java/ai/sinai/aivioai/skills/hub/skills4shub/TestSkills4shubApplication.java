package ai.sinai.aivioai.skills.hub.skills4shub;

import org.springframework.boot.SpringApplication;
import org.testcontainers.postgresql.PostgreSQLContainer;

class TestSkills4shubApplication {

	static final PostgreSQLContainer postgres;

    static {
        postgres = new org.testcontainers.postgresql.PostgreSQLContainer("postgres:17-alpine");
        postgres.start();
        System.setProperty("spring.datasource.url", postgres.getJdbcUrl());
        System.setProperty("spring.datasource.username", postgres.getUsername());
        System.setProperty("spring.datasource.password", postgres.getPassword());
    }

    public static void main(String[] args) {
       // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.from(Skills4shubApplication::main)
                .run(args);
    }
}
