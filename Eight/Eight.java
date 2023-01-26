package Eight;

class Eight {
    int i[] = {0};

    public static void main(String args[]) {
        int i[] = {1};
        alter(i);
        System.out.println(i[0]); //burada 1 yazar.
    }

    public static void alter(int a[]) {
        int j[] = {2};
        a = j;
        System.out.println(a[0]); //burada 2 yazar.
    }
}

//Java pass-by value mu? pass-by reference mı??  Pass-by value oldugunu görebiliriz.


