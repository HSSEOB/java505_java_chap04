package Quiz;

public class lotto {
    public static void main(String[] srgs) {
//      로또 번호를 저장할 배열
        int lotto2[] = new int[7];

//        로또 번호 생성
        for (int i = 0; i < lotto2.length; i++) {
//            랜덤 숫자 생성, 1 ~ 45
            int rnd = (int) ((Math.random() * 7) + 1);

//            중복 제거
            for (int j = 0; j < i; j++) {
//                동일한 값이 있는지 확인
                if (rnd == lotto2[j]) {
//                    동일한 값이 있을 경우 현재 루프를 다시 한번 더 실행함
                    i--; // 나중에 자동으로 1 증가할 카운트 변수를 먼저 1 감소 시켜서 동일한 값이 나올 수 있도록 변경함, 동일한 번호 루프를 돌 수 있게 됨
                    break;
                }
//                동일한 값이 아니면 배열에 저장
                lotto2[i] = rnd;
            }

//            첫번째 루프의 경우 중복 제거 루틴으로 빠지지 않기 때문에 데이터가 저장되는 부분이 없으므로 0번 루프때만 동작되는 if문을 실행함
            if (i == 0) {
                lotto2[i] = rnd;
            }
        }


//        화면 출력
        for (int i = 0; i < lotto2.length; i++) {
            System.out.print(lotto2[i] + " ");
        }
    }
}