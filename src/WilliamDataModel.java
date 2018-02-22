import java.util.Scanner;

enum Ingredient {
	T, M;
}

class Case {
	Ingredient ig;
	int x, y;
	boolean isInASlice = false;

	public Case(int x, int y, Ingredient ig) {
		this.x = x;
		this.y = y;
		this.ig = ig;
	}

}

public class WilliamDataModel {

	int rows, colums, minIngredient, maxSliceSize;
	int nbTomato = 0, nbMushroom = 0;
	Case[][] pizza;

	public WilliamDataModel(int rows, int colums, int minIngredient, int maxSliceSize) {
		this.rows = rows;
		this.colums = colums;
		this.minIngredient = minIngredient;
		this.maxSliceSize = maxSliceSize;
		pizza = new Case[rows][colums];
	}

	public void populatePizza(Scanner inputFile) {
		int i = 0;
		while (inputFile.hasNextLine()) {
			String line = inputFile.nextLine();
			for (int j = 0; j < line.length(); j++) {
				if (line.charAt(j) == 'T') {
					pizza[i][j] = new Case(i, j, Ingredient.T);
					nbTomato++;
				}else {
					pizza[i][j] = new Case(i, j, Ingredient.M);
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
				s += pizza[i][j].ig;
			}
			s += "\n";
		}
		return s;
	}

}
