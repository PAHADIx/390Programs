
public class Main {

	public static void main(String[] args) {

		System.out.println(factorial(4));
		System.out.println(factorialRec(4));
		System.out.println(sum(4));
		System.out.println(sumRec(4));
		
	}
	
	public static int factorial(int num){
		int product = 1;
		while(num > 0){
			product *= num;
			num--;
		}
		return product;
	}
	
	public static int factorialRec(int num){
		if(num <= 1){
			return 1;
		} else {
			return num*factorialRec(num-1);
		}
	}
	
	public static int sum(int num){
		int sum = 0;
		while(num > 0){
			sum += num;
			num--;
		}
		return sum;
	}

	public static int sumRec(int num){
		if(num <= 0){
			return 0;
		} else {
			return num + sumRec(num-1);
		}
	}
	
}
