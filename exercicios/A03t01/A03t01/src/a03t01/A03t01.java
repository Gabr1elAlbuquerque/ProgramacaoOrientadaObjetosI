package a03t01;

import java.util.Scanner;

public class A03t01 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite a Largura: ");
        float largura = scanner.nextFloat();
        System.out.printf("Digite a Altura: ");
        float altura = scanner.nextFloat();
        //System.out.printf("Largura: %.2f Altura: %.2f", largura, altura);
        int totalTijolos = (int) (((largura * altura) * 20) + 1);
        System.out.printf("Serão necessários %d tijolos para preencher essa parede\n", totalTijolos);
    }
    
}
