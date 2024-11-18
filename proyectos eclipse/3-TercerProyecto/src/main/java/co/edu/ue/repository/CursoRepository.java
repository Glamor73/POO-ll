package co.edu.ue.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Curso;

@Repository
public class CursoRepository {
	
	List<Curso> lista ;

	
	
	public CursoRepository() {
		super();
		listaCursos();
	}
	//4.Metodos de orden
			public List<Curso> listaCursos(){
				this.lista = new ArrayList<Curso>();
			
			
		//llenar lista de cursos
				if(this.lista.isEmpty()) {
		this.lista.add(new Curso(1,"JAVA", "CURSO INICIO JAVA",20,15 ));
		this.lista.add(new Curso(2,"JAVA2", "CURSO AVANZADO JAVA",40,15 ));
		this.lista.add(new Curso(3,"PYTHON", "CURSO BASICO PYTHON",25,15 ));
		this.lista.add(new Curso(4,"C#", "CURSO INICIO C#",18,10 ));
		this.lista.add(new Curso(5,"RUBY", "CURSO RUBY",25,20 ));
		this.lista.add(new Curso(6,"PHP", "CURSO PHP",15,15 ));
		this.lista.add(new Curso(7,"PYTHON2", "CURSO AVANZADO PYTHON",35,15 ));
				}
		return lista;
			}
			//2.BUSCAR CURSO
			public List<Curso> buscarCurso(String nombrecurso){
			List<Curso> listAux = new ArrayList<>();
					List<Curso> listReturn = new ArrayList<>();
					// Asigno a la lista aux todos los elementos que tiene mi lista original
					listAux = this.lista;
					for(Curso c: listAux) {//c es la variable iteradora
						if (c.getNombre().contains (nombrecurso)) {
							listReturn.add(c);
					}
				}

		return listReturn;
			}
		//3. Agregar nuevo curso
			public List<Curso> agregarcurso(Curso course){
				List<Curso> listAux = this.listaCursos();   // obtener la lista original
				if( course != null && ! listAux.contains(course)) { // preguntar si el curso  
					   listAux.add(course); // verificar que el cusro
					   this.lista = listAux;
				}
				return this.lista;
			}
				//4. BUSQUEDA POR ID. equals ( = compara objetos
				/*
				 * int-> Integer
				 * double -> Double
				 */
				public Curso getCursoPorID(long id) {
					return this.lista.stream().filter(i->i.getId().equals(id)).findFirst().orElseThrow();
				}
				
				//5.Dar de baja el curso
				public List<Curso> borrarCurso (long id){
					this.lista.removeIf(c->c.getId().equals(id));
					return this.lista;
				}
}
