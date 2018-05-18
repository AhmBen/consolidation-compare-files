import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;

public class TreeMapMotCommunWealth {

	public static void main(String[] args) {

		TreeMap<String, Integer> motCommun = new TreeMap<String, Integer>();

		try {
			File fileW = new File("Wealth.txt");
			FileReader fileReaderW = new FileReader(fileW);
			BufferedReader br = new BufferedReader(fileReaderW);

			String mot = br.readLine();

			while (mot != null) {
				Integer valeurCourante = motCommun.get(mot);
				if (valeurCourante == null) {
					valeurCourante = 0;
				}
				motCommun.put(mot, valeurCourante + 1);
				mot = br.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Entry<String, Integer> entry : motCommun.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();

			System.out.println(key + " => " + value);
		}
		
		 // putting values in navigable set
	     for (String entry : motCommun.descendingKeySet()) {
			

			System.out.println(entry+" :  "+motCommun.get(entry));
		}
	     
	    /*NavigableMap<String,Integer> listCommunInverse = motCommun.descendingMap();
	    for (Entry<String, Integer> entry : listCommunInverse.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();

			System.out.println(key + " => " + value);
		}*/
		
//		ArrayList<StringEvol> listPourClasserAlenvers = new ArrayList<StringEvol>();
//		
//		for (Entry<String, Integer> entry : motCommun.entrySet()) {
//			listPourClasserAlenvers.add(new StringEvol(entry.getKey()));			
//			
//		}
//		
		
		
//		for(int i = listPourClasserAlenvers.size() - 1  ; i >= 0  ; i--) {
//			System.out.println(listPourClasserAlenvers.get(i) + " :" + motCommun.get(listPourClasserAlenvers.get(i)));
//		}
//		listPourClasserAlenvers.sort(null);
//		
//		for(int i = 0 ; i < listPourClasserAlenvers.size()  ; i++) {
//			System.out.println(listPourClasserAlenvers.get(i).getValue() + " :" + motCommun.get(listPourClasserAlenvers.get(i).getValue()));
//		}
	     
		
	}
}
