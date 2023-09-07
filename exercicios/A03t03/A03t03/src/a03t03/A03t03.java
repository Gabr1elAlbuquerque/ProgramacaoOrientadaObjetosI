package a03t03;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class A03t03 {


    public static void main(String[] args) {
        try {
            
            float largura = Float.parseFloat(JOptionPane.showInputDialog("Digite a largura da parede: "));
            float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da parede: "));
            String alturaParede = null;
            int totalTijolos = (int)(largura * altura) * 20;
            
            if(altura >= 3.5){
                alturaParede = "ALTA";
            }
            else if(altura < 3.5 && altura > 3.25){
                alturaParede = "MÉDIA";
            }
            else{
                alturaParede = "BAIXA";
            }
            JOptionPane.showMessageDialog(null, "Serão Necessários "+totalTijolos+" tijolos para preencher a parede, ela é " + alturaParede+"\n", "Total de Tijolos", 1);          
        } 
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Houve um erro, forneça apenas números", "Erro", 0);
        }

        
    }
    
}
