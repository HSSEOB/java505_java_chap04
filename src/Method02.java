import java.util.Arrays;
import java.util.Scanner;

public class Method02 {
    private static Scanner scanner = new Scanner(System.in);

    public static void sum1(){
    int a = 10;
    int b = 20;
    int result = a+b;
        System.out.println("두 수의 합은 : "+result);
    }

    public static void sub1(){
        int a = 10;
        int b = 20;
        int result = a-b;
        System.out.println("두 수의 차는 : "+result);
    }

    public static void multi1(){
        int a = 10;
        int b = 20;
        int result = a*b;
        System.out.println("두 수의 곱은 : "+result);
    }

    public static void div1(){
        int a = 10;
        int b = 20;
        int result = a/b;
        System.out.println("두 수의 비는 : "+result);
    }

    public static void sum2(int a, int b){
        int result = a+b;
        System.out.println("두 수의 합은 : "+ result);
    }

    public static void sub2(int a, int b){
        int result = a-b;
        System.out.println("두 수의 차는 : "+ result);
    }

    public static void multi2(int a, int b){
        int result = a*b;
        System.out.println("두 수의 곱은 : "+ result);
    }

    public static void div2(int a, int b){
        int result = a/b;
        System.out.println("두 수의 비는 : "+ result);
    }


    public static int sum3(){
        int a = 10;
        int b = 20;
        int result = a+b;
        return result;
    }

    public static int sub3(){
        int a = 10;
        int b = 20;
        int result = a-b;
        return result;
    }

    public static int multi3(){
        int a = 10;
        int b = 20;
        int result = a*b;
        return result;
    }

    public static int div3(){
        int a = 10;
        int b = 20;
        int result = a/b;
        return result;
    }

    public static int sum4(int a, int b){
        int result = a+b;
        return result;
    }

    public static int sub4(int a, int b){
        int result = a-b;
        return result;
    }

    public static double multi4(int a, int b){
        double result = a*b;
        return result;
    }

    public static double div4(int a, int b){
        double result = a/b;
        return result;
    }

    public static void gugudan(int a) {
        System.out.println(a+"단\n");
        for (int b = 1; b < 10; b++) {
            int result = a * b;

            System.out.println(a+" * " +b+ " = "+ result);
        }
    }





    public static void average(int korean, int english, int math){
        int result2 = (korean+english+math)/3;
        int result1 = korean+english+math;
        System.out.println("당신의 총점은 "+result1+"점 이고 평균은"+result2+"점 입니다.");
        if (result2>=90){
            System.out.println("당신의 등급은 A 입니다");
        } else if (result2>=80) {
            System.out.println("당신의 등급은 B 입니다");
        } else if (result2>=70) {
            System.out.println("당신의 등급은 C 입니다");
        } else if (result2>=60){
            System.out.println("당신의 등급은 D 입니다");
        }  else System.out.println("당신의 등급은 F 입니다");


    }


    public static void inputNum10(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {

        int inputArray[] = {a, b, c, d, e, f, g, h, i, j};



        System.out.println("----정렬 배열 오름차순----");
        Arrays.sort(inputArray);
        for (int z : inputArray)
            System.out.print(z + " ");
    }


    public static void main(String[] args){
        System.out.println("문제1_ 사칙연산을 하기 위한 메서드를 메서드의 4가지 형태로 각각 생성하여 실행하는 프로그램을 작성하라");
            //1. 더하기, 빼기, 곱하기 , 나누기를 각각 4가지 형태로 생성
            //2. 타입1의 함수 명: sum1, sub1, multi1, div1
            //3. 타입2의 함수 명: sum2, sub2, multi2, div2
            //4. 타입3의 함수 명: sum3, sub3, multi3, div3
            //%. 타입4의 함수 명: sum$, sub4, multi4, div4
            //각각의 함수를 모두 실행하여 결과 확인

        System.out.println("\n타입1\n");
        sum1();
        sub1();
        multi1();
        div1();

        System.out.println("\n타입2\n");
        sum2(10, 20);
        sub2(10, 20);
        multi2(10, 20);
        div2(10, 20);

        System.out.println("\n타입3\n");

        int result1 = sum3();
        System.out.println("두 수의 합은 : "+result1);

        int result2 = sub3();
        System.out.println("두 수의 차는 : "+result2);

        int result3 = multi3();
        System.out.println("두 수의 곱은 : "+result3);

        int result4 = div3();
        System.out.println("두 수의 비는 : "+ result4);

        System.out.println("\n타입4\n");

        int result5 = sum4(10, 20);
        System.out.println("두 수의 합은 : "+result5);

        int result6 = sub4(10, 20);
        System.out.println("두 수의 합은 : "+result6);

        double result7 = multi4(10, 20);
        System.out.println("두 수의 합은 : "+result7);

        double result8 = div4(10, 20);
        System.out.println("두 수의 합은 : "+result8);

        System.out.println("\n문제2_사용자 입력을 통해서 2~9까지의 숫자를 입력받아 해당하는 단수의 구구단을 출력하는 프로그램을 작성하라\n");
        //1. 구구단을 출력하는 부분을 함수로 구현 (함수명 : gugudan)
        //2. 사용자 입력 부분은 함수로 구현해도 되고 안해도 됨

        System.out.print("단수를 입력하세요 >>");
        int num = scanner.nextInt();
        gugudan(num);



        System.out.println("\n문제3_사용자 입력을 통해서 국어, 영어, 수학의 점수 3개를 입력 받고, 총점과 평균, 등급을 출력하는 프로그램을 작성하라\n");
        //1.등급 계산 부분을 함수로 구현 (함수명: scores)
        //2.총점과 평균 계산 부분을 함수로 구현 (함수명: average)

        System.out.println("당신의 국어 성적은? >> ");
        int kor = scanner.nextInt();
        System.out.println("당신의 영어 성적은? >> ");
        int eng = scanner.nextInt();
        System.out.println("당신의 수학 성적은? >> ");
        int mat = scanner.nextInt();
    average(kor, eng, mat);

        System.out.println("정수 10개 입력 >> ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int e=scanner.nextInt();
        int f=scanner.nextInt();
        int g=scanner.nextInt();
        int h=scanner.nextInt();
        int i=scanner.nextInt();
        int j=scanner.nextInt();


    inputNum10(a,b,c,d,e,f,g,h,i,j);


    }
}
