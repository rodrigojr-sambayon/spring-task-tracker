package com.rodev.tasks.mappers;

import com.rodev.tasks.domain.dto.TaskListDto;
import com.rodev.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
