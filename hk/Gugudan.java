import java.util.Scanner;

public class Gugudan{

     public static void main(String []args){
        System.out.println("숫자를 입력하세요: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i<=9; i++){
            System.out.println(num+"X"+i+" = "+num*i);
        }
     }
}
