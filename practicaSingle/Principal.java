package practicaSingle;

public class Principal {
    public static void main(String[] args) {

        Videojuegos video1 = Videojuegos.getInstance();
        Videojuegos video2 = Videojuegos.getInstance();
        Videojuegos video3 = Videojuegos.getInstance();

        System.out.println(Videojuegos.contador);

    }
}
