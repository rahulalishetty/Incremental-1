package rahul.assignment.main;

import rahul.assignment.data.Data;
import rahul.assignment.singleton.Singleton;

public class Main {
    public static void main(String args[]){
        Data data=new Data();
        Singleton singleton= Singleton.assignString("hello world");

        data.printValues();
//        data.printLocal();

        singleton.printString();
    }
}
