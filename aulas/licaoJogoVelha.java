import java.util.Scanner;
public class licaoJogoVelha {
  public static void main(String[] args) {
    
    try(Scanner sc = new Scanner(System.in)){
     
      System.out.print("insira a primeira linha de jogo");
     int j1 = sc.nextInt();
     int j2 = sc.nextInt();
     int j3 = sc.nextInt();

     System.out.print("insira a segunda linha de jogo");
     int j4 = sc.nextInt();
     int j5 = sc.nextInt();
     int j6 = sc.nextInt();

     System.out.print("insira a terceira linha de jogo");
     int j7 = sc.nextInt();
     int j8 = sc.nextInt();
     int j9 = sc.nextInt();
       sc.nextInt();
     
         int jv[][] = {{j1},{j2},{j3},
                       {j4},{j5},{j6},
                       {j7},{j8},{j9}};
        
        
         for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
              if(jv[0][0] == '1' && jv[1][0] == '1' && jv [2][0] == '1'){
                System.out.println("'1' VENCEU");
                
            }
             else if(jv[0][1] == '1' && jv[1][1] == '1' && jv[2][1] == '1'){
                System.out.println("'1' VENCEU");
                
             }
             else if(jv[0][2] == '1' && jv[1][2] == '1' && jv[2][2] == '1'){
                System.out.println("'1' VENCEU");
                
            }
        
        
        
             //Checa 1 horizontalmente
             else if(jv[0][0] == '1' && jv[0][1] == '1' && jv[0][2] == '1'){
            System.out.println("'1' VENCEU");
            
            }
            else if(jv[1][0] == '1' && jv[1][1] == '1' && jv[1][2] == '1'){
            System.out.println("'1' VENCEU");
            
            } 
            else if(jv[2][0] == '1' && jv[2][1] == '1' && jv[2][2] == '1'){
            System.out.println("'1' VENCEU");
            
            }
            //Checa 1 diagonalmente
            else if(jv[0][0] == '1' && jv[1][1] == '1' && jv[2][2] == '1'){
            System.out.println("'1' VENCEU");
            
            }
            else if(jv[0][2] == '1' && jv[1][1] == '1' && jv[2][0] == '1'){
            System.out.println("'1' VENCEU");
            
            }
            //Checa 0 verticalmente
            if(jv[0][0] == '0' && jv[1][0] == '0' && jv [2][0] == '0'){
            System.out.println("'0' VENCEU");
            
            }
            else if(jv[0][1] == '0' && jv[1][1] == '0' && jv[2][1] == '0'){
            System.out.println("'0' VENCEU");
            
            }
            else if(jv[0][2] == '0' && jv[1][2] == '0' && jv[2][2] == '0'){
            System.out.println("'0' VENCEU");
            
            }
        
            //Checa 0 horizontalmente
            if(jv[0][0] == '0' && jv[0][1] == '0' && jv[0][2] == '0'){
            System.out.println("'0' VENCEU");
            
            }
            else if(jv[1][0] == '0' && jv[1][1] == '0' && jv[1][2] == '0'){
            System.out.println("'0' VENCEU");
            
            }
            else if(jv[2][0] == '0' && jv[2][1] == '0' && jv[2][2] == '0'){
            System.out.println("'0' VENCEU");
            
            }
        
            //Checa 0 diagonalmente
            if(jv[0][0] == '0' && jv[1][1] == '0' && jv[2][2] == '0'){
            System.out.println("'0' VENCEU");
            
            }
            else if(jv[0][2] == '0' && jv[1][1] == '0' && jv[2][0] == '0'){
            System.out.println("'0' VENCEU");
             
            }
        
            
        }

        }
        }
    }
  }

