package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@GetMapping("/principal")
	public String getIndexPage() {
		return"index";
	}
	
	@GetMapping("/formulario")
	public String getFormulario() {
		return "form-cliente";
	}
}
