import java.util.Scanner;
public class ex1044 {
    public static void main (String[]args){

try (Scanner sc = new Scanner(System.in)){

    System.out.println("insira  o primeiro numero :");
int n1 = sc.nextInt();

    System.out.println("Insira o segundo numero :");
int n2 = sc.nextInt();

if(n2 % n1 == 0){
    System.out.println("São multiplos");
}else{
    System.out.println("Não são multiplos");
}
}
}
}