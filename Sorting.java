import java.util.Scanner;

public class Sorting {

	static int[] list = new int[1000];

	static void randomize(){
		for(int i = 0 ; i < 1000 ; i++ )
			list[i] = (int) (Math.random()*1000);
	}
	
	public static void main(String[] args) {
		
		randomize();
		
		long startTime = System.currentTimeMillis();
		bubbleSort();
		long finishTime = System.currentTimeMillis();
		System.out.println("It took " +(finishTime - startTime)+ " ms for Bubblesort to sort these elements.");
		
		randomize();
		
		startTime = System.currentTimeMillis();
		insertSort();
		finishTime = System.currentTimeMillis();
		System.out.println("It took " +(finishTime - startTime)+ " ms for Insertsort to sort these elements.");
		
	}

	static void bubbleSort(){
		
		int i;
		int j;
		int n = list.length;
        int key;
           
        for(i = 0; i < n; i++){
            	
        	for(j = 1; j < (n-i); j++){
                           
        		if(list[j-1] > list[j]){
                            	
        			key = list[j-1];
        			list[j-1] = list[j];
        			list[j] = key;
        			
        		}      
        	}
        }
    }

			
		

	static void insertSort(){
		    
		int i;
		int j;
		int n = list.length;
		int key;               
	 
		for (j = 1; j < n; j++){
			
			key = list[j];
			
			for(i = j - 1; (i >= 0) && (list[i] < key); i--){
				
				list[i+1] = list[i];
			                 
			}
			
			list[i+1] = key; 
			
		}
	}
}


