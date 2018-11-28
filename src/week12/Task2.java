/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan12_2;

/**
 *
 * @author Minh Anh
 */
interface sort{
    public void sort1(int arr[], int n);
    
}
class bubblesort implements sort{

    @Override
    public void sort1(int[] arr, int n) {
        for(int i=0; i<n; i++){
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    } 
}
class insertsort implements sort{
    

    @Override
    public void sort1(int[] data, int n) {
        for (int i = 1; i < n; i++) {
	// Tìm vị trí phù hợp cho i
            int j = i;
            while (j > 0 && data[i] < data[j-1]) --j;

	// Đưa i về đúng vị trí
            int tmp = data[i];
            for (int k = i; k > j; k--) data[k] = data[k-1];
            data[j] = tmp;
        }
    }
}
public class task2 {
    sort so;
    public void setSort(sort so) {
        this.so = so;
    }
    public static void main(String[] args) {
        task2 t= new task2();
        int arr[]= {9,12,1,5,46};
        t.setSort(new insertsort());
        t.so.sort1(arr, 5);
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
