package com.rodev.tasks.domain.dto;

import java.util.List;
import java.util.UUID;

public record TaskListDto(
        UUID id,
        String title,
        String description,
        Integer count,                          //computed field
        Double progress,                        //computed field
        List<TaskDto> tasks
) {
}
