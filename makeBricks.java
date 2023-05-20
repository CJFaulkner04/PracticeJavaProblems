public boolean makeBricks(int small, int big, int goal) {
  //calc num of big bricks needed
  int need = goal / 5;
  //subtract length of bricks from goal if num of big bricks needed is less than or equal to num of big bricks
  if (need <= big) {
    goal -= need * 5;
  }
  //else subtract the length of all big bricks from goal
  else {
    goal -= big * 5;
  }
  
  return goal <= small;
}
