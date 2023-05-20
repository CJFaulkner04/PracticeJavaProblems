public boolean lessBy10(int a, int b, int c) {
  //setting difference of all possibilities 
  int x = Math.abs(a - b);
  int y = Math.abs(a - c);
  int z = Math.abs(b - c);
  
  //returns the equations boolean
  return x >= 10 || y >= 10 || z >= 10;
}
