package Construktor;

/**
 * Created by vkukanauskas on 27/04/2016.
 */
public class C extends B {
    public C(){
        System.out.println("default Constructor von Klasse C");
        msg="wurde bei C Constructor initiert";
    }

    public C(String string) {
//        super(string);
        System.out.println("String constructor von Klasse C");
    }

    @Override
    public void aMethod(){
        System.out.println("Class C Method");
    }


    public void cMethod(){
        System.out.println("Class C only Method");
    }

}
