package com.company;
import java.util.Scanner;
class company {
    //private static double Bill;
    private  static final int METER_FEE=500;
    private  static  final int UNITS=2500;
    private  static final double C_DISCOUNT=0.09;
    private  static final double U_DISCOUNT=0.08;
    private  static final double RENT_DISCOUNT = 0.09;
    private static final int RATE=33;
    private static final int RATE2=30;
   // public static int units;
    public static void billCompany(){
       Scanner input= new Scanner(System.in);
       System.out.println("Units to purchase:"+UNITS);
       if (UNITS>=150){
           metered.Bill=(RATE2*UNITS)+(METER_FEE*0.1)-(RATE2*U_DISCOUNT);
           System.out.println("Your bill:"+metered.Bill);
        }
       if (UNITS>100) {
           metered.Bill=(RATE2*UNITS)+(RATE2*UNITS*U_DISCOUNT)-(METER_FEE*RENT_DISCOUNT);
       }
       if(UNITS<100){
          metered.Bill=(RATE*UNITS)+(METER_FEE * C_DISCOUNT);
           System.out.println("your bill:"+metered.Bill);
       }
        System.out.println("mode of payment:");
        System.out.println("1.Electronic:");
        System.out.println("2. Cash:");
        System.out.println("choose mode of payment:");
        int mode=input.nextInt();
        if(mode==1){
            System.out.println("Electronic");
           double pay=metered.Bill-(metered.Bill*C_DISCOUNT);
            System.out.println("Total amount your supposed to pay is:"+pay);
        }if(mode==2){
            System.out.println("Cash");
           double pay = metered.Bill;
            System.out.println("Total amount your supposed to pay is:" + pay);
        }
    }
}
