import java.util.ArrayList;
import java.util.List;

public class MotsCommunsenMieux {

	public static void main(String[] args) {
		FileBook fb1 = new FileBook("ethics.txt");
		FileBook fb2 = new FileBook("wealth.txt");
		List<String> resList = fb1.commonWords(fb2);
		System.out.println("nb de mots communs : " + resList.size());
		System.out.println("Mots communs : " + resList);
	}

}
