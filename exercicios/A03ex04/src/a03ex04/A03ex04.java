package a03ex04;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class A03ex04 {

    public static void main(String[] args) {
        try {
           String valor = JOptionPane.showInputDialog("Digite a nota:");
           int nota = (int) Float.parseFloat(valor);
           JOptionPane.showMessageDialog(null,"Nota digitada: "+nota);
        } 
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showConfirmDialog(null,"Houve um erro. Digite apenas números");
        }
    }
    
}
