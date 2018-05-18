
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.TreeSet;

public class MotsCommuns {

	public static void main(String[] args) throws IOException {

		compare();
	}

	private static void compare() throws IOException {
		int compteur = 0;
		TreeSet<String> fileW = new TreeSet<String>();
		TreeSet<String> fileE = new TreeSet<String>();

		// lecture du fichier fileW
		
		
		BufferedReader buf = new BufferedReader(new FileReader("wealth.txt"));
		for (String line = buf.readLine(); line != null; line = buf.readLine()) {
			line.replaceAll("[\\[]", "");

			fileW.add(line);
		}
		buf.close();

		// lecture du fichier fileE
		buf = new BufferedReader(new FileReader("ethics.txt"));
		for (String line = buf.readLine(); line != null; line = buf.readLine()) {
			// line.replaceAll("\\[", "").replaceAll("\\]","");
			// line.replaceAll("\\[|\\]", "");
			line = line.replace("[", "").replace("]", "");
			System.out.println("line fileE : " + line);
			fileE.add(line);
		}
		buf.close();

		for (String mot1 : fileW) {
			if (fileE.contains(mot1)) {
				System.out.println("Mot commun des fichiers ethics et wealth : " + mot1);
				compteur++;
			}
			// else
			// System.out.println("fichier1.txt - mot : " + mot1 + " n'existe pas dans
			// fichier2.txt");

		}
		System.out.println("Nb mots en commun : " + compteur);
	}

}

