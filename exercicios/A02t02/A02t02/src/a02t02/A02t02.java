
package a02t02;

import java.util.Scanner;

public class A02t02 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float media = 0f;
        System.out.printf("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.printf("Nota1: ");
        float nota1 = scanner.nextFloat();
        System.out.printf("Nota2: ");
        float nota2 = scanner.nextFloat();
        media = (nota1 + nota2) / 2;
        System.out.printf("%s, com as notas %.1f e %.1f você tem a média %.1f\n", nome, nota1, nota2, media);
        
        
    }
    
}
