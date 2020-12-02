package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner select= new Scanner(System.in);
	    System.out.println("1.Metered");
        System.out.println("2.NonMetered");
        System.out.println("3.Company");
        System.out.println("Select client type:");
        int option =select.nextInt();
        if(option==1) {
            System.out.println("Metered");
            metered.billMetered();
        }
        else if(option==2){
            System.out.println("NonMetered");
            non_metered.billUmetered();
        }else {
            System.out.println("Company");
            company.billCompany();
        }
    }
}
