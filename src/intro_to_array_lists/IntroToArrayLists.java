package intro_to_array_lists;
import java.util.ArrayList;
public class IntroToArrayLists {
	ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		IntroToArrayLists x = new IntroToArrayLists();
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
	IntroToArrayLists(){
		list.add("Alec");
		list.add("tutle");
		list.add("hair");
		for (String s: list) {
			System.out.println(s);
		}
	}
}
