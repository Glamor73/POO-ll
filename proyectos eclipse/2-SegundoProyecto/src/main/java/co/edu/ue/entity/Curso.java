package co.edu.ue.entity;

import java.util.ArrayList;

public class Curso {
	private long id;
	private String nombre;
	private String descripcion;
	private double costo;
	private int capacidad;
	ArrayList<Curso> lista;
	//2. Metodos constructor
	public Curso(long id, String nombre, String descripcion, double costo, int capacidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costo = costo;
		this.capacidad = capacidad;
	}
	
	public Curso() {
		super();
		this.listacursos();
	}

	//3. Metodos de acceso
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	//Retorna toda la lista
	public ArrayList<Curso> getLista() {
		return this.lista;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", costo=" + costo + ", capacidad=" + capacidad + "]";
	}
	//4.Metodos de orden
	public ArrayList<Curso> listacursos(){
		//Declaro lista para crear una lista de cursos
	

this.lista = new ArrayList<Curso>();
//llenar lista de cursos
this.lista.add(new Curso(1,"JAVA", "CURSO INICIO JAVA",20,15 ));
this.lista.add(new Curso(2,"JAVA2", "CURSO AVANZADO JAVA",40,15 ));
this.lista.add(new Curso(3,"PYTHON", "CURSO BASICO PYTHON",25,15 ));
this.lista.add(new Curso(4,"C#", "CURSO INICIO C#",18,10 ));
this.lista.add(new Curso(5,"RUBY", "CURSO RUBY",25,20 ));
this.lista.add(new Curso(6,"PHP", "CURSO PHP",15,15 ));
this.lista.add(new Curso(7,"PYTHON2", "CURSO AVANZADO PYTHON",35,15 ));
return lista;
	}
	//5.BUSCAR CURSO
	public ArrayList<Curso> buscarCurso(String nombrecurso){
	ArrayList<Curso> listAux = new ArrayList<>();
			ArrayList<Curso> listReturn = new ArrayList<>();
			// Asigno a la lista aux todos los elementos que tiene mi lista original
			listAux = this.lista;
			for(Curso c: listAux) {//c es la variable iteradora
				if (c.getNombre().contains (nombrecurso)) {
					listReturn.add(c);
			}
		}

return listReturn;
	}
//6. Agregar nuevo curso
	public ArrayList<Curso> agregarcurso(Curso course){
		ArrayList<Curso> listAux = new ArrayList<Curso>();
		//Asigno a la lista  aux todos los elementos que tiene mi lista original
		listAux = this.listacursos();
		if(! course.equals(null)) { // pregunto si el objeto curso no es igual a null
			   listAux.add(course);
			   this.lista = listAux;
		}
		return this.lista;
	
}
// tarea: metodo eliminar y actualizar
}
