
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double lancheCarne = 4.95;
            double lancheQueijo = 4.30;
            double lancheFrango = 5.95;
            double lancheVegano = 9.99;

            double sucoLimao = 5.50;
            double sucoLaranja = 5.75;
            double sucoUva = 5.85;
            double sucoMaracuja = 5.95;

            boolean rodarDenovo = true;

            while (rodarDenovo) {
                System.out.println("Escolha o lanche:");
                System.out.println("1 - Lanche de carne");
                System.out.println("2 - Lanche de queijo");
                System.out.println("3 - Lanche de frango");
                System.out.println("4 - Lanche vegano");
                int escolhaLanche = sc.nextInt();
                
                String nomeLanche = ""; 

                switch (escolhaLanche) {
                    case 1:
                        nomeLanche = "Lanche de carne";
                        break;
                    case 2:
                        nomeLanche = "Lanche de queijo";
                        break;
                    case 3:
                        nomeLanche = "Lanche de frango";
                        break;
                    case 4:
                        nomeLanche = "Lanche vegano";
                        break;
                    default:
                        System.out.println("Escolha de lanche inválida.");
                        continue;
                }

                System.out.println("Escolha o suco:");
                System.out.println("1 - Suco de limão");
                System.out.println("2 - Suco de laranja");
                System.out.println("3 - Suco de uva");
                System.out.println("4 - Suco de maracuja");
                int escolhaSuco = sc.nextInt();
                
                String nomeSuco = ""; 

                switch (escolhaSuco) {
                    case 1:
                        nomeSuco = "Suco de limão";
                        break;
                    case 2:
                        nomeSuco = "Suco de laranja";
                        break;
                    case 3:
                        nomeSuco = "Suco de uva";
                        break;
                    case 4:
                        nomeSuco = "Suco de maracuja";
                        break;
                    default:
                        System.out.println("Escolha de suco inválida.");
                        continue;
                }

                double precoTotal = lancheCarne + sucoLimao; 

                switch (escolhaLanche) {
                    case 1:
                        precoTotal = lancheCarne + sucoLimao;
                        break;
                    case 2:
                        precoTotal = lancheQueijo + sucoLaranja;
                        break;
                    case 3:
                        precoTotal = lancheFrango + sucoUva;
                        break;
                    case 4:
                        precoTotal = lancheVegano + sucoMaracuja;
                        break;
                }

                System.out.println("Lanche escolhido: " + nomeLanche);
                System.out.println("Suco escolhido: " + nomeSuco);
                System.out.println("Total a pagar: " + precoTotal);

                System.out.print("Você quer fazer outro pedido? (S/N): ");
                String input = sc.next();
                rodarDenovo = input.equalsIgnoreCase("S");
            }
        }
    }
}