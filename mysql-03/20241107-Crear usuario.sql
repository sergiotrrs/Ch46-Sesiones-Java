-- Creat Usuario
CREATE USER "readonly_user"@"localhost" IDENTIFIED BY "sololeo";
-- Ver todos los usuarios
SELECT user FROM mysql.user;

-- Crear permisos al usuario a las DB
-- solo puede hacer consultas con SELECT
GRANT SELECT ON superneto.* TO "readonly_user"@"localhost";
FLUSH PRIVILEGES;

-- Verificar los permisos de un usuairio
SHOW GRANTS FOR "readonly_user"@"localhost";