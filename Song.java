package cpm.tinzel.song;

public class Song {
	String songName;
	String singer;
	double time;
	public Song(String songName, String singer, double time) {
		super();
		this.songName = songName;
		this.singer = singer;
		this.time = time;
	}
	public Song() {
		super();
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	

}
