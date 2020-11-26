package RunTimeException;

public class TestE {

	public static void main(String[] args) {
		try{
			Object o = null;
			System.out.println(o.toString());
		}
		catch(NullPointerException ex){
			System.out.println("Null Pointer Exception"); 
		}
	}

}
