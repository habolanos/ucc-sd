ALTER SESSION SET CONTAINER=ORCL;
ALTER SESSION SET CURRENT_SCHEMA=banco_user;

INSERT INTO dummy_table (id, "name") VALUES(1, 'Harold Adrian');
INSERT INTO dummy_table (id, "name") VALUES(2, 'Adrian David');
INSERT INTO dummy_table (id, "name") VALUES(3, 'Juan Jose');
INSERT INTO dummy_table (id, "name") VALUES(4, 'Juan David');

INSERT INTO dummy_table (id, "name") VALUES(5, 'Stefania');
INSERT INTO dummy_table (id, "name") VALUES(6, 'Alexandra');
INSERT INTO dummy_table (id, "name") VALUES(7, 'Ibeth');

SELECT id, "name" FROM dummy_table;

COMMIT;

SELECT SYS_CONTEXT('USERENV', 'CURRENT_SCHEMA') AS current_schema FROM dual;