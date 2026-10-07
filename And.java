1.import java.util.*;
public class And
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
int a=sc.nextInt();
if(a>10 && a<50)
{
System.out.println("True");
}
else
{
System.out.println("False");

}
}
}



2.import java.util.*;
public class Divisible
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
int a=sc.nextInt();
if(a%3==0 && a%5==0)
{
System.out.println(a+" "+"is divisible by 3 and 5");
}
else if(a%3==0)
{
System.out.println(a+" "+"is divisible by 3");
}
else if(a%5==0)
{
System.out.println(a+" "+"is divisible by 5");
}
else
{
System.out.println(a+" "+"is not divisible by 3 and 5");
}
sc.close();
}
}


3.import java.util.*;
public class Divide
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
int a=sc.nextInt();
if(a%3==0 || a%7==0)
{
System.out.println(a+" "+"is divisible by 3 or 7");
}
else
{
System.out.println(a+" "+"is not divisible by 3 and 7");
}
sc.close();
}
}


4.import java.util.*;
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