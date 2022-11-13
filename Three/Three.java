package Three;

public class Three {
    public static void changeIndexOfCharacters(String s){
        StringBuilder sb=new StringBuilder(s);
        char firstLetter=s.charAt(0);
        int endIndex=s.length()-1;
        char endLetter=s.charAt(endIndex);
        sb.setCharAt(0,endLetter);
        sb.setCharAt(endIndex,firstLetter);
        System.out.println(sb);
    }

    public static void main(String[] args) {

      changeIndexOfCharacters("coensio"); // ooensic
      changeIndexOfCharacters("ozgenur");  // rzgenuo
      changeIndexOfCharacters("higuys!"); //!iguysh
      changeIndexOfCharacters("?dfhs+"); // +dfhs?


    }
}
