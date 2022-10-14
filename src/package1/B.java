package package1;

// 접근제한자 public 사용
//public class B {
//    A a;
//
//}

//클래스 A를 사용하여 객체를 생성
//public class B {
//    //클래스 A의 생성자 중 public을 사용한 생성자로 객체 생성
//    A a1 = new A(true);
//
//    //클래스 A의 생성자 중 default를 사용한 생성자로 객체 생성.
//    //defaut는 동일한 패키지 내에서는 사용제한이 없어 아래의 경우 오류가 발생하지 않음.
//    A a2 = new A(1);
//
//    //클래스 A의 생성자 중 private를 사용한 생성자로 객체 생성 시도.
//    //하지만 private는 해당 클래스 내에서만 사용 가능하기에 아래의 경우 오류가 발생하여 실행 되지 않는다.
////    A a3 = new A("문자열");
//}

public class B {
    public B(){
        A a = new A();

        // value1은 public으로 설정되어 모두 접근 가능
        a.value1 = 10;

        // value2는 default로 설정되어 동일 패키지에서만 접근 가능.
        a.value2 = 20;

        // value3은 private로 설정되어 외부에선 접근 불가
//        a.value3 = 30;

        a.method1();
        a.method2();
//        method3()은 private로 설정되어 외부에서 접근이 불가
//        a.method3();
    }
}