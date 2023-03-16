package com.corejavapractice.sessions;

public class ArraysAndControls {

    public static void main(String[] args) {
        String[] daysOfTheWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        System.out.println("Enhanced Loop");
        for(String day : daysOfTheWeek){
            System.out.println(day+" March 2023");
        }

        //Printing based on the range/length of the array
        System.out.println("Standard Loop");
        for(int i = 0; i<daysOfTheWeek.length; i++){
            System.out.println(daysOfTheWeek[i]);
        }

        //Reversed Loop
        System.out.println("Reversed Loop");
        for (int j = 6; j>0; j--){
            System.out.println(daysOfTheWeek[j]);
        }

        //Creat
        int cnt=0;
           while (cnt <= 20){
               cnt++;
               if((cnt % 2) == 1){
                   continue;
                   //An odd Number
               }
               System.out.println(cnt+"");
            }

           for(int k=1; k <=100; k++){
               if(k >= 50 && k<61){
                   continue;
                   //skip
               }
               System.out.println(k+", ");

            }

           //Months in a year
            String[] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
           int mc = 1;
           while (mc <= 12){
               switch(mc){
                   case 1:
                   case 3:
                   case 5:
                   case 7:
                   case 8:
                   case 10:
                   case 12:
                       System.out.println("There are 31 days in "+monthNames[mc - 1]);
                       break;
                   case 4:
                   case 6:
                   case 9:
                   case 11:
                       System.out.println("There are 30 days in "+monthNames[mc - 1]);
                       break;
                   case 2:
                       System.out.println("There are 28 days in "+monthNames[mc - 1]);
                       break;
                   default:
                       System.out.println("Error");

               }
               mc++;

           }

           System.out.println("Challenge Exercise");







    }


}
