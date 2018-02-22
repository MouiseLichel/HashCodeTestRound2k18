import java.awt.Rectangle;
import java.util.LinkedList;
import java.util.List;

public class WilliamAlgoHorizontalV1 {

	WilliamDataModel datamodel;
	Case[][] pizza;
	List<Rectangle> slices = new LinkedList<>();

	public WilliamAlgoHorizontalV1(WilliamDataModel dm) {
		this.datamodel = dm;
		pizza = datamodel.pizza;
	}

	public List<Rectangle> getMeThoseSlices() {
		for (int i = 0; i < pizza.length; i++) {
			for (int j = 0; j < pizza[0].length; j++) {
				if (!pizza[i][j].isInASlice) {
					tryToSliceIt(i, j);
				}
			}
		}
		return slices;
	}

	private void tryToSliceIt(int i, int j) {
		int width = 0, height = 0;
		int nbT = 0, nbM = 0;
		for (width = 0; width < datamodel.maxSliceSize; width++) {
			if (j + width < datamodel.colums) {
				if (pizza[i][j+ width].ig == Ingredient.M) {
					nbM++;
				} else {
					nbT++;
				}
			}
			if (nbT >= datamodel.minIngredient && nbM >= datamodel.minIngredient) {
				sliceIt(i, j, width+1 , height+1 );
				break;
			}
		}
		
	}

	private void sliceIt(int x, int y, int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.println("cell :" + x+i + " " + y+j);
				pizza[x + i][y + j].isInASlice = true;
			}
		}

		slices.add(new Rectangle(x, y, width, height));
	}

}
