public int blackjack(int a, int b) {
  //check if a and b are over 21
  if (a > 21 && b > 21) {
        return 0;
    }
  //check if a is over 21 
  else if (a > 21) {
        return b;
    } 
  //check if b is over 21
  else if (b > 21) {
        return a;
    }
  //if neither numbers are over 21, return largest number  
  return Math.max(a,b);
}
