package ru.inobitec.status.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.inobitec.status.model.StatusEntity;
import ru.inobitec.status.repository.StatusRepository;
import ru.inobitec.status.service.StatusService;

@Service
@RequiredArgsConstructor
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public void changeStatus(String message) {
        String[] msg = message.split(" ");
        StatusEntity status = new StatusEntity();
        status.setId(Long.parseLong(msg[0]));
        switch (msg[1]) {
            case "created" -> status.setStatusName("created");
            case "updated" -> status.setStatusName("updated");
        }
        statusRepository.changeStatus(status);
    }
}
