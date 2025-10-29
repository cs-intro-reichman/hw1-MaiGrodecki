public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int num1 = (int)(Math.random() * lim);
		int num2 = (int)(Math.random() * lim);
		int num3 = (int)(Math.random() * lim);
		System.out.println(num1 + " " +  num2 + " " + num3);
		int smallestNumber = Math.min(num1, Math.min(num2, num3));
		int largestNumber = Math.max(num1, Math.max(num2, num3));
		int middleNumber = Math.max(Math.min(num1,num2), Math.min(num2,num3));
		System.out.println(smallestNumber + " " + middleNumber + " " + largestNumber);


	}
}
