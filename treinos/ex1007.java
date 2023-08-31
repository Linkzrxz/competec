import java.util.Scanner;
public class ex1007 {
    public static void main(String[]args){

try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Insira o primeiro valor :");
    int a = sc.nextInt();
    
    System.out.print("Insira o segundo valor :");
    int b = sc.nextInt();
    
    System.out.print("Insira o terceiro valor :");
    int c = sc.nextInt();
    
    System.out.print("Insira o quarto valor :");
    int d = sc.nextInt();
    
    int produtoA = (a * b);
    int produtoB = (c * d);
    
    int diferenca = (produtoA - produtoB);
    
    System.out.print("diferença =" + diferenca);
}

}
}