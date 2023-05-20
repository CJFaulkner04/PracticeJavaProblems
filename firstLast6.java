public boolean firstLast6(int[] nums) {
  //if the first number in the array is equal to 6 or if the last number is equal to 6 (-1 because arrays start at 0)
  if(nums[0] == 6 || nums[nums.length-1]==6){
    return true;
  }
  return false;
}
