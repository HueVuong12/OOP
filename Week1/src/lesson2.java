
public class lesson2 {
public static void main(String[] args) {
//	cau 1
	int result = 1 + 2;
	result = result - 1;
	result = result * 2;
	result = result / 2;
	result = result + 8;
	result = result % 7;
	System.out.println("kq: " + result);
//	cau 2
	class ConcatDemo
	{
		public static void main(String[] args) {
			String frist = "this is";
			String Second = "a concatenated string.";
			String Third = frist + Second;
			System.out.println(Third);
		}
	}
//	cau 3
	class UnaryDemo{
		public static void main(String[] args) {
			int result = +1;
			System.out.println(result);
			result--;
			System.out.println(result);
			result = -result;
			System.out.println(result);
			boolean success = false;
			System.out.println(success);
			System.out.println(!success);
		}
	}
//	cau 4
}
}
