/**
 * 
 */
package vidulan2;

/**
 * 
 */
import java.util.Scanner;
public class NhapXuat {

	public static void main(String[] args) {
		System.out.print("Chuong trình tính Tổng \n");
		Scanner banPhim = new Scanner(System.in);
		
		System.out.print("Nhập vào số A : ");
		double a = banPhim.nextDouble();
		
		System.out.print("Nhập vào số b : ");
		double b = banPhim.nextDouble();
		
		
		double tong = a+b;
		System.out.print("Tổng là : " + tong);
		banPhim.close();
	}
}