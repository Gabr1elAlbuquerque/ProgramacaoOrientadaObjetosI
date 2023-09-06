package a03t02;

import javax.swing.*;

public class A03t02 {

  
    public static void main(String[] args) {
        try {
            float largura = Float.parseFloat(JOptionPane.showInputDialog("Digite a Largura"));
            float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
            //System.out.printf("Largura: %.2f Altura: %.2f", largura, altura);
            int totalTijolos = (int) (((largura * altura) * 20) + 1);
            JOptionPane.showMessageDialog(null, "Serão Necessários "+totalTijolos+" tijolos para preencher a parede\n", "Gabriel", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, forneça apenas números!", "ERRO", 0);
        }
        
    }
    
}
