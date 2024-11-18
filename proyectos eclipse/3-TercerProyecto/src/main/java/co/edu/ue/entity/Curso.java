package co.edu.ue.entity;


public class Curso {
	//1. declaracion de atributos
		private Long id;
		private String nombre;
		private String descripcion;
		private double costo;
		private int capacidad;
		
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
			//this.listacursos();
		}

		//3. Metodos de acceso
		public 	Long getId() {
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
	

		@Override
		public String toString() {
			return "Curso [id=" + id + ", costo=" + costo + ", capacidad=" + capacidad + "]";
		}
		
		
	
	}
