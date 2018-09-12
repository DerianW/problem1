public class main
{
    public static void main(String[] args)
    {
        int count = 1 ;
        System.out.println("*** Output ***");

        while ( (count > 0) && (count < 20))
        {
            if ( (count % 2) != 0 )
            {
                System.out.println(count) ;
            }
            count++ ;
        }
    }
}
