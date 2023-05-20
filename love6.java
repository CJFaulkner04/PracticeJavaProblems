public boolean love6(int a, int b) {
  //checks to see if a or b is equal to 6
  if(a == 6 || b == 6){
    return true;
  } 
  //then checks to see if the sumation or difference is equal to 6
  else if (a + b == 6 || a - b == 6 || b - a == 6){
    return true;
  }
  return false;
}
