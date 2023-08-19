package a03ex02;

import java.util.Scanner;
        
public class A03ex02 {

    public static void main(String[] args) {
       try{
           System.out.printf("Digite a nota: ");
           Scanner s = new Scanner(System.in);
           float nota = s.nextFloat();
           System.out.printf("Nota Digitada: %.1f\n", nota);
       }
       catch(Exception e){
           //System.out.printf("Houve um erro, digite apenas números!\n");
           e.printStackTrace();
       }
    }
    
}
