package Ten;

public class palindromeString {
    public static void palindromeString(String st) {
        String reversed = "";
        int stIndex = st.length();
        for (int i = stIndex-1; i >= 0; i--) {
            reversed += st.charAt(i);
        }
        if (st.equals(reversed)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        palindromeString("xox");
        palindromeString("ertyuıdfhdfdf");
        palindromeString("efvbnbvfe");
    }
}
