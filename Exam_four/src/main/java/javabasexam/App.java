package javabasexam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * ������� 50 ��С�� 100 ������,���� List ��,�� List �е����ݳ��� 10,
 * �õ���{1=>[11,10,12],2=>[21,24,23]}�� Map,
 * �ٽ� Map �� key ��Ӧ�������������,�õ���{1=>[10,11,12],2=>[21,23,24]}
 * �������ʽ����:
 * 		������� 50 ��С�� 100 ���� , �ֱ�Ϊ : xxx,xxxx,xxxx
 * 		Map �е�����Ϊ : {1=>[11,10,12],2=>[21,24,23]}
 * 		������ Map Ϊ : {1=>[10,11,12],2=>[21,23,24]}
 */
public class App {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
	
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(); 
		for(int i=0;i<50;i++){
			list.add((int)(Math.random()*100));
		}
		System.out.print("������� 50 ��С�� 100 ���� , �ֱ�Ϊ : ");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+",");
			int list1 = list.get(i);
			int a = list1/10;
			List<Integer> li = new ArrayList<Integer>();
			if(map.containsKey(a)){
				li = map.get(a);
			}
			li.add(list1);
			map.put(a,li);
		}
		System.out.println();
		System.out.print("Map�е�����Ϊ��");

		for (Object o : map.keySet()) {
			System.out.print(map);
		}
		System.out.println("}");
		System.out.print("������ Map Ϊ :");
		for (int i = 0; i < map.size(); i++) {
			list =sort(map.get(i));
			map.put(i, list);
			
		}
		for (Object o : map.keySet()) {
			System.out.print(map);
		}
		 
		
	}
	public static List<Integer> sort(List<Integer> list){
		List<Integer> li = new ArrayList<Integer>();
        for (int i = 0; i < list.size() - 1; i++) {  
            for (int j = 1; j < list.size() - i; j++) {  
                Integer a;  
                if ((list.get(j - 1)).compareTo(list.get(j)) > 0) { // �Ƚ����������Ĵ�С  
  
                    a = list.get(j - 1);  
                    list.set((j - 1), list.get(j));  
                    list.set(j, a);  
                }  
            }  
        }
		return list;
	}
}

