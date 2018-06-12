package com.deepak.resource;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.deepak.domain.Product;
import com.deepak.service.ProductService;
import com.deepak.service.ProductServiceImpl;

@Path("/service")
public class ProductResource {
	
	ProductService service;
	
	public ProductResource() {
		super();
		this.service = new ProductServiceImpl();
	}

	@GET
	@Path("/products")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Collection<Product> getAll() {
		return service.getAllProducts();
	}
	
	@GET
	@Path("/product/{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Product get(@PathParam("id") Long id) {
		return service.getProduct(id);
	}
	
	@POST
	@Path("/products")
	@Consumes(MediaType.APPLICATION_JSON)
	public void add(Product product) {
		service.addProduct(product);
	}
	
/*	
	public Product delete(Product product) {
		
	}
*/
}
