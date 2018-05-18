import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FileBook {

	private final Set<String> wordSet = new TreeSet<String>();
	private final String fileName;

	public FileBook(String fileName) {
		this.fileName = fileName;
		loadWordSet();
	}

	public Set<String> getWordSet() {
		return wordSet;
	}

	public String getFileName() {
		return fileName;
	}

	private void loadWordSet() {
		try (BufferedReader buf = new BufferedReader(new FileReader(fileName))) {

			for (String line = buf.readLine(); line != null; line = buf.readLine()) {
				// line = line.replaceAll("[\\[]", "");
				// wordSet.add(line);
				// ou la suivante
				wordSet.add(line.replaceAll("[\\[]", ""));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public List<String> commonWords(FileBook fb) {
		List<String> res = new ArrayList<String>();

		for (String mot1 : wordSet) {
			if (fb.wordSet.contains(mot1)) {
				res.add(mot1);

			}
		}
		return res;
	}

}
