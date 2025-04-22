
    -- Script de creación de base de datos
    CREATE DATABASE IF NOT EXISTS Uex;
    USE Uex;

    -- Creación de entidades
        -- Creación de la entidad Titulo
        CREATE TABLE IF NOT EXISTS Titulo (
            -- Atributos
                    Nombre VARCHAR(255)
                    Creditos INT
                    Optativa BOOLEAN

            -- Clave primaria
                , PRIMARY KEY (
                        Nombre
                )
        );
        -- Creación de la entidad Asignatura
        CREATE TABLE IF NOT EXISTS Asignatura (
            -- Atributos
                    Nombre VARCHAR(255)
                    ID INT
                    Parcial BOOLEAN

            -- Clave primaria
                , PRIMARY KEY (
                        Nombre
                )
        );

