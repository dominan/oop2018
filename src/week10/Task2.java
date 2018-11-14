package week10;

import java.util.Random;
public class Task2 {	
	public static void BubleSort(int a[]) {
            int temp;
            for(int i = 0; i < 999; i ++) {
		for(int j = 0; j < 999 - i; j ++) {
                    if(a[j] > a[j+1]) {
			temp = a[j];
			a[j] = a[j+1];
			a[j+1] = temp;					
                    }			
		}
            }
	}
	public static void main(String[] args) {
            int []a = new int[1000];
            Random random = new Random(); 
            for(int i = 0; i < 1000 ; i ++){
		a[i] = random.nextInt(1000);			
            }		
            BubleSort(a);
            for(int i=0; i<1000; i++)System.out.print(a[i]+" ");
	}
}
