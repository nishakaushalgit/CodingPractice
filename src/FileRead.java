import java.io.*;
import java.util.*;

class FileRead {
	/* Online Java Compiler and Editor */
	public static void readFile(String filepath) throws Exception {

		FileReader reader = new FileReader(filepath);
		BufferedReader br = new BufferedReader(reader);
		String para="";
		String line = null;
		while ((line = br.readLine()) != null) {
			para += line + " ";
		}
		System.out.print(maxOccurance(para));
	}

	public static String maxOccurance(String str) {
		String key = "";
		int result = 1;
		String newstr[] = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < newstr.length; i++) {
			map.put(newstr[i], map.getOrDefault(newstr[i], 0) + 1);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > result) {
				result = entry.getValue();
				key = entry.getKey();
			}
		}
		return key;
	}

	public static void main(String[] args) throws Exception {
		String filepath = "/Users/kshitijchaudhary/Desktop/text.txt";
		readFile(filepath);

	}
}