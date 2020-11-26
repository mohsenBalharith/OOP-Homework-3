package HierarchicalInheritance;

        //*HierarchicalInheritance//*
//* Subclass //*
public class Youtube extends SocialMedia{ 
	//* Youtube Class Constructor //*
	public Youtube(){
		//* Create a super method //*
		super.SocialMediaWebsites();
		System.out.println("//Class Youtube!!");
	}
	public void OriginalAuthors(String author1, String author2, String author3){
		System.out.println("Original Authors for Youtube App//");
		System.out.println(author1);
		System.out.println(author2);
		System.out.println(author3);
	}
	public void Developers(String developer){
		System.out.println("//Developer for Youtube App");
		System.out.println(developer);
	}
	public void InitialRelease(int year, int yearsago){
		System.out.println("Initial Release for Youtube App//");
		System.out.println("February " + year + ", " + yearsago + " years ago");
	}
	public void Types(String type){
		System.out.println("//Types for Youtube App");
		System.out.println(type);
	}
	public static void main(String[] args) {
		Youtube obj = new Youtube();
		obj.OriginalAuthors("Chad Hurley", "Steve Chen", "Jawed Karim");
		obj.Developers("Google");
		obj.InitialRelease(2005, 15);
		obj.Types("Video hosting service");
	}

}
