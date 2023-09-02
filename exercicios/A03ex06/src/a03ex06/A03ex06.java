
package a03ex06;

import javax.swing.*;

public class A03ex06 {

    public static void main(String[] args) {
        String escolha = JOptionPane.showInputDialog("Digite V para verdadeiro e F para falso");
        
        if(escolha.equals("V") || escolha.equals("F")){
            JOptionPane.showMessageDialog(null,"Escolha: " +escolha);
        }else{
            
        }
    }
    
}
