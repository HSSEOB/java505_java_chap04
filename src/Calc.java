public class Calc {

    //정적 멤버
    public static int sNum1;
    public static int sNum2;
    public static int sResult;

    //일반 멤버
    public int iNum1;
    public int iNum2;
    public int iResult;

    // 정적 멤버는 일반 멤버에 접근이 불가능 함.
    // 정적 멤버가 동작하느 시점에 일반멤버가 메모리에 등록되어 있다는 확신이 없기에 사용할 수 없다.
    // 정적 멤버는 정적 멤버만 사용이 가능함
    // 때문에 정적 멤버는 공용적인 데이터에 사용 한다.
    public static int sum(){
        sResult = sNum1 + sNum2;
    // sResult = iNum1 + iNum2;
        return sResult;
    }

    //일반 멤버는 정적 멤버에 접근이 가능함
    // 일반 멤버는 객체 생성 후 사용하는 것이기 떄문에 언제든지 정적 멤버에 접근이 가능함.
    public int iSum(){
        iResult = sNum1+ sNum2;
        return iResult;
    }

    public static int abs(int a){
        if (a>0){
            return  a;
        }
        else {
            return -a;
        }

    }

    public static int max(int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }

    }



    public static int min (int a, int b){
        if(a>b){
            return a;
            }
        else{
            return b;
        }
    }
}