**Proyecto DataWeb - Desarrollo de Software Dirigido por Modelos**
Descripción del Proyecto
El proyecto DataWeb tiene como objetivo el desarrollo de una aplicación web basada en el concepto de Desarrollo de Software Dirigido por Modelos (DSDM), donde se implementa un lenguaje de modelado específico (DSL) para generar automáticamente código funcional que interactúa con una base de datos.

Este proyecto busca simplificar y automatizar parte del proceso de desarrollo de software, permitiendo que los desarrolladores diseñen modelos abstractos que, al ser procesados por una herramienta de transformación (como Acceleo), generen código de aplicación en varios niveles. El código generado incluye no solo la estructura de la base de datos, sino también las páginas web interactivas que realizan operaciones CRUD (Crear, Leer, Actualizar, Borrar) sobre dicha base de datos.

El proyecto se desarrolla utilizando tecnologías web como JSP, PHP, y servidores como Apache Tomcat, y es compatible con bases de datos como MySQL o SQLite.

Funcionalidades
Editor gráfico/textual: Se incluye una interfaz gráfica o textual que permite crear modelos utilizando un lenguaje de modelado específico. Los modelos creados en este editor serán utilizados para generar código automáticamente.

Generación automática de código: A partir de los modelos diseñados, el sistema generará páginas web, scripts de base de datos y operaciones CRUD necesarias para una aplicación funcional.

Aplicación web dinámica: La aplicación web generada permite acceder a una base de datos y realizar operaciones CRUD sobre ella, todo gestionado a través de páginas dinámicas que interactúan con el servidor de aplicaciones.

Tecnologías Utilizadas
Lenguaje de Modelado (DSL): Se ha diseñado un lenguaje específico que describe la estructura de la base de datos y las operaciones que la aplicación debe realizar.

Acceleo: Se utiliza para realizar la transformación modelo a texto, generando automáticamente la documentación y el código necesario a partir de los modelos creados.

Tecnologías Web:

JSP / PHP: Se utilizan para crear páginas dinámicas que interactúan con la base de datos.

Base de datos: MySQL, SQLite u otras tecnologías de bases de datos relacionales.

Servidor de aplicaciones: Apache Tomcat, Wildfly.

Estructura del Proyecto
El proyecto está compuesto por varios módulos, los cuales incluyen tanto la infraestructura de generación de código como las aplicaciones de ejemplo.

Módulos Principales
dmss.dataweb: Contiene el proyecto principal que incluye el metamodelo, el editor y el generador de código.

dmss.dataweb.edit: Define la interfaz de usuario para editar y visualizar modelos.

dmss.dataweb.editor: Proporciona herramientas para crear y modificar modelos utilizando el DSL.

dmss.dataweb.test: Contiene pruebas para verificar la funcionalidad del sistema y los modelos generados.

dmss.dataweb.applicationgen: Genera el código para la aplicación web a partir de los modelos.

dmss.dataweb.examplemodels: Incluye ejemplos de modelos generados con el editor.

dmss.dataweb.diagram / dmss.dataweb.xtext: Definen la sintaxis gráfica y textual del DSL.
