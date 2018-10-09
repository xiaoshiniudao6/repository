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
		System.out.println("播放的歌曲信息为：");
		for(int i = 0;i<listsong.size();i++){
			System.out.println("歌曲名称为："+listsong.get(i).getSongName()+"歌手为："+listsong.get(i).getSinger()+"歌曲时长为："+listsong.get(i).getTime());
		}
		return false;
		
	}
}
