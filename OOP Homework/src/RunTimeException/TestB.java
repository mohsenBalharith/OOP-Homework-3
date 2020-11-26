package RunTimeException;

public abstract class TestB {

	public static void main(String[] args) {
		try{
			int [] list = new int[5];
			System.out.println(list[5]);
		}
		catch(IndexOutOfBoundsException ex){
			System.out.println ("Array Index is Out Of Bounds Exception " + "cannot enter the value number 5 "
					+ "in index");
		}
	}

}
