
package a03ex03;

import java.util.Scanner;

public class A03ex03 {

   
    public static void main(String[] args) {
       try{
           System.out.printf("Digite a nota: ");
           Scanner s = new Scanner(System.in);
           float nota = s.nextFloat();
           if (nota > 10) {
            throw new Exception("Número muito grande");
           }
           else{
            System.out.printf("Nota Digitada: %.1f\n", nota);
           }
       
       }
       catch(Exception e){
           System.out.println(e.getMessage());
           e.printStackTrace();
       }
    }
    
}
