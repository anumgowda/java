package com.xworkz.collection.dto;

public class PaintDTO implements Comparable<PaintDTO>{
	private int paintId;
	private String PaintName;
	
	public PaintDTO(int id,String name) {
		this.paintId=id;
		this.PaintName=name;
	}

	
	public int getPaintId() {
		return paintId;
	}

	public void setPaintId(int paintId) {
		this.paintId = paintId;
	}

	public String getPaintName() {
		return PaintName;
	}

	public void setPaintName(String paintName) {
		PaintName = paintName;
	}

	@Override
	public int compareTo(PaintDTO o) {
		// TODO Auto-generated method stub
		return this.paintId-o.paintId;
	}

	@Override
	public String toString() {
		return "PaintDTO [paintId=" + paintId + ", PaintName=" + PaintName + "]";
	}
	

}
