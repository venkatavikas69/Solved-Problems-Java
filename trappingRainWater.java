public class trappingRainWater {

	static int find_total_water(int[] arr, int n) {
		int total_water = 0;
		for (int i = 1; i < n - 1; i++) {
			int left_max = find_left_max(arr, i, n);
			int right_max = find_right_max(arr, i, n);
			total_water += min(left_max, right_max) - arr[i];
		}
		return total_water;
	}

	static int find_left_max(int[] arr, int i, int n) {
		int maximum = 0;
		for(int j = 0; j <= i; j++) {
			maximum = max(maximum,arr[j]);
		}
		return maximum;
	}

	static int find_right_max(int[] arr, int i, int n) {
		int maximum = 0;
		for(int j = n-1; j >= i; j--) {
			maximum = max(maximum,arr[j]);
		}
		return maximum;
	}

	static int max(int i, int j) {
		int max = 0;
		if(i > j) {
			max = i;
		} else {
			max = j;
		}
		return max;
	}

	static int min(int i, int j) {
		int min = 0;
		if(i < j) {
			min = i;
		} else {
			min = j;
		}
		return min;
	}


	public static void main(String[] args) {

		int[] input2 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int n = input2.length;
		int result = find_total_water(input2, n);
		System.out.println(result);

	}

}
