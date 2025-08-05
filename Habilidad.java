public class Habilidad {
    private String nombre;
    private String efecto;
    private int activacion; 
    
    public Habilidad(String nombre, String efecto, int activacion){
        this.nombre = nombre; 
        this.efecto = efecto; 
        this.activacion = activacion; 
    }
    public String getNombre(){
        return "Habilidad: " + nombre; 
    }
    public String getEfecto(){
        return "Hará al oponente: " + efecto;
    }
}
