DROP TABLE IF EXISTS PRODUCTO;
DROP TABLE IF EXISTS VENTA;
DROP TABLE IF EXISTS CLIENTE;

CREATE TABLE PRODUCTO(
IDPRODUCTO LONG NOT NULL AUTO_INCREMENT,
NOMBRE VARCHAR(100) NOT NULL,
MARCA VARCHAR(100) NOT NULL,
COSTO DOUBLE NOT NULL,
CANTIDAD DOUBLE NOT NULL,
PRIMARY KEY (IDPRODUCTO)
);

CREATE TABLE CLIENTE(
IDCLIENTE LONG NOT NULL AUTO_INCREMENT,
NOMBRE VARCHAR(150) NOT NULL,
APELLIDO VARCHAR(150) NOT NULL,
DNI VARCHAR(10) NOT NULL,
PRIMARY KEY(IDCLIENTE)
);

CREATE TABLE VENTA(
IDVENTA LONG NOT NULL AUTO_INCREMENT,
FECHA DATE NOT NULL,
TOTAL DOUBLE NOT NULL,
IDPRODUCTO VARCHAR(20) NOT NULL,
CANTIDADPRODUCTO VARCHAR(20) NOT NULL,
IDCLIENTE LONG NOT NULL,
PRIMARY KEY (IDVENTA)
);