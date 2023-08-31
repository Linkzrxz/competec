import java.util.Scanner;
public class campeonato{
    public static void main(String[]args){

        try(Scanner scn = new Scanner (System.in)){
        System.out.print("digite sua idade em dias :");
        int idadeDias = scn.nextInt();
        int idadeAnos = idadeDias / 365;
        idadeDias -= idadeAnos * 365;
        int idadeMeses = idadeDias / 30;
        idadeDias -= idadeMeses * 30;
        
        System.out.print(idadeAnos + "ano(s)");
    System.out.print(idadeMeses + "mes(es)");
    System.out.print(idadeDias + "dia(s)");
        }
    }

}