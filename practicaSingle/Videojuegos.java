package practicaSingle;

public class Videojuegos {
    private String nombre;
    static int contador;
    static private Videojuegos videojuegos;
    private Videojuegos(String nombre){
        this.nombre = nombre;
        contador++;
    }

    public static Videojuegos getInstance() {
        if (videojuegos==null){
            videojuegos = new Videojuegos("PlayStation");
            return videojuegos;
        }else{
         return videojuegos;
        }
    }
}
