package javabasexam;
import java.util.Scanner;
/**
 * ���趨������ᱣ�ս�Ϊ 0�����������н����û�����Ĺ�����,������д�ӡ������ɵ�˰��,��ʽ����:
 * �����빤�� : xxxx
 * ����Ҫ���ɵ�˰��Ϊ : xxxx
 */

public class App {
	static int[] sor = {0,1500,4500,9000,35000,55000,80000,999999999};   //���ʲ����������
	static double[] shui ={0.03,0.1,0.2,0.25,0.3,0.35,0.45};
	
	public static void main(String[] args) {
		System.out.print("�����빤�ʣ�");
		Scanner sc = new Scanner(System.in);
		int gz = sc.nextInt()-3500;
		double haha = 0;
//		if(gz<80000){								
//			haha = sum(gz);
//		}else{
//			haha = sum(80000)+(gz-80000)*0.45;
//		}
		haha = sum(gz);
		System.out.println("����Ҫ���ɵ�˰��Ϊ :"+haha);
		
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

