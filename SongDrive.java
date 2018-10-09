package cpm.tinzel.song;

import java.util.Scanner;

public class SongDrive {
	static Master master = new Master();
	Player player = new Player();
	public SongDrive(){
		
	}

	public static void main(String[] args) {
		System.out.println("请选择是否添加歌曲播放");
		System.out.println("1:播放");
		System.out.println("2:不播放");
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		if(b==1){
			boolean bo = true;
			if(bo){
			     Song s1 = new Song("青花瓷","周杰伦",3.0);
			     Song s2 = new Song("认真的雪","薛之谦",3.0);
			     Song s3 = new Song("千里之外","费玉清",2.9);
			     master.listsong.add(s1);
			     master.listsong.add(s2);
			     master.listsong.add(s3);
			     master.play();
			     
			}
		}

	
	}
}
