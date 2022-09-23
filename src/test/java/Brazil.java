
public class Brazil implements India,Usa {

	public static void main(String[] args) {
		Brazil obj=new Brazil();
		obj.Hockey();
		obj.Cricket();
		obj.Football();
		obj.Vollyball();
		India obj2=new Brazil();
		obj2.Cricket();
		obj2.Hockey();
		obj2.Football();
		//India obj3=new Brazil();
		Usa obj4=new Brazil();
		obj4.Keyboard();
		obj4.Hdmi();
		obj4.Niyaon();

	}

	public void Cricket() {
		System.out.println("I dont like cricket");
		
	}

	public void Football() {
		System.out.println("I like Football");
		
	}

	public void Hockey() {
		System.out.println("Also like hockey");
		
	}
	public void Vollyball()
	{
		System.out.println("Vollyball Players");
	}

	public void Hdmi() {
		System.out.println("HDMI cable");
		
	}

	public void Keyboard() {
		System.out.println("Parts of computer");
		
	}

	public void Niyaon() {
		System.out.println("Niyaon system");
		
	}

}
