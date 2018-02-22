package Week_2;

import java.util.*;
/* 1. PROBLEM STATEMENT:
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
	[
  [-1, 0, 1],
  [-1, -1, 2]
]

2. INPUTS								OUTPUTS
 [] or null							[]
 [0,0,0,0,0,0]						[0,0,0]
 [-1, 0, 1, 2, -1, -4] 				[[-1, 0, 1],[-1, -1, 2]]
 [1,-1,2,-2,3,-3,0]					[-2, -1, 3][-3, 1, 2][-3, 0, 3][-2, 0, 2][-1, 0, 1]
 [-1,2,3]							[]
 [1,2,-3,0,5,1]						[-3,1,2]
3. BRUTE FORCE:
	Without sorting considering all the triplets and simultaneously removing the duplicates using HashSet
	Time Complexity: O(n^3)
	Space Complexity: O(n)
4. OPTIMIZATION:
	By sorting the elements of the array the time complexity can be reduced as:
	Time Complexity: O(n^2)
	Space complexity however remains unchanged because we need to remove duplicates
	Space Complexity: O(n)
 * */
public class Three_Sum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();		//size of the array
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		List<List<Integer>> result=return3Sum(arr);
		if(result==null||result.size()==0) {
			System.out.println(result);
		}
		else {
			for(int i=0;i<result.size();i++) {
				System.out.print(result.get(i));
			}
		}
	}
public static List<List<Integer>> return3Sum(int arr[]){
	if(arr==null||arr.length<=2) {
		return null;
	}
	
	HashSet<List<Integer>> sets=new HashSet<>();
	Arrays.sort(arr);
	for(int i=0;i<arr.length-2;i++) {
		int j=i+1;
		int k=arr.length-1;
		while(j<k) {
			int sum=arr[i]+arr[j]+arr[k];
			if(sum==0) {
				ArrayList<Integer> ans=new ArrayList<>();
				ans.add(arr[i]);
				ans.add(arr[j]);
				ans.add(arr[k]);
				sets.add(ans);
				j++;
				k--;
			}
			else if(sum<0) {
				j++;
			}
			else {
				k--;
			}
		}
	}
	List<List<Integer>> result=new ArrayList<>(sets);
	return result;
}
	

}
