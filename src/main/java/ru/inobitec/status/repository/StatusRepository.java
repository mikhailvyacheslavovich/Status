package ru.inobitec.status.repository;

import ru.inobitec.status.model.StatusEntity;

public interface StatusRepository {
    void changeStatus(StatusEntity status);
}
