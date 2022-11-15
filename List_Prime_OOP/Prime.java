import java.util.Scanner;
public class Prime {
    int number;
    boolean checkPrime(int number){
        if(number==2){
            return true;
        }
        for(int i=2 ;i<Math.sqrt(number);i++){
            if(number % i !=0){
                return true;
            }else{
                return false;
            }
        }return false;
    }

}
