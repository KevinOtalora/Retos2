import java.util.Scanner;

public class Retos3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String[][] productos = new String[16][3]; 
    
        for (int i = 0; i <= productos.length; i++) {
          System.out.print("Ingrese el nombre del producto #" + (i + 1) + ": ");
          productos[i][0] = lectura.nextLine();
          System.out.print("Ingrese el precio del producto #" + (i + 1) + ": ");
          productos[i][1] = lectura.nextLine();
        }
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Catálogo de productos:");
            System.out.println("_____________________");
            System.out.println("Código | Nombre | Precio");
            System.out.println(i + " | " + productos[i][0] + " | " + productos[i][1]);
        }
        lectura.close();
      }
}
