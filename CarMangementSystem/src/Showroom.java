import java.util.Scanner;

public class Showroom implements utility {

    String showroom_name;

    String showroom_adress;

    int total_showroom_emp;

    int total_cars_Instock = 0;

    String manager_Name;



    @Override
    public void get_deatils(){

        System.out.println("Showroom Name: "+showroom_name);
        System.out.println("Showroom Adress: "+showroom_adress);
        System.out.println("Manager Name: "+manager_Name);
        System.out.println("Total Showroom Employees: "+total_showroom_emp);
        System.out.println("Total Car stocks: "+total_cars_Instock);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================Enter the Showroom Details==================");
        System.out.println();
        System.out.println("Showroom Name: ");
        showroom_name =sc.nextLine();
        System.out.println("Showroom Address: ");
        showroom_adress= sc.nextLine();
        System.out.println("Manager Name-: ");
        manager_Name = sc.nextLine();
        System.out.println("Total Showroom Employees: ");
        total_showroom_emp = sc.nextInt();
        System.out.println("Total Car stocks-: ");
        total_cars_Instock = sc.nextInt();

    }
}
