package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
	while (a!=b){
		if(a>b) a=a-b;
		else b=b-a;
	}
	return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
	
        int [] arr= new int [n];
        arr[0]=1; arr[1]=1;
	for(int i=2; i<n; i++){
		arr[i]=arr[i-1]+arr[i-2];
	}
        int m=arr[n-1];
        return m;
    }
}
