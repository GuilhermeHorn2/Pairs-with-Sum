package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main_misc {

	
	public static class pair{
		
		public int x;
		public int y;
		
		public pair(int x,int y) {
			this.x = x;
			this.y = y;
		}
		
		public String toString() {
			return "("+x+","+y+")";
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> v = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		System.out.println(find_pairs(v,8));

	}
	
	
	
	private static List<pair> find_pairs(List<Integer> v,int s){
		
		//if the array is sorted and the difference between each element is 1 we can solve in O(n)
		
		List<pair> pairs = new ArrayList<>();
		
		int strt = 0;
		int end = v.size()-1;
		while(strt <= end){
			int x = v.get(strt);
			int y = v.get(end);
			if(x + y == s) {
				pairs.add(new pair(x,y));
				strt++;
				end--;
			}
			else{}
			
		}
		
		
		return pairs;
	}

}
