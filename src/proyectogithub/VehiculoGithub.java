package proyectogithub;

public class VehiculoGithub {

    public VehiculoGithub() {
    }

    public String Marca;
    public String Modelo;
    public String Matricula;
    public String Calificacion;
    public double combustible;
    
 
            public String getMarca() {
                return Marca;
            }

            public void setMarca(String Marca) {
                this.Marca = Marca;
            }

            public String getModelo() {
                return Modelo;
            }

            public void setModelo(String Modelo) {
                this.Modelo = Modelo;
            }

            public String getMatricula() {
                return Matricula;
            }

            public void setMatricula(String Matricula) {
                this.Matricula = Matricula;
            }

            public String getCalificacion() {
                return Calificacion;
            }

            public void setCalificacion(String Calificacion) {
                this.Calificacion = Calificacion;
            }
    
   
            
           
            
        public void guardaMarca(String parametro) {
		this.Marca = parametro;
	}
	
	public void escribeMarca() {
		System.out.print(this.Marca);
	}
	
	public void circular(double km) {
		this.combustible = this.combustible - 4 * km;
	}
	
	public void repostar(double litros) {
		this.combustible = this.combustible + litros;
	}
    
    
    
}
