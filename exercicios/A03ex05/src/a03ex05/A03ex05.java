package a03ex05;


public class A03ex05 {

    
    public static void main(String[] args) {
        
        int nota = (int) Float.parseFloat(args[0]);
        
        if(nota == 10){
            System.out.println("Excelente!");
        }else if(nota >=5 && nota <=7){
            System.out.println("Regular");
        }else if(nota > 7 && nota <=9){
            System.out.println("Muito Bom");
        }else if(nota > 10 || nota < 0){
            System.out.println("Erro, forneça uma nota entre 0 e 10");
        }else{
            System.out.println("Você precisa melhorar");
        }
}
}