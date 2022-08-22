CREATE SEQUENCE STATUS_SEQ START WITH 1000 INCREMENT BY 1;
CREATE TABLE status
(
    ID          INTEGER,
    STATUS_NAME VARCHAR(64)
);

ALTER TABLE status
    ADD CONSTRAINT STATUS_ID_PK PRIMARY KEY (ID);

CREATE INDEX STATUS_PK_IDX ON status (ID);

DO $$
    DECLARE
        v_status_id      integer;
    BEGIN
        SELECT NEXTVAL('status_seq') INTO v_status_id;
    INSERT INTO status(ID, STATUS_NAME) VALUES (v_status_id + 1, 'open');
END $$;

