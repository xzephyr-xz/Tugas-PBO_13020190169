public class Oper3 {

	public static void main(String[] args) {

		if (true && true){ System.out.println(true && true); } /* true = true and true */
		if (true & true) { System.out.println(true & false); } /* true & true */
		if (true) { System.out.println(true); } /* true */
		if (true || true){ System.out.println(true); } /* true = true or true */
		if (true|false) { System.out.println(true|false); } /* true|false */
	}
} 