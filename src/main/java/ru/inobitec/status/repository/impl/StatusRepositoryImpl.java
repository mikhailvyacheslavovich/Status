package ru.inobitec.status.repository.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.inobitec.status.mappers.StatusMapper;
import ru.inobitec.status.model.Statuses;

@Repository
@RequiredArgsConstructor
public class StatusRepositoryImpl implements StatusMapper {

    private final StatusMapper statusMapper;

    @Override
    public void changeStatus(Statuses status) {
        statusMapper.changeStatus(status);
    }
}
