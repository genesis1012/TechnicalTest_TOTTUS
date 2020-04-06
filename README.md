# TechnicalTest_TOTTUS
Prueba de automatización de compra en pagina web y consumo de servicio web 

En la siguiente solucion encontrara la prueba de buscar y agregar el primer producto encontrado a carrito de compras validando el nombre del producto seleccionado, la cantidad seleccionada y el precio total a pagar.
En esta solucion tambien encontrara la automatiozacion del consumo de un servicio rest api

Para compilar todo el proyecto ejecute el comando:
gradle clean build -x test

para ejecutar el proyecto completo ejecute el comando:
gradle clean test aggregate --info

para ejecutar solo la prueba de compra de producto ejecute el comando:
gradle clean -Dcucumber.options="--tags @SoppingCart" test -info

para ejecutar solo la prueba del consumo del revicio wen ejecute el comando:
gradle clean -Dcucumber.options="--tags @ConsulUserRest" test -info

Saludos!
