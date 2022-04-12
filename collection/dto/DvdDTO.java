package com.xworkz.collection.dto;

public class DvdDTO implements Comparable<DvdDTO> {
	private  int dvdId;
	private String dvdName;
	
	public DvdDTO(int id,String name) {
		dvdId=id;
		dvdName=name;
	}

	public int getDvdId() {
		return dvdId;
	}

	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}

	public String getDvdName() {
		return dvdName;
	}

	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}

	@Override
	public String toString() {
		return "DvdDTO [dvdId=" + dvdId + ", dvdName=" + dvdName + "]";
	}

	@Override
	public int compareTo(DvdDTO o) {
		// TODO Auto-generated method stub
		return dvdId-o.dvdId;
	}
	

}
