public class Debug {
    public static void main(String[] args){
        //デバックの実行
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            if (sum > 30){
                System.out.println("Sumが30を超えた為処理を中止。" );
                break;
            }
            if ( i% 2 == 0){
                printStar(i);
                sum += i;
            }
        }
    }
    private  static void printStar(final int num){
        System.out.println("*".repeat(num));
    }
}
