package test;

import java.util.Stack;

public class Parens {
	/**
	 * check expression with only round brackets
	 */
	public static boolean validateSingle(String inp) {
		int depth = 0;
		for (char c : inp.toCharArray()) {
			if (c == '(')
				depth++;
			else if (c == ')')
				depth--;
			if (depth < 0)
				return false;
		}
		return depth == 0;
	}

	static boolean isOpeningBracket(char c) {
		return c == '(' || c == '[' || c == '{';
	}

	static char getOpeningBracket(char c) {
		switch (c) {
		case ')':
			return '(';
		case ']':
			return '[';
		case '}':
			return '{';
		default:
			return '-';
		}
	}

	/**
	 * validate expression with [,{,( brackets 
	 */
	static boolean validateMulti(String inputStr) {
		char[] input = inputStr.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length; i++) {
			char c = input[i];
			if (isOpeningBracket(c)) {
				stack.push(c);
			} else {
				if (stack.size() == 0)
					return false;
				char current = getOpeningBracket(c);
				char other = stack.pop();
				if (current != other)
					return false;

			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String[] inputs = { "()", "(())", "()()", "(", "())" };
		for (String test : inputs) {
			System.out.println(test + ": " + validateSingle(test));
		}

		String[] inputs2 = { "([])", "([][])", "([{}])", "([)]" };
		for (String test : inputs2) {
			System.out.println(test + ": " + validateMulti(test));
		}
	}

}
