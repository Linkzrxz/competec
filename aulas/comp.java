
import java.util.Scanner;
public class comp {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
       
System.out.println("Escreva uma palavra :");
String texto = sc.next();

    int contarVogais = 0;
    
    texto.toLowerCase();
    
    for (int i = 0; i < texto.length(); i++){
        char c = texto.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            contarVogais++;
    }
    
   System.out.println("O número de vogais no texto é :" + contarVogais);
}
}

}

