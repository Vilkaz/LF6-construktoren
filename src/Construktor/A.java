package Construktor;

/**
 * Created by vkukanauskas on 27/04/2016.
 */
public class A {
    String msg;
    public A(){
        System.out.println("default Constructor von Klasse A");
        msg="wurde bei A Constructor initiert";
    }

    public A(String string) {
        System.out.println("String constructor von Klasse A");
    }

    public void aMethod(){
        System.out.println("Class A Method");
    }

    @Override
    public String toString(){
       return msg;
    }

}
