package com.superneto.app.repository;


import java.time.LocalDateTime;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.superneto.app.model.PurchaseHasProduct;
import com.superneto.app.model.composite_key.PurchaseProductKey;

/**
 * @RepositoryRestResource en Spring Data REST se utiliza para personalizar 
 * cómo se expone un repositorio de Spring Data a través de una API RESTful.
 * 
 * - collectionResourceRel: Define el nombre del recurso en plural que se 
 *    utilizará en las respuestas JSON y en los enlaces HATEOAS. 
 * - path: Define la ruta de acceso bajo la cual el recurso estará disponible. 
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "purchasesHasProducts", path = "purchasesHasProducts")
public interface PurchaseHasProductRepository extends CrudRepository<PurchaseHasProduct, PurchaseProductKey> {

	Set<PurchaseHasProduct> findAllByPurchaseId(@Param("purchase") Long purchaseId );
	Set<PurchaseHasProduct> findAllByPurchasePurchaseDate(@Param("purchase-date") LocalDateTime purchaseDate );
	void deleteByPurchaseIdAndProductId(@Param("purchase") Long purchaseId, @Param("product") Long productId);
	
}


/*
 Spring Data REST es un proyecto de Spring que facilita la 
 creación de servicios RESTful a partir de repositorios de 
 Spring Data automáticamente. En lugar de escribir manualmente 
 los controladores y las rutas para cada operación CRUD, 
 Spring Data REST expone automáticamente los repositorios 
 como servicios RESTful basados en las convenciones de Spring Data.

Conceptos Clave
Automatización de Endpoints: Spring Data REST genera automáticamente 
endpoints para las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) 
en las entidades gestionadas por los repositorios de Spring Data.

HATEOAS: Los endpoints generados por Spring Data REST son compatibles 
con HATEOAS (Hypermedia as the Engine of Application State), proporcionando 
enlaces en las respuestas JSON que describen cómo navegar por la API.

Configuración Mínima: Solo necesitas definir tus repositorios y anotar 
tus entidades; Spring Data REST se encarga del resto.

Personalización: Aunque se genera automáticamente, puedes personalizar 
los endpoints, los controladores y la exposición de datos según tus necesidades.

Beneficios
- Ahorro de Tiempo: No necesitas escribir código repetitivo para las operaciones CRUD básicas.
- Consistencia: Sigue las convenciones y patrones de diseño de Spring, asegurando una 
  implementación consistente.
- Flexibilidad: Puedes extender y personalizar los endpoints generados según los 
  requerimientos de tu aplicación.
- Spring Data REST es ideal para proyectos donde necesitas exponer rápidamente 
  una API RESTful sin escribir mucho código manualmente, especialmente útil en prototipos y 
  aplicaciones donde las operaciones CRUD estándar son suficientes.

*/