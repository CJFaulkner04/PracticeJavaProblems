public boolean lessBy10(int a, int b, int c) {
  int x = Math.abs(a - b);
  int y = Math.abs(a - c);
  int z = Math.abs(b - c);
    
  return x >= 10 || y >= 10 || z >= 10;
}
