package a02t01;

import java.util.Scanner;

public class A02t01 {

    
    public static void main(String[] args) {
        
        System.out.printf("Digite seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.printf("Digite um número: ");
        int n = scanner.nextInt();
        System.out.printf("Digite um float: ");
        float n2 = scanner.nextFloat();
        
        System.out.printf("Nome: %s, Int: %d, Float: %f\n",nome, n, n2);
    }
    
}
