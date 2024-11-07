/*
 RIGHT JOIN (o RIGHT OUTER JOIN)
 Devuelve todas las filas de la tabla de la derecha, 
 y las filas coincidentes de la tabla de la izquierda. 
 Si no hay coincidencia, se muestran NULLs en las 
 columnas de la izquierda.
*/

SELECT
	u.user_id,
	u.firstname,
    u.email,
    p.purchase_id,
    p.purchase_date,
    php.product_id,
    php.quantity
	FROM purchases p
    INNER JOIN users u    
    ON p.fk_user_id = u.user_id
    LEFT JOIN purchase_has_products php
    ON p.purchase_id = php.purchase_id;