import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Wealth {

	public static String fileNameW = "wealth.txt";

	public static void main(String[] args) throws FileNotFoundException, IOException {

		System.out.println("Debut W");
		
		ArrayList<String> dataW = new ArrayList<String>();
		try (BufferedReader brW = new BufferedReader(new FileReader(new File("wealth.txt")))) {
			for (String line = brW.readLine(); line != null; line = brW.readLine()) {
				dataW.add(line);

				//dataW.sort(null); pour trier
			}
			for (int i = 0; i < dataW.size(); i++) {
				System.out.println(dataW.get(i));
			}

		}
		System.out.println("Fin W");

	}

}
