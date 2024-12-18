package com.jdc.ttw.entity.InventoryData;

import com.jdc.ttw.entity.Listeners.EnableTimesListeners;
import com.jdc.ttw.entity.Listeners.Times;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "store_tbl")
public class Store implements EnableTimesListeners{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Embedded
	private Times times;
	
	@ManyToOne(optional = false)
	private Film film;
	
	 @Override
	    public Times getTimes() {
	        return times;
	    }

	    @Override
	    public void setTimes(Times times) {
	        this.times = times;
	    }

}
