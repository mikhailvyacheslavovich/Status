package ru.inobitec.status.mappers;

import org.apache.ibatis.annotations.Mapper;
import ru.inobitec.status.model.Statuses;

@Mapper
public interface StatusMapper {
    void changeStatus(Statuses status);
}
