package class_basic;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.printAccount();

        Account acc1 = new Account(10000);
        acc1.printAccount();

        //객체 초기화(객체 생성 시 최초 1회 실행)


    }
}
