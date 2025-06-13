import java.util.Scanner;
public class TotalIncome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary: ");
		int salary = sc.nextInt();
		System.out.println("Enter Bonus: ");
        int bonus = sc.nextInt();
        int totalincome = salary + bonus;
        System.out.println("The salary is INR " + salary+" and the bonus is INR "+ bonus +". Hence Total Income is INR "+ totalincome);
        
	}

}
