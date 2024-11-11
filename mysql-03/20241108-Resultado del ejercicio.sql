USE miniso;
SELECT * FROM users Order by birthdate;

-- 1. Mostrar los usuarios que nacieron en agosto, posiblemente se les envíe una tarjeta de regalo a su email.
SELECT *
	FROM users
    WHERE Month(birthdate) = 8;

SELECT 
	*, 	month(birthdate) AS "month_number"
	FROM users    
    Order by month_number;

-- 2.- Mostrar todas las compras que ha tenido el usuario carlos.hernandez@example.com
SELECT *
 FROM users u
 INNER JOIN purchases p
 ON u.user_id = p.fk_user_id
 WHERE u.email = "carlos.hernandez@example.com";
 
-- 3.- Mostrar el número de compras que ha tenido el usuario carlos.hernandez@example.com
SELECT 
  u.user_id,
  u.email,
  count(purchase_id) As "purchases_number"
 FROM users u
 INNER JOIN purchases p
 ON u.user_id = p.fk_user_id
 WHERE u.email = "carlos.hernandez@example.com";

-- 4.- Mostrar el número de veces que se han vendido un producto.
-- Ordenar el resultado en orden descendente por el número de veces que se ha vendido el producto, incluir el id del producto.
SELECT
	product_id,
    sum(quantity) AS sold_items_number
    FROM purchase_has_products php
    GROUP BY product_id
    ORDER BY sold_items_number DESC;
    
-- 5.- Del ejercicio n.4 incluir el nombre del producto
SELECT
	php.product_id,
    p.name,
    sum(quantity) AS sold_items_number
    FROM purchase_has_products php
    LEFT JOIN products p
    ON php.product_id = p.product_id
    GROUP BY php.product_id
    ORDER BY sold_items_number DESC;

-- 6.- Mostrar las ventas que se ha tenido en el mes de marzo del 2024.
SELECT
	*
    FROM purchases pch
    INNER JOIN purchase_has_products php
    ON pch.purchase_id = php.purchase_id
    WHERE month( purchase_date) = 3;
    
-- 7.- Mostrar el monto total que se ha vendido en el mes de marzo del 2024
SELECT
    SUM(purchase_sold) AS "total_purchase_sold"
    FROM purchases pch
    INNER JOIN purchase_has_products php
    ON pch.purchase_id = php.purchase_id
    WHERE month( purchase_date) = 3;
    
-- 8.- Mostrar el monto vendido por cada mes en el año 2024.    
SELECT
	month( purchase_date) AS "month",
    SUM(purchase_sold) AS "total_purchase_sold"
    FROM purchases pch
    INNER JOIN purchase_has_products php
    ON pch.purchase_id = php.purchase_id    
    WHERE YEAR( purchase_date ) = 2024
    GROUP BY month
    ORDER BY month;
    
-- 9.- Mostrar los clientes con el total de compras que han hecho en el año 2024.
-- Mostrar el email del cliente y el monto total de las compra que lleva en el año.
SELECT
	u.email,
    SUM(purchase_sold) AS "total_purchase_sold"
    FROM users u
    INNER JOIN purchases pch
    ON u.user_id = pch.fk_user_id
    INNER JOIN purchase_has_products php
    ON pch.purchase_id = php.purchase_id
    WHERE YEAR( purchase_date ) = 2024
    GROUP BY email
    ORDER BY total_purchase_sold DESC;
    
-- 10.- Mostrar los clientes con el total de compras que han hecho en el año 2024.
-- Mostrar el email del cliente y el monto total de las compra que lleva en el año.
-- Mostrar SOLO los clientes que en su total de compra superen los $5,000
SELECT
	u.email,
    SUM(purchase_sold) AS "total_purchase_sold"
    FROM users u
    INNER JOIN purchases pch
    ON u.user_id = pch.fk_user_id
    INNER JOIN purchase_has_products php
    ON pch.purchase_id = php.purchase_id
    WHERE YEAR( purchase_date ) = 2024
    GROUP BY email
    HAVING total_purchase_sold >= 5000
    ORDER BY total_purchase_sold DESC;