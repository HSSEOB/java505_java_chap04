public class Person {

    // final : 딱 한 번만 데이터를 저장 가능하고 그 이상 수정이 불가능하다.
    final String nation="대한민국";
    final String ssn;
    String name;

    // final 변수인 ssn을 생성자를 통해서 한 번 데이터 저장
    public Person (String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
}
