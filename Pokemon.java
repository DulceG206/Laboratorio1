public class Pokemon {
    private String nombre;
    private String tipo;
    private int ataque; 
    private int defensa; 
    private Habilidad habilidad; 

    public Pokemon (String nombre, String tipo, int ataque, int defensa, Habilidad habilidad){
        this.nombre = nombre; 
        this.ataque = ataque;
        this.defensa = defensa;
        this.habilidad = habilidad;
    }
    public void atacar(){

    }
    public void usarHabilidad(Habilidad habilidad){
        
    }
    public String getNombre(){
        return nombre;

    }
    public int getAtaque(){
        return ataque;

    }
    public int getDefensa(){
        return defensa;

    }

    public String getTipo(){
        return tipo;

    }
     public Habilidad getHabilidad(){
        return habilidad;

    }

}
