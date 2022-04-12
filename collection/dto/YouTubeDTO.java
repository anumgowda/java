package com.xworkz.collection.dto;

public class YouTubeDTO implements Comparable<YouTubeDTO> {
	private int channelId;
	private String channelName;
	
	
	public YouTubeDTO(int id,String name) {
		channelId=id;
		channelName=name;
	}


	public int getChannelId() {
		return channelId;
	}


	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}


	public String getChannelName() {
		return channelName;
	}


	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}


	@Override
	public int compareTo(YouTubeDTO o) {
		// TODO Auto-generated method stub
		return channelId-o.channelId;
	}


	@Override
	public String toString() {
		return "YouTubeDTO [channelId=" + channelId + ", channelName=" + channelName + "]";
	}
	

}
