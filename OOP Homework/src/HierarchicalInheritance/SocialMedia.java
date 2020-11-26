package HierarchicalInheritance;

      //*HierarchicalInheritance//*
//* Superclass //*
public class SocialMedia { 
	//* Social Media Class Constructor //*
	public SocialMedia(){
		System.out.println("Class Social Media!");
	}
	public void SocialMediaWebsites(){
		System.out.print("1-Snapchat");
		System.out.print(" 2-Whatsapp");
		System.out.println(" 3-Youtube");
	}
	
	public static void main(String[] args) {
		SocialMedia obj = new SocialMedia();
		obj.SocialMediaWebsites();
	}

}
