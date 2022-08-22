package ru.inobitec.status.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import ru.inobitec.status.mappers.StatusMapper;
import ru.inobitec.status.model.StatusEntity;
import ru.inobitec.status.repository.StatusRepository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class StatusRepositoryImpl implements StatusRepository {

    private final StatusMapper statusMapper;

    @Override
    public void changeStatus(StatusEntity status) {
        try{
            statusMapper.changeStatus(status);
        }catch(RuntimeException ex){
            log.error(ex.getMessage());
        }
    }
}
