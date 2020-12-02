package com.company;
import java.util.Scanner;
class non_metered {
    private static final int RATE=33;
    private  static  final int RATE2=30;
    public static double Bill;
    public static double units;
    private static final double COST_DISCOUNT=0.05;
    private static final double U_DISCOUNT=0.08;
    static  Scanner input=new Scanner(System.in);
    public static void billUmetered(){
        double pay;
        System.out.println("Enter number units to purchase:");
        units=input.nextInt();
        if(units>=150) {
            Bill = (RATE2 * units) - (RATE2 * units * U_DISCOUNT) ;
            System.out.println("your bill:" + Bill);
        } else if (units>100){
            Bill=(RATE*units)- (RATE2 * units * U_DISCOUNT);
            System.out.println("Your bill:"+Bill);
        }else{
            Bill=(RATE*units);
            System.out.println("your bill:"+Bill);
        }
        System.out.println("mode of payment:");
        System.out.println("1.Electronic:");
        System.out.println("2. Cash:");
        System.out.println("choose mode of payment:");
        int mode=input.nextInt();
        if(mode==1){
            System.out.println("Electronic");
            pay=Bill-(Bill*COST_DISCOUNT);
            System.out.println("Total amount your supposed to pay is:"+pay);
        }if(mode==2){
            System.out.println("Cash");
            pay = Bill;
            System.out.println("Total amount your supposed to pay is:" + pay);
        }
    }
}
