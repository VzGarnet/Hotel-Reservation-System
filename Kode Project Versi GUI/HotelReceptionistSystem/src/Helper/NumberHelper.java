package Helper;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberHelper {
	public static String formatMoneyRupiah(int number) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		formatter.setMaximumFractionDigits(0);
		
		return formatter.format(number).replace("$", "Rp");
	}
}
