package co.edu.ue.controller;

	import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.bind.annotation.RequestParam;

	import co.edu.ue.entity.Curso;
import co.edu.ue.repository.CursoRepository;
import jakarta.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;

	@RestController
	@RequestMapping(value="web")
	public class CursoController {
		
	CursoRepository cursito;

	@PostConstruct
	public void init () {
		cursito = new CursoRepository();
	}	    	    
		    // Retornar toda la lista de cursos
	@GetMapping(value="curso",produces = MediaType.APPLICATION_JSON_VALUE)
	     public List<Curso>getAllCourse(){
	return cursito.listaCursos();
	}
	  @GetMapping(value="buscar-nombre", produces = MediaType.APPLICATION_JSON_VALUE)
		  public List<Curso> getMethodName(@RequestParam ("name") String name  ) {
		  return cursito.buscarCurso(name.toUpperCase());
	  }
		  /**
		 * @param id
		 * @return
		 */
		@GetMapping(value="buscar-id", produces = MediaType.APPLICATION_JSON_VALUE)
		  public Curso getMethodName(@RequestParam ("id") long id ) {
		  return cursito.getCursoPorID(id);
		  
		}
		  
 //Agregar nuevo curso
	  @PostMapping(value="curso",produces =  MediaType.APPLICATION_JSON_VALUE,
	  	consumes = MediaType.APPLICATION_JSON_VALUE)
	  public List<Curso> posCurso(@RequestBody Curso course) {
	  return cursito.agregarcurso(course);
	  
	  	  }
	  @DeleteMapping(value="curso",produces = MediaType.APPLICATION_JSON_VALUE)
	  public List<Curso> deleteCurso(@RequestParam("id") long id){
		  return cursito.borrarCurso(id);
	  }
	}
//tarea actualizar