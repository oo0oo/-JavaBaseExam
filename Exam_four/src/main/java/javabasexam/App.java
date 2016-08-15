package javabasexam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 随机生成 50 个小于 100 的整数,放入 List 中,将 List 中的数据除以 10,
 * 得到如{1=>[11,10,12],2=>[21,24,23]}的 Map,
 * 再将 Map 中 key 对应的数组进行排序,得到如{1=>[10,11,12],2=>[21,23,24]}
 * 输出的形式如下:
 * 		随机生成 50 个小于 100 的数 , 分别为 : xxx,xxxx,xxxx
 * 		Map 中的数据为 : {1=>[11,10,12],2=>[21,24,23]}
 * 		排序后的 Map 为 : {1=>[10,11,12],2=>[21,23,24]}
 */
public class App {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
	
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(); 
		for(int i=0;i<50;i++){
			list.add((int)(Math.random()*100));
		}
		System.out.print("随机生成 50 个小于 100 的数 , 分别为 : ");

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
		System.out.print("Map中的数据为：");

		for (Object o : map.keySet()) {
			System.out.print(map);
		}
		System.out.println("}");
		System.out.print("排序后的 Map 为 :");
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
                if ((list.get(j - 1)).compareTo(list.get(j)) > 0) { // 比较两个整数的大小  
  
                    a = list.get(j - 1);  
                    list.set((j - 1), list.get(j));  
                    list.set(j, a);  
                }  
            }  
        }
		return list;
	}
}

