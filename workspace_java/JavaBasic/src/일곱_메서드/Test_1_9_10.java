package 일곱_메서드;

public class Test_1_9_10 {
    public static void main(String[] args) {

        test9("김형진",33,"울산");

        //10번 메서드
        String a = "김형진";
        int b = 33;
        String c = "울산";

        test9(a,b,c);

    }

    //9번 메서드

    public static void test9(String name,int age, String addr){
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "입니다.");
        System.out.println("주소는 " + addr + "입니다.");

        /*
        9번 강사님 ver.

        public static void main(String[] args) {
            test9_1("임꺽정");
            test9_2(10);
            test9_3("파리");
        }

        public static void test9_1(String name){
            System.out.println(name);
        }
        public static void test9_2(int age){
            System.out.println(age);
        }
        public static void test9_3(String addr){
            System.out.println(addr);
        }

        */

        /*
            10번 강사님 ver.
            public static void main(String[] args) {
            test10("임꺽정", 10, "파리");
            }

            public static void test10(String name,int age, String addr){
                test9_1(name);
                test9_2(age);
                test9_3(addr);

            }
        */
    }
}
