import java.util.Scanner;
public class Array1 
{
    public static void main(String[] x) 
    {

Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int temp;
        int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}