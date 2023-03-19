import java.util.Scanner;

public class Retos1 {
    public static void main(String[] args) {
        double apuesta=100000;
        String nombre, respuesta;
        
        Scanner lectura=new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        nombre=lectura.next();

        boolean seguirJugando=true;

        while (seguirJugando) {
            int intentosRest=15;
            char palabraEscrita;
            boolean letraEncontrada=false;
            char[] palabraAdivinada;

            String[] palabras={"cristianoronaldo","musica","televisor","rinoceronte","computador"};
            String palabraSeleccionada=palabras[(int) (Math.random() * palabras.length)];
            palabraAdivinada=new char[palabraSeleccionada.length()]; 
            
            for (int i=0;i<palabraAdivinada.length;i++){
                palabraAdivinada[i]='_';
            }
            while (intentosRest>0 && !palabraSeleccionada.equals(new String(palabraAdivinada))) {
                System.out.println("Palabra a adivinar: ");
                for (char letra : palabraAdivinada){
                    System.out.println(letra + " ");
                }
                System.out.println();
                System.out.println("Intentos restantes: " + intentosRest);
                System.out.print("Ingresa una letra: ");
                palabraEscrita=lectura.next().charAt(0);

                letraEncontrada=false;
                for (int i=0;i<palabraSeleccionada.length();i++){
                    if (palabraSeleccionada.charAt(i) == palabraEscrita) {
                        palabraAdivinada[i]=palabraEscrita;
                        letraEncontrada=true;
                    }
                }
                if (!letraEncontrada) {
                    intentosRest--;
                }
            }
            if (intentosRest==0) {
                System.out.println("Nombe "+nombre+" perdiste, la palabra a adivinar era: "+palabraSeleccionada);
                apuesta=apuesta-10000;
            }else {
                System.out.println("felicitaciones "+nombre+" adivinaste la palabra "+palabraSeleccionada);
                apuesta=apuesta+5000;
            }
            System.out.println("Tu apuesta actual es de: $"+apuesta);
            System.out.println("Quieres seguir jugando s:(si) n:(no)");
            respuesta=lectura.next();
            seguirJugando=respuesta.equalsIgnoreCase("s");
        }
        System.out.println(nombre+" gracias por jugar, tu saldo final es de: $"+apuesta);
        lectura.close();
    }
}
