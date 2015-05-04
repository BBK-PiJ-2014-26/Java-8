import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Arrays;

/**
 * Answers Q5 lambda expressions.
 */
public class AllMatches {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "Belgium", "boxing", "toe", "me", "I", "Yosemite", "car", "bullion");
		List<String> shortWords = allMatches(words, s -> s.length() < 4);
		System.out.println(shortWords + "\n");
		List<String> wordsWithB = allMatches(words, s -> s.contains("b"));
		System.out.println(wordsWithB + "\n");	
		List<String> evenLengthWords = allMatches(words, s -> (s.length() % 2) == 0);
		System.out.println(evenLengthWords + "\n");
	}
	
	
	public static List<String> allMatches(List<String> list, Predicate<String> predicate) {
		List<String> result = new ArrayList<String>();
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			if (predicate.test(temp)) {
				result.add(temp);
			}
		}
		return result;
	}
}
