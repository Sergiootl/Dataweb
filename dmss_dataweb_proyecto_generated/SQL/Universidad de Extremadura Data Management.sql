
    -- Script de creación de base de datos
    CREATE DATABASE IF NOT EXISTS Uex;
    USE Uex;

    -- Creación de entidades
        -- Creación de la entidad Titulo
        CREATE TABLE IF NOT EXISTS Titulo (
            -- Atributos
                    Nombre VARCHAR(255)
                    Creditos totales INT

            -- Clave primaria
                , PRIMARY KEY (
                        Nombre
                )
        );
        -- Creación de la entidad Asignatura
        CREATE TABLE IF NOT EXISTS Asignatura (
            -- Atributos
                    01 INT
                    Creditos INT
                    Optativa BOOLEAN

            -- Clave primaria
                , PRIMARY KEY (
                        01
                )
        );
        -- Creación de la entidad Estudiante
        CREATE TABLE IF NOT EXISTS Estudiante (
            -- Atributos
                    Nombre VARCHAR(255)
                    Apellidos VARCHAR(255)
                    DNI INT

            -- Clave primaria
                , PRIMARY KEY (
                        DNI
                )
        );
        -- Creación de la entidad Profesor
        CREATE TABLE IF NOT EXISTS Profesor (
            -- Atributos
                    Nombre VARCHAR(255)
                    Apellidos VARCHAR(255)
                    DNI INT
                    Departamento VARCHAR(255)

            -- Clave primaria
                , PRIMARY KEY (
                        DNI
                )
        );

