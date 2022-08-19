package ru.inobitec.status.service.Impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import ru.inobitec.status.model.StatusEntity;
import ru.inobitec.status.repository.StatusRepository;
import ru.inobitec.status.service.StatusService;

import static ru.inobitec.status.util.StringConstants.*;

@Service
@RequiredArgsConstructor
@Log4j2
public class StatusServiceImpl implements StatusService {

    private final StatusRepository statusRepository;

    @Override
    public void changeStatus(String message) {
        try {
            String[] msg = message.split(" ");
            StatusEntity status = new StatusEntity();
            status.setId(Long.parseLong(msg[0]));
            switch (msg[1]) {
                case STATUS_CREATED -> status.setStatusName(STATUS_CREATED);
                case STATUS_UPDATED -> status.setStatusName(STATUS_UPDATED);
                default -> log.info(BAD_STATUS);
            }
            statusRepository.changeStatus(status);
        } catch (RuntimeException ex) {
            log.error(ex.getCause());
        }
    }
}
