import java.io.*;

class Selection_Sort {
	public static void main (String[] args) {
		int a[]={10,5,1,78,5};
		for(int i=0;i<a.length-1;i++){
		    int min=i;
		    for(int j=i+1;j<a.length;j++){
		        if(a[min]>a[j])
		        min=j;
		    }
		    int temp=a[min];
		    a[min]=a[i];
		    a[i]=temp;
		    
		}
		for(int n1:a)
		System.out.print(n1+" ");
	}
}
