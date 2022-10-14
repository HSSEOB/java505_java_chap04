public class StaticClass {
    public static String  name;
    public  static int age;

    public static String job;

    public StaticClass(String name,int age){
        this.name = name ;
        this.age = age;
    }

    public StaticClass(String name) {this(name,30);}



    public static void getJob(){
        System.out.println("직업 : "+job);
    }

    public StaticClass(){
        this("아이유");

    }






    public static void getInfo(){
        System.out.println("이름 : " + name + "\n나이 : " + age);





    }
}
