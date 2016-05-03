package Construktor;

/**
 * Created by vkukanauskas on 27/04/2016.
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("default constructor test");
        C c = new C();

        System.out.println("String  constructor test");
        C cText = new C("String");


        System.out.println("polymorpf");

        A a = new C();


        System.out.println("Classname = "+a.getClass().getSimpleName());
        System.out.println(a);


        System.out.println("a method test");

        a.aMethod();


        System.out.println("String spielereien");
        String str = "A.B.C!";
        System.out.println(str.replaceAll(".", ",").replace("!","?"));

    }
}
