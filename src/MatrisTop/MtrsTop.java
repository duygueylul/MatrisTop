package MatrisTop;

public class MtrsTop {

	public static void main(String[] args) {
		
		
		int [][] mtrs1 = {{51,22,43},{73,15,23}};
		int [][] mtrs2 = {{46,47,89},{20,41,93}};
		
		int [][] mtrs3 = new int [2][3];
		
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				mtrs3[i][j] = mtrs1 [i][j] + mtrs2[i][j];
				
				System.out.print(mtrs3[i][j] + " ");
			}
			
			
			System.out.println();
		}

	}

}
