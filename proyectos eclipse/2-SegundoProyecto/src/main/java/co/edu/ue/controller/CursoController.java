package co.edu.ue.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.ue.entity.Curso;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value="web")
public class CursoController {
//Instanciacion de objeto tipo Curso
	private Curso cursito = new Curso(); //nombre del objeto es curso
	//Retornar toda la lista de cursos 
@GetMapping (value="Cursos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Curso>getACurses(){
		return cursito.getLista();
	}

@GetMapping(value="buscar", produces = MediaType.APPLICATION_JSON_VALUE)
public ArrayList<Curso> getAllCourseName(@RequestParam("name") String name) {
    return cursito.buscarCurso(name.toUpperCase());
}

	    
	    
	    // Agregar nuevo  CURSO
@PostMapping(value="curso",produces = MediaType.APPLICATION_JSON_VALUE,
       consumes = MediaType.APPLICATION_JSON_VALUE)
public String postCurso(@RequestBody Curso corse ) {
	ArrayList<Curso> cursos = new ArrayList<>();
	int sizeIni = cursito.getLista().size();
	cursos = cursito.agregarcurso(corse);
	int sizeEnd = cursito.getLista().size();
	if(sizeEnd > sizeIni) return "se agrego curso";
	else return "No se agrego curso";
}

	    
}