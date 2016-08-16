package javabasexam;
import java.util.Scanner;
/**
 * 现设定各项社会保险金为 0，从命令行中接收用户输入的工资数,在输出中打印出需缴纳的税费,形式如下:
 * 请输入工资 : xxxx
 * 所需要缴纳的税费为 : xxxx
 */

public class App {
	static int[] sor = {0,1500,4500,9000,35000,55000,80000,999999999};   //工资不超过最大数
	static double[] shui ={0.03,0.1,0.2,0.25,0.3,0.35,0.45};
	
	public static void main(String[] args) {
		System.out.print("请输入工资：");
		Scanner sc = new Scanner(System.in);
		int gz = sc.nextInt()-3500;
		double haha = 0;
//		if(gz<80000){								
//			haha = sum(gz);
//		}else{
//			haha = sum(80000)+(gz-80000)*0.45;
//		}
		haha = sum(gz);
		System.out.println("所需要缴纳的税费为 :"+haha);
		
	}
	public static double sum(int gz){
		int i=0;		
		double sum = 0;
		for(i=0;i<sor.length-1;i++){
			if(gz>sor[i]&&gz<=sor[i+1]){
				sum = (gz-sor[i])*shui[i]+sum;
				break;
			}else{
				sum = (sor[i+1]-sor[i])*shui[i]+sum;
			}
		}
		return sum;
	}
}

