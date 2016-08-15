package javabasexam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 随机生成 50 个小于 100 的整数,放入 List 中,将 List 中的数据除以 10,
 * 以结果的整数值作为 key 放入 Map 中,得到如{1=>[11,10,12],2=>[21,24,23]}的 Map,
 * 再将 Map 中 key 对应的数组进行排序,得到如{1=>[10,11,12],2=>[21,23,24]}
 * 输出的形式如下:
 * 		随机生成 50 个小于 100 的数 , 分别为 : xxx,xxxx,xxxx
 * 		Map 中的数据为 : {1=>[11,10,12],2=>[21,24,23]}
 * 		排序后的 Map 为 : {1=>[10,11,12],2=>[21,23,24]}
 */
public class App {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> li = new ArrayList<Integer>();
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(); 
		for(int i=0;i<50;i++){
			list.add((int)(Math.random()*100));
		}
		System.out.print("随机生成 50 个小于 100 的数 , 分别为 : ");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+",");
			int list1 = list.get(i);
			int a = list1%10;
			//			li = map.get(a);
			//			li.add(list1);
			map.put(a,li);
		}
		System.out.println();
		System.out.print("Map中的数据为：{");

		for (Object o : map.keySet()) {
			System.out.print( o + "=>" + map.get(o)+",");
		}


	}
}

