package Five;
import java.util.*;
import java.util.stream.Collectors;

public class Five {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        String [] cityList=new String[num];

        for(int i=0;i<num;i++){
            cityList[i]=input.nextLine();
        }

        List<String> cityListString= Arrays.asList(cityList);
        cityListString.stream().
                sorted(Comparator.comparingInt(String::length)).
                forEach(System.out::println);




    }



}
