import java.util.Scanner;
public class ex1060 {
    public static void main(String[]args){
try(Scanner sc = new Scanner(System.in)){

System.out.println("Insira o primeiro número");
    double n1 = sc.nextDouble();

System.out.println("Insira o segundo número");
    double n2 = sc.nextDouble();

System.out.println("Insira o terceiro número");
    double n3 = sc.nextDouble();

System.out.println("Insira o quarto número");
    double n4 = sc.nextDouble();

System.out.println("Insira o quinto número");
    double n5 = sc.nextDouble();

System.out.println("Insira o sexto número");
    double n6 = sc.nextDouble();

double[] numeros =  {n1, n2, n3, n4, n5, n6};

for(var i = 0; i < numeros.length; i++){
    if(numeros[i] > 0){
System.out.println(numeros[i]);
}
}
}
}
}