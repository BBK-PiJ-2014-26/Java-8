import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Arrays;

/**
 * Answers Q6 lambda expressions.
 */
public class AllMatchesAllElements {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "Belgium", "boxing", "toe", "me", "I", "Yosemite", "car", "bullion");
		List<String> shortWords = allMatches(words, s -> s.length() < 4);
		System.out.println(shortWords + "\n");
		List<String> wordsWithB = allMatches(words, s -> s.contains("b"));
		System.out.println(wordsWithB + "\n");	
		List<String> evenLengthWords = allMatches(words, s -> (s.length() % 2) == 0);
		System.out.println(evenLengthWords + "\n");
	}
	
	
	public static <T> List<T> allMatches(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<T>();
		ListIterator<T> iterator = list.listIterator();
		while (iterator.hasNext()) {
			T temp = iterator.next();
			if (predicate.test(temp)) {
				result.add(temp);
			}
		}
		return result;
	}
}
