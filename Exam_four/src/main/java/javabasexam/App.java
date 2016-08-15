package javabasexam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * ������� 50 ��С�� 100 ������,���� List ��,�� List �е����ݳ��� 10,
 * �Խ��������ֵ��Ϊ key ���� Map ��,�õ���{1=>[11,10,12],2=>[21,24,23]}�� Map,
 * �ٽ� Map �� key ��Ӧ�������������,�õ���{1=>[10,11,12],2=>[21,23,24]}
 * �������ʽ����:
 * 		������� 50 ��С�� 100 ���� , �ֱ�Ϊ : xxx,xxxx,xxxx
 * 		Map �е�����Ϊ : {1=>[11,10,12],2=>[21,24,23]}
 * 		������ Map Ϊ : {1=>[10,11,12],2=>[21,23,24]}
 */
public class App {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> li = new ArrayList<Integer>();
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(); 
		for(int i=0;i<50;i++){
			list.add((int)(Math.random()*100));
		}
		System.out.print("������� 50 ��С�� 100 ���� , �ֱ�Ϊ : ");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+",");
			int list1 = list.get(i);
			int a = list1%10;
			//			li = map.get(a);
			//			li.add(list1);
			map.put(a,li);
		}
		System.out.println();
		System.out.print("Map�е�����Ϊ��{");

		for (Object o : map.keySet()) {
			System.out.print( o + "=>" + map.get(o)+",");
		}


	}
}

