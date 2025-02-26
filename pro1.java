public class pro1
{
public static void main(String args[])
{
StringBuffer buff=new StringBuffer("Java is a high level language");
System.out.println("Original String="+buff);
buff.delete(5,8);
System.out.println("After Deletion="+buff);
}
}