import java.util.Scanner;

public class WilliamDataModel {

	int rows, colums, minIngredient, maxSliceSize;
	int nbTomato = 0, nbMushroom = 0;
	char[][] pizza;

	public WilliamDataModel(int rows, int colums, int minIngredient, int maxSliceSize) {
		this.rows = rows;
		this.colums = colums;
		this.minIngredient = minIngredient;
		this.maxSliceSize = maxSliceSize;
		pizza = new char[rows][colums];
	}

	public void populatePizza(Scanner inputFile) {
		int i = 0;
		while (inputFile.hasNextLine()) {
			String line = inputFile.nextLine();
			for (int j = 0; j < line.length(); j++) {
				pizza[i][j] = line.charAt(j);
				if (pizza[i][j] == 'T' ){
					nbTomato++;
				}
				else{
					nbMushroom++;
				}
			}
			i++;

		}
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < pizza.length; i++) {
			for (int j = 0; j < pizza[0].length; j++) {
				s += pizza[i][j];
			}
			s += "\n";
		}
		return s;
	}

}
