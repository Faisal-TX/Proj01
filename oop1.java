class oop1
{
int salary;
String name;
public int getsalary()
{
return salary;
}
 String getname()
{
return name;
}
 void setname(String n)
{
name=n;
}
public static void main(String[] args)
{
oop1 fai = new oop1();
fai.setname("hi");
System.out.println(fai.getname());
}
}