package Quiz;

//        추가문제 1) 사칙연산을 할 수 있는 클래스 Calculator을 생성하고 정수 2 개를 입력 받아 계산하는 프로그램을 작성하라.
//        멤버 변수 : int num1, num2, result
//        멤버 메서드 : sum, sub, multi, div
//        모든 결과는 int 데이터 타입으로 사용, 메서드의 4가지 형태 중 아무거나 사용

public class Calculator {
    int num1;
    int num2;
    int result;

    int sum;
    int sub;
    int multi;
    double div;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setSum() {
        sum = num1 + num2;

    }


    public void setSub() {
        sub = num1 - num2;
    }


    public void setMulti() {
        multi = num1 * num2;
    }


    public void setDiv() {
        div = num1/num2;
    }

    public int getSum(){
        return sum;
    }
    public int getSub(){
        return sub;
    }
    public int getMulti(){
        return multi;
    }
    public double getDiv(){
        return div;
    }

}




