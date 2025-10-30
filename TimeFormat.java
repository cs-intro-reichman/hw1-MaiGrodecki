public class TimeFormat {
	public static void main(String[] args) {
		String hourFormat = args[0];
		int hourDigits = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minDigits = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); 
		int newFormatHour = hourDigits % 12;
		if (newFormatHour == 0){
			newFormatHour = 12;
		} 
		if (hourDigits == 0){
			newFormatHour = 0;
		}
		String newFormatMin = "" + minDigits;
		if (minDigits < 10){
			newFormatMin = "0" + minDigits;
		} else { newFormatMin = "" + minDigits;
		}
		System.out.print(newFormatHour + ":" + newFormatMin);
		if (hourDigits > 11 ){
			System.out.println(" PM");
		} else {
			System.out.println(" AM");
		}
	}
}