import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Arrays;

/**
 * Answers Q8 lambda expressions.
 */
public class GenericTransformedList {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "Belgium", "boxing", "toe", "me", "I", "Yosemite", "car", "bullion");
		
		List<String> excitingWords = transformedList(words, s -> s + "!");
		System.out.println(excitingWords + "\n");
		
		List<String> eyeWords = transformedList(words, s -> s.replace("i", "eye"));
		System.out.println(eyeWords + "\n");
		
		List<String> upperCaseWords = transformedList(words, String::toUpperCase);
		System.out.println(upperCaseWords + "\n");
	}
	
	public static <T> List<T> transformedList(List<T> list, Function<T,T> lambda) {
		List<T> result = new ArrayList<T>();
		ListIterator<T> iterator = list.listIterator();
		while (iterator.hasNext()) {
			T temp = lambda.apply(iterator.next());
			result.add(temp);
		}
		return result;
	}
}					
