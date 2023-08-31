import java.util.Scanner;
public class desafio2{
    public static void main (String[]args){
try(Scanner sc = new Scanner(System.in)){
System.out.print("Insira um número inteiro para definir o tamanho do vetor :");
int numeroDoVetor = sc.nextInt();
System.out.print("Insira os números :");
int numeros[] = new int[numeroDoVetor];
for(int i = 0; i < numeros.length; i++){
    numeros [i] = sc.nextInt();
    
   } 
    for(int i = 0; i < numeros.length; i++){
        
        System.out.print(numeros[i]);
       
     }

for(int i = 0; i < numeros.length; i++){
     double produtoDosNumeros = numeros[i] * 2;

    int somaDosNumeros = numeros[i] + numeros[i];
    double mediaDosNumeros = somaDosNumeros / numeroDoVetor;


    

System.out.print(" O produto dos numeros é :" + produtoDosNumeros);

System.out.print(" A média dos numeros é :" + mediaDosNumeros);
}
}
}
}