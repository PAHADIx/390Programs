import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		
		System.out.println("How long do you want?");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.close();
		
		
		//Adding Nodes
		for(int i = 0; i < length; i++){
			list.addAtLast(i);
			list.print();
		}
		
		
		
	}

}
