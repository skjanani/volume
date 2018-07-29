package janani;
import java.util.Scanner;
public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1,n2,n3,a,b;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n1=ja.nextInt();
n2=ja.nextInt();
n3=ja.nextInt();
a=n1*n2*n3;
b=(2*n1*n2)+(2*n2*n3)+(2*n3*n1);
System.out.print(a+" "+b);
//System.out.print(a);
	}
	

}
