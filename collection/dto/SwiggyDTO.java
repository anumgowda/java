package com.xworkz.collection.dto;

public class SwiggyDTO implements Comparable<SwiggyDTO>{
	private int swiggyid;
	private String foodName;
	
	public SwiggyDTO(int id,String name)
	{
		swiggyid=id;
		foodName=name;
		
	}

	public int getSwiggyid() {
		return swiggyid;
	}

	public void setSwiggyid(int swiggyid) {
		this.swiggyid = swiggyid;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	@Override
	public String toString() {
		return "SwiggyDTO [swiggyid=" + swiggyid + ", foodName=" + foodName + "]";
	}
	@Override
	public int compareTo(SwiggyDTO o) {
		return this.swiggyid-o.swiggyid;
	}
	
}
