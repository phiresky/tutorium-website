package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JSONParser {
	private JSONStream in;

	public JSONParser(Reader in) {
		this.in = new JSONStream(in);
	}

	public void parse() {
		parseElement();
	}

	private void parseElement() {
		switch (in.peek()) {
		case '[':
			parseArray();
			break;
		case '{':
			parseObject();
			break;
		case '"':
			parseString();
			break;
		default:
			throw new RuntimeException("unexpected " + in.peek());
		}
	}

	private void parseString() {
		in.expect('"');
		String string = "";
		char c = in.read();
		while (c != '"') {
			string += c;
			c = in.read();
		}
		System.out.println("parsed string " + string);
	}

	private void parseAttribute() {
		parseString();
		in.expect(':');
		parseElement();
	}

	private void parseObject() {
		in.expect('{');
		if (in.peek() == '}') {
			return;
		}
		parseAttribute();
		while (in.peek() != '}') {
			in.expect(',');
			parseAttribute();
		}
		in.expect('}');
	}

	private void parseArray() {
		in.expect('[');
		if (in.peek() == ']') {
			in.read();
			return;
		}
		parseElement();
		while (in.peek() != ']') {
			in.expect(',');
			parseElement();
		}
		in.expect(']');
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Put filename as argument");
			return;
		}
		try (FileReader r = new FileReader(args[0])) {
			new JSONParser(r).parse();
			System.out.println("Successfully parsed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
