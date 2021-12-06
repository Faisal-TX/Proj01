 public class abs {
public static void main(String[] args) {
	Mahesh object = new Ramesh();
	object.call();
	object.move();


	}

 }

abstract class Mahesh
{
	public void call()
	{
		System.out.println("calling");
		
	}
	public abstract void move();
	
}
 class Ramesh extends Mahesh
{
	public void move()
	{
		System.out.println("moving");
	}
}
 