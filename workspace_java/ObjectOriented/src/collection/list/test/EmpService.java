package collection.list.test;
//2024.6.17 3교시
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
    private List<Emp> empList;
    private Scanner sc;

    public EmpService(){
        sc = new Scanner(System.in);

        empList = new ArrayList<>();

        Emp e1 = new Emp(1001,"김","개발부","1111-1111",260);
        Emp e2 = new Emp(1002,"이","개발부","1111-1112",250);
        Emp e3 = new Emp(1003,"박","영업부","1111-1113",330);
        Emp e4 = new Emp(1004,"최","영업부","1111-1114",320);
        Emp e5 = new Emp(1005,"정","인사부","1111-1115",250);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
    }

    //List2_1번 문제
    public void login(){
        boolean isRunning = true; //while문 반복 변수
        boolean isFind = false;


        while(true){
            System.out.print("사번 : ");
            int empNo = sc.nextInt();
            System.out.print("비밀번호(연락처 마지막 4자리) : ");
            String pw = sc.next();

            //입력한 사번과 비밀번호 일치 여부 확인
            for(Emp e : empList){
                if(e.getEmpNo()== empNo && e.getPw().equals(pw)){
                    isRunning = false; //while문 벗어남
                    System.out.println("로그인 하였습니다.");
                    System.out.println(e.getName() + "님 반갑습니다.");
                    isFind = true;
                }
            }
            if(!isFind){ //'!' : 부정연산자
                System.out.println("사번 혹은 비번이 일치하지 않습니다.");
            }

        }
    }

    //List2_2번 문제
    public void printDeptMoney(){
        System.out.print("부서명 : ");
        String dept = sc.next();

        int sum = 0;
        int cnt = 0;
        System.out.println("==" +dept+ "월급 현황==");
        for(int i = 0 ; i < empList.size(); i++){
            if(empList.get(i).getDept().equals(dept)){
                System.out.println(empList.get(i));
                sum = sum + empList.get(i).getMoney();
                cnt++;
            }
        }
        System.out.println(dept + "의 월급 총액은" + sum+ ",평균 급여는" + (sum/(double)cnt));

    }

    //List2_3번 문제
    public void increaseMoney(){
        System.out.print("부서명 : ");
        String dept = sc.next();
        System.out.print("인상 급여 : ");
        int money = sc.nextInt();

        System.out.println(dept + "각 사원의 급여가 각각 " + money+"원씩 인상됩니다.");

        //급여 인상 코드
        for(Emp e : empList){
            if(e.getDept().equals(dept)){
                int result = e.getMoney()+ money;
                e.setMoney(result);
            }
        }
        //인상된 사원 정보 출력
        for(Emp e :empList){
            if(e.getDept().equals(dept)){
                System.out.println(e);
            }
        }
    }
}
