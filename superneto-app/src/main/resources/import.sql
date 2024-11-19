
INSERT INTO roles(id, name, description) VALUES (1,'CUSTOMER', 'Cliente de la ecommerce');
INSERT INTO roles(id, name, description) VALUES (2,'ADMIN', 'Administrador de la ecommerce');
INSERT INTO roles(id, name, description) VALUES (3,'WAREHOUSE_MANAGER', 'Administrador del almacen');

INSERT INTO customers(first_name, last_name, email, active) VALUES ('Bob', 'Esponja', 'esponja@nikelodeon.com', 1);

INSERT INTO customer_has_role(customer_id, role_id) VALUES (1, 1);
INSERT INTO customer_has_role(customer_id, role_id) VALUES (1, 2);

INSERT INTO products(id, name, price) VALUES (1, 'Laptop Gamer', 26000.50);
INSERT INTO products(id, name, price) VALUES (2, 'Bicicleta', 5000.50);

INSERT INTO purchases(id, fk_customer_id, purchase_date) VALUES (1, 1, '2024-11-08T11:13:14');

INSERT INTO purchase_has_products(purchase_id, product_id, quantity, purchase_sold) VALUES (1, 1, 1, 26000.50);
INSERT INTO purchase_has_products(purchase_id, product_id, quantity, purchase_sold) VALUES (1, 2, 2, 10001.00);