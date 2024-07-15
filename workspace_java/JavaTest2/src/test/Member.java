package test;

public class Member {
   private String name;
   private String id;
   private String pw;
   private int age;

   void setInfo(String name, String id, String pw, int age){
      this.name = name;
      this.id = id;
      this.pw = pw;
      this.age = age;
   }

   void showInfo(){
      System.out.println(name);
      System.out.println(id);
      System.out.println(pw);
      System.out.println(age);
   };
   public boolean isLogin(String id, String pw){
      if(id.equals("java") && pw.equals("abcd1234")){
         System.out.println("로그인 가능");
         return true;
      }
      else{
         System.out.println("로그인 불가능");
         return false;
      }
   }


}


