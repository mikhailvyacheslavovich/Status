package ru.inobitec.status.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.inobitec.status.model.Statuses;
import ru.inobitec.status.mappers.StatusMapper;
import ru.inobitec.status.service.StatusService;

@Component
@RequiredArgsConstructor
public class StatusServiceImpl implements StatusService {

    StatusMapper statusMapper;

    @Override
    public void changeStatus() {
        statusMapper.changeStatus(Statuses.IN_WORK);
    }
}
