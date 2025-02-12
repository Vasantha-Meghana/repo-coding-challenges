//Find Insertion
import java.util.*; 
import java.io.*;

class Main {

  public static String FindIntersection(String[] strArr) 
  {
    String[] arr1 = strArr[0].split(", ");
    String[] arr2 = strArr[1].split(", ");
    ArrayList<String> arr = new ArrayList<String>();
    for(String ele1 : arr1)
    {
      for(String ele2 : arr2)
      {
        if(ele1.equals(ele2))
        {
          arr.add(ele1);
        }
      }
    }
    return String.join(",", arr);
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }

}
