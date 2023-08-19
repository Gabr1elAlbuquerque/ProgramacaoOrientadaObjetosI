
package a03ex01;

import java.util.Scanner;

public class A03ex01 {

   
    public static void main(String[] args) {
        System.out.printf("Digite seu nome:");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        System.out.printf("Digite a nota 1: ");
        Scanner n = new Scanner(System.in);
        float nota1 = n.nextFloat();
        System.out.printf("Digita a nota 2: ");
        float nota2 = n.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.printf("%s, sua Média é : %.1f",nome,media);
    }
    
}
