import java.io.*;
import java.util.*;

class FileRead2 {
	/* Online Java Compiler and Editor */
	public static void readFile(String filepath) throws Exception {

		FileReader reader = new FileReader(filepath);
		BufferedReader br = new BufferedReader(reader);
		Map<String, Integer> map = new HashMap<String, Integer>();
		String key = "";
		int result = 1;
		String line = "";
		while ((line = br.readLine()) != null) {
			String newstr[] = line.split(" ");
			for (int i = 0; i < newstr.length; i++) {
				map.put(newstr[i], map.getOrDefault(newstr[i], 0) + 1);
			}
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > result) {
				result = entry.getValue();
				key = entry.getKey();
			}
		}
		System.out.print(key);
	}

	public static void main(String[] args) throws Exception {
		String filepath = "/Users/kshitijchaudhary/Desktop/text.txt";
		readFile(filepath);

	}
}