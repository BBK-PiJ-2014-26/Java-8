import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Arrays;

/**
 * Answers Q7 lambda expressions.
 */
public class TransformedList {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "Belgium", "boxing", "toe", "me", "I", "Yosemite", "car", "bullion");
		
		List<String> excitingWords = transformedList(words, s -> s + "!");
		System.out.println(excitingWords + "\n");
		
		List<String> eyeWords = transformedList(words, s -> s.replace("i", "eye"));
		System.out.println(eyeWords + "\n");
		
		List<String> upperCaseWords = transformedList(words, String::toUpperCase);
		System.out.println(upperCaseWords + "\n");
	}
	
	public static List<String> transformedList(List<String> list, Function<String,String> lambda) {
		List<String> result = new ArrayList<String>();
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			String temp = lambda.apply(iterator.next());
			result.add(temp);
		}
		return result;
	}
}					
