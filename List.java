package cpm.tinzel.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
//		arrrayListTime();
		
		
		/*for (int i = 1; i < 21; i++) {
			SetTime(i);
		}*/
		
		
		/*for (int i = 1; i < 21; i++) {
			HashSet_Time(i);
		}*/
		
	}

	private static void HashSet_Time(int num) {
		HashSet<String> loadsSet = new HashSet<String>();
		for (int i = 0; i < num; i++) {
			loadsSet.add(i+"c");
		}
		long startTime=System.nanoTime();   //��ȡ��ʼʱ��
		for (String str : loadsSet) {  
			String s = str; 
		}
		long endTime=System.nanoTime(); //��ȡ����ʱ��
		long time = endTime-startTime;
		System.out.println("��ѯ"+num+"����ʱ��"+time);
	}

	private static void SetTime(int num) {
		Set<String> test = new TreeSet<>();
		for (int i = 0; i < num; i++) {
			test.add(i+"c");
		}
		
		long startTime=System.nanoTime();   //��ȡ��ʼʱ��
		for (String str : test) {  
			String s = str; 
		}
		long endTime=System.nanoTime(); //��ȡ����ʱ��
		long time = endTime-startTime;
		System.out.println("��ѯ"+num+"����ʱ��"+time);
	}

	private static long arrrayListTime() {
		long time = 0;
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			list.add(i+"c");
		}
		
		for (int i = 1; i < list.size()+1; i++) {
			long startTime=System.nanoTime();   //��ȡ��ʼʱ��
			for (int j = 0; j < i; j++) {
				String s = list.get(j);
			}
			long endTime=System.nanoTime(); //��ȡ����ʱ��
			time = endTime-startTime;
			System.out.println("��ѯ"+i+"����ʱ��"+time);
		}
		
		return time;
	}
	
}
