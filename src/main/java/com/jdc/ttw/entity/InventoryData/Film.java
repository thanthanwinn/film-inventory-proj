package com.jdc.ttw.entity.InventoryData;

import com.jdc.ttw.entity.Listeners.Times;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "film_tbl")
public class Film {
	
	private int id;
	private String title;
	private String description;
	//
	 @Embedded
	private Times times;
	
	public enum Rate{
		 One, Two, Three, Four, Five
	 }
	 
	 
	 
	 
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
}
