public class aularevisaoDia1208 {
    public static void main(String[]args){
    int matriz[][] = new int[4][4];
   for(int i = 0; i < 4; i++){ 
        for(int j = 0; j < 4; i++){
            if(i == j){
        matriz[i][j] = 0; 
   
    }   else if(i < j ){
     matriz[i][j] = 1;
    }   
        else if (i > j){ 
      matriz[i][j] = 2;
    }
   
    System.out.print(matriz[i][j]);


}
System.out.print("\n");
}   
}
}