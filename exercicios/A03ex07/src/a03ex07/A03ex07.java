
package a03ex07;


public class A03ex07 {

    public static void main(String[] args) {
        if(args.length > 0){
            String info="";
            switch(args[0]){
                case "1": info="Domingo";break;
                case "2": info="Segunda-feira";break;
                case "3": info="Terça-feira";break;
                case "4": info="Quarta-feira";break;
                case "5": info="Quinta-feira";break;
                case "6": info="Sexta-feira";break;
                case "7": info="Sábado";break;
                default:  info ="Argumento inválido";
            }
            System.out.println(info);
        }else{
            System.out.println("Argumento numérico obrigatório!");
        }
    }
    
}
