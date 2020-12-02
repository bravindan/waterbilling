package com.company;
import java.util.Scanner;
public class metered {
    private static final double RATE=33;
    private static final double RATE2=30;
    private static  final double P_DISCOUNT=0.1;
    private  static  final int METER_FEE=500;
    public  static  final double U_DISCOUNT=0.08;
    public  static  final double COST_DISCOUNT=0.05;
    public static   int units;
    public static double Bill;

   static Scanner input=new Scanner(System.in);
    public static void billMetered(){
        double pay;
        System.out.println("Enter units to purchase:");
        units=input.nextInt();
        if(units>=150) {
            Bill = (RATE2 * units) - (RATE2 * units * U_DISCOUNT) + (METER_FEE * P_DISCOUNT);
            System.out.println("your bill:" + Bill);
        } else if (units>100){
           Bill=(RATE*units)- (RATE2 * units * U_DISCOUNT) + (METER_FEE * P_DISCOUNT);
           System.out.println("Your bill:"+Bill);
        }else{
            Bill=(RATE*units)+(METER_FEE * P_DISCOUNT);
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
