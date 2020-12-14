package solvedkatas;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {

	public static Map<String, List<Integer>> getPeaks(int[] arr) {

		LinkedHashMap<String, List<Integer>> peakMap = new LinkedHashMap<>();
		List<Integer> peakList = new ArrayList<Integer>();
		List<Integer> posList = new ArrayList<Integer>();

		/* Loop to iterate into the array */
		for (int i = 1; i < arr.length - 1; i++) {

			/*
			 * Condition to check the adjacent value is less. If yes, add it into respective
			 * List
			 */
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				peakList.add(arr[i]);
				posList.add(i);
			}
			int k;
			/*
			 * Condition to check the plateau values and return the first peak from plateau
			 */
			if (arr[i] > arr[i - 1] && arr[i] == arr[i + 1]) {
				k = i;
				/* Iterate through the plateau condition till you find the end of the plateau */
				while (k < arr.length - 1 && arr[k] >= arr[k + 1]) {
					if (arr[k] > arr[k + 1]) {
						peakList.add(arr[i]);
						posList.add(i);
						i = k + 1;
						break;
					}
					k++;
				}
			}

		}

		/* Update the local peakMap variable with the respective list and return */
		peakMap.put("pos", posList);
		peakMap.put("peaks", peakList);
		return peakMap;
	}

}
