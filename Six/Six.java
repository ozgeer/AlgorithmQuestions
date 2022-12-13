package Six;

import java.util.HashMap;
import java.util.Scanner;



public class Six {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str= input.next();
        duplicateLetter(str);
    }

    public static void duplicateLetter(String str) throws Exception {
        try{
        HashMap hashmap=new HashMap<>();
        int count;

        for (int i=0;i<=str.length();i++){
            if(!hashmap.containsKey(str.charAt(i))){
                hashmap.put(str.charAt(i),1);
            }
            else{
                count= (int) hashmap.get(str.charAt(i));
                hashmap.put(str.charAt(i),count++);
            }
        }
        System.out.println(hashmap);
    }
        catch (StringIndexOutOfBoundsException exception){
            exception.getMessage();
            exception.printStackTrace();
        }

        }
}
