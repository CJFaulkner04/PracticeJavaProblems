public int[] makeLast(int[] nums) {
  //create newNums array thats double nums array length
  int[] newNums = new int[nums.length*2];
  //set last element in newNums to last element in nums
  newNums[newNums.length - 1] = nums[nums.length - 1];
  //return new nums
  return newNums; 
}
