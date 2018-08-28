import java.util.*;
public class Reverse
{
public static void main(String[] x)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int rev=0,rem;
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;

}
System.out.println("Reverse of number is"+rev);

}

}