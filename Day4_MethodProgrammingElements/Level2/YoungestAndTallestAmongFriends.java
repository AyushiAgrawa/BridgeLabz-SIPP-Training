package Day4_MethodProgrammingElements.Level2;
import java.util.*;
public class YoungestAndTallestAmongFriends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }
        int youngestIndex = Youngest(ages);
        int tallestIndex = Tallest(heights);

        System.out.println("Youngest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");


	}
	public static int Youngest(int[] ages) {
        int min = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[min]) {
                min= i;
            }
        }
        return min;
    }
	public static int Tallest(double[] heights) {
        int max = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[max]) {
                max = i;
            }
        }
        return max;
    }

}
