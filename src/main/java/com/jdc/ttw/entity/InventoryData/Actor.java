package com.jdc.ttw.entity.InventoryData;

import com.jdc.ttw.entity.Listeners.Times;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "actor_tbl")
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Embedded
	private Times times;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
