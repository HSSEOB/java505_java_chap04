public class SingletonEx {
    public static void main(String [] args){
//        Singleton singleton1 = new Singleton();
//        Singleton singleton2 = new Singleton();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2){
            System.out.println(singleton1+"");
            System.out.println(singleton2+"");
            System.out.println("두 객체가 같다.");
        }
        else{
            System.out.println("두 객체가 다르다.");
        }
    }
}
