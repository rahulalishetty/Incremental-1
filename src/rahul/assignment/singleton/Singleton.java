package rahul.assignment.singleton;

public class Singleton {
    String stringValue;
    public static Singleton assignString(String value){
        Singleton singleton=new Singleton();
        singleton.stringValue=value;
        return singleton;
    }

    public void printString(){
        System.out.println(this.stringValue);
    }
}
