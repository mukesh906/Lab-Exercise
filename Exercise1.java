import java.util.Arrays; 
public class Exercise1 {
public static void main(String[] args){   
    
    int[] my_array1 = {
            43,55,75,67,54,87,43,23,12,32,11,15
			};
            
       
System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
    
    
    }
}