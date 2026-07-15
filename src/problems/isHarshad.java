package problems;
import java.util.*;
class Example2{
	public boolean isHarshad(int num) {
		int temp=num;
		int sum=0;
		while(temp>0) {
			sum+=temp%10;
			temp/=10;
		}
		return num%sum==0;
	}
}

public class isHarshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 obj=new Example2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		System.out.println(obj.isHarshad(num)?"harshad number":"not a harshad number");
		

	}

}
