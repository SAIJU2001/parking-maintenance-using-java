//creat a mini project to maintain parking.
//charge for every vehicle.
//bus = 100Rs; car = 50Rs; auto = 40Rs; toto = 30Rs; bike = 20Rs; cycle = 10Rs; 

import java.util.*;

public class parking_maintenance
    {
        public static int nauto,ncar,nbus,ncycle,ntoto,nbike,count,amount; //glodal variable 

        public static void Auto()
            {
	            nauto++;
	            amount=amount+40;
	            count++;
	            System.out.print("Entry sucessfull.\n");
	            System.out.print("Thank you for parking the AUTO.\n");
                System.out.println();	
            }
        public static void Car()
            {
	            ncar++;
	            amount=amount+50;
	            count++;
	            System.out.print("Entry sucessfull.\n");
	            System.out.print("Thank you for parking the CAR.\n");
                System.out.println();	
            }
        public static void Bus()
            {
	            nbus++;
	            amount=amount+100;
	            count++;
	            System.out.print("Entry sucessfull.\n");
	            System.out.print("Thank you for parking the BUS.\n");
                System.out.println();	
            }
        public static void Bike()
            {
	            nbike++;
	            amount=amount+20;
	            count++;
	            System.out.print("Entry sucessfull.\n");
	            System.out.print("Thank you for parking the BIKE.\n");
                System.out.println();	
            }
        public static void Cycle()
            {
	            ncycle++;
	            amount=amount+10;
	            count++;
	            System.out.print("Entry sucessfull.\n");
	            System.out.print("Thank you for parking the CYCLE.\n");
                System.out.println();	
            }
        public static void Toto()
            {
	            ntoto++;
	            amount=amount+30;
	            count++;
	            System.out.print("Entry sucessfull.\n");
	            System.out.print("Thank you for parking the TOTO.\n");
                System.out.println();
            }
        public static void amt()
            {
	            System.out.print("The total amount colleted is : "+amount);
                System.out.println();
            }
        public static void status()
            {
                System.out.print("\nThe number of bus is : "+nbus);
	            System.out.print("\nThe number of car is : "+ncar);
	            System.out.print("\nThe number of auto is : "+nauto);
	            System.out.print("\nThe number of toto is : "+ntoto);
	            System.out.print("\nThe number of bike is : "+nbike);
	            System.out.print("\nThe number of cycle is : "+ncycle);
	            System.out.print("\nThe number of total vehicle is : "+count);
                System.out.print("\nThe gain of total amount is : "+amount+"Rs.");
                System.out.print("\n");
            }
        public static void delete_data()
            {
	            System.out.print("Sucessfully deleted the data.\n");
	            System.out.print("Thank you for using my program.\n");
                System.out.println();
                nauto=ncar=nbus=ncycle=ntoto=nbike=count=amount=0;
                
            }

        public static void main(String args[])
            {
	            int m;
	            do
	            {
		            System.out.print("\nFor exit the server press 0.\nParking the BUS press 1.\nParking the CAR press 2.\n");
		            System.out.print("Parking the AUTO press 3.\nParking the TOTO press 4.\nParking the BIKE press 5.\n");
		            System.out.print("Parking the CYCLE press 6.\nView the present status press 7.\n");
                    System.out.print("Delete the data press 8.\nCheck the total amount press 9.\n");
                    System.out.print("\n");
                    Scanner Sc = new Scanner(System.in);
                    m = Sc.nextInt();
		            switch(m)
		                {
			                case 0 :
                                System.out.print("Program Terminated !!\n");
                                System.out.println();
				                break;
			                case 1 :
				                Bus();
				                break;
			                case 2 :
				                Car();
				                break;
			                case 3 :
				                Auto();
				                break;
			                case 4 :
				                Toto();
				                break;
			                case 5 :
				                Bike();
				                break;
			                case 6 :
				                Cycle();
				                break;
			                case 7 :
				                status();
				                break;
			                case 8 :
				                delete_data();
				                break;
			                case 9 :
				                amt();
				                break;
			                default :
                                System.out.print("Invalid Entry !!\n");
                                System.out.println();
				                break;
					
		                }
	            }while(m!=0);
	
        System.out.print("\nThank you for using my parking.\n");
        System.out.print("Created and Designed by saikat.\n");
        System.out.println();	
            }		
}