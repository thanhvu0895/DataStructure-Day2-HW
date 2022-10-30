//Time complexity: O(N)

public class fibonacci {
	public static void main(String[] args) {
		int input = 24;
		
		System.out.println(fib(input));
	}
	
	public static int fib (int n) {
		if (n <= 1) { // Base Case:  for n = 0 and n = 1, return n
			return n;
		}
		
		int[] memory = new int[n + 1]; // Create an int array with size = n + 1
		memory[1] = 1;  // default memory[0] = 0. Now set memory[1] = 1 to create a fibonnaci sequence 
		// iterate through the array and save the answer into array
		for (int i = 2; i <= n; i ++) {
			memory[i] = memory[i - 1] + memory [i - 2];
		}
		 
		//Once we reached the last index, return the fibonnaci number in that index
		return memory[n];
	}
}


