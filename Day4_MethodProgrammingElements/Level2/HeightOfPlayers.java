package Day4_MethodProgrammingElements.Level2;
import java.util.*;
public class HeightOfPlayers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] heights = generateHeights();
		System.out.print("Player heights: ");
	    for (int h : heights) {
	        System.out.print(h + " ");
	    }
	    System.out.println("\n\nShortest height: " + Shortest(heights) + " cm");
        System.out.println("Tallest height: " + Tallest(heights) + " cm");
        System.out.printf("Mean height: %.2f cm\n", Mean(heights));   
	}
	public static int[] generateHeights() {
        int[] heights = new int[11];
        Random random = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; 
        }
        return heights;
    }
	public static int Sum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }
	 public static double Mean(int[] heights) {
	        return (double) Sum(heights) / heights.length;
	 }
	 public static int Shortest(int[] heights) {
	        int min = heights[0];
	        for (int h : heights) {
	            if (h < min) {
	                min = h;
	            }
	        }
	        return min;
	 }
	 public static int Tallest(int[] heights) {
	        int max = heights[0];
	        for (int h : heights) {
	            if (h > max) {
	                max = h;
	            }
	        }
	        return max;
	    }

}
