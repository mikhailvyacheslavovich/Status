package ru.inobitec.status.mappers;

import org.apache.ibatis.annotations.Mapper;
import ru.inobitec.status.model.StatusEntity;

@Mapper
public interface StatusMapper {
    void changeStatus(StatusEntity status);
}
