import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static int hackerlandRadioTransmitters(List<Integer> x, int k) {

		int result = 0;
        Collections.sort(x);
        int start=0;
        int end=x.size();

        int mid;
        while (start < end) {
            mid = x.get(start) + k;

            result++;
            
            while(start<end && x.get(start)<=mid) {
                start++;
            }
            start--;
            mid= x.get(start)+k;
            while(start<end && x.get(start)<=mid) {
                start++;
            }
           
        }

        return result;
	}

	public static void main(String[] args) {
		System.out.println(hackerlandRadioTransmitters(Arrays.asList(7, 2, 4, 6, 5, 9, 12, 11), 2));
		/*System.out.println(hackerlandRadioTransmitters(Arrays.asList(1, 2, 3, 5, 9), 1));
		System.out.println(hackerlandRadioTransmitters(Arrays.asList(1, 2, 3, 4, 5), 1));*/
	}

}
