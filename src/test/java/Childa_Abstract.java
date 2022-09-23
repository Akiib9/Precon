
public class Childa_Abstract extends Parent_Abstract{

	public static void main(String[] args) {
		Childa_Abstract  obj=new Childa_Abstract();
		obj.Abhijit();
		obj.Bottle();
		obj.Manish();
		obj.HardDisk();
		obj.Yogesh();
		Parent_Abstract  obj2=new Childa_Abstract();
        obj2.Abhijit();
        obj2.Bottle();
        obj2.HardDisk();
        obj2.Manish();
	}

	@Override
	public void Bottle() {
		System.out.println("Water Bottel");
		
	}

	@Override
	public void HardDisk() {
		System.out.println("C Harddisk");
		
	}
	public void Yogesh()
	{
		System.out.println("Yogesh Automation");
	}

}
