# Requirements

## Functional Requirements (FR)

| ID     | Title                      | User Story                                                                                      | Priority | Status |
|--------|----------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|----------|--------|
| FR-001 | Browse Skills Catalog      | As a Public user, I want to browse the skills catalog so that I can discover available scientific skills.                                              | High     | Open   |
| FR-002 | Search Skills              | As a Public user, I want to search skills by topic, author, or keyword so that I can find relevant skills quickly.                                    | High     | Open   |
| FR-003 | Filter Skills by Status    | As a Public user, I want to filter skills by verification status so that I can identify trusted skills.                                                 | High     | Open   |
| FR-004 | View Skill Details         | As a Public user, I want to view skill details including purpose, authorship, and trust level so that I understand what each skill does.               | High     | Open   |
| FR-005 | Download Skills            | As a Public user, I want to download skills for scientific purposes so that I can use them with my workflows.                                           | High     | Open   |
| FR-006 | View Download Statistics   | As an Administrator, I want to view download statistics including anonymous downloads so that I can analyze platform usage patterns.                      | Medium   | Open   |
| FR-007 | View Skill Comments        | As a Public user, I want to view community comments on skills so that I can understand user feedback.                                                   | Medium   | Open   |
| FR-008 | Write Skill Comment        | As a Public user, I want to write skill comments so that I can share feedback with the community.                                                      | Low      | Open   |
| FR-009 | Upload Skills              | As a skills provider, I want to upload skills to the application so that they are available to other users.                                             | High     | Open   |
| FR-010 | Submit Skills for Verification | As a skills provider, I want to submit skills for verification so that they can be validated by verifiers.                                           | High     | Open   |
| FR-011 | Manage Skill Versions      | As a skills provider, I want to upload new versions of existing skills so that the skill history is maintained.                                        | High     | Open   |
| FR-012 | Verify Skills              | As a verifier, I want to check and validate skills uploaded by others so that the catalog maintains quality.                                            | High     | Open   |
| FR-013 | Add Verification Notes     | As a verifier, I want to add notes when verifying skills so that providers understand feedback.                                                         | Medium   | Open   |
| FR-014 | Admin Dashboard            | As an administrator, I want a real-time overview of all downloads so that I can monitor platform usage.                                                 | High     | Open   |
| FR-015 | Manage Users               | As an administrator, I want to create member accounts manually so that only authorized users can access the system.                                     | High     | Open   |
| FR-016 | Manage Catalog             | As an administrator, I want to manage the catalog so that it remains well-organized and relevant.                                                       | Medium   | Open   |
| FR-017 | Access Admin Screens       | As an administrator, I want to access administrator-only screens so that I can perform administrative tasks.                                            | High     | Open   |
| FR-018 | View Active Skills         | As an administrator, I want a clear overview of active skills so that I can monitor the catalog content.                                                | Medium   | Open   |
| FR-019 | Filter Skills by Category  | As a Public user, I want to filter skills by category so that I can find skills related to specific scientific domains.                                | Medium   | Open   |
| FR-020 | View Skill Author          | As a Public user, I want to view the author of each skill so that I can identify trusted contributors.                                                  | Low      | Open   |
| FR-021 | Login to Account           | As a registered member, I want to login so that I can access protected features like uploading and commenting.                                         | High     | Open   |
| FR-022 | View All Downloads         | As an Administrator, I want to view all skill download statistics so that I can analyze platform usage patterns.                                        | Medium   | Open   |

## Non-Functional Requirements (NFR)

| ID      | Title              | Requirement                                                   | Category     | Priority | Status |
|---------|--------------------|---------------------------------------------------------------|--------------|----------|--------|
| NFR-001 | Response Time      | All page loads must complete within 2 seconds.                | Performance  | High     | Open   |
| NFR-002 | Availability       | System must maintain 99.5% uptime during business hours.      | Availability | High     | Open   |
| NFR-003 | Concurrent Users   | System must support 50 concurrent users without degradation.  | Scalability  | Medium   | Open   |
| NFR-004 | Data Encryption    | All user data in transit must use TLS 1.3 encryption.         | Security     | High     | Open   |
| NFR-005 | Access Control     | Admin-only screens must be accessible only by administrators. | Security     | High     | Open   |
| NFR-006 | Data Retention     | Download history must be retained for at least 12 months.     | Availability | Medium   | Open   |
| NFR-007 | Search Performance | Catalog search must return results within 3 seconds.          | Performance  | Medium   | Open   |
| NFR-008 | Code Integrity     | Downloaded skills must be immutable after verification.       | Security     | High     | Open   |
| NFR-009 | Versioning         | Skill versions must be preserved and traceable.               | Maintainability | High     | Open   |

## Constraints (C)

| ID    | Title                      | Constraint                                                                | Category  | Priority | Status |
|-------|----------------------------|---------------------------------------------------------------------------|-----------|----------|--------|
| C-001 | No Payment Handling        | This first version does not include payment handling.                     | Business  | High     | Open   |
| C-002 | Single Branch Support      | System supports only one deployment branch for this version.              | Technical | High     | Open   |
| C-003 | Manual User Accounts       | Member accounts must be created manually by administrators.               | Business  | High     | Open   |
| C-004 | No Self-Service Signup     | Self-service sign-up, password reset, and social login are not included.  | Business  | High     | Open   |
| C-005 | Scientific Focus           | Skills are targeted at scientific platforms (ESA, NASA, IVOA).            | Business  | Medium   | Open   |
| C-006 | Small and Maintainable     | System must remain small and easy to maintain.                            | Technical | High     | Open   |

## Requirement Quality Checks

| Check       | Rule                                 | Bad Example                          | Good Example                  |
|-------------|--------------------------------------|--------------------------------------|-------------------------------|
| Measurable  | NFRs must have a number or threshold | "System should be fast"              | "Pages load within 2 seconds" |
| Singular    | One requirement per row              | "System must log in and export data" | Split into FR-001 and FR-002  |
| Unambiguous | No subjective terms                  | "User-friendly interface"            | "WCAG 2.1 AA compliant"       |
| Testable    | Can write a pass/fail test           | "System is reliable"                 | "99.5% uptime over 30 days"   |
| Unique IDs  | No duplicate IDs across all tables   | Two FR-001 entries                   | Each ID used exactly once     |

## Requirements Traceability

| ID     | Related Requirements                                                  |
|-------- | --------------------------------------------------|
| FR-001 | FR-003, FR-004, FR-005, FR-006, FR-007, FR-008                        |
| FR-002 | FR-001, FR-019                                                        |
| FR-003 | FR-004, FR-005                                                        |
| FR-009 | FR-010, FR-011, FR-021                                                |
| FR-012 | FR-010, FR-011, FR-013                                                |
| FR-014 | FR-015, FR-016, FR-017, FR-018, FR-022                                |
| NFR-001 | NFR-002, NFR-003, NFR-007                                             |
| NFR-004 | NFR-005, NFR-008                                                      |

## Status Legend

- **Open** - Requirement is pending implementation
- **In Progress** - Requirement is being implemented
- **Review** - Requirement is under review
- **Done** - Requirement is implemented and verified

## Change History

| Date       | Version | Author | Changes                                    |
|------|---------|--------|--------------------------------------------|
| 2026-06-30 | 1.1     | AI     | Updated FR-001-FR-008 for Public user access; Updated FR-019-FR-020 for Public access; Added FR-021-FR-022; Fixed NFR-009 category |
| 2026-06-30 | 1.0     | AI     | Initial requirements document based on vision |
