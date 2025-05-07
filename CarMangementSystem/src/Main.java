import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface utility{

    public void get_deatils();

    public void set_details();
}


public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("==================Welcome To Car Showroom====================");
        System.out.println();
        System.out.println("==================Enter Your Choice====================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t  2].ADD EMPOLYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t  5].GET EMPOLYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("==================*** ENTER 0 TO EXIT ***===========================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employee employee[] = new Employee[5];
        Car car[] = new Car[5];

        int car_counter =0;
        int showroom_counter=0;
        int employee_counter=0;

        int choice = 100;

        while (choice!=0){

            main_menu();

            choice= sc.nextInt();

            while (choice!=9 && choice!=0){

                switch (choice)
                {

                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1]. Add New Showrrom");
                        System.out.println("9]. Go Back To Main Manu");
                        choice =sc.nextInt();
                        break;

                    case 2:
                        employee[employee_counter] = new Employee();
                        employee[showroom_counter].set_details();
                        employee_counter++;
                        System.out.println();
                        System.out.println("1]. Add New Employee");
                        System.out.println("9]. Go Back To Main Manu");
                        choice =sc.nextInt();
                        break;

                    case 3:
                        car[car_counter] = new Car();
                        car[showroom_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("1]. Add New Car");
                        System.out.println("9]. Go Back To Main Manu");
                        choice =sc.nextInt();
                        break;

                    case 4:
                        for(int i=0; i<showroom_counter; i++){
                            showroom[i].get_deatils();
                            System.out.println();
                            System.out.println();

                        }
                        System.out.println();
                        System.out.println("9]. Go Back To Main Manu");
                        System.out.println("0]. Exit ");
                        choice =sc.nextInt();
                        break;

                    case 5:
                        for(int i=0; i<employee_counter; i++){
                            employee[i].get_deatils();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]. Go Back To Main Manu");
                        System.out.println("0]. Exit ");
                        choice =sc.nextInt();
                        break;

                    case 6:
                        for(int i=0; i<car_counter; i++){
                            car[i].get_deatils();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]. Go Back To Main Manu");
                        System.out.println("0]. Exit ");
                        choice =sc.nextInt();
                        break;

                    default:
                        System.out.println("Enter the Vaild Choice: ");
                        break;
                }
            }
        }


        }
    }
