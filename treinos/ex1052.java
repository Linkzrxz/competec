import java.util.Scanner;
public class ex1052{
    public static void main (String[]args){

try(Scanner sc = new Scanner(System.in)){

System.out.print("escolha um mês : ");

int escolha = sc.nextInt();
        
        if(escolha == 1){
            System.out.println("Janeiro");
        }
       else if(escolha == 2){
            System.out.println("Fevereiro");
       }
       else if(escolha == 3){
            System.out.println("Março");
       }
       else if(escolha == 4){
            System.out.println("Abril");
       }
       else if(escolha == 5){
            System.out.println("Maio");
       }
       else if(escolha == 6){
            System.out.println("Junho");
       }
       else if(escolha == 7){
            System.out.println("Julho");
       }
       else if(escolha == 8){
            System.out.println("Agosto");
       }
       else if(escolha == 9){
            System.out.println("Setembro");
       }
       else if(escolha == 10){
            System.out.println("Outubro");
       }
       else if(escolha == 11){
            System.out.println("Novembro");
       }
        else{
            System.out.println("Dezembro");
        }      
         
        }
    }
}
