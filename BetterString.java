/**
 * Answers Q3 Lambda Expressions.
 */
 
@FunctionalInterface
interface TwoStringPredicate {
	
	boolean test(String s1, String s2);
}

public class BetterString {

	public static void main(String[] args) {
		System.out.println(betterString("1", "2", (s1, s2) -> s1.length() > s2.length()));
		System.out.println(betterString("1", "2  ", (s1, s2) -> true));
	}
	
	public static String betterString(String s1, String s2, TwoStringPredicate lambda) {
		String result = null;
		if (lambda.test(s1, s2)) {
			result = s1;
		} else {
			result = s2;
		}
		return result;
	}
}
