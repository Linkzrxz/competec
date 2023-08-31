import java.util.Scanner;
public class ex1114 {
    public static void main (String[]args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("digite a senha : ");
            String senha = sc.nextLine();
            int contador = 1;
            while (senha.equals("senha123") && contador <= 2){
                System.out.println("Senha incorreta, tente novamente: \nTentativas restantes :" + (3-contador));
                contador++;
                senha = sc.nextLine();
            }
            System.out.println();
            if(senha.equals("senha123")) {
                System.out.println("Acesso permitido");
            } else  {
                System.out.println("Acesso bloquado (senha incorreta)");
            }

     }
}
}
