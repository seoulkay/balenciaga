public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        System.out.println("Hongsung");
        
        //자바는 숫자문자를 구분함
        String beunsu = "hello!";
        int shotja = 2;
        
        System.out.println(shotja);
            
        if(shotja >= 10 ){
            System.out.println("숫자가 10보다 크다");
        } else {
            System.out.println("숫자가 10보다 작다");
        }
        
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(i);
        }  
        
        //자바는 배열 문법이 조금 다르고 사이즈를 제공해야 한다.
        int[] list  = {1,2,3,4,5};
        int list2[] = new int[5];
        
        list2[0] = 10;
        list2[1] = 20;
        
        for(int i = 0 ; i < list.length ; i++){
            System.out.println(list2[i]);
        } 
        
        System.out.println(duhagi(30,40));
     }
     
    //접근자_시작할때 메모리에 올린다_리턴은 숫자로한다_너의함수이름_메개변수 두개
    public static int duhagi(int a, int b){
        return a+b;
    }
     
    //숙제코드 
     
    public static void gugudan(int a){
         
    }
}
