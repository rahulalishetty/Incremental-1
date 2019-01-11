package rahul.assignment.data;

public class Data {
    int intValue;
    char charValue;

    public void printValues(){
        System.out.println("intValue:"+this.intValue+" charValue:"+this.charValue);
    }//the class variables are initialized to default values

    public void printLocal(){
//        int localInt;
//        char localChar;
//        System.out.println("localInt:"+localInt+" localChar:"+localChar);
    }//cannot use this method because the local variables might not be initialized
}
