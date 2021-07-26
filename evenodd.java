import java.util.Scanner;
public class evenodd
{
public static void main(String args[])
{
int p;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
p=sc.nextInt();
System.out.println();
sc.close();
if(p%2==0)
{
System.out.println("The number is Even ");
}
else
System.out.println("The number is Odd ");
}
}