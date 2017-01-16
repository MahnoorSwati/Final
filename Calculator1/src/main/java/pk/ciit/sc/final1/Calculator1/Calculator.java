package pk.ciit.sc.final1.Calculator1;

/**
 * @author Sundus
 *
 */
public class Calculator {

	/**
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0; //The max is set to 0. So it'd not consider negative numbers and max will always be 0 when negative number show up.
		for (int i = 0; i < arr.length; i++) {
		if (arr[i] > max)
		max = arr[i];
		}
		return max;
		}
		/**
		 * @param num
		 * @return
		 * @throws IllegalArgumentException
		 */
		public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
		result = num * num;
		} else
		throw new IllegalArgumentException();
		return result;
		}
		
		/**
		 * @param num
		 * @return
		 */
		public int cube(int num){
			return num*num*num;
		}
}
