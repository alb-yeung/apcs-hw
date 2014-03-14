import java.util.*;
public class QuickSort{
    public int partition (int[]A,int L,int R,int p){
	int pivot = p;
	int temp = A[pivot];
	int wall = 0;
	A[pivot] = A[R];
	A[A.length - 1] = temp;
	pivot = temp;
	for (int i = 0;i<R-L;i++){
	    if (A[L+i]<pivot){
		temp = A[L+i];
		A[L+i]=A[wall];
		A[L+wall]=temp;
		wall++;
	    }
	}
	temp = A[wall];
	A[wall]=pivot;
	A[A.length-1]=temp;
	return wall;
    }

    public int[] QSort(int[]A,int L,int R){
        if (L>=R){
            return A;
        }
        int pivoti = partition(A,L,R,(int)(Math.random()*(R-L)));
        //Don't understand why this doesn't stop repeating
        QSort(A,L,pivoti-1);
        QSort(A,pivoti+1,R);
        return A;
    }

    public static void main(String[]args){
	QuickSort a = new QuickSort();
	int[] b = new int[20];
	for (int i = 0;i<b.length;i++){
	    b[i]=(int)(Math.random()*100);
	}
        a.QSort(b,0,19);
        System.out.println(Arrays.toString(b));
    }
}
