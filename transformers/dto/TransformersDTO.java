package com.xworkz.transformers.dto;

import java.io.Serializable;

public class TransformersDTO implements Serializable {

	private String name;
	private String place;
	private String charecterType;
	private String happy;
	private String angry;
	private String sad;
	private String likeToDo;

	public TransformersDTO() {
		super();
	}

	public TransformersDTO(String name, String place, String charecterType, String happy, String angry, String sad,
			String likeToDo) {
		super();
		this.name = name;
		this.place = place;
		this.charecterType = charecterType;
		this.happy = happy;
		this.angry = angry;
		this.sad = sad;
		this.likeToDo = likeToDo;
	}

	@Override
	public String toString() {
		return "TransformersDTO [name=" + name + ", place=" + place + ", charecterType=" + charecterType + ", happy="
				+ happy + ", angry=" + angry + ", sad=" + sad + ", likeToDo=" + likeToDo + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Original hashcode: " + System.identityHashCode(this) + "for hashing returning 43");
		return 43;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof TransformersDTO) {
			TransformersDTO casted = (TransformersDTO) obj;
			if (this.name.equals(casted.name) && this.likeToDo.equals(casted.likeToDo)
					&& this.angry.equals(casted.angry) && this.charecterType.equals(casted.getCharecterType())) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCharecterType() {
		return charecterType;
	}

	public void setCharecterType(String charecterType) {
		this.charecterType = charecterType;
	}

	public String getHappy() {
		return happy;
	}

	public void setHappy(String happy) {
		this.happy = happy;
	}

	public String getAngry() {
		return angry;
	}

	public void setAngry(String angry) {
		this.angry = angry;
	}

	public String getSad() {
		return sad;
	}

	public void setSad(String sad) {
		this.sad = sad;
	}

	public String getLikeToDo() {
		return likeToDo;
	}

	public void setLikeToDo(String likeToDo) {
		this.likeToDo = likeToDo;
	}

}
