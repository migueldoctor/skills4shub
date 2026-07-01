package ai.sinai.aivioai.skills.hub.skills4shub.views;

import ai.sinai.aivioai.skills.hub.skills4shub.database.dto.SkillDto;
import ai.sinai.aivioai.skills.hub.skills4shub.database.repositories.SkillRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.data.provider.ListDataProvider;

import java.util.List;

/**
 * View for browsing the skills catalog.
 * Public users can view skills with PENDING or VERIFIED status.
 */
@Route("skills")
public class SkillListView extends VerticalLayout {

    private final SkillRepository skillRepository;
    private final Grid<SkillDto> skillGrid;

    public SkillListView(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
        this.skillGrid = new Grid<>();

        configureGrid();
        updateSkillList();

        add(createHeader(), skillGrid);
    }

    private void configureGrid() {
        skillGrid.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS);
        skillGrid.setHeightFull();
        skillGrid.addColumn(SkillDto::title).setHeader("Title").setKey("title");
        skillGrid.addColumn(SkillDto::authorName).setHeader("Author").setKey("author");
        skillGrid.addColumn(SkillDto::verificationStatus).setHeader("Status").setKey("status");
        skillGrid.addColumn(SkillDto::createdAt).setHeader("Created").setKey("createdAt");
        skillGrid.setSelectionMode(Grid.SelectionMode.SINGLE);
    }

    private void updateSkillList() {
        List<SkillDto> skills = skillRepository.findAllWithAuthors();

        if (skills.isEmpty()) {
            add(new Paragraph("No skills available in the catalog. Skills providers are encouraged to contribute!"));
        } else {
            skillGrid.setDataProvider(new ListDataProvider<>(skills));
        }
    }

    private VerticalLayout createHeader() {
        VerticalLayout header = new VerticalLayout();
        header.add(new H2("Skills Catalog"));
        header.add(new Paragraph("Browse and discover available scientific skills"));
        return header;
    }
}
