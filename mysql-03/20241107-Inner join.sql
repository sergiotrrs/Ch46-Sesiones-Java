/*
 Los JOINS en SQL se utilizan para combinar filas 
 de dos o más tablas basadas en una columna 
 relacionada entre ellas.

*/
SELECT * 
 FROM products
 INNER JOIN categories
 ON products.fk_category_id = categories.category_id;
 
-- Mostrar solo columnas id, name, name category
SELECT 
	product_id,
    products.name AS "product_name",
    categories.name AS "category_name"
 FROM products
 INNER JOIN categories
 ON products.fk_category_id = categories.category_id;

-- Uso de Alias en el nombre de las tablas
SELECT 
	p.product_id,
    p.name AS "product_name",
    c.name AS "category_name"
 FROM products AS p -- Se puede usar AS
 INNER JOIN categories c -- Se puede omitir AS
 ON p.fk_category_id = c.category_id;

SELECT * FROM users;
SELECT * from purchases;
-- Mostrar nombre de firstname, email, purchase_id, purchase_date
SELECT
	u.firstname,
    u.email,
    p.purchase_id,
    p.purchase_date
	FROM purchases p
    INNER JOIN users u    
    ON p.fk_user_id = u.user_id;
        
-- Mostrar nombre de firstname, email, purchase_id, purchase_date
-- product_id, quantity
SELECT
	u.firstname,
    u.email,
    p.purchase_id,
    p.purchase_date,
    php.product_id,
    php.quantity
	FROM purchases p
    INNER JOIN users u    
    ON p.fk_user_id = u.user_id
    INNER JOIN purchase_has_products php
    ON p.purchase_id = php.purchase_id;
    
-- Verificar que pasó con las compras de María
SELECT * FROM users WHERE firstname like "Maria";   -- ID 1

SELECT * FROM purchases WHERE fk_user_id = 1; -- Compra ID 1, 11

SELECT * FROM purchase_has_products WHERE purchase_id IN (1,11);

select * from products where product_id in (1, 4, 17); 

-- Mostrar nombre de firstname, email, purchase_id, purchase_date
-- product_id, quantity
-- nombre dep productos
SELECT
	u.firstname,
    u.email,
    p.purchase_id,
    p.purchase_date,
    php.product_id,
    pro.name,
    php.quantity
	FROM purchases p
    INNER JOIN users u    
    ON p.fk_user_id = u.user_id
    INNER JOIN purchase_has_products php
    ON p.purchase_id = php.purchase_id
    INNER JOIN products pro 
    ON php.product_id = pro.product_id
    WHERE firstname LIKE "%a"
    ORDER BY email ASC;
    

