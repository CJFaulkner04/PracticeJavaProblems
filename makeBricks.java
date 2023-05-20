public boolean makeBricks(int small, int big, int goal) {
  int need = goal / 5;
    if (need <= big) {
        goal -= need * 5;
    } else {
        goal -= big * 5;
    }
    return goal <= small;
}
