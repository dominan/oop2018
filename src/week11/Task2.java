package week11;

public class Task2 {                            
   public static < E extends Comparable<E>> void max( E[] inputArray )
   {
       // Hien thi cac phan tu mang
       E max = inputArray[0];
         for(int i=0; i<inputArray.length-1; i++){
             if(inputArray[i].compareTo(max)>0){                               
                 max=inputArray[i];
             }
         }
         
             System.out.printf(" %s ", max);
         
    }
    public static void main( String args[] )
    {
        // Tao cac mang Integer, Double va Character
        Integer[] intArray = { 1, 7, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 6.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Max intArray la:" );
        max( intArray  ); // truyen mot mang Integer

        System.out.println( "\nMax charArray la:" );
        max( charArray ); // truyen mot mang Character
                
        System.out.println( "\nMax doubleArray la:" );
        max(doubleArray) ;// truyen mot mang Double

    } 
}
