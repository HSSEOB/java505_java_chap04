package package2;//package package2;
//
//// class A는 접근제한자를 default를 사용하고 있어 다든 패키지에서 사용 할 수 없다
////import package1.A;
//// class B는 접근제한자를 public으로 사용하고 있어 다른 패키지에서 사용 할 수 있음
//import package1.A;
//import package1.B;
//
//public class C {
////    A a;
////    B b;
//
//    //클래스 A의 생성자 중 public을 사용한 생성자로 객체 생성
//    A a1 = new A(true);
//
//    // 클래스 A의 생성자 중 default를 사용한 생성자로 객체 생성.
//    // defaut는 동일한 패키지 내에서는 사용제한이 없다. 때문에 아래의 경우 오류가 발생.
//    // A a2 = new A(1);
//
//    // 클래스 A의 생성자 중 private를 사용한 생성자로 객체 생성 시도.
//    // 하지만 private는 해당 클래스 내에서만 사용 가능하기에 아래의 경우 오류가 발생하여 실행 되지 않는다.
//    // A a3 = new A("문자열");
//
//
//
//}

import package1.A;

public class C {
    public C(){
        A a= new A();


        a.value1 = 1000;

//        클래스 A의 value2sms default를 사용하여 다른 패키지에서 접근 불가
//        a.value2 = 1000;

//        클래스 A의 value3는 private를 사용하여 외부 클래스에서는 접근 불가
//        a.value3 = 1000;

        a.method1();

//        클래스 A의 method2()는 default를 사용하여 다른 패키지에서 접근 불가
//        a.method2();

//        클래스 A의 value3는 private를 사용하여 외부 클래스에서는 접근 불가
//        a.method3();

    }
}
