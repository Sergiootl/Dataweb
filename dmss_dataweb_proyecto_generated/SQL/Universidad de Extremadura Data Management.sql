
    -- Script de creación de base de datos
    CREATE DATABASE IF NOT EXISTS Uex;
    USE Uex;

    -- Creación de entidades
        -- Creación de la entidad Titulo
        CREATE TABLE IF NOT EXISTS Titulo (
            -- Clave primaria obligatoria
            id_Titulo INT NOT NULL AUTO_INCREMENT,

            -- Atributos
                    Nombre VARCHAR(255)
,                    Creditos totales INT

            ,

            -- Clave primaria
            PRIMARY KEY (id_Titulo)

            -- Claves foráneas (referencias a otras entidades)
                , FOREIGN KEY (id_Asignatura) REFERENCES Asignatura(id_Asignatura)
                , FOREIGN KEY (id_Estudiante) REFERENCES Estudiante(id_Estudiante)
                , FOREIGN KEY (id_Profesor) REFERENCES Profesor(id_Profesor)
        );
        -- Creación de la entidad Asignatura
        CREATE TABLE IF NOT EXISTS Asignatura (
            -- Clave primaria obligatoria
            id_Asignatura INT NOT NULL AUTO_INCREMENT,

            -- Atributos
                    Nombre VARCHAR(255)
,                    Creditos INT
,                    Optativa BOOLEAN

            ,

            -- Clave primaria
            PRIMARY KEY (id_Asignatura)

            -- Claves foráneas (referencias a otras entidades)
        );
        -- Creación de la entidad Estudiante
        CREATE TABLE IF NOT EXISTS Estudiante (
            -- Clave primaria obligatoria
            id_Estudiante INT NOT NULL AUTO_INCREMENT,

            -- Atributos
                    Nombre VARCHAR(255)
,                    Apellidos VARCHAR(255)
,                    DNI INT

            ,

            -- Clave primaria
            PRIMARY KEY (id_Estudiante)

            -- Claves foráneas (referencias a otras entidades)
        );
        -- Creación de la entidad Profesor
        CREATE TABLE IF NOT EXISTS Profesor (
            -- Clave primaria obligatoria
            id_Profesor INT NOT NULL AUTO_INCREMENT,

            -- Atributos
                    Nombre VARCHAR(255)
,                    Apellidos VARCHAR(255)
,                    DNI INT
,                    Departamento VARCHAR(255)

            ,

            -- Clave primaria
            PRIMARY KEY (id_Profesor)

            -- Claves foráneas (referencias a otras entidades)
        );

