package ai.sinai.aivioai.skills.hub.skills4shub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
@StyleSheet("styles.css")
public class Skills4shubApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(Skills4shubApplication.class, args);
	}

}
