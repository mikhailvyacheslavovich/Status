package ru.inobitec.status.repository.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.inobitec.status.mappers.StatusMapper;
import ru.inobitec.status.model.StatusEntity;
import ru.inobitec.status.repository.StatusRepository;

@Repository
@RequiredArgsConstructor
public class StatusRepositoryImpl implements StatusRepository {

    private final StatusMapper statusMapper;

    @Override
    public void changeStatus(StatusEntity status) {
        statusMapper.changeStatus(status);
    }
}
