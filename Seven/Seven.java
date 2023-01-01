package Seven;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("eleman sayisini gir");
        int a=input.nextInt();
        int[] numbers=new int[a];
        System.out.println("toplam miktari girin");
        int total= input.nextInt();

        for(int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        boolean b1;
        int count=0;
        for (int  b=0;b<numbers.length;b++){
            for (int c=b+1;c<numbers.length;c++){
                b1 = numbers[c] == total - numbers[b];
                if(b1){
                    System.out.print("There is subset ("+numbers[b]+","+numbers[c]+") with sum "+total);
                    count++;
                }
            }
        }
        if(count==0)
        System.out.println("There is no subset.");
    }

}
