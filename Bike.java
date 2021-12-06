 class abs {
public static void main(String[] args) {
	Mahesh object = new Suresh();
	object.call();
	object.move();
	object.dance();
object.cook();
	}

 }

abstract class Mahesh
{
	public void call()
	{
		System.out.println("calling");
		
	}
	public abstract void move();
	public abstract void dance();
}
abstract class Ramesh extends Mahesh
{
	public void move()
	{
		System.out.println("moving");
	}
}
abstract class Suresh extends Ramesh
{
	public void dance()
	{
		System.out.println("dancing");
	}
	public void cook()
	{
	System.out.println("cooking");
	}
}
