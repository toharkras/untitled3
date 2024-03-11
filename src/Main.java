import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AxisSystem axisSystem = new AxisSystem();
        function1(axisSystem);
        function2(axisSystem);
        function3(axisSystem);
        function4(axisSystem);
        function5(axisSystem);
        function6(axisSystem);
        function7(axisSystem);










        //this line displays the initial axis

    }


    public static void function1 (AxisSystem axisSystem){
        axisSystem.addSinglePoint(100,150, "red");
    }

    public static void function2 (AxisSystem axisSystem){
        axisSystem.addSinglePoint(-200,200, "red");
    }

    public static void  function3 (AxisSystem axisSystem){
        axisSystem.addSinglePoint(50,50, "red");
        axisSystem.addSinglePoint(60,60, "red");
        axisSystem.addSinglePoint(70,70, "red");

    }

    public static  void function4 (AxisSystem axisSystem){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter two nums between that are bigger or equal -250 and smaller or equal 250:");
      int x= s.nextInt();
      int y= s.nextInt();

     if (x<-250 && y>250){
         System.out.println("please try again your number dont fit to the function!");
     }else {
         axisSystem.addSinglePoint(x, y, "red");
     }



    }

    public static  void function5 (AxisSystem axisSystem){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the num of dots you would like to print");
        int numOfDots= s.nextInt();
        System.out.println("enter the wanted color");
        String color= s.next();
        for (int i=0; i<=numOfDots; i++){
            System.out.println("Enter the dots by X, Y: ");
            int x= s.nextInt();
            int y= s.nextInt();
        }
        System.out.println(axisSystem+ color);

    }



    public static void function6 (AxisSystem axisSystem){
        System.out.println("The function is y= 2x+100!");
        for (int x = -250; x <250 ; x--) {
            for (int y = -250; y <250 ; y--) {
                axisSystem.addSinglePoint(x,y, "red");

            }

        }


    }


    public static void function7(AxisSystem axisSystem){
        Scanner s= new Scanner(System.in);
        System.out.println("The function is y= mx+n!");
        System.out.println("Enter the value of n and m:");
        int n=  s.nextInt();
        int m=  s.nextInt();
        if (m<-250 || m>250 ){
            if( n <-250|| n>250){
                System.out.println("Try again!");
            }else {
                for ( m = -250; m <=250 ; m++) {
                    for ( n = -250; n <= 250 ; n++) {
                        axisSystem.addSinglePoint(n, m, "red");
                        break;

                    }  }
            }
            }

            }
        }









