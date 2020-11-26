package HierarchicalInheritance;

         //*HierarchicalInheritance//*
//* Subclass //*
public class Snapchat extends SocialMedia{
	//* Snapchat Class Constructor //*
	public Snapchat(){
		//* Create a super method //*
		super.SocialMediaWebsites();
		System.out.println("//Class Snapchat!!");
	}
	public void OriginalAuthors(String author1, String author2, String author3){
		System.out.println("Original Authors For Snapchat App// ");
		System.out.println(author1);
		System.out.println(author2);
		System.out.println(author3);
	}	
	public void Developers(String developer){
		System.out.println("//Developers for Snapchat");
		System.out.println(developer);
	}
	public void InitialRelease(int year, int yearsago){
		System.out.println("Initial Release for Snapchat App//");
		System.out.println("September " + year +", " + yearsago + " years ago");
    } 
	public void Types(String Type1, String Type2, String Type3, String Type4){
		System.out.println("//Types for Snapchat App");
		System.out.println(Type1);
		System.out.println(Type2);
		System.out.println(Type3);
		System.out.println(Type4);
		}
	public static void main(String[] args) {
		Snapchat obj = new Snapchat();
		obj.OriginalAuthors("Evan Spiegel.", "Bobby Murphy.", "Reggie Brown.");
		obj.Developers("Snap Inc.");
		obj.InitialRelease(2011, 9);
		obj.Types("Photo sharing", "Instant messaging", "Video chat", "Multimedia");
	}

}
