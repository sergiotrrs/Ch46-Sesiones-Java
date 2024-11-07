SELECT * FROM products;

SELECT COUNT(name) AS "total_products" FROM products; -- 23
SELECT COUNT(*) AS "total_products" FROM products; -- 23
SELECT COUNT(price) AS "total_products" FROM products; -- 19

-- Categorías que están siendo usadas por los productos
SELECT DISTINCT(fk_category_id) FROM products;

-- Cuántos productos tengo por categoría
SELECT * FROM products ORDER by fk_category_id;
/*
 El uso de GROUP BY en SQL se emplea para agrupar filas 
 que tienen valores iguales en columnas específicas y 
 permite realizar funciones de agregación 
 (como COUNT, SUM, AVG, etc.) en cada grupo
*/
SELECT fk_category_id, COUNT(*) 
	FROM products
    GROUP BY fk_category_id;

-- Cuántos productos tengo por categoría 
-- SIN contar los que tiene  precio con null
SELECT  fk_category_id, COUNT(*) 
 FROM products
 WHERE price is not null
 GROUP BY fk_category_id;
 
SELECT fk_Category_id, COUNT(price) AS total_products
FROM products
GROUP BY fk_Category_id;
 

 /*
  El HAVING en SQL se utiliza para filtrar los 
  resultados de grupos creados con GROUP BY, 
  aplicando condiciones a las funciones de agregación 
  (como SUM, AVG, COUNT, etc.).
  
  WHERE filtra antes de agrupar los datos, y HAVING 
  filtra después de agrupar los datos. Esta es una 
  distinción importante; las filas eliminadas por 
  una cláusula WHERE no se incluyen en el grupo.
  
  La eliminación de filas podría cambiar los valores 
  calculados, lo que a su vez podría afectar a qué 
  grupos se filtran basándose en el uso de esos valores 
  en la cláusula HAVING.  
 */
-- Cuántos productos tengo por categoría 
-- SIN contar los que tiene  precio con null
-- Solo mostrar las categorias que tengas más
-- de 5 productos asociados
SELECT  
	fk_category_id, 
    COUNT(*) AS "num_products"
 FROM products
 WHERE price is not null
 GROUP BY fk_category_id
 HAVING num_products >= 5
 ORDER by fk_category_id DESC;
 
 
 
 
    
    