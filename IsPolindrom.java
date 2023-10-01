package Week2;

public class IsPolindrom {
    static boolean isPolindrom(int a){
        int temp=a, reverseNumber=0, lastNumber;
        while(temp !=0 ){
            lastNumber= temp % 10;

            reverseNumber =(reverseNumber*10)+lastNumber;


            temp /=10;
        }

        if( a==reverseNumber){
            System.out.println(a+ " sayısı Polindrom Sayıdır");
        return true;}

        return false;
    }

    public static void main(String[] args) {
        isPolindrom(242);


    }

}
