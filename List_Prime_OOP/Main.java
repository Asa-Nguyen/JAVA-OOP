public class Main {
    public static void main(String[] args) {
        System.out.println("Input value point");
        Prime p = new Prime();
        Point point = new Point();
        point.Input_Point(point.point);

            for(int i = 2;i<point.point;i++){
                if(p.checkPrime(i)){
                    System.out.println(i+"\t");
                }
            }
        }

}