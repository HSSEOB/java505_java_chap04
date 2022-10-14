package Quiz;

import java.util.Scanner;

public class Ch04_Quiz {
    public static void main(String[] args) {

        System.out.println("\nCH4.실습문제 1 번 - \n");


        Song mySong = new Song("Nessun Dorma");
        Song yourSong = new Song("공주는 잠 못 이루고");
        System.out.println("내 노래는 " + mySong.getTitle());
        System.out.println("너 노래는 " + yourSong.getTitle());


        System.out.println("\nCH4.실습문제 2 번 - \n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름과 전화번호를 입력 >>");
        Phone user1 = new Phone(scanner.next(), scanner.next());

        System.out.print("이름과 전화번호를 입력 >>");
        Phone user2 = new Phone(scanner.next(), scanner.next());

        System.out.println(user1.getName() + " " + user1.getTel());
        System.out.println(user2.getName() + " " + user2.getTel());


        System.out.println("\nCH4.실습문제 3 번 - \n");

        System.out.print("1 너비와 높이 >> ");
        Rect figure1 = new Rect(scanner.nextInt(), scanner.nextInt());
        System.out.print("2 너비와 높이 >> ");
        Rect figure2 = new Rect(scanner.nextInt(), scanner.nextInt());
        System.out.print("3 너비와 높이 >> ");
        Rect figure3 = new Rect(scanner.nextInt(), scanner.nextInt());
        System.out.print("4 너비와 높이 >> ");
        Rect figure4 = new Rect(scanner.nextInt(), scanner.nextInt());
        System.out.println("저장하였습니다...");
        int total = figure1.getArea() + figure2.getArea() + figure3.getArea() + figure4.getArea();
        System.out.println("사각형 전체의 합은 " + total);


//        1. Rect 클래스의 배열 생성
//        2. 반복문으로 4번 데이터 입력 받기
//        3.넓이의 전체 합을 출력
        Rect rectArray[] = new Rect[4];
        int total1 = 0;

        for (int i = 0; i < rectArray.length; i++) {
            System.out.print((i + 1) + " " + "너비와 높이 >> ");
            rectArray[i] = new Rect(scanner.nextInt(), scanner.nextInt());
            System.out.println("저장하였습니다...");
            total1 += rectArray[i].getArea();
        }


        System.out.print("사각형 전체의 합은 " + total1);


        System.out.println("\nCH4.실습문제 4 번 - \n");

//        1. 사용자 입력을 통해서 저장할 배열 크리르 입력 받음.
//        2. 지정한 크기 만큼의 사용자 정보 입력 받음
//        3. 사용자가 입력한 사용자 이름이 있는지 반복문을 통해서 배열 안의 내용과 비교
//        4. 있으면 정보 출력, 없으면 없습니다. 출력
//        5. exit를 입력 받으면 프로그램 종료


        System.out.println();
        System.out.print("인원수 >> ");
        int size = scanner.nextInt();

        // phone2 클래스 타입의 배열 생성, 사용자가 입력한 크기 만큼
        phone2 phoneBook[] = new phone2[size];

        for (int i = 0; i < phoneBook.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");


            phoneBook[i] = new phone2(scanner.next(), scanner.next());
        }
        System.out.println("저장되었습니다.");

        //사용자 이름 검색, 무한 반복
        while (true) {
            System.out.print("검색할 이름 >> ");
            String searchName = scanner.next();
            int index = -1; //배열의 index 번호를 저장할 변수. 검색 불가 : -1, 검색 완료 : 검색된 index 번호

            if (searchName.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            for (int i = 0; i < phoneBook.length; i++) {
                if (searchName.equals(phoneBook[i].getName())) {
                    index = i;
                    break;
                }
            }

            if (index > -1) {
                System.out.println(phoneBook[index].getName() + "의 번호 " + phoneBook[index].getTel());
            } else {
                System.out.println(searchName + " 이 없습니다.");
            }
        }


//        System.out.println("인원수 >> ");
//        int pNumber = scanner.nextInt();
//        for (int i= 0; i<=pNumber; i++){
//
//            System.out.print("이름과 전화번호 >> ");
//            int phoneArray[i] = new {}
//        }
//
//
//        int count = 3;
//
//        Phone2 addressBook[] = new Phone2[count];
//
//        for (int i = 0; i < count; i++) {
//            Phone2 p = new Phone2("aaa", "111");
//            addressBook[i] = p;
//        }
//
//        String name = "aaa";
//
//        for (int i = 0; i < count; i++) {
//            if (name.equals(addressBook[i].getName())) {
//                System.out.println();
//                break;
//            }
//        }


//        추가문제 1) 사칙연산을 할 수 있는 클래스 Calculator을 생성하고 정수 2 개를 입력 받아 계산하는 프로그램을 작성하라.
//        멤버 변수 : int num1, num2, result
//        멤버 메서드 : sum, sub, multi, div
//        모든 결과는 int 데이터 타입으로 사용, 메서드의 4가지 형태 중 아무거나 사용

        System.out.print("두 정수를 입력하세요 >> ");
        Calculator calculator = new Calculator(scanner.nextInt(), scanner.nextInt());
        calculator.setSum();
        calculator.setSub();
        calculator.setMulti();
        calculator.setDiv();

        System.out.println("두 정수의 합은 " + calculator.sum);
        System.out.println("두 정수의 차는 " + calculator.sub);
        System.out.println("두 정수의 곱은 " + calculator.multi);
        System.out.println("두 정수의 비는 " + calculator.div);


//        추가문제2) 임의의 숫자 6개를 생성하여 그 결과를 출력하는 프로그램을 작성하라(1~45)
//        배열을 사용하여 랜덤으로 생성된 데이터를 저장
//        Math.random() 사용


//        추가문제3) 문제 2를 여러번 실행 시 배열에 저장되는 숫자가 중복되는 상황이 발생되는데, 이 때 중복되는 숫자를 제외하고
//        총 6개의 숫자를 저장하고 출력하는 프로그램을 작성하라
//        Math.random() 사용

        int lottoArray1[] = new int[6];
        int lottoArray2[] = new int[6];

        for (int i = 0; i < 6; i++) {
            lottoArray1[i] = (int)((Math.random()*6)+1);
        }


        for (int j = 0; j < 6; j++) {
            lottoArray2[j] = lottoArray1[j];

            while(true) {
                int a= lottoArray1[j];

                if (a==lottoArray2[j]) {
                    lottoArray1[j] = (int)((Math.random()*6)+1);
                    }
                else{
                    break;
                }
            }
            System.out.println(lottoArray1[j]+""+" ");
        }

        int lotto3[] = new int[6];
        int lotto4[] = new int[6];

        for (int i = 0; i < 6; i++) {
            int rnd = (int)((Math.random()*6)+1);
            lotto3[i] = rnd;
            lotto4[i] = rnd;
        }

        int count = 0;
        for (int i = 0; i < lotto3.length; i++) {
            for (int j = 0; j < lotto3.length; j++) {
                System.out.println("lotto3[" + i + "] : " + lotto3[i] + "\tlotto4[" + j + "] : " + lotto4[j]);

                if (lotto3[i] == lotto4[j]) {
                    count++;
                }
            }
        }



    }



}



