public class Veredicto {

    private void v(String valor1, String valor2){
        if (valor1.equals(valor2)){
            System.out.println("Bien pero puedes estudiar más.");
        } else if (Integer.valueOf(valor1)>Integer.valueOf(valor2)) {
            System.out.println("Hace falta más estudio.");
        }else {
            System.out.println("Estudias mucho, bien hecho.");
        }
    }
}
