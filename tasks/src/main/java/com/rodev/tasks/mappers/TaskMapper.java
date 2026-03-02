package com.rodev.tasks.mappers;

import com.rodev.tasks.domain.dto.TaskDto;
import com.rodev.tasks.domain.entities.Task;
import com.rodev.tasks.domain.entities.TaskList;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}
