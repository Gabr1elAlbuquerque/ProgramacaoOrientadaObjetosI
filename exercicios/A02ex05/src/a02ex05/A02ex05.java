
package a02ex05;


public class A02ex05 {

    
    public static void main(String[] args) {
        int x = 10;
        double y = 3.5;
        char z = 'a';
        String v = "3.5";
        
        float n = (int)y;
        System.out.println("N = "+n);
        n = Float.parseFloat(v);
        System.out.println("N = "+n);
        float a = (float)x;
        String idade = ""+x;
        System.out.println("Valor de a: "+a+" idade = "+idade);
        
        
        
    }
    
}
