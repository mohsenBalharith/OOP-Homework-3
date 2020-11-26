package RunTimeException;

public class TestC {

	public static void main(String[] args) {
		try{
			String s = "abc";
			System.out.println(s.charAt(3));
		}
		catch(StringIndexOutOfBoundsException ex){
			System.out.println("String Index Out Of Bounds Exception " + "cannot enter number 3 in the number "
					+ "of characters required");
		}
	}

}
