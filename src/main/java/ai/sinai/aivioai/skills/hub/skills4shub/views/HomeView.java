package ai.sinai.aivioai.skills.hub.skills4shub.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {

        add(new H1("Welcome to Skills4SHub application!"));
        add(new Paragraph("This is the home view"));

        add(new Paragraph("You can edit this view in src/main/java/ai/sinai/aivioai/skills/hub/skills4shub/views/HomeView.java"));

    }
}
