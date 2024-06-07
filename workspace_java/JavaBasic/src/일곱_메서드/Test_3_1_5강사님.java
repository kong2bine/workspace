package 일곱_메서드;
//2024.6.7 4교시 5교시
public class Test_3_1_5강사님 {
    public static void main(String[] args) {
        int[] a = {1,3,5};
        test5(a);
        test1(5);
        test2(8);
        System.out.println(test3());
        System.out.println(test4(5));

        int[] arr = {1, 7, 5, 3, 2};
        int max = test6(arr);
        System.out.println(max);
    }
    public static void test1(int num){
        for(int i = 1; i<10; i++){
/*            int x = 0;
            x = num*i;*/
            System.out.println(num+"*"+i+"="+num*i);
        }
    }

    public static void test2(int num){
        for(int i = 1; i <101; i++){
            int y = 0;
            y = num*2;
            System.out.println(y);
            break;
        }
    }
    public static int test3(){
        //0.0 <= x <50.0
        return (int)(Math.random()*50+1);
    }
    public static boolean test4(int num){
        return num % 2 ==0? true : false;
        //return num % 2 ==0; 이렇게만 써도 됨
    }

    public static void test5(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int test6(int[] array){
        int max = 0;
        for(int i = 0; i<array.length; i++){
            if(max< array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
