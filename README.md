# 📊 DataWeb DSL - Generador de Aplicaciones Web y Consola

**Proyecto final de la asignatura _Diseño y Modelos de Sistemas Software_ (DMSS) - Universidad de Extremadura (Curso 2024/2025)**

**Autores:**
- Sergio Terrazas Lobato
- Javier Costillo Palacios


## 📌 Descripción del Proyecto

**DataWeb DSL** es un lenguaje específico de dominio (DSL) desarrollado para facilitar la definición y generación automática de aplicaciones de gestión basadas en datos, tanto en versión web (HTML/CSS/JS) como de consola (Java).

Permite modelar entidades (como Asignaturas, Alumnos, Profesores), roles de usuario, páginas CRUD, encuestas, cuestionarios y mucho más, integrando redes sociales y fuentes RSS.

Este proyecto sigue un enfoque **Model-Driven Development (MDD)** utilizando herramientas del ecosistema Eclipse como EMF, EuGENia y Acceleo.


## 🧠 Características Principales

- ✅ **Sintaxis abstracta**: Definida con EMF (Ecore) + restricciones OCL.
- ✅ **Sintaxis concreta gráfica**: Generada automáticamente con EuGENia.
- ✅ **Editor gráfico DSL** para modelado visual.
- ✅ **Generación automática** de:
  - Aplicación Web (HTML + CSS)
  - Aplicación de consola (Java)
  - Código SQL para base de datos
  - Documentación HTML del metamodelo
- ✅ **Soporte de roles**: Administrador, Profesor, Estudiante, etc.
- ✅ **Gestión completa CRUD**
- ✅ **Encuestas y Cuestionarios** con visualización de resultados.
- ✅ **Integración con redes sociales y fuentes RSS**


## 🛠️ Tecnologías y Herramientas

| Herramienta         | Versión        | Uso principal                        |
|---------------------|----------------|--------------------------------------|
| Eclipse             | 4.30.0         | Entorno principal                    |
| EMF                 | 2.36.0         | Definición de metamodelo             |
| EuGENia             | 2.4.0          | Generación de editor gráfico         |
| Acceleo             | 3.7.14         | Generación de código (M2T)           |
| Java                | 17+            | Aplicación de consola                |
| HTML/CSS/JS         | -              | Aplicación Web generada              |
| Git                 | -              | Control de versiones                 |


## 📁 Estructura del Proyecto

- dmss_dataweb_proyecto/
	- metamodel/                             -> Archivos del metamodelo EMF y GMF
		- dataweb.aird
		- dataweb.ecore
		- dataweb.emf
		- dataweb.genmodel
		- dataweb.gmfgen
		- dataweb.gmfgraph
		- dataweb.gmfmap
		- dataweb.gmftool
		- dataweb.gmftrace

	- model/                                 -> Modelos de ejemplo creados
		- Aplicacion.xmi

	- dmss.dataweb.diagram/                 -> Editor gráfico (EuGENia / GMF)
	- dmss.dataweb.edit/                    -> Proyecto auxiliar EMF
	- dmss.dataweb.editor/                  -> Proyecto del editor
	- dmss.dataweb.tests/                   -> Tests automáticos (opcional)

- org.eclipse.acceleo.module.SQL/       -> Generación de SQL
  - generateSQL.mtl

- org.eclipse.acceleo.module.HTMLCSS/   -> Generación Web y Consola
  - generateHTMLCSSWeb.mtl
  - generateHTMLCSSConsola.mtl

- org.eclipse.acceleo.module.DOC/       -> Generación de documentación (Extensión 2)
  - generate.mtl

- dmss_dataweb_proyecto_generated/      -> Código generado
  - src/                            -> Código Java (consola)
  - SQL/                            -> Scripts SQL generados
  - WEB/                            -> HTML/CSS por rol
  - DOCAuto/                        -> Documentación HTML generada



## 🚀 Ejecución y Generación

1. Abrir Eclipse con todos los proyectos importados.
2. Utilizar el editor gráfico para modelar una aplicación (`.xmi`).
3. Ejecutar los templates Acceleo:
   - `generateSQL.mtl` → código SQL
   - `generateWeb.mtl` → HTML/CSS
   - `generateConsola.mtl` → Java (consola)
   - `generateDOC.mtl` → documentación automática
4. Acceder al resultado en la carpeta `dmss_dataweb_proyecto_generated/`.


## 📝 Licencia

Este proyecto ha sido desarrollado con fines educativos en el marco de la asignatura **DMSS (Grado en Ingeniería Informática, UEx)**.  
No se autoriza su reutilización con fines académicos sin citar a los autores.

