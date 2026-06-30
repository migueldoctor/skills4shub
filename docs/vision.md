# Vision: Skills4SHub

## Problem

Skills—based on the Anthropic standard for agent capabilities—are emerging as reusable, shareable abilities packaged as markdown files that agents can load to perform specialized tasks. While this openness makes it easy for anyone to create and distribute Skills, it also introduces a significant challenge: there is no inherent guarantee of safety or quality, meaning Skills could potentially contain harmful or malicious code. This creates a need for a trusted registry where Skills can be stored, reviewed, and certified through some form of verification or governance process. In practice, users, especially in complex domains like scientific research, often struggle to discover relevant Skills because there is no centralized hub or consistent search structure, leading to fragmentation and duplication. To be truly usable at scale, Skills would also need to be presented in a well-organized catalog that clearly communicates their purpose, authorship, and trust level, alongside practical metadata such as intended use cases and example invocations, so users can quickly understand what each Skill does and how to apply it effectively.

## Solution

SKILL4S is a  web application that lets members search the catalog, access and download skills for scientific purposes. Users can see all downloads and how many times it has been downloaded along with comments from the community. SKILL4S allows to upload skills, that will store version, date and authorship. It is something like docker hub but for scientific skills.


## Target Users

- **Members**: people who search and download skills. They want to find skills related to scientific topics like ESA or NASA archives or IVOA (Virtual Observatory) platforms. Each member has a user account they sign in with.
- **Skills Providers**: People who create and upload skills to the application (SKILL4S). They can be Members of the platform too.
- **Verifiers**: They are members of the most important scientific organizations and can check and validate SKILLS uploaded by others.
- **SKILL4S Administrator**: the person who manages the platform, the catalog and helps members. Wants a clear
  overview of active skills. The SKILL4S Admin signs in with their own user account.

## Goals

- Make searching and finding relevant skills easy.
- Give members a self service way to find verified skills to download and to interact to scientific platforms.
- Give the SKILL4S Administrators a real time view of all downloads.
- Keep the system small and easy to maintain.
- Give Skills Providers to upload or create Skills. It should support different versions for the skills. A new version will be created and upload a new version or editing a existing one.
- Make sure every action is tied to a known user, and that administrator-only screens are reachable only by administrator of SKILL4S.

## Non Goals

- No payment handling for this first version.
- No multi branch support.
- No self service sign-up, password reset, or social login. The Administrator creates member accounts manually for this first version.