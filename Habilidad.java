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
    public int getModificadorAtaque() {
        if (efecto.toLowerCase().contains("llama")) return 15;
        if (efecto.toLowerCase().contains("escudo")) return 0;
        if (efecto.toLowerCase().contains("impacto")) return 0;
        return 0;
    }

    public int getModificadorEnemigo() {
        if (efecto.toLowerCase().contains("impacto")) return -10;
        return 0;
    }
}
