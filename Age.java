import java.util.*;
public class Age
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
int a=sc.nextInt();
if(a>=18 && a<=60)
{
System.out.println("Yes!.. the age is between 18 and 60");
}
else
{
System.out.println("No!.. the age is between 18 and 60");

}
}
}