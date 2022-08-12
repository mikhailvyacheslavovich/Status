package ru.inobitec.status.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class StatusEntity {
    private Long id;
    private String statusName;
}
