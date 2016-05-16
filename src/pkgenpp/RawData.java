package pkgenpp;

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class RawData {

	public String[] lines;
	public String fileName;
	
	public RawData(String content) {
		lines = content.split("\n");
		fileName = "(no file)";
	}
	
	public RawData(Path path) {
		fileName = path.toString();
		try {
			lines = Files.lines(path).toArray(String[]::new);
		} catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public Document toDocument() {
		Document doc = new Document(this);
		return doc;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < lines.length; i++) {
			sb.append("[" + (i+1) + "] " + lines[i]);
			if(i != lines.length-1) { sb.append('\n'); }
		}
		return sb.toString();
	}
}
