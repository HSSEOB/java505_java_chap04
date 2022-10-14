package subject;

import java.util.Random;
import java.util.Scanner;

public class QuestionEx {
    public static void main (String[] args) {
//        문제 1)

        Scanner scanner = new Scanner(System.in);
        System.out.print("알파벳을 입력하세요 >> ");
        String s = scanner.next();
//        charAt(): String 타입의 데이터 중 지정한 index의 문자를 char 타입으로 변환
        char c = s.charAt(0);


//        char 타입의 데이터 a는 아스키코드 문자로는 'a' 정수로는 97로 표현
        for (char a = 'a'; a <= c; a++) {

            for (char b = a; b <= c; b += 1) {
                System.out.print((char) b);

            }
            System.out.println();
        }


//      문제 2)
        System.out.print("정수 10개 입력 >> ");
        int Array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            Array[i] = scanner.nextInt();
            if (Array[i] % 3 == 0) {
                System.out.print(Array[i] + " ");
            }
        }


//      문제  6)
//        1. eng 배열을 전체 검색하여 사용자가 입력한 단어가 있는지 확인.
//        2. 있으면 해당 index 번호 확인하고 검색 중지
//        3. kor 배열의 index 번호에 있는 단어 출력
//        4. 입력된 단어가 exit 이면 프로그램 종료

        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};


        Random r = new Random();
        int card; // 컴퓨터가 램덤으로 생성한 데이터가 저장될 변수
        int low; // 카드에 적힌 수의 범위
        int high;

        while (true) {
            int i = 1;
            low = 0;
            high = 99;
            card = r.nextInt(100);
            System.out.println("UP & DOWN 게임입니다. 숨겨진 수를 맞추어 보세요");

            while (true) {
                System.out.println(low + " - " + high);
                System.out.print(i + " >> ");

                int count = scanner.nextInt();

                if (count > high || count < low) {
                    System.out.println("범위를 벗어났습니다.");
                } else {
                    if (count == card) {
                        System.out.println("정답 입니다.");
                        break; // 내부 while 문 종료
                    } else if (count > card) {
                        System.out.println("더 낮게");
                        high = count;
                    } else {
                        System.out.println("더 높게");
                        low = count;
                    }
                }
                i++;
            }
            System.out.println("다시 하시겠습니까? (y/n) >> ");
            if (scanner.next().equals("n")) {
                break;
            }
        }


//  문제 5)
        int intArray[][];
        intArray = new int [3][4];

        for (int i = 0; i<3;  i++){
            for(int j= 0; j<4; j++){
                //Math.random()*10 : 랜덤 숫자를 발생시키기 위한 수학 클래스의 함수, 0.0 ~ 1.0까지의 숫자를 랜덤하게 출력.
//                *10을 진행하여 정수 부분이 나올 수 있도록 함
                //int 를 사용하여 소수점 제거. 정수 강제형변환
                //
                intArray[i][j] = (int)(Math.random()*10);
            }
        }

        for (int i = 0; i< intArray.length; i++){
            for (int j = 0; j<intArray[i].length ; j++){
                System.out.print(intArray[i][j]+"\t");
            }
            System.out.println();
        }

        int i = 0;
        int sum = 0;
        while (i<3){
            for(int j = 0; j<intArray[i].length; j++){
                sum= sum + intArray[i][j];
            }
            i++;
        }

        System.out.println("합은 "+ sum);
    }
}