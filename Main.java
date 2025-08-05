import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
  
    PokemonController pokemonController = new PokemonController();

    while (true) {
    System.out.println("1. Registrar Entrenador 1");
    System.out.println("2. Crear Habilidad de los pokemones");
    System.out.println("3. Crear Pokemones");
    System.out.println("1. Registrar Entrenador 2");
    System.out.println("2. Crear Habilidad de los pokemones del segundo entrenador");
    System.out.println("3. Crear Pokemones del segundo entrenador");

    System.out.print("Elija una opción del menu ");
    int opcion = scanner.nextInt();
    scanner.nextLine();

    Entrenador entrenador1 = null;
    Entrenador entrenador2 = null; 
    Pokemon pokemon1 = null;  
    Pokemon pokemon2 = null; 
    Pokemon pokemon3 = null; 
    Pokemon pokemon4 = null; 
    Habilidad habilidad1 = null;
    Habilidad habilidad2 = null;
    Habilidad habilidad3 = null;
    Habilidad habilidad4 = null;
    Pokemon pokemon5 = null;  
    Pokemon pokemon6 = null; 
    Pokemon pokemon7 = null; 
    Pokemon pokemon8 = null; 
    Habilidad habilidad5 = null;
    Habilidad habilidad6 = null;
    Habilidad habilidad7 = null;
    Habilidad habilidad8 = null;

        switch (opcion) {

    case 1: 
    System.out.print("Ingrese el nombre del primer Entrenador que va a aprticipar: ");
    String nombreEntrenador = scanner.nextLine();
    System.out.print("Ingrese el apellido del Entrenador: ");
    String apellido = scanner.nextLine();
    System.out.print("Ingrese la edad del Entrenador: ");
    int edad = scanner.nextInt();
    entrenador1 = pokemonController.crearEntrenador(nombreEntrenador, apellido, edad);

    case 2:
    System.out.print("Ingrese el nombre de la habilidad especial de su primer pokemon: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el efecto que tendrá en el oponente: ");
    String efecto = scanner.nextLine();
    System.out.print("Ingrese el numero activacion de la habilidad: ");
    int activacion = scanner.nextInt();
    Habilidad habilidad = new Habilidad(nombre, efecto, activacion);
    scanner.nextLine();
    habilidad1 = pokemonController.crearHabilidad(nombre, efecto, activacion);
    System.out.print("Ingrese el nombre de la habilidad especial de su segundo pokemon: ");
    String nombre2 = scanner.nextLine();
    System.out.print("Ingrese el efecto que tendrá en el oponente: ");
    String efecto2 = scanner.nextLine();
    System.out.print("Ingrese el numero activacion de la habilidad: ");
    int activacion2 = scanner.nextInt();
    scanner.nextLine();
    habilidad2 = pokemonController.crearHabilidad(nombre2, efecto2, activacion2);
    scanner.nextLine();
    System.out.print("Ingrese el nombre de la habilidad especial de su tercer pokemon: ");
    String nombre3 = scanner.nextLine();
    System.out.print("Ingrese el efecto que tendrá en el oponente: ");
    String efecto3 = scanner.nextLine();
    System.out.print("Ingrese el numero activacion de la habilidad: ");
    int activacion3 = scanner.nextInt();
    scanner.nextLine();
    habilidad3 = pokemonController.crearHabilidad(nombre3, efecto3, activacion3);
    scanner.nextLine();
    System.out.print("Ingrese el nombre de la habilidad especial de su cuarto pokemon: ");
    String nombre4 = scanner.nextLine();
    System.out.print("Ingrese el efecto que tendrá en el oponente: ");
    String efecto4 = scanner.nextLine();
    System.out.print("Ingrese el numero activacion de la habilidad: ");
    int activacion4 = scanner.nextInt();
    scanner.nextLine();
    habilidad4 = pokemonController.crearHabilidad(nombre2, efecto2, activacion2);
    scanner.nextLine();
    break;

    case 3:
    System.out.print("Ingrese el nombre del primer pokemon a usar: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el tipo de su pokemon: ");
    String tipo = scanner.nextLine();
    System.out.print("Ingrese el numero de ataque de su pokemon ");
    int ataque = scanner.nextInt();
    System.out.print("Ingrese el numero de defensa de su pokemon ");
    int defensa = scanner.nextInt();
    scanner.nextLine();
    pokemon1 = pokemonController.crearPokemon(nombre, tipo, ataque, defensa, habilidad);
    scanner.nextLine();
    System.out.print("Ingrese el nombre del segundo pokemon a usar: ");
    String nombre2 = scanner.nextLine();
    System.out.print("Ingrese el tipo de su pokemon: ");
    String tipo2 = scanner.nextLine();
    System.out.print("Ingrese el numero de ataque de su pokemon ");
    int ataque2 = scanner.nextInt();
    System.out.print("Ingrese el numero de defensa de su pokemon ");
    int defensa2 = scanner.nextInt();
    scanner.nextLine();
    pokemon2 = pokemonController.crearPokemon(nombre2, tipo2, ataque2, defensa2, habilidad2);
    scanner.nextLine();
    System.out.print("Ingrese el nombre del tercer pokemon a usar: ");
    String nombre3 = scanner.nextLine();
    System.out.print("Ingrese el tipo de su pokemon: ");
    String tipo3 = scanner.nextLine();
    System.out.print("Ingrese el numero de ataque de su pokemon ");
    int ataque3 = scanner.nextInt();
    System.out.print("Ingrese el numero de defensa de su pokemon ");
    int defensa3 = scanner.nextInt();
    scanner.nextLine();
    pokemon3 = pokemonController.crearPokemon(nombre3, tipo3, ataque3, defensa3, habilidad3);
    scanner.nextLine();
    System.out.print("Ingrese el nombre del cuarto pokemon a usar: ");
    String nombre4 = scanner.nextLine();
    System.out.print("Ingrese el tipo de su pokemon: ");
    String tipo4 = scanner.nextLine();
    System.out.print("Ingrese el numero de ataque de su pokemon ");
    int ataque4 = scanner.nextInt();
    System.out.print("Ingrese el numero de defensa de su pokemon ");
    int defensa4 = scanner.nextInt();
    scanner.nextLine();
    pokemon4 = pokemonController.crearPokemon(nombre4, tipo4, ataque4, defensa4, habilidad4);
    scanner.nextLine();
    break;
    case 4: 
    System.out.print("Ingrese el nombre del segundo Entrenador que va a aprticipar: ");
    String nombreEntrenador2 = scanner.nextLine();
    System.out.print("Ingrese el apellido del Entrenador: ");
    String apellido2 = scanner.nextLine();
    System.out.print("Ingrese la edad del Entrenador: ");
    int edad2 = scanner.nextInt();
    entrenador2 = pokemonController.crearEntrenador(nombreEntrenador2, apellido2, edad2);

    case 5:
    System.out.print("Ingrese el nombre de la habilidad especial de su primer pokemon: ");
    String nombre5 = scanner.nextLine();
    System.out.print("Ingrese el efecto que tendrá en el oponente: ");
    String efecto5 = scanner.nextLine();
    System.out.print("Ingrese el numero activacion de la habilidad: ");
    int activacion5 = scanner.nextInt();
    scanner.nextLine();
    habilidad5 = pokemonController.crearHabilidad(nombre5, efecto5, activacion5);
    System.out.print("Ingrese el nombre de la habilidad especial de su segundo pokemon: ");
    String nombre6 = scanner.nextLine();
    System.out.print("Ingrese el efecto que tendrá en el oponente: ");
    String efecto6 = scanner.nextLine();
    System.out.print("Ingrese el numero activacion de la habilidad: ");
    int activacion6 = scanner.nextInt();
    scanner.nextLine();
    habilidad6 = pokemonController.crearHabilidad(nombre6, efecto6, activacion6);
    scanner.nextLine();
    System.out.print("Ingrese el nombre de la habilidad especial de su tercer pokemon: ");
    String nombre7 = scanner.nextLine();
    System.out.print("Ingrese el efecto que tendrá en el oponente: ");
    String efecto7 = scanner.nextLine();
    System.out.print("Ingrese el numero activacion de la habilidad: ");
    int activacion7 = scanner.nextInt();
    scanner.nextLine();
    habilidad7 = pokemonController.crearHabilidad(nombre7, efecto7, activacion7);
    scanner.nextLine();
    System.out.print("Ingrese el nombre de la habilidad especial de su cuarto pokemon: ");
    String nombre8 = scanner.nextLine();
    System.out.print("Ingrese el efecto que tendrá en el oponente: ");
    String efecto8 = scanner.nextLine();
    System.out.print("Ingrese el numero activacion de la habilidad: ");
    int activacion8 = scanner.nextInt();
    scanner.nextLine();
    habilidad8 = pokemonController.crearHabilidad(nombre8, efecto8, activacion8);
    scanner.nextLine();
    break;
    case 6:
    System.out.print("Ingrese el nombre del primer pokemon a usar: ");
    String nombre5 = scanner.nextLine();
    System.out.print("Ingrese el tipo de su pokemon: ");
    String tipo5 = scanner.nextLine();
    System.out.print("Ingrese el numero de ataque de su pokemon ");
    int ataque5 = scanner.nextInt();
    System.out.print("Ingrese el numero de defensa de su pokemon ");
    int defensa5 = scanner.nextInt();
    scanner.nextLine();
    pokemon5 = pokemonController.crearPokemon(nombre5, tipo5, ataque5, defensa5, habilidad5);
    scanner.nextLine();
    System.out.print("Ingrese el nombre del segundo pokemon a usar: ");
    String nombre6 = scanner.nextLine();
    System.out.print("Ingrese el tipo de su pokemon: ");
    String tipo6 = scanner.nextLine();
    System.out.print("Ingrese el numero de ataque de su pokemon ");
    int ataque6 = scanner.nextInt();
    System.out.print("Ingrese el numero de defensa de su pokemon ");
    int defensa6 = scanner.nextInt();
    scanner.nextLine();
    pokemon6 = pokemonController.crearPokemon(nombre6, tipo6, ataque6, defensa6, habilidad6);
    scanner.nextLine();
    System.out.print("Ingrese el nombre del tercer pokemon a usar: ");
    String nombre7 = scanner.nextLine();
    System.out.print("Ingrese el tipo de su pokemon: ");
    String tipo7 = scanner.nextLine();
    System.out.print("Ingrese el numero de ataque de su pokemon ");
    int ataque7 = scanner.nextInt();
    System.out.print("Ingrese el numero de defensa de su pokemon ");
    int defensa7 = scanner.nextInt();
    scanner.nextLine();
    pokemon7 = pokemonController.crearPokemon(nombre7, tipo7, ataque7, defensa7, habilidad7);
    scanner.nextLine();
    System.out.print("Ingrese el nombre del cuarto pokemon a usar: ");
    String nombre8 = scanner.nextLine();
    System.out.print("Ingrese el tipo de su pokemon: ");
    String tipo8 = scanner.nextLine();
    System.out.print("Ingrese el numero de ataque de su pokemon ");
    int ataque8 = scanner.nextInt();
    System.out.print("Ingrese el numero de defensa de su pokemon ");
    int defensa8 = scanner.nextInt();
    scanner.nextLine();
    pokemon8 = pokemonController.crearPokemon(nombre8, tipo8, ataque8, defensa8, habilidad8);
    scanner.nextLine();
    break;
    default:
    System.out.println("Opción inválida.");
    }

    System.out.println("Que comience el juego");
    pokemonController.luchar(entrenador1, pokemon1, usarHabilidad1, entrenador2, pokemon2, usarHabilidad2);

    }

 }
}