public class PokemonController {
    private Entrenador entrenador;
    private Pokemon pokemon; 
    private Habilidad habilidad; 

    public PokemonController() {

    }

    public Entrenador crearEntrenador(String nombreEntrenador,String apellido, int edad){
        return new Entrenador(nombreEntrenador, apellido, edad); 
        
    }

    public Pokemon crearPokemon(String nombre, String tipo, int ataque, int defensa, Habilidad habilidad) {
        return new Pokemon(nombre, tipo, defensa, ataque, habilidad); 
    
     
}
  public Habilidad crearHabilidad(String nombre, String efecto, int activacion) {
        return new Habilidad(nombre, efecto, activacion); 
     
}
 public void luchar(Entrenador entrenador1, Pokemon pokemon1, boolean usarHabilidad1, Entrenador entrenador2, Pokemon pokemon2, boolean usarHabilidad2) {
    System.out.println(entrenador1.getNombre() + " ha enviado a " + pokemon1.getNombre());
    System.out.println(entrenador2.getNombre() + " ha enviado a " + pokemon2.getNombre());

    int ataqueTotal1 = pokemon1.getAtaque();
    int ataqueTotal2 = pokemon2.getAtaque();

    ataqueTotal1 += calcularVentajaTipo(pokemon1.getTipo(), pokemon2.getTipo());
    ataqueTotal2 += calcularVentajaTipo(pokemon2.getTipo(), pokemon1.getTipo());


    if (usarHabilidad1) {
        ataqueTotal1 += pokemon1.getHabilidad().getModificadorAtaque(); 
        ataqueTotal2 += pokemon1.getHabilidad().getModificadorEnemigo(); 
        System.out.println(pokemon1.getNombre() + " usó habilidad especial: " + pokemon1.getHabilidad().getNombre());
    }

    if (usarHabilidad2) {
        ataqueTotal2 += pokemon2.getHabilidad().getModificadorAtaque();
        ataqueTotal1 += pokemon2.getHabilidad().getModificadorEnemigo();
        System.out.println(pokemon2.getNombre() + " usó habilidad especial: " + pokemon2.getHabilidad().getNombre());
    }

    System.out.println("Ataque total de " + pokemon1.getNombre() + ": " + ataqueTotal1);
    System.out.println("Ataque total de " + pokemon2.getNombre() + ": " + ataqueTotal2);

    if (ataqueTotal1 > ataqueTotal2) {
        System.out.println(entrenador1.getNombre() + " ha ganado");
        entrenador1.sumarPuntos(1);
    } else if (ataqueTotal2 > ataqueTotal1) {
        System.out.println(entrenador2.getNombre() + " ha ganado");
        entrenador2.sumarPuntos(1);
    } else {
        System.out.println("Empate");
        entrenador1.sumarPuntos(1);
        entrenador2.sumarPuntos(1);
    }
}
}



