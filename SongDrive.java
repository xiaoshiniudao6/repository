package cpm.tinzel.song;

import java.util.Scanner;

public class SongDrive {
	static Master master = new Master();
	Player player = new Player();
	public SongDrive(){
		
	}

	public static void main(String[] args) {
		System.out.println("��ѡ���Ƿ���Ӹ�������");
		System.out.println("1:����");
		System.out.println("2:������");
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		if(b==1){
			boolean bo = true;
			if(bo){
			     Song s1 = new Song("�໨��","�ܽ���",3.0);
			     Song s2 = new Song("�����ѩ","Ѧ֮ǫ",3.0);
			     Song s3 = new Song("ǧ��֮��","������",2.9);
			     master.listsong.add(s1);
			     master.listsong.add(s2);
			     master.listsong.add(s3);
			     master.play();
			     
			}
		}

	
	}
}
