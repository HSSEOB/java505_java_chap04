package package1;

//// 접근 제한자 default 사용 중
//// 접근 제한자 표시가 없으면 default 접근제한자를 사용 함
//// default 접근제한자는 동일한 패키지 내에서는 사용 가능. 다른 패키지에서는 사용 불가
//
////    B b =new B();
//
////생성자 접근 제한
//public class A {
//
//    //멤버변수
//    //클래스의 객체를 생성하기 위해서 생성자를 호출
//
//    //접근제한자가 public인 생성자를 사용하여 객체 생성
//    A a1 = new A(true);
//
//    //접근제한자가 default 인 생성자를 사용하여 객체 생성
//    A a2 = new A(1);
//
//    //접근제한자가 private인 생성자를 사용하여 객체 생성
//    A a3 = new A("문자열");
//
//    //생성자
//    //접근제한자가 public 인 생성자
//    public A(boolean b){}
//    //접근제한자가 default 인 생성자
//    A(int b){}
//    //접근제한자가 private 인 생성자
//    private A(String s){}
//}



// 멤버 변수와 메서드의 접근제한자
public class A {
    // public을 사용하여 외부에서 접근 가능
    public int value1;

    // default를 사용하여 동일 패키지 내에서면 접근 가능
    int value2;

    // private를 사용하여 해당 클래스 내에서만 접근 가능
    private int value3;

    public A(){
        //생성자는 해당 클래스 내에서 동작
        //접근제한자에 상관없이 모든 멤버 변수에 접근이 가능
        value1 = 1;
        value2 = 1;
        value3 = 1;
    }


    public void  method1() {}
    void  method2() {}
    private void  method3() {}
}
