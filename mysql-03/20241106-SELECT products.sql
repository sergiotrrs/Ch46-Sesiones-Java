
/*
 SELECT: obtiene datos de una base de datos. 
  Permite especificar columnas, condiciones y orden
  para personalizar la consulta
*/

SELECT * FROM products;

-- Especificar los campos
SELECT price, name FROM products;

-- Renombrar el nombre de los campos
SELECT name AS "nombre", price AS "precio" FROM products;

-- Ordenar la columna precio de forma ascendente
SELECT            
    name AS "nombre", 
    price AS "precio" 
    FROM products ORDER by precio ASC;

-- Ordenar la columna precio de forma descendente
SELECT            
    name AS "nombre", 
    price AS "precio" 
    FROM products ORDER by precio DESC;
    
-- Ordenar la columna precio y nombre de forma descendente
SELECT            
    name AS "nombre", 
    price AS "precio" 
    FROM products 
    ORDER by precio DESC, nombre DESC;

-- Limitar el número de elementos mostrados
SELECT * FROM products LIMIT 4;

-- Limitar el número de elementos con un offset
SELECT * FROM products LIMIT 2 OFFSET 3;

-- Contar el número de elementos COUNT
SELECT COUNT(name) AS "total_products"  FROM products;


/*
Uso de WHERE
La cláusa where se usa para filtrar registros según una condición

 Operadores lógicos
	Operator 	Description
	= 			Equality
	<> 			Nonequality
	!= 			Nonequality
	< 			Less than
	<= 			Less than or equal to
	> 			Greater than
	>= 			Greater than or equal to
	BETWEEN 	Between two specified values
*/

-- Mostrar los productos que su precio sea mayor a una cantidad
SELECT * FROM products
	WHERE price >= 20;

-- Mostrar los productos entre un rango (20-100)
SELECT * FROM products
	WHERE price >= 20 AND price<=100;

-- Uso de Between
SELECT * FROM products
	WHERE price BETWEEN 20 AND 100;

-- Mostrar los productos que NO esten en un rango (20-100)
SELECT * FROM products
WHERE price < 20 OR price > 100;

SELECT * FROM products
	WHERE price NOT BETWEEN 20 AND 100;

-- Filtros con valores null, no se debe usar WHERE campo = null
-- SELECT * FROM products WHERE price != null;
SELECT * FROM products WHERE price IS NULL;
SELECT * FROM products WHERE price IS NOT NULL;

-- Mostrar registros de ciertos valores
-- Mostrar productos de categoria 1,3,5
SELECT * FROM products WHERE
	fk_category_id = 1 OR fk_category_id = 3 OR fk_category_id = 5;

SELECT * FROM products WHERE fk_category_id IN (1, 3, 5);

-- No mostrar registros de ciertos valores
-- NO mostrar productos de categoria 1,3,5
SELECT * FROM products WHERE fk_category_id NOT IN (1, 3, 5);

-- Mostrar valores únicos con DISTINC
SELECT price FROM products ORDER BY price ASC;
-- Cuántos valores diferentes de precios tienes?
SELECT DISTINCT price FROM products ORDER BY price ASC;
SELECT COUNT(DISTINCT price) FROM products ORDER BY price ASC;

-- Obtener el valor máximo de precio de los productos
SELECT price FROM products ORDER BY price DESC LIMIT 1; -- no se recomienda

-- Obtener el valor máximo de una columna (MAX)
SELECT MAX(price) FROM products;

-- Mostrar los productos que tengan el precio máximo
SELECT * FROM products WHERE price = 200;

-- Anidar consultas
SELECT * FROM products WHERE price = (SELECT MAX(price) FROM products);

-- Obtener el valor mínimo de una columna (MIN)
SELECT MIN(price) FROM products;
-- El valor promedio de una columna (AVG)
SELECT AVG(price) FROM products;
-- SUMA los valores de una columna (SUM)
SELECT SUM(price) FROM products;

/*
 Suma total del precio de los productos
 de las categorias 1,3,5
*/
SELECT SUM(price) FROM products WHERE fk_category_id IN (1,3,5); -- 230
