import java.util.Scanner;
public class Point {
    int point;//number must be <= point
    void Input_Point(int point_value){
        Scanner object = new Scanner(System.in);
        point_value = object.nextInt();
        point = point_value;
    }
}
