# UC-001: User Authentication

## Overview

| Property | Value |
|----------|-------|
| **ID** | UC-001 |
| **Title** | User Authentication |
| **Primary Actor** | Member |
| **Goal** | Sign in to the system with a user account so that actions are tracked |
| **Status** | Done |

## Preconditions

1. The user has a valid account created by an administrator (C-003, C-004)
2. The user has received their credentials from the administrator

## Main Success Scenario

1. Member navigates to the login screen
2. Member enters their username and password
3. System validates credentials against the user database
4. System authenticates the member and creates a session
5. System redirects member to their dashboard

## Alternative Flows

### Invalid Credentials

- **Trigger**: Step 3
- **Description**: System detects invalid username or password

1. System displays error message "Invalid username or password"
2. System prompts member to re-enter credentials
3. Return to step 2 of main success scenario

### Account Not Found

- **Trigger**: Step 3
- **Description**: Username does not exist in the system

1. System displays error message "Account not found"
2. System prompts member to contact an administrator
3. End use case

## Postconditions

### Success

1. Member is logged in and has an active session
2. System records the login timestamp for the member
3. Member can access system features appropriate to their role

### Failure

1. No session is created
2. System logs the failed authentication attempt
3. Member remains on the login screen

## Business Rules

| ID | Rule |
|----|------|
| BR-001 | Password must be at least 8 characters |
| BR-002 | Account must be activated by an administrator before first login |
| BR-003 | Failed login attempts are logged for security monitoring |
