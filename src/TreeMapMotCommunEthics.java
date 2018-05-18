import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapMotCommunEthics {

	public static void main(final String[] args) {

		TreeMap<String, Integer> motCommun = new TreeMap<String, Integer>();

		try {

			File fileE = new File("ethics.txt");
			FileReader fileReaderE = new FileReader(fileE);
			BufferedReader br = new BufferedReader(fileReaderE);

			
			//Je r�cup�re le premier mot
		
			String mot = br.readLine();
			while (mot != null) {
				//Je r�cup�re la valeur courante du nombre d'occurence du mot 
				Integer valeurCourante = motCommun.get(mot);				
				//Si c'est la premi�re fois elle sera forc�ment null on force alors la valeur enti�re � 0
				if(valeurCourante == null) { valeurCourante = 0; }
				//Je renseigne la valeur du nombre d'occurence du mot cherch� par la valeur courante incr�ment�e de 1
				motCommun.put(mot, valeurCourante + 1);
				//Je passe au mot suivant
				mot = br.readLine();
				
						}
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*List mots = new ArrayList<Integer>(motCommun.values());
		
		for(int i = 0 ; i < mots.size() ; i += 1 ) {
			System.out.println(mots.get(i));
		}*/
		int comp = 0;
		for(Entry<String, Integer> entry : motCommun.entrySet()) {
			
			String key = entry.getKey();
			  Integer value = entry.getValue();

			    System.out.print("mot commun de ethics n� " + comp++);
			    System.out.println(" " +key + " => " + value);
			
			}
				
		
	}
}
