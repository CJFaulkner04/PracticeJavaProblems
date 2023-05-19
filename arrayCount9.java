public int arrayCount9(int[] nums) {
  int count = 0;
  
  //loops through array adding 1 to count everytime it finds 9
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 9){
      count++;
    }
  }
  return count;
}
