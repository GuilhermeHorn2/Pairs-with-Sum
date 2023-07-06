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
		
		List<Integer> v = new ArrayList<>(Arrays.asList(2,1,5,6,3,11));
		
		System.out.println(find_pairs(v,8));

	}
	
	private static int binary_search(List<Integer> v,int x){
		
		int strt = 0;
		int end = v.size()-1;
		int mid;
		
		while(strt <= end){
			
			mid = (strt+end)/2;
			
			if(v.get(mid) == x) {
				return mid;
			}
			if(v.get(mid) > x) {
				// x is <--
				end = mid-1;
			}
			if(v.get(mid) < x) {
				// x is -->
				strt = mid+1;
			}
			
		}
		return -1;
	}
	
	private static List<pair> find_pairs(List<Integer> v,int s){
		
		List<pair> pairs = new ArrayList<>();
		
		Collections.sort(v);
		
		for(int i = 0;i < v.size()/2;i++){
			
			int x = s-v.get(i);
			int idx = binary_search(v,x);
			if(idx == -1){
				continue;
			}
			pairs.add(new pair(v.get(i),x));
			
		}
		
		return pairs;
	}

}
