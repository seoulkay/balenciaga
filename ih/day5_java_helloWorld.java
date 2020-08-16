public class HelloWorld{

     public static void main(String []args){
        String guel = "글";
        int shotja = 3;
        
        
        if(shotja > 1){
            System.out.println("숫자가 1보다 작다");
        } else {
            System.out.println("숫자가 1보다 크다.");
        }    
        
        int[] baeyol = {2,3,4,5,6};
        
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(baeyol[i]);
        }
        
        System.out.println("Hello World");
        
        System.out.println(duhagi(1, 5));
        
    }
     
     
     public static int duhagi(int a, int b){
         return a + b;
    }
    
    //숙제는 구구단 함수;
    //2단계 숙제는 단수를 받아서 그단까지 하는 구구단 함수;
    
}
