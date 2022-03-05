import java.util.*;
public class ArraysFillExample {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

		Arrays.fill(numbers, 1, 5, 10);

		System.out.println(Arrays.toString(numbers));
	}

}
