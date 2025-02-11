//Longest Word
import java.util.*; 
import java.io.*;

class Main 
{

  public static String LongestWord(String sen) 
  {
    String res = "";
    String[] arr = sen.split(" ");
    for(String s : arr)
    {
      String w = "";
      for(char ch : s.toCharArray())
        if(Character.isLetter(ch))
          w += ch;
      if(w.length() > res.length())
        res = w;
    }
    return res;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }

}
