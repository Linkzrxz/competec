
import java.util.Scanner;
public class quintaAula {
    public static void main (String[]args){
try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Insira um número inteiro para definir o tamanho do vetor :");
    int numeroDoVetor = sc.nextInt();
    System.out.print("Insira os números :");
    int numeros[] = new int[numeroDoVetor];
    for(int i = 0; i < numeros.length; i++){
        numeros [i] = sc.nextInt();
        
       } 
     int maior = numeros[0];
       
for(int n = 0; n < numeroDoVetor; n++);{
if(maior > numeros[1]);
maior = numeros[1];
System.out.println("O maior número é: " + maior);


   }
}
}
}