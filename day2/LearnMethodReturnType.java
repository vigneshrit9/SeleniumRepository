package week1.day2;

public class LearnMethodReturnType {

	public static void main(String[] args) {

		LearnMethodReturnType lm = new LearnMethodReturnType();
		System.out.println(lm.add(45, 30));
		int sub = lm.sub(20, 10);
		System.out.println(sub);


	}





	public int add(int a, int b) {
		return a+b;

	}

	public int sub (int a, int b) {
		return a-b;


	}

}
