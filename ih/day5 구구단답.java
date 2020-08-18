package pack1;

public class HelloWorld4 {
	public static void main(String[] args) {
		gugudan(3);

	}	
	
	public static void gugudan(int p1) {
		for(int i = 2 ; i < p1+1 ; i++) {
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " * " + j + " = "+ (i*j));
			}
		}
	}
	
}
