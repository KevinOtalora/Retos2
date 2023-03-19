import java.util.Arrays;
import java.util.Scanner;

public class Retos2 {
    public static void main(String[] args) {
     String palabra;
     
     Scanner lectura=new Scanner(System.in);
     
     System.out.println("ingresa la palabra que desees para determinar si es palindromo");
     palabra=lectura.next();
     
     char[] letra=palabra.toCharArray();

     char[] caracteresInvertidos=new char[letra.length];

     for(int i=0;i<letra.length;i++){
        caracteresInvertidos[i]=letra[letra.length-1-i];
     }

     boolean equals=Arrays.equals(letra, caracteresInvertidos);
     if (equals) {
        System.out.println("La palabra ("+palabra+") es un palindromo");
     }else{
        System.out.println("La palabra ("+palabra+") no es un palindromo");
     }
     lectura.close();
    }
}
