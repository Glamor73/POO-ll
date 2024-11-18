package co.edu.uniempresarial.primerp;

import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeEditor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimerProyectoContoller {

	@GetMapping(value="control1", produces =   MediaType.APPLICATION_JSON_VALUE)
	public String primerControlador() {
	 return "controlador 1";
			 
	}
	
	//Recibiendo Valores(Variable) en la url
	@GetMapping(value="addition/{num1}/{num2}",produces =   MediaType.APPLICATION_JSON_VALUE)
	public double suma(@PathVariable("num1") double numero1, 
@PathVariable("num2") double numero2){ 
		return numero1 + numero2;
		
}
	//recibiendo valores con queryparam
	@RequestMapping(value="sustract", method = RequestMethod.GET )
	public double resta(@RequestParam("num1") double numero1, 
@RequestParam("num2") double numero2){ 
		return numero1 - numero2;
      }
	
}