import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class MotsCommuns2703 {

	public static void main(String[] args) throws IOException {
		// Création de l'objet File
		// File f = new File("ethics.txt");
		// System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
		// System.out.println("Nom du fichier : " + f.getName());
		// System.out.println("Est-ce qu'il existe ? " + f.exists());
		// System.out.println("Est-ce un répertoire ? " + f.isDirectory());
		// System.out.println("Est-ce un fichier ? " + f.isFile());

		TreeSet<String> tsE = new TreeSet<String>();

		File fileE = new File(args[0]);
		FileReader fileReaderE = new FileReader(fileE);
		BufferedReader br = new BufferedReader(fileReaderE);

		int comptE = 0;
		String line = br.readLine();
		while (line != null) {
			tsE.add(line);
			line = br.readLine();
		}

		for (String linetsE : tsE) {
			System.out.println(linetsE);
			System.out.println(comptE ++);
		}

		br.close();

//		File fileW = new File(args[1]);
//		FileReader fileReaderW = new FileReader(fileW);
//		BufferedReader br1 = new BufferedReader(fileReaderW);
//		TreeSet<String> tsW = new TreeSet<String>();
//
//		String lineW;
//		lineW = br1.readLine();
//		while (lineW != null) {
//			if (tsE.contains(lineW)) {
//				tsW.add(lineW);
//			}
//			lineW = br1.readLine();
//		}
//		for (String linetsW : tsW) {
//			System.out.println(linetsW);
//		}
//		System.out.println("nb mot commun : " + tsW.size());
//		// System.out.println(tsW);
//		br1.close();

	}

}
