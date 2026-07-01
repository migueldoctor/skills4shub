package ai.sinai.aivioai.skills.hub.skills4shub.database.dto;

import java.time.LocalDateTime;

/**
 * DTO for skill data including author information.
 */
public record SkillDto(
        Long id,
        String title,
        String description,
        String authorName,
        String verificationStatus,
        LocalDateTime createdAt
) {
}
