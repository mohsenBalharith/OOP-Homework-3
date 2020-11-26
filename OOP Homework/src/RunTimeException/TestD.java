package RunTimeException;

public class TestD {
	
	public static void main(String[] args) {
		try{
			Object o = new Object();
			String d = (String)o;
		}
		catch(ClassCastException ex){
			System.out.println("Class Cast Exception");
		}
	}

}
