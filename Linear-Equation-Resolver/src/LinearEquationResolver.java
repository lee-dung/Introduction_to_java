import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Bộ giải phương trình tuyến tính");
        System.out.println("Cho phương trình là 'a * x + b = c', vui lòng nhập hằng số!");
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        double a = sc.nextDouble();

        System.out.println("b: ");
        double b = sc.nextDouble();

        System.out.println("c: ");
        double c = sc.nextDouble();

        if (a != 0){
            double answer = (c - b) / a;
            System.out.printf("Phương trình đạt x = %f! \n", answer);
        }else{
            if (b == c){
                System.out.print("Giải pháp là tất cả x!");
            }
            else{
                System.out.print("Không có giải pháp!");
            }
        }
    }
}
