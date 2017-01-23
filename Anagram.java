import java.util.ArrayList;

public class Anagram {

	public static void main(String[] args) {
		
		String str = new String();
		str = "detta är ett anagram";
		ArrayList<Character> chars = new ArrayList<Character>();
		for (char c : str.toCharArray()) {
			chars.add(c);
		}	
		for(int x = 0; x>chars.size(); x++){
			System.out.println(x + ": " + chars.get(x));
		}
			
		String newString = new String();
		while (!chars.isEmpty()) {
			int i=(int) (Math.random()*chars.size());
			newString += Character.toString(chars.get(i));
			chars.remove(i);
		}
		System.out.println("Anagram: " + newString);
	}
}
