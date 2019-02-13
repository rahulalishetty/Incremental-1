package rahul.assignment.singleton;

public class Singleton {
    String stringValue;
    private static Singleton singleton = null; 
    
    public static Singleton getInstance(String value){
        if (singleton == null) 
            singleton = new Singleton(); 
        singleton.stringValue=value;
        return singleton;
    }

    public void printString(){
        System.out.println(this.stringValue);
    }
}
