
    -- Script de creación de base de datos
    CREATE DATABASE IF NOT EXISTS Uex;
    USE Uex;

    -- Creación de entidades
        -- Creación de la entidad Titulo
        CREATE TABLE IF NOT EXISTS Titulo (
                ID INT NOT NULL AUTO_INCREMENT,
	            -- Atributos
	            PRIMARY KEY (PrimaryKey)
        );
        -- Creación de la entidad Asignatura
        CREATE TABLE IF NOT EXISTS Asignatura (
                ID INT NOT NULL AUTO_INCREMENT,
	            -- Atributos
	            PRIMARY KEY (PrimaryKey)
        );
