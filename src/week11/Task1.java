package week11;

public class Task1 {
  public static < E extends Comparable<E>> void printArray( E[] inputArray )
   {
       // Hien thi cac phan tu mang
       
         for(int i=0; i<inputArray.length-1; i++){
             if(inputArray[i].compareTo(inputArray[i+1])>0){
                 E name = inputArray[i];
                 inputArray[i]=inputArray[i+1];
                 inputArray[i+1]=name;
             }
         }
         for (E element : inputArray){
             System.out.printf(" %s ", element);
         }
    }
    public static void main( String args[] )
    {
        // Tao cac mang Integer, Double va Character
        Integer[] intArray = { 1, 7, 3, 4, 5 };      
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Mang intArray bao gom:" );
        printArray( intArray  ); // truyen mot mang Integer

        System.out.println( "\nMang charArray bao gom:" );
        printArray( charArray ); // truyen mot mang Character
      

    } 
}
