import java.util.*;
public class Armstrong1
{
public static void main(String[] x)
{
int num,rem,result=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
num=n;

while(num!=0)
{
rem=num%10;
result +=Math.pow(rem,3);
num/=10;

}
if(result==n)
System.out.println(n + "number is armstrong");
else
System.out.println(n + "number is not armstrong");

}

}