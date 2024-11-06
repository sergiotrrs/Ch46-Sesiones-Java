USE tiendas3b;

INSERT INTO `tiendas3b`.`users` (`id`, `firstname`, `lastname`, `email`, `telephone`, `birthdate`, `password`, `avatar`, `active`)
VALUES 
	(1, 'Ivanna', 'Saucedo', 'ivannasaucedorantes@gmail.com', '5545915798', '2000-09-14', 'chocolatito', 'ivannasado', 1),
	(2, 'Gary', 'Garcia', 'garybomnito@gmail.com', '5532202867', '2001-10-14', 'pinwuinos', 'garyleaks', 1),
    (3, 'Rufina', 'Loca', 'gata_fea@gmail.com', '5512345678', '2020-05-03', 'gatita', 'rufinaGato', 1),
    (4, 'Steve', 'El Macho', 'stevesiemprereal@gmail.com', '5587654321', '2017-05-23', 'stevecito', 'steveGecko', 1),
    (5, 'Pato', 'Del estanque', 'patoestancado@gmail.com', '5522334455', '2000-09-15', 'patito', 'patitoLoco', 1);
    
SELECT * FROM users;

INSERT INTO categories (id, name, description)
VALUES 
	(1, 'alimentos', 'diversos productos de la canasta básica'),
    (2, 'bebidas', 'bebidas como lácteos, refrescos y jugos'),
    (3, 'vinos y licores', 'bebidas alcohólicas'),
    (4, 'salud y belleza', 'productos de higiene y cuidado personal'),
    (5, 'irrepetibles', 'ofertones que no se vuelven a repetir');
    
SELECT * FROM categories;

INSERT INTO products (id, name, price, fk_category_id)
VALUES
	(1, 'Galletas Marias', '10.00', 1),
    (2, 'Leche Deslactosada Vaquita', '20.00', 2),
    (3, 'Bacardi', '200.00', 3),
    (4, 'Toallas húmedas', '15.00', 4),
    (5, 'Tupper para lunch', '20.00', 5);
SELECT * FROM products;

-- Errores con la fk
-- No se puede tener el campo fk_category_id sin dato
INSERT INTO products (name, price) VALUES ("Sprite 600ml", 20 );

-- No se puede agregar por que el id de fk no existe
INSERT INTO products (name, price, fk_category_id ) VALUES ("Sprite 600ml", 20, 60 );


