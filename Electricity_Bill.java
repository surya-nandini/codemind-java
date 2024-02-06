import java.util.*;
public class electricitybill
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        double c = sc.nextDouble();
        if(c<=199)
        {
            System.out.printf("%.2f",(c*1.20)+100);
        }
        else if(c>=200 && c<=400)
        {
            System.out.printf("%.2f",(c*1.50)+100);
        }
        else if(c>=400 && c<=600)
        {
            double f = c*1.80;
            System.out.printf("%.2f",f+f*0.15);
        }
        else if(c>=600)
        {
            double d = c*2.00;
            System.out.printf("%.2f",d+d*0.15);
        }
    }
}