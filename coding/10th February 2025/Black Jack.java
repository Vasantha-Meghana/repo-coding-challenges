//Black Jack
public int blackjack(int a, int b) 
{
  int d1 = 21 - a;
  int d2 = 21 - b;
  if(d1 == 0 || d2 == 0)
    return 21;
  if(d1 > 0 && d2 > 0)
  {
    if(d1 > d2)
      return b;
    return a;
  }
  if(d1 > 0)
    return a;
  if(d2 > 0)
    return b;
  return 0;
}
