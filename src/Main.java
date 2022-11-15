//Hecho Daniel Coll Fernández
public class Main {
    public static void main(String[]args){
        Veredicto v = new Veredicto();

        System.out.println("Estudiante: " + args[0]);
        v.v(args[1], args[2]);

    }
}
