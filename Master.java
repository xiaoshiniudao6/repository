package cpm.tinzel.song;

import java.util.ArrayList;
import java.util.List;

public class Master {	
	static List<Song> listsong;
	public List song(){
		
		List<Song> listsong = new ArrayList<Song>();
		return listsong;
		
	}
	public boolean play(){
		System.out.println("���ŵĸ�����ϢΪ��");
		for(int i = 0;i<listsong.size();i++){
			System.out.println("��������Ϊ��"+listsong.get(i).getSongName()+"����Ϊ��"+listsong.get(i).getSinger()+"����ʱ��Ϊ��"+listsong.get(i).getTime());
		}
		return false;
		
	}
}
