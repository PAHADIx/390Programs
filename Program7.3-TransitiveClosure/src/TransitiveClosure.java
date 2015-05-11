import java.util.Scanner;
 
public class TransitiveClosure
{
    private int transitiveMatrix[][];
    private int numberofvertices;
    public static final int INFINITY = 999;
 
    public TransitiveClosure(int numberofvertices)
    {
        transitiveMatrix= new int[numberofvertices + 1][numberofvertices + 1];
        this.numberofvertices = numberofvertices;
    }
 
    public void transitiveClosure(int adjacencymatrix[][])
    {
        for (int source = 1; source <= numberofvertices; source++)
        {
            for (int destination = 1; destination <= numberofvertices; destination++)
            {
                transitiveMatrix[source][destination] = adjacencymatrix[source][destination];
            }
        }
 
        for (int intermediate = 1; intermediate <= numberofvertices; intermediate++)
        {
            for (int source = 1; source <= numberofvertices; source++)
            {
                for (int destination = 1; destination <= numberofvertices; destination++)
                {
                    if (transitiveMatrix[source][intermediate] + transitiveMatrix[intermediate][destination]
                               < transitiveMatrix[source][destination])
                        transitiveMatrix[source][destination] = transitiveMatrix[source][intermediate] 
                                + transitiveMatrix[intermediate][destination];
                }
            }
        }
 
        for (int source = 1; source <= numberofvertices; source++)
            System.out.print("\t" + source);
 
        System.out.println();
        for (int source = 1; source <= numberofvertices; source++)
        {
            System.out.print(source + "\t");
            for (int destination = 1; destination <= numberofvertices; destination++)
            {
                System.out.print(transitiveMatrix[source][destination] + "\t");
            }
            System.out.println();
        }
    }
 
    public static void main(String... arg)
    {
        int adjacency_matrix[][];
        int numberofvertices;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        numberofvertices = scan.nextInt();
        adjacency_matrix = new int[numberofvertices + 1][numberofvertices + 1];
 
        System.out.println("Enter the Weighted Matrix for the graph");
        for (int source = 1; source <= numberofvertices; source++)
        {
            for (int destination = 1; destination <= numberofvertices; destination++)
            {
                adjacency_matrix[source][destination] = scan.nextInt();
                if (source == destination)
                {
                    adjacency_matrix[source][destination] = 0;
                    continue;
                }
                if (adjacency_matrix[source][destination] == 0)
                {
                    adjacency_matrix[source][destination] = INFINITY;
                }
            }
        }
        
        scan.close();
        
        System.out.println("\nThe Transitive Closure of the Graph"); 
        TransitiveClosure transitiveClosure = new TransitiveClosure(numberofvertices);
        transitiveClosure.transitiveClosure(adjacency_matrix);
 
    }
    
    /*
		{0,1,1,1,0,0,0},
		{1,0,0,0,1,1,1},
		{1,0,0,1,0,0,0},
		{1,0,0,0,0,0,1},
		{0,1,0,0,0,1,0},
		{0,1,0,0,1,0,1},
		{0,1,0,1,0,1,0}
		
			
		0 1 1 1 0 0 0
		1 0 0 0 1 1 1
		1 0 0 1 0 0 0
		1 0 0 0 0 0 1
		0 1 0 0 0 1 0
		0 1 0 0 1 0 1
		0 1 0 1 0 1 0	
     
     */
    
    
    
    
    /* Supporters */
	public static void print(int[] arr){
		for(int i = 0; i < arr.length; i++){
			print(arr[i] + " ");
		}
	}
	
	public static void print(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			print(arr[i]);
			println("");
		}
	}
	
	public static void print(Object o){
		System.out.print(o);	
		
	}
	
	public static void println(Object o){
		System.out.println(o);
	}
	
	public static void print(String[] arr){
		for(int i = 0; i < arr.length; i++){
			print(arr[i] + " ");
		}
	}
	
	public static void print(String[][] arr){
		for(int i = 0; i < arr.length; i++){
			print(arr[i]);
			println("");
		}
	}
}