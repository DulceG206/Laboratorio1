public class Entrenador {
    private String nombreEntrenador; 
    private String apellido; 
    private int edad;

    public Entrenador (String nombreEntrenador, String apellido, int edad){
        this.nombreEntrenador = nombreEntrenador;
        this.apellido = apellido; 
        this.edad = edad; 
    }
    public String getNombre() {
     return "El nombre del entrenador es: " + nombreEntrenador;
    }

    public String getApellido(){
        return "El apellido del entrenador es: " + apellido; 
    }
   
    public String getNombreCompleto(){
        return "Entrenador registrado: " + nombreEntrenador + apellido; 
    }

}