package controllers;

import java.util.List;

import models.College;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.colleges.list;

public class Colleges extends Controller{
	private static final Form<College> collegeForm = Form
			.form(College.class);
	
	public static Result list(){
		List<College> colleges = College.findAll();
		return ok(list.render(colleges));
	}
	
	public static Result newCollege(){
		return TODO;
	}
	
	public static Result details(String internalId){
		return TODO;
	}
	
	public static Result save(){
		return TODO;
	}
	
	public static Result delete(String internalId){
		return TODO;
	}

}
