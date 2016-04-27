package Construktor;

/**
 * Created by vkukanauskas on 27/04/2016.
 */
public class B extends A {
    public B(){
        System.out.println("default Constructor von Klasse B");
        msg="wurde bei B Constructor initiert";
    }

    public B(String string) {
        System.out.println("String constructor von Klasse B");
    }
}
