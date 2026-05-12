
public class main
{
    public static void main()
    {
        int summe = 0;
        for(int i = 1; i <= 20; i++){
            summe = summe + i;
        }
        
        int mult = 1;
        for (int i = 1; i <= 10; i++){
            mult = mult * i;
        }
        
        System.out.println("Summe = " + summe);
        System.out.println("Mult = " + mult);
    }
}
