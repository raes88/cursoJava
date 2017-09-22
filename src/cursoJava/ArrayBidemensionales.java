package cursoJava;

public class ArrayBidemensionales {

	public static void main(String[] args) {
		int[][] matrix = new int[4][5];
		matrix[0][0] = 15;
		matrix[0][1] = 23;
		matrix[0][2] = 1;
		matrix[0][3] = 13;
		matrix[0][4] = 12;

		matrix[1][0] = 34;
		matrix[1][1] = 145;
		matrix[1][2] = 46;
		matrix[1][3] = 67;
		matrix[1][4] = 10;

		matrix[2][0] = 65;
		matrix[2][1] = 84;
		matrix[2][2] = 3;
		matrix[2][3] = 5;
		matrix[2][4] = 415;

		matrix[3][0] = 92;
		matrix[3][1] = 64;
		matrix[3][2] = 9;
		matrix[3][3] = 11;
		matrix[3][4] = 18;
		for (int i = 0; i < 4; i++) {
			System.out.println("");
			for (int j = 0; j < 5; j++) {
				System.out.print(+matrix[i][j]+" ");
			}
		}
	}

}
