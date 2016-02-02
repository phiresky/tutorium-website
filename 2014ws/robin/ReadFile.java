import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadFile {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Wrong usage");
			return;
		}
		String filename = args[0];

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			while (reader.ready()) { // lines remaining 
				String line = reader.readLine();
				System.out.println(line); // or some method call ;-)
			}
		} catch (IOException e) { // in case of errors (needed!)
			System.out.println("Something went wrong");
		}

	}
}
