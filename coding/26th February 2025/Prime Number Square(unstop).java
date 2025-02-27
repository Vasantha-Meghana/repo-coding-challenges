//Prime Number Square
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main 
{
    public static boolean isPrime(int n)
    {
        for(int i = 2; i < n; i++)
            if(n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 2;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(arr.size() < n)
        {
            if(isPrime(num))
                arr.add(num);
            num++;
        }
        System.out.print(arr.get(n - 1) * arr.get(n - 1));
    }
}
