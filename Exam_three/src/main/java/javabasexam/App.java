package javabasexam;
import java.util.Scanner;

/*
 * )输入某年某月某日，判断这一天是这一年的第几天？
	从控制台读取日期,日期输入的格式为”2015-07-26”形式.
	(不允许使用 Calendar,Date,DateTime 类中的函数),输入输出的形式
	如下:
	请输入日期 : 2015-01-01
	你输入的日期为当年的第 1 天
 */
public class App {
	public static void main(String[] args) {
		System.out.println("请输入日期 :");
		Scanner sc = new Scanner(System.in);
		String [] da = sc.nextLine().split("-");
		int n1 = Integer.parseInt(da[0]);
		int n2 = Integer.parseInt(da[1]);
		int n3 = Integer.parseInt(da[2]);
		boolean mon = n2==1||n2==3||n2==5||n2==7||n2==8||n2==10||n2==12;
		boolean year = (n1%4==0&&n1%100!=0)||n1%400==0;
		if(mon&&n3>31){						//判断日期输入是否正确
			try {
				throw new MyException();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if((n2!=2)&&n3>30){
			try {
				throw new MyException();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(n2==2&&year&&n3>29){
			try {
				throw new MyException();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(n2==2&&!year&&n3>28){
			try {
				throw new MyException();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			int sum = 0;						//天数求和
			for(int i =1;i<n2;i++){
				sum  = sum + mon(n1,i,n3);		
			}
			sum = sum + n3;
			System.out.println("你输入的日期为当年的第"+sum+"天");
		}
	}
	public static int mon(int y,int m,int d){   //判断每个完整月的天数
		int a1 = 31;
		int a2 = 30;
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
			if(d<32){
				return a1;
			}
		}else if(m!=2){
			if(d<31){
				return a2;
			}
		}else{
			return erYue(y,d);
		}
		return -1;
	}
	public static int erYue(int y,int d){    // 判断2月天数
		int b1 = 29;
		int b2 =28;
		if((y%4==0&&y%100!=0)||y%400==0){
			if(d<=29){
				return b1;
			}
		}else{
			if(d<=28){
				return b2;
			}
		}
		return -1;
	}
}

class MyException extends Exception{
	public MyException() {
		System.out.println("日期输入不正确，请重新输入！");
	}
}

