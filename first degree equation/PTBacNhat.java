import java.util.Scanner;
public class PTBacNhat {
    double soA, soB,x;
    String cauTraLoi;


    void nhap2SoAB(double gTriSoA,double gTriSoB){
        Scanner myObj = new Scanner(System.in);
        gTriSoA = myObj.nextDouble();
        soA = gTriSoA;
        gTriSoB = myObj.nextDouble();
        soB = gTriSoB;
    }
    void timNghiem(){
        if(soA == 0){
            if(soB==0){
                System.out.println("Vo so nghiem");
            }
            else{
                System.out.println("Vo nghiem");
            }
        }else{
            System.out.println("Co nghiem duy nhat: "+(double)-soB/soA);
        }
    }
}
