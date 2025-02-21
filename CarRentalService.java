import java.util.*;
public class CarRentalService
{
	public static void main(String[] args) {
	    
		CarRental cr = new CarRental();
		
		cr.getcar();
		cr.showCar();
	}
}

class CarRental{
    
    int car_id;
    String car_type;
    float rent=0;
    
    void getcar(){
        Scanner scn = new Scanner(System.in);
        car_id=scn.nextInt();
        scn.nextLine();
        System.out.println("Enter Car Type : ");
        car_type = scn.nextLine();
        car_type.toLowerCase();
        rent = getRent(car_type);
        scn.close();
    }
    
    float getRent(String car_type){
        switch(car_type){
            case "smallcar":
                rent = 1000;
                break;
                
            case "van":
                rent = 800;
                break;
                
            case "suv":
                rent = 2500;
                break;
            default:
                System.out.print("Invalid Values... Try Again");
        }
        return rent;
    }
    
    void showCar(){
        System.out.println("Car ID : " + car_id);
        System.out.println("Car Type : " + car_type);
        System.out.println("The Rent is : " + rent);
    }
}