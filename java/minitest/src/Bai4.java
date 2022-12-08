public class Bai4 {
    public static void main(String[] args) {
        int n,count = 0;
        int status = 1;
        int num = 3;
        System.out.println("10 số nguyên tố đầu tiên là:");
        System.out.println(2);
        for ( int i = 2 ; i <=10 ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }

            }
            if ( status != 0 )
            {
                if (num < 10) {
                    System.out.println("số nguyên tố nhỏ hơn 10 là : " + num);
                }
                System.out.println(num);
                i++;
                count++;
            }
            status = 1;
            num++;

        }


    }
}
