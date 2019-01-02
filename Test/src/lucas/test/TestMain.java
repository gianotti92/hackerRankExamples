package lucas.test;

import java.util.HashSet;
import java.util.Set;

public class TestMain {

//	public static void main(String[] args) {
//		int[] ar = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
//		int n = 9;
//
//		Set<Integer> colors = new HashSet<>();
//		int pairs = 0;
//
//		for (int i = 0; i < n; i++) {
//			if (!colors.contains(ar[i])) {
//				colors.add(ar[i]);
//			} else {
//				pairs++;
//				colors.remove(ar[i]);
//			}
//		}
//		System.out.println("total de pares: " + pairs);
//	}
//}
	
	public static void main(String[] args) {
		int val = pageCount(6, 2);
		System.out.println(val);
	}
	
	
	static int pageCount(int n, int p) {
		if(isOdd(n)) {
			n+=1;
		}
		
        int firstPageValue = countFromFirstPage(p, n);
        int lastPageValue = counFromLastPage(p, n);
        if(firstPageValue > lastPageValue) {
        	 return firstPageValue;
        }else {
        	return lastPageValue;
        }
    }
	
	
	static int counFromLastPage(int p, int n){
		return (p - 1) / 2;
	}
	
	static int countFromFirstPage(int p, int n){
		return (n - p) / 2;
	}
	
	static boolean isOdd(int n) {
		return n % 2 == 0;
	}
}
