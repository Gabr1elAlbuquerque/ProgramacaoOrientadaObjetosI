package a02ex06;

import java.util.Scanner;

public class A02ex06 {

    public static void main(String[] args) {

        float n1 = Float.parseFloat(args[0]);
        float n2 = Float.parseFloat(args[1]);

        float soma = (n1 + n2);
        Scanner s = new Scanner(System.in);

        System.out.printf("O valor da soma de %.1f e %.1f é igual a %.1f\n", n1, n2, soma);
    }
             
}
