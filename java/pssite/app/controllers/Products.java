package controllers;

import java.util.List;

import models.Product;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.products.list;
import views.html.products.details;

public class Products extends Controller{

	private static final Form<Product> productForm = Form
			.form(Product.class);
	
	public static Result list(){
		List<Product> products = Product.findAll();
		return ok(list.render(products));
	}
	
	public static Result newProduct(){
		return ok(details.render(productForm));
	}	
	public static Result details(String ean){
		return TODO;
	}	
	public static Result save(){
		Form<Product> boundForm = productForm.bindFromRequest();
		if(boundForm.hasErrors()) {
		flash("error", "Please correct the form below.");
		return badRequest(details.render(boundForm));
		}
		Product product = boundForm.get();
		product.save();
		flash("success",
		String.format("Successfully added product %s", product));
		return redirect(routes.Products.list());
	}
	
	public static Result index(){
		return TODO;
	}
	
}
