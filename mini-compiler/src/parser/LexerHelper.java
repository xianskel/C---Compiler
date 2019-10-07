package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {
		if (str.charAt(0) != '\'')
			return 0;
		if (str.charAt(str.length()-1) != '\'')
			return 0;
		if (str.equals("'\\n'")) // '\n'
			return '\n';
		if (str.equals("'\\t'")) // '\n' 
			return '\t';  
		if (str.length() == 3) // 'x' where x is any character
			return str.charAt(1);
		// '\number' where number is a natural number
		String numberStr = str.substring(2, str.length()-1);
		try {
			return (char)Integer.parseInt(numberStr);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return 0;
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}
}
