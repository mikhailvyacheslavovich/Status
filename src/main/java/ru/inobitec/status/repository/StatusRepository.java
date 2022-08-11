package ru.inobitec.status.repository;

import ru.inobitec.status.model.Statuses;

public interface StatusRepository {

    void changeStatus(Statuses status);
}
