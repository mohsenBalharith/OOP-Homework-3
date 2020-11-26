package HierarchicalInheritance;

           //*HierarchicalInheritance//*
//* Subclass //*
public class WhatsApp  extends SocialMedia{
	//* WhatsApp Class Constructor //*
	public WhatsApp(){
		//* Create a super method //*
		super.SocialMediaWebsites();
		System.out.println("//Class Whatsapp!!");
	}
	public void OriginalAuthors(){
		System.out.println("Original Authors for WhatsApp App//");
		System.out.println("Brian Acton" + ", " + "Jan Koum");
	}
	public void Developers(){
		System.out.println("//Developers for WhatsApp App");
		System.out.println("WhatsApp Inc. " + ", " + "FaceBook Inc.");
	}
	public void InitialRelease(){
		System.out.println("Initial Release for WhatsApp App//");
		System.out.println("January 2009; 11 years ago");
	}
	public void Types(){
		System.out.println("//Types for WhatsApp App");
		System.out.println("Instant message " + ", " + "Voice over IP");
	}
	public static void main(String[] args) {
		WhatsApp obj = new WhatsApp();
		obj.OriginalAuthors();
		obj.Developers();
		obj.InitialRelease();
		obj.Types();
	}

}
