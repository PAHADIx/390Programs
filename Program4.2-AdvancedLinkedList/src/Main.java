import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Enter the filename: (Eg: data)");
		Scanner sc = new Scanner(System.in);
		String filename = sc.next();
		sc.close();
		
		
		String[] names = readFile(filename);
		System.out.println(names[0]);
		
		
		
		
		
	}
	public static String[] readFile(String file){
		String[] temp = null;
		try{
			Scanner sc = new Scanner(new File(file));
			int count = 0;
			while(sc.hasNextLine()){
				sc.nextLine();
				count++;
			}
			//defining size for names/hashed
			temp = new String[count];

			sc = new Scanner(new File(file));
			count = 0;
			while(sc.hasNextLine()){
				temp[count] = sc.nextLine();
				count++;
			}
		
			sc.close();

		} catch (Exception e){
			System.out.println("No file found.");
		}
		
		return temp;
	}

}
