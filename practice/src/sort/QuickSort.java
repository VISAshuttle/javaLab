package sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
	
	public List<Integer> quickSort(List<Integer> list) {
		if (list == null)	
			return null;
		else if (list.size() <= 1)
			return list;
		
		int center = list.get(0);
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		
		for (int i = 1; i < list.size(); i++) {
			int number = list.get(i);
			if (number < center)		left.add(number);
			else						right.add(number);
		}

		List<Integer> returnList = new ArrayList<Integer>();
		returnList.addAll(quickSort(left));
		returnList.add(center);
		returnList.addAll(quickSort(right));
		return returnList;
	}
	
}