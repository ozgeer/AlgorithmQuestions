package One;

public class One {
    public static void changeMail(String mail){
        int charIndex=mail.indexOf("@");
        String substring=mail.substring(charIndex+1,mail.length());
        System.out.println(mail.replace(substring,"gmail.com"));
    }


    public static void main(String[] args) {

        changeMail("ozgee_err@hotmail.com");
        changeMail("sbgjsbgjs.132@outlook.com");
        changeMail("bdhfs.95.bsdva@yahoo.com");
        changeMail("12312356@nirvanasoftware.com");
    }
}
