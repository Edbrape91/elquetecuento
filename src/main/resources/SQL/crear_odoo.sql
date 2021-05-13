-- Generado por Oracle SQL Developer Data Modeler 21.1.0.092.1221
--   en:        2021-04-28 16:37:11 CEST
--   sitio:      Oracle Database 21c
--   tipo:      Oracle Database 21c



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE


use odoo;

CREATE TABLE actividad (
    codigoactividad  INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombreactividad  VARCHAR(100) NOT NULL
);

-- ALTER TABLE actividad ADD CONSTRAINT actividad_pk PRIMARY KEY ( codigoactividad );

CREATE TABLE cliente (
    codigocliente              INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombrecliente              VARCHAR(50) NOT NULL,
    apellidoscliente           VARCHAR(100),
    tipocliente                CHAR(1) NOT NULL,
    codigoprovincia  INTEGER NOT NULL,
    calle                      VARCHAR(100) NOT NULL,
    calle1                     VARCHAR(100),
    ciudad                     VARCHAR(100) NOT NULL,
    codigopostal               INTEGER,
    nif                        VARCHAR(9),
    telefono                   VARCHAR(14),
    movil                      VARCHAR(14),
    email                      VARCHAR(50),
    paginaweb                  VARCHAR(100),
    categorias                 VARCHAR(200)
);

-- ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( codigocliente );

CREATE TABLE comercial (
    codigocomercial     INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombrecomercial     VARCHAR(30) NOT NULL,
    apellidoscomercial  VARCHAR(50) NOT NULL
);

-- ALTER TABLE comercial ADD CONSTRAINT comercial_pk PRIMARY KEY ( codigocomercial );

CREATE TABLE estado (
    codigoestado  INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombreestado  VARCHAR(100)
);

-- ALTER TABLE estado ADD CONSTRAINT estado_pk PRIMARY KEY ( codigoestado );

CREATE TABLE estadopago (
    codigoestadopago  INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombreestadopago  VARCHAR(100) NOT NULL
);

-- ALTER TABLE estadopago ADD CONSTRAINT estadopago_pk PRIMARY KEY ( codigoestadopago );

CREATE TABLE factura (
    codigocliente        INTEGER NOT NULL,
    codigoactividad    INTEGER NOT NULL,
    codigoestado          INTEGER NOT NULL,
    codigofactura                INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fechafactura                 DATE NOT NULL,
    fechavencimiento             DATE,
    impuestos                    DOUBLE NOT NULL,
    total                        DOUBLE NOT NULL,
    codigoestadopago  INTEGER NOT NULL
);

-- ALTER TABLE factura ADD CONSTRAINT factura_pk PRIMARY KEY ( codigofactura );

CREATE TABLE pais (
    codigopais  INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombrepais  VARCHAR(100) NOT NULL
);

-- ALTER TABLE pais ADD CONSTRAINT pais_pk PRIMARY KEY ( codigopais );

CREATE TABLE presupuesto (
    codigopresupuesto          INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fechapresupuesto           DATE NOT NULL,
    total                      DOUBLE NOT NULL,
    codigocliente      INTEGER NOT NULL,
    codigocomercial  INTEGER NOT NULL,
    codigoactividad  INTEGER NOT NULL,
    codigoestado        INTEGER NOT NULL
);

-- ALTER TABLE presupuesto ADD CONSTRAINT presupuesto_pk PRIMARY KEY ( codigopresupuesto );

CREATE TABLE provincia (
    codigopais  INTEGER NOT NULL,
    codigoprovincia  INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombreprovincia  VARCHAR(60) NOT NULL
);

-- ALTER TABLE provincia ADD CONSTRAINT provincia_pk PRIMARY KEY ( codigoprovincia );

ALTER TABLE cliente
    ADD CONSTRAINT cliente_provincia_fk FOREIGN KEY ( codigoprovincia )
        REFERENCES provincia ( codigoprovincia );

ALTER TABLE factura
    ADD CONSTRAINT factura_actividad_fk FOREIGN KEY ( codigoactividad )
        REFERENCES actividad ( codigoactividad );

ALTER TABLE factura
    ADD CONSTRAINT factura_cliente_fk FOREIGN KEY ( codigocliente )
        REFERENCES cliente ( codigocliente );

ALTER TABLE factura
    ADD CONSTRAINT factura_estado_fk FOREIGN KEY ( codigoestado )
        REFERENCES estado ( codigoestado );

ALTER TABLE factura
    ADD CONSTRAINT factura_estadopago_fk FOREIGN KEY ( codigoestadopago )
        REFERENCES estadopago ( codigoestadopago );

ALTER TABLE presupuesto
    ADD CONSTRAINT presupuesto_actividad_fk FOREIGN KEY (codigoactividad )
        REFERENCES actividad ( codigoactividad );

ALTER TABLE presupuesto
    ADD CONSTRAINT presupuesto_cliente_fk FOREIGN KEY ( codigocliente )
        REFERENCES cliente ( codigocliente );

ALTER TABLE presupuesto
    ADD CONSTRAINT presupuesto_comercial_fk FOREIGN KEY ( codigocomercial )
        REFERENCES comercial ( codigocomercial );

ALTER TABLE presupuesto
    ADD CONSTRAINT presupuesto_estado_fk FOREIGN KEY ( codigoestado )
        REFERENCES estado ( codigoestado );

ALTER TABLE provincia
    ADD CONSTRAINT provincia_pais_fk FOREIGN KEY ( codigopais )
        REFERENCES pais ( codigopais );



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             9
-- CREATE INDEX                             0
-- ALTER TABLE                             19
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
