import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class TestEco {

	public static void main(String[] args) throws IOException {

		try (BufferedReader buf1 = new BufferedReader(new FileReader("ethics.txt"))) {

			ArrayList<String> alE = new ArrayList<String>();

			String lineE;
			lineE = buf1.readLine();
			while (lineE != null) {
				alE.add(lineE);
				lineE = buf1.readLine();
			}
			int compteur = 0;
			// permet de trier dans l'ordre ascendant
			Collections.sort(alE);
			for (String motAlE : alE) {
				if (alE.contains(motAlE)) {
					System.out.println("Mot n° " + compteur++ + ":" + motAlE);

				}

			}
			System.out.println(alE.size());

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}
}
