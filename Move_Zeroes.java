public class test1 {
	
	
	 static void zerosToEnd(int A[], int n)
	    {
	        int count = 0;  
	 
	        
	        for (int i = 0; i < n; i++)
	            if (A[i] != 0)
	                A[count++] = A[i]; 
	        
	        while (count < n)
	            A[count++] = 0;
	    }
	 
	  
	    public static void main (String[] args)
	    {
	        int array[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
	        int n = array.length;
	        zerosToEnd(array, n);
	        System.out.println("Array after pushing zeros to the back: ");
	        for (int i=0; i<n; i++)
	            System.out.print(array[i]+" ");
	    }
	}  
