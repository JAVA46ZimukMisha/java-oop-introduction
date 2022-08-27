package telran.text;

import java.util.Arrays;

public class Strings {
/**
 * 
 * @param dates - array of strings containing dates in the format D/M/YYYY
 * D day of month  without leading 0 (3);
 * M month number (1 - 12)
 * YYYY  year (1980)
 *  
 * @return array sorted by dates
 * Use only class String and interface Comparator
 */
	public static String[] sortStringsAsDates(String [] dates) {
	String [] resArray = Arrays.copyOf(dates, dates.length);
	Arrays.sort(resArray, (String str1, String str2) -> {
		String [] str1Parts = str1.split("/");
		String [] str2Parts = str2.split("/");
		int res = -1;
		int ind = 2;
		do {
			res = Integer.compare(Integer.parseInt(str1Parts[ind]),
					Integer.parseInt(str2Parts[ind]));
			ind--;
		}while(ind >=0 && res == 0);
		return res;
	});
	return resArray;
}
}
