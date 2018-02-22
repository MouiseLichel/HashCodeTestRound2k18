import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class William {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inputFile = new Scanner(new File("example.in"), "UTF-8");
		
		String vars = inputFile.nextLine();
		String[] split = vars.split(" ");
		WilliamDataModel dataModel = new WilliamDataModel(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
		
		dataModel.populatePizza(inputFile);
		
		System.out.println(dataModel);
		
		inputFile.close();

	}

}
