/**
 * Answers Q4 Lambda Expressions.
 */
 
@FunctionalInterface
interface TwoElementPredicate<T> {
	
	boolean test(T t1, T t2);
}

public class BetterEntry {

	public static void main(String[] args) {
		System.out.println(betterEntry("1", "2", (t1, t2) -> t1.length() > t2.length()));
		System.out.println(betterEntry("1", "2  ", (t1, t2) -> true));
	}
	
	public static <T> T betterEntry(T t1, T t2, TwoElementPredicate<T> lambda) {
		T result = null;
		if (lambda.test(t1, t2)) {
			result = t1;
		} else {
			result = t2;
		}
		return result;
	}
}
