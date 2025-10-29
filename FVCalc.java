public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		double futureValue = currentValue * Math.pow(1 + rate / 100 , n);
		System.out.println("After " + (int)n + " years, $" + (int)currentValue + " saved at " + rate + "% will yield $" + (int)futureValue);
	}
}