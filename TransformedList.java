import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Answers Q7 lambda expressions.
 */
public class TransformedList {
	
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
