import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static List<Integer> maxSubarray(List<Integer> arr) {
		
		int length = arr.size();
		
		// 0 is start here, 1 is carry previous
		int starth=arr.get(0);
		int carrypre= 0;
		int max = arr.get(0);
		
		//0 chose, 1 not chose
		int chose=arr.get(0);
		int notchose=0;
		
		int temp;
		int maxele=arr.get(0);
		
		for (int i = 1; i < length; i++) {

			carrypre = Math.max(starth, carrypre) + arr.get(i);
			starth = arr.get(i);
			max = Math.max(max, Math.max(starth, carrypre));
			
			temp= Math.max(chose,notchose);
			chose= temp+arr.get(i);
			notchose=temp;
			
			maxele=Math.max(maxele, arr.get(i));
		}
		
		List<Integer> result = new ArrayList<>(2);
		
		result.add(max);
		
		if(maxele>=0)
			result.add(Math.max(chose,notchose));
		else
			result.add(maxele);
		
		return result;
		
	}

	public static void main(String[] args) {
		List<Integer> ll=Arrays.asList(-1,2,3,-4,5,10);
		System.out.println(maxSubarray(ll));
		ll=Arrays.asList(-2,-3,-1,-4,-6);
		System.out.println(maxSubarray(ll));
		ll=Arrays.asList(2,-1,2,3,4,-5);
		System.out.println(maxSubarray(ll));
		ll=Arrays.asList(1,2,3,4);
		System.out.println(maxSubarray(ll));
		ll=Arrays.asList(-1);
		System.out.println(maxSubarray(ll));
	}
}
