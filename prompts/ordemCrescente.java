package prompts;
import java.util.Scanner;
import java.util.Arrays;
public class ordemCrescente {
    public static void main(String[]args){

int[] numeros = new int[4];
try(Scanner sc = new Scanner(System.in)){
for(int i = 0; i < numeros.length; i++){ 
System.out.println("Digite o" + (i+1) + "numero:");
numeros[i] = sc.nextInt();
}
Arrays.sort(numeros);
System.out.println("Os números na ordem crescente são: ");
for(int numero : numeros){
    System.out.println(numero);
}
}
}
}