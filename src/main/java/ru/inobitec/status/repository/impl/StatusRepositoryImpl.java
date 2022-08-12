package ru.inobitec.status.repository.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.inobitec.status.mappers.StatusMapper;
import ru.inobitec.status.model.StatusEntity;
import ru.inobitec.status.repository.StatusRepository;

@Repository
@RequiredArgsConstructor
public class StatusRepositoryImpl implements StatusRepository {
    @Autowired
    private final StatusMapper statusMapper;

    @Override
    public void changeStatus(StatusEntity status) {
        statusMapper.changeStatus(status);
    }
}
