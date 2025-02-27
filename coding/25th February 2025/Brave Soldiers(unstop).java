//Brave Soliders
import java.util.Scanner;

public class Main 
{
    public static boolean isPrime(int n)
    {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) 
            if (n % i == 0) 
                return false;
        return true;
    }
    public static boolean isPerfectSquare(int n) 
    {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
    public static int countBraveSoldiers(int n) 
    {
        int c = 0;
        for(int i = 1; i <= n; i++)
            if(isPrime(i) && !isPerfectSquare(i))
                c++;
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = countBraveSoldiers(n);
        System.out.println(result);
    }
}
