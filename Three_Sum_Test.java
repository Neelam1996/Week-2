package Week_2;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Three_Sum_Test {

	@Test
	void test1() {
	List<List<Integer>> l=new ArrayList<>();
	int arr[]= {};
	assertEquals(l,Three_Sum.return3Sum(arr));
	}
	void test2() {
		ArrayList<Integer> l=new ArrayList<>();
		int arr[]= {0,0,0,0,0,0};
		l.add(0);
		l.add(0);
		l.add(0);
		assertEquals(l,Three_Sum.return3Sum(arr));
	}
	void test3() {
		int arr[]= {-1, 0, 1, 2, -1, -4};
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(-1);
		l1.add(0);
		l1.add(1);
		ArrayList<Integer> l2=new ArrayList<>();
		l2.add(-1);
		l2.add(-1);
		l2.add(2);
		List<List<Integer>> l=new ArrayList<>();
		l.add(l1);
		l.add(l2);
		assertEquals(l,Three_Sum.return3Sum(arr));
	}

}
