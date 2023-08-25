
package a02t03;

import java.lang.Math;

public class A02t03 {

    
    public static void main(String[] args) {
        
        int n1 = (int)Float.parseFloat(args[0]);
        int n2 = (int)Float.parseFloat(args[1]);
        
        System.out.printf("n1: %d\nn2: %d\n", n1, n2);
        float pow = (float)Math.pow(n1, n2);
    }
    
}
