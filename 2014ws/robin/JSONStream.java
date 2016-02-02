package json;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;

class JSONStream {
	private PushbackReader in;

	public JSONStream(Reader in) {
		this.in = new PushbackReader(in);
	}

	public char read() {
		try {
			char c;
			do {
				int i = in.read();
				if (i == -1)
					throw new RuntimeException("unexpected EOF");
				c = (char) i;
			} while (Character.isWhitespace(c));
			return c;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public char peek() {
		try {
			char c = read();
			in.unread(c);
			return (char) c;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void expect(char c) {
		if (read() != c) {
			throw new RuntimeException("expected " + c);
		}
	}
}
