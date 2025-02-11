//Reverse a String
import java.util.*; 
import java.io.*;

class Main {

  public static String FirstReverse(String str) 
  {
    String res = "";
    for(char ch :str.toCharArray())
      res = ch + res;
    return res;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}
