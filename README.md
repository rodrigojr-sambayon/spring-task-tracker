# Task Tracker
----
## Brief Summary
The Task Tracker App is designed to help users organize their daily tasks, set priorities, and track their progress.

This application will provide a user-friendly way for creating, managing and completing tasks, helping users to increase their productivity and stay organized.

## Definitions

### Task
A task is a specific action item or to-do that a user wants to complete. It typically includes a title, description, due date and priority level.

### Task List
A task list is a collection of related tasks, grouped together for organizational purposes.


## User Stories
---
### Group Tasks into Task Lists
**As a** project manager
**I want** to be able to create multiple task lists for different projects
**So that I** can keep tasks organized and separate

#### Acceptance Criteria
1. A user can create task lists which can contain tasks.
2. Each task list should have a title and optional description.

### Update Task Lists
**As a** project manager
**I want** to be able to update a task list's name
**So that I** can ensure task lists names remain relevant

#### Acceptance Criteria
1. A user can update task lists name and description.

### Delete Task Lists
**As a** project manager
**I want** to be able to delete a task lists I no longer need, or have created by mistake
**So that I** can ensure task lists names remain relevant

#### Acceptance Criteria
1. A user can delete task lists.


### Capture Task
**As a** busy professional
**I want** to be able to quickly add new tasks to my list
**So that I** can capture all my responsibilities without losing focus on my current work

#### Acceptance Criteria
1. A user can create new tasks on a task list.
2. Each task should have a title, optional description, due date, and priority level.

### Update Tasks
**As a** user with a busy schedule
**I want** to be able to quickly adjust the title, description, due date and priority level of my tasks
**So that I** can focus on what's most important.

#### Acceptance Criteria
1. A user should be able to edit tasks.

### Delete Tasks
**As a** user prone to making mistakes
**I want** to be able to quickly delete tasks I have created by mistake
**So that I** my task list of tasks us correct

#### Acceptance Criteria
1. A user should be able to delete tasks.

### Complete Tasks
**As a** productive user
**I want** to be able to mark tasks as complete
**So that I** know which tasks I have completed and can focus on the next task I need to complete

#### Acceptance Criteria
1. A user should be able to mark tasks as complete.


### Task Completion Progress
**As a** productive user
**I want** to be able to see my tasks list's task completion progress
**So that I** can stay motivated and understand mu productivity

#### Acceptance Criteria
1. Users are informed of their completion percentage of tasks in a task list.

---

## API Endpoints


| GET    | /task-lists                                | List Task Lists     |
| ------ | ------------------------------------------ | ------------------- |
| POST   | /task-lists                                | Create Task Lists   |
| GET    | /task-lists/{task_list_id}                 | Get Task List by ID |
| PUT    | /task-lists/{task_list_id}                 | Update Task List    |
| DELETE | /task-lists/{task_list_id}                 | Delete Task List    |
|        |                                            |                     |
| GET    | /task-lists/{task_list_id}/tasks           | List Tasks          |
| POST   | /task-lists/{task_list_id}/tasks           | Create Task         |
| GET    | /task-lists/{task_list_id}/tasks/{task_id} | Get Task by ID      |
| PUT    | /task-lists/{task_list_id}/tasks/{task_id} | Update Task         |
| DELETE | /task-lists/{task_list_id}/tasks/{task_id} | Delete Task         |



