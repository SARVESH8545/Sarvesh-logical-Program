package array1;

public class Nums1 {

	public static void main(String[] args) {}
		public boolean firstLast6(int[] nums) {
			if(nums[0]==6 || nums[nums.length-1]==6) {
				return true;
			}
			else return false;
			
		}
		public boolean sameFirstLast(int[] nums) {
		if(nums.length>=1 && (nums[0]==nums[nums.length-1])) 
		{
			return true;
		}	  
		else return false;
		}
		public int[] makePi() {
		return new int[] {3,1,4};	  
		}
		public boolean commonEnd(int[] a, int[] b) {
		if(a[0]==b[0]||(a[a.length]== b[b.length])) {
			return true;
		}	  
		else return false;
		}
		public int[] maxEnd3(int[] nums) {
			  int max=0;
			  if(nums[0] > nums[nums.length-1]){
			    max=nums[0];
			  }
			  else
			  {
			  max=nums[nums.length-1];
			}
			  return new int[]{max,max,max};
			}
		public int sum2(int[] nums) {
			  if(nums.length>=0){
			    return nums[0]+nums[1];
			  }else if(nums.length==1){
			    return nums[0];
			  }
			  else return 0;
			}
		public int[] middleWay(int[] a, int[] b) {
		return new int[] {a[1],b[1]};	  
		}
		public int[] makeEnds(int[] nums)
		{
		int firstele=nums[0]; 
		int lastele=nums[nums.length-1];
		return new int[]{firstele,lastele};
		}





	

}
