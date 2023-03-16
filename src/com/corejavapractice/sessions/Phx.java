package com.corejavapractice.sessions;

public class Phx {
    public static void main(String[] args) {
        System.out.println("Welcome Back Mr Ndhlovu!");

        //Declare Some variales
        int width =8, height=12, area=96;
        double radius = 10.0;
        double pi = 3.14;
        boolean result = true;

        //Array
        int[] daysInMonths = new int[12];
        String[] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        daysInMonths[0]=31;
        daysInMonths[1]=28;
        daysInMonths[2]=31;
        daysInMonths[3]=30;
        daysInMonths[4]=31;
        daysInMonths[5]=30;
        daysInMonths[6]=31;
        daysInMonths[7]=31;
        daysInMonths[8]=30;
        daysInMonths[9]=31;
        daysInMonths[10]=30;
        daysInMonths[11]=31;

        if(12 > 24 ){

            System.out.println(monthNames[0]+" has "+daysInMonths[0]+" days!");
            System.out.println(monthNames[1]+" has "+daysInMonths[1]+" days!");
            System.out.println(monthNames[2]+" has "+daysInMonths[2]+" days!");
            System.out.println(monthNames[3]+" has "+daysInMonths[3]+" days!");
            System.out.println(monthNames[4]+" has "+daysInMonths[4]+" days!");
            System.out.println(monthNames[5]+" has "+daysInMonths[5]+" days!");
            System.out.println(monthNames[6]+" has "+daysInMonths[6]+" days!");
            System.out.println(monthNames[7]+" has "+daysInMonths[7]+" days!");
            System.out.println(monthNames[8]+" has "+daysInMonths[8]+" days!");
            System.out.println(monthNames[9]+" has "+daysInMonths[9]+" days!");
            System.out.println(monthNames[10]+" has "+daysInMonths[10]+" days!");
            System.out.println(monthNames[11]+" has "+daysInMonths[11]+" days!");

        }
        else {
            System.out.println("Width is : "+width);
            System.out.println("Height is :"+height);
            System.out.println("Area is : "+area);
            System.out.println("Radius is : "+radius);
            System.out.println("Pi is : "+pi);
            System.out.println("Result is : "+result);
        }
    //Tenary Expression
        /*
        * int y = (x > 7)?  2 : 5
        *
        * if x is greater than 7, y will be set to 2, otherwise y will be set to 5
        *
        * Switch statement (wattage){
        *      case 40:
        *              price = 1.20;
        *       case 60:
        *               price 1.30
        *          //Fall Through
        *       case 100:
        *           case 150:
        *               price = 1.10
        *       default:
        *          System.out.println("Sorry Error");
        *
        *
        * }
        *
        * */

        int count = 0;
        int n = 20;

        while(count++ < n){
            System.out.print("*");
        }

        /**
         * initialize, test, after-testcode
         * for(int i= 0; i<10; i++){}
         * Use this instead of counting/enumatation
         * int i, j;
         * for(i=0, j=2; i<10; i++, j+=3){ }
         * */

        for(int i = 0; i<10; i++){
            System.out.println("Somethings are not meant to last/happen");
        }

        //Enhanced for statement to loop through an array aka foreach
        // for(type name : collection){}

        //Use the foreach loop to go through/over a style loop
        for(String month : monthNames){
            System.out.println(month.toString());
        }

        //When Looping, you can use the break and the continu stantement for a reason
       for (int c = 1; c <= 10; c++ ){
           if (c == 4){
               System.out.println("You rock Mr. Ndhlovu");
               break;
           }
           else{
               System.out.println(c + ",");
           }
        }

       for(int x = 0; x <= 10; x++){
           if (x == 2){
               continue;
           }
           System.out.print(x+",");
       }




    }


}
