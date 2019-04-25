import java.util.HashMap;
import java.util.Map;

class Test {
	public static void main(String[] args) {
		StringBuffer res = null;
		res = numToWordParser(33);
		System.out.println(res);
	}

	public static StringBuffer numToWordParser(int num) {
		StringBuffer result = new StringBuffer(110);
		String[] unit = { " ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
		String[] ten = { " ", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety",
				"twenty" };
		Map<Integer, String> unitMaps = new HashMap<Integer, String>();
		for (int i = 0; i < unit.length; i++) {

			unitMaps.put(i, unit[i]);
		}
		Map<Integer, String> TenthMaps = new HashMap<Integer, String>();
		for (int i = 0; i < ten.length; i++) {
			TenthMaps.put(i, ten[i]);
		}

		String countNum = String.valueOf(num);
		int unitDigit = 0;
		int tenthDigit = 0;
		if (countNum.length() >= 2) {
			unitDigit = num % 10;
			num = (num - (unitDigit)) / 10;
			tenthDigit = num % 10;
			result.append(TenthMaps.get(tenthDigit));
			result.append(unitMaps.get(unitDigit));

		} else {
			unitDigit = num % 10;
			result.append(unitMaps.get(unitDigit));
		}

		return result;

	}
}
