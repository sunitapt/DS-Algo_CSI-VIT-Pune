import java.util.Scanner;
class fibnocci
{
    static int fibdp(int n)
    {
        int dp[] = new int[n+2];
        dp[0] =0;dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    static int fibRec(int n)
    {
        if(n<=1) return n;
        return fibRec(n-1)+fibRec(n-2);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Using rec "+fibRec(n));
        System.out.println("Using Dp "+fibdp(n));
    }
}