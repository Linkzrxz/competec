import java.util.Scanner;
public class matrizes2 {
 public static void main (String[]args){
    try (Scanner sc = new Scanner(System.in)) {
        
        int linhas = sc.nextInt();
        int colunas = sc.nextInt();

int[][]matriz = new int[linhas][colunas];
        for(int l = 0; l < linhas; l++){
            for(int c = 0; c < colunas; c++){
             int var = sc.nextInt();
                matriz[l][c] = var;
                System.out.print(var);

            }
        }
        for(int l = 0; l < linhas; l++){
            for(int c = 0; c < colunas; c++){
                int var = sc.nextInt();
                matriz[l][c] = var;
   System.out.print(matriz[l][c]+ "");         
                
 }
 
 System.out.println("");
}
    }

 }
}