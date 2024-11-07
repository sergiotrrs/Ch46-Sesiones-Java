
/*
1.- Mostrar para la tabla users;
  fistname como nombre
  lastname como apellido
  email como email
  birthdate como fecha_de_nacimiento
  Ordenar por fecha de nacimiento y apellido de forma ascendentes
  
2.- Mostrar el número de usuario registrados

*/
SELECT
firstname AS "nombre",
lastname AS "apellido",
email AS "email",
birthdate AS "fecha_de_nacimiento"
FROM users
ORDER by fecha_de_nacimiento ASC, apellido ASC;

SELECT COUNT(firstname) AS "total_usuarios" FROM users;

-- Patrones de búsqueda con LIKE
-- comodín: _ donde puede buscar cualquier caracter
-- comodín: % donde puede buscar n número de caracteres
SELECT * FROM users WHERE firstname = "i";

SELECT * FROM users WHERE firstname LIKE "i%";

-- Buscar los usuarios que su correo electrónico sea gmail.com 
SELECT * FROM users WHERE email LIKE "%@gmail.com";

-- Buscar los usuarios que su teléfono tenga lada 558
SELECT * FROM users WHERE telephone LIKE "558%";

-- Buscar los usuarios que su teléfono tenga 554591?798
SELECT * FROM users WHERE telephone LIKE "554591_798";

-- Funciones de caracteres
-- Concatener los valores de columnas (CONCAT)
SELECT CONCAT(firstname," ", lastname) AS fullName FROM users;

-- cantidad de caracteres LENGTH()
-- invertir los caracteres REVERSE()
-- poner en mayúsculas UPPER()
-- poner en minúsculas LOWER()

-- Mostrar en una única columna el nombre completo en mayúscula
SELECT UPPER(CONCAT(firstname, " ", lastname)) AS fullName FROM users;

-- funciones fecha
SELECT CURDATE(); -- fecha actual
SELECT NOW(); -- fecha y hora actual

SELECT * FROM users;
SELECT firstname, DATEDIFF( CURDATE(), birthdate ) AS "días" FROM users;

-- Filtrar a las personas que cumplen años en el mes siguiente
SELECT firstname, birthdate, MONTH(birthdate) FROM users;

-- Mostrar las personas que su cumpleaños sea en noviembre
SELECT 
	firstname, birthdate, MONTH(birthdate) 
    FROM users
    WHERE MONTH(birthdate) = 9;
    
-- Mostrar las personas que se cumpleaños sea el próximo mes
SELECT 
	firstname, birthdate, MONTH(birthdate) 
    FROM users
    WHERE MONTH(birthdate) = MONTH(CURDATE() + INTERVAL 1 MONTH );
    
-- Buscar una fecha específica
SELECT * FROM users WHERE birthdate = "2000-09-14";

-- Buscar a todas las personas que su fecha de nacimiento sea el 14
SELECT * FROM users
	WHERE DAY(birthdate) = "14";
    
-- Buscar a todas las personas que seal del año 2000 y mes septiembre
select * from users 
	where year(birthdate) = 2000 and month(birthdate) = 9;

