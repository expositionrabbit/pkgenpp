package pkgenpp;

import java.nio.file.Paths;
import pkgenpp.RawData;

public class Pkgenpp {

	public static void main(String[] args) {
		System.out.println(new RawData(Paths.get(args[0])));
	}
}
