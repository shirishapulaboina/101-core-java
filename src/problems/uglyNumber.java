package problems;
import java.util.*;
class Example1{
	public boolean isUgly(int num) {
		int temp=num;
		while(temp%2==0) {
			temp/=2;
		}
		while(temp%3==0) {
			temp/=3;
		}
		while(temp % 5 == 0) {
			temp/=5;
		}
		return temp==1;
	}
}

public class uglyNumber {

	public static void main(String[] args) {
		Example1 obj=new Example1();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println(obj.isUgly(num)?"ugly number":"not a ugly number");
		

	}

}
