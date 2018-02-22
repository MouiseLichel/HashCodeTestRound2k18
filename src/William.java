import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class William {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inputFile = new Scanner(new File("small.in"), "UTF-8");
		
		String vars = inputFile.nextLine();
		String[] split = vars.split(" ");
		WilliamDataModel dataModel = new WilliamDataModel(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
		
		dataModel.populatePizza(inputFile);
		
		System.out.println(dataModel);
		
		WilliamAlgoHorizontalV1 algo = new WilliamAlgoHorizontalV1(dataModel);
		List<Rectangle> slices = algo.getMeThoseSlices();
		
		for (Rectangle rectangle : slices) {
			System.out.println(rectangle);
		}
		
		inputFile.close();

	}

}
