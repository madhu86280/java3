import java.util.*;
public class Array2 
{
    public static void main(String[] x) 
    {

Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int[] num={1,4,6,7,8,9,10};
boolean max = false;
for(int tem:num)
{
if(tem==n)
{
max = true;
break;
}
}
if(max)
      
        System.out.print(n + "number is found");
else
System.out.print(n + "number is not  found");
    }
}