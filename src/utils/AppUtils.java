package utils;

public class AppUtils {
    public static  int currentId;


    public static  String generatedId(){
        int generatedId =  currentId+=1;
        return String.valueOf(generatedId);
    }
}
