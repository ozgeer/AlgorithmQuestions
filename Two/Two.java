package Two;

public class Two {
    public static int letterCount(String str){
        int letterA = 0;
        int letterB=0;
        //above variables are local variables so they have to get first value
        for(int i=0;i<str.length();i++){
            char letter=str.charAt(i);
            if(letter=='A'){
                letterA++;
            }
            else
                letterB++;
        }
        return Math.abs(letterB-letterA);
    }

    public static void main(String[] args) {
        System.out.println(letterCount("AABBBBBBABABA"));
        System.out.println(letterCount("BBBBABAAA"));
        System.out.println(letterCount("AABA"));
    }
}
