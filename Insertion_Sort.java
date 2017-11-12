import java.util.*;

class Insertion_Sort {
	public static void main (String[] args) {
		int a[]={5,4,8,1,88,2};
		sort(a);
	
	}
	static void sort(int a[]){
	    	for(int i=1;i<a.length;i++){
		    for(int j=i;j>0;j--){
		        if(a[j]<a[j-1]){
		            int t=a[j];
		            a[j]=a[j-1];
		            a[j-1]=t;}
		        }
		    }
		
		print(a);
	
	}
	static void print(int a[]){
	    for(int s:a)
		System.out.print(s+" ");
	}
}
