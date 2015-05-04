import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

/**
 * Answers Q5 lambda expressions.
 */
public class AllMatches {
	
	public static void main(String[] args) {
		String[] strArray = {"Hello", "Belgium", "boxing", "toe", "me", "I", "Yosemite", "car"};
		List<String> words = Arrays.asList("Hello", "Belgium", "boxing", "toe", "me", "I", "Yosemite", "car");
		List<String> shortWords = allMatches(words, s -> s.length() < 4);
		List<String> wordsWithB = allMatches(words, s -> s.contains("b"));
		List<String> evenLengthWords = allMatches(words, s -> (s.length() % 2) == 0);
	}
	
	
	public static List<String> allMatches(List<String> list, Predicate<String> predicate) {
		List<String> result = new ArrayList();
		String[] temp = list.toArray();
		for (String e : temp) {
			if (predicate.test()) {
				result.add(e);
			}
		}
		return result;
	}
}
