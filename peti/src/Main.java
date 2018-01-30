import java.util.Scanner; 

public class Main {
    public static void main(String[] args){
        //int[][] peti = new int[][]{
        //        {0,1,1,0,1,0,1,0,1,0},
        //        {1,0,0,1,0,1,0,1,1,1},
        //        {1,0,0,0,1,1,1,0,1,0},
        //        {0,1,1,0,1,0,1,0,1,0},
        //        {1,0,0,0,1,1,1,0,1,0},
        //        {1,0,0,0,1,1,1,0,1,0},
        //        {0,1,1,0,1,0,1,0,1,0},
        //        {1,0,0,0,1,1,1,0,1,0},
        //        {0,1,1,0,1,0,1,0,1,0},
        //        {1,0,0,0,1,1,1,0,1,0},
        //};
    	
        //Scanner scan = new Scanner(System.in);
        //int N = scan.nextInt();
    	int x = 0;
    	int N = 8;
        int[][] tomb = new int[N][N];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
            	for(int a = 0; a<N/2; a++) {
            		if(i == a || j == a) {
            			tomb[i][j] = a;
            			break;
            		}
            		else if(i == N-a-1 || j == N-a-1) {
            			tomb[i][j] = a;
            			break;
            		}
            	}
            }
        }
        
        for(int a = 0; a<N; a++) {
        	for(int j = 0; j<N; j++) {
        		System.out.print(tomb[a][j]);
        	}
        	System.out.println("\n");
        }
    }
}
