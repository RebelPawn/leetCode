/**
 * 
 */
package OneToFivety;

/**
 * @author Administrator
 * @time 2019年3月12日 下午3:20:06 
 */
public class TwoSum {

	public int[] twoSum(int[] nums,int target) {
		int [] nums2 = null ;
		int size=nums.length;
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<=size-1;j++) {
				int num1=nums[i];
				int num2=nums[j];
				int tag=num1+num2;
				if(tag==target) {
					nums2=new int[] {i,j};
					break;
				}
			}
		}
		return nums2;
	}
	
	public static void main(String[] args) {
		TwoSum ts=new TwoSum();
		int[] nums= {1,2,3};
		int target=3;
		int[] res=ts.twoSum(nums, target);
		System.err.println(res[0]+"-----"+res[1]);
	}
}
