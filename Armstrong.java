public class Armstrong 
{

    public static void main(String[] x)
 {

        int n=371,Num,rem,result=0;

        Num=n;

        while(Num!=0)
        {
            rem=Num%10;
            result += Math.pow(rem, 3);
            Num/= 10;
        }

        if(result==n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}