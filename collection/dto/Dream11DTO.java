package com.xworkz.collection.dto;

public class Dream11DTO implements Comparable<Dream11DTO>{
 private int DreamId;
 private String DreamName;
 
public  Dream11DTO(int id,String name){
	 DreamId=id;
	 DreamName=name;
 }

public int getDreamId() {
	return DreamId;
}

public void setDreamId(int dreamId) {
	DreamId = dreamId;
}

public String getDreamName() {
	return DreamName;
}

public void setDreamName(String dreamName) {
	DreamName = dreamName;
}
@Override
public int compareTo(Dream11DTO o) {
	// TODO Auto-generated method stub
	return this.DreamId-o.DreamId;
}

@Override
public String toString() {
	return "Dream11 [DreamId=" + DreamId + ", DreamName=" + DreamName + "]";
}
 
}
