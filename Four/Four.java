package Four;

import java.util.Scanner;


class Encrypter{
    public static String getEncryptedName(String name) throws Exception{
        Boolean value=Validator.validate(name);
        String updatedName=null;

        if(value==true){
            String newName=name.toLowerCase();
            StringBuilder sb=new StringBuilder(newName);
            updatedName=sb.reverse().toString();

        }
        else{
            throw new  IllegalArgumentException("Try again with valid name");
        }

        return updatedName;
    }
}

class Validator {
    public static boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }

        return true;
    }
}

public class Four {
    private static final Scanner INPUT_READER = new Scanner(System.in);

    public static void main(String[] args) {
        String name = INPUT_READER.nextLine();

        try {
            System.out.println(Encrypter.getEncryptedName(name));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
