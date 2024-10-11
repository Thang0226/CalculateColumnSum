import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows;
		int cols;
		System.out.println("-----Find sum of a column in a matrix-----");
		do {
			System.out.print("Enter number of rows of matrix: ");
			rows = input.nextInt();
			System.out.print("Enter number of columns of matrix: ");
			cols = input.nextInt();
		} while (rows <= 0 || cols <= 0);
		int[][] mat = new int[rows][cols];
		inputMatrix(mat);

		int col_ind;
		do {
			System.out.println("Enter column index you want to calculate sum: ");
			col_ind = input.nextInt();
		} while (col_ind < 0 || col_ind >= cols);

		int sum = 0;
		for (int i = 0; i < rows; i++) {
			sum += mat[i][col_ind];
		}
		System.out.println("Sum of column " + col_ind + " is: " + sum);
	}

	public static void inputMatrix(int[][] mat) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < mat.length; i++) {
			System.out.println("Enter numbers in row " + i + ": ");
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print("    Enter number at column " + j + ": ");
				mat[i][j] = input.nextInt();
			}
		}
	}
}
