package ai.sinai.aivioai.skills.hub.skills4shub.database.repositories;

import ai.sinai.aivioai.skills.hub.skills4shub.database.dto.SkillDto;
import ai.sinai.aivioai.skills.hub.skills4shub.database.tables.records.SkillRecord;
import org.jooq.DSLContext;
import org.jooq.Records;
import org.jooq.types.YearToSecond;
import org.springframework.stereotype.Repository;
import ai.sinai.aivioai.skills.hub.skills4shub.database.tables.Skill;
import ai.sinai.aivioai.skills.hub.skills4shub.database.tables.User;

import java.time.LocalDateTime;
import java.util.List;

import static ai.sinai.aivioai.skills.hub.skills4shub.database.Public.PUBLIC;
import static ai.sinai.aivioai.skills.hub.skills4shub.database.tables.Skill.SKILL;
import static ai.sinai.aivioai.skills.hub.skills4shub.database.tables.User.USER;

/**
 * Repository for skill-related database operations.
 */
@Repository
public class SkillRepository {

    private final DSLContext ctx;

    public SkillRepository(DSLContext ctx) {
        this.ctx = ctx;
    }

    /**
     * Retrieves all skills with their author information.
     * Only skills with PENDING or VERIFIED status are returned.
     *
     * @return list of skill DTOs
     */
    public List<SkillDto> findAllWithAuthors() {
        return ctx.select(
                        SKILL.ID,
                        SKILL.TITLE,
                        SKILL.DESCRIPTION,
                        USER.FIRST_NAME.concat(" ").concat(USER.LAST_NAME).as("authorName"),
                        SKILL.VERIFICATION_STATUS,
                        SKILL.CREATED_AT
                )
                .from(SKILL)
                .join(USER)
                .on(SKILL.AUTHOR_ID.eq(USER.ID))
                .where(SKILL.VERIFICATION_STATUS.in("PENDING", "VERIFIED"))
                .orderBy(SKILL.CREATED_AT.desc())
                .fetch(Records.mapping(SkillDto::new));
    }

    /**
     * Retrieves a skill by its ID with author information.
     *
     * @param skillId the skill ID
     * @return optional skill DTO or empty if not found
     */
    public SkillDto findByIdWithAuthor(Long skillId) {
        return ctx.select(
                        SKILL.ID,
                        SKILL.TITLE,
                        SKILL.DESCRIPTION,
                        USER.FIRST_NAME.concat(" ").concat(USER.LAST_NAME).as("authorName"),
                        SKILL.VERIFICATION_STATUS,
                        SKILL.CREATED_AT
                )
                .from(SKILL)
                .join(USER)
                .on(SKILL.AUTHOR_ID.eq(USER.ID))
                .where(SKILL.ID.eq(skillId))
                .fetchOptional(Records.mapping(SkillDto::new))
                .orElse(null);
    }
}
