import java.util.Scanner;
public class ex1008 {
    public static void main(String[]args){
try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Insira seu número :");
    int numero = sc.nextInt();
    
    System.out.print("Insira suas horas trabalhadas :");
    int horasTrab = sc.nextInt();
    
    System.out.print("Insira quanto ganha por hora :");
    double ganhoPorHr = sc.nextDouble();
    
     double salario = (horasTrab * ganhoPorHr);
     
     System.out.println("Número :" + numero);
     
     System.out.println("Salário :" + salario);
}

    }
}