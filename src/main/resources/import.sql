INSERT INTO `usuarios` (username, password, enabled, name, surname, email) VALUES ('goodfighty', '$2a$10$LbIMBXZPkUyWkFwzFEA33ejKhLR6FLhl1YYLvQdf3ABSNOzCtgu7C', true, 'xavi', 'sierra', 'xaviersierra13@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, name, surname, email) VALUES ('yisus', '$2a$10$2pAtgpPLJy1dd23wHNMyMOp0i0M.JyLV9M/Z2i.cT.22i0zenOIXC', false, 'yisuschrist', 'magdalena', 'yisus@christ.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);