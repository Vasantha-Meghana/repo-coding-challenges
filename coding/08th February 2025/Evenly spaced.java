//Evenly spaced
public boolean evenlySpaced(int a, int b, int c) 
{
  int[] arr = new int[3];
  arr[0] = a;
  arr[1] = b;
  arr[2] = c;
  Arrays.sort(arr);
  return (Math.abs(arr[0] - arr[1]) == Math.abs(arr[1] - arr[2]));
  
}
