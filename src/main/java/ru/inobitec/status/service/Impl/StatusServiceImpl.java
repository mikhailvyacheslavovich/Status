package ru.inobitec.status.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.inobitec.status.model.StatusEntity;
import ru.inobitec.status.service.StatusService;

@Component
@RequiredArgsConstructor
public class StatusServiceImpl implements StatusService {

    @Override
    public void changeStatus(StatusEntity status) {

    }
}
