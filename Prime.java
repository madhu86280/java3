import java.util.*;
public class Prime
{
public static void main(String[] x)
{
int temp;
boolean prime=true;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
for(int i=2;i<=n/2;i++)
{
temp=n%i;
if(temp==0)
{
prime=false;
break;
}
}
if(prime)
System.out.println(n + "is a prime number");
else
System.out.println(n + "is a not prime number");
}

}