import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

@FunctionalInterface
interface StringComparator extends Comparator<String> {
	
	@Override
	int compare(String t1, String t2);
}

/**
 * Answers Q1 Lambda Expressions 1.
 */
public class StringSorter {

	public static void main(String[] args) {
	
		String [] strArray  = {"batman", "superman", "wonder woman", "martian manhunter",
			"black canary", "green arrow", "the atom", "the flash"};
			
		StringComparator length = (t1, t2) -> t1.length() - t2.length();	
		printArray(strArray,"In Length Order", length)
		

	}
	
	private void printArray(String strArray, String orderType, StringComparator comparator) {
		System.out.println(orderType);
		List<String> list = Arrays.asList(strArray);
		Collections.sort(list, length);
		Object[] o = list.toArray();
		for (Object element : o) {
			System.out.println(element);
		}
	}
		
	
	
}
