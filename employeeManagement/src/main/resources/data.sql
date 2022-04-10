INSERT INTO users (user_id, user_name, password) VALUES(1, 'admin', '$2a$12$4r3elEOaoduGgEGCsFHQ2OqrJNmVn5ruvjIVTcJYGz/M7/nBT82X.');
INSERT INTO users (user_id, user_name, password) VALUES(2, 'user', '$2a$12$cFoig3y7D8awJZb7xYiTXeeSEy2PCCT7VpcOz9Nc5JaTeO92Rpafa');

INSERT INTO roles (role_id, role_name) VALUES(1, 'ADMIN');
INSERT INTO roles (role_id, role_name) VALUES(2, 'USER');

INSERT INTO users_roles (user_id, role_id) VALUES(1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES(2, 2);