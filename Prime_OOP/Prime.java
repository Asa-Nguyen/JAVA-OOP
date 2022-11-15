import java.util.Scanner;
public class Prime {
    int number;
    void input_number(int value_number){
        Scanner object = new Scanner(System.in);
        value_number = object.nextInt();
        number = value_number;
    }
    boolean Check_Prime(){
        if(number == 2){
            return true;
        }
        for (int i=2;i<number;i++){
            if(number%i!=0){
                return true;
            }else{
                return false;
            }
        }
            return false;
    }
    void Print(){
        if(Check_Prime()){
            System.out.println("This number is Prime");
        }else{
            System.out.println("This number is NOT Prime");
        }
    }
}
