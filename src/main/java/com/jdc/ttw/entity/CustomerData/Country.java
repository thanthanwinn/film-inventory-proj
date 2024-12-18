package com.jdc.ttw.entity.CustomerData;

import com.jdc.ttw.entity.Listeners.EnableTimesListeners;
import com.jdc.ttw.entity.Listeners.Times;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name = "country_tbl")
public class Country implements EnableTimesListeners {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, length=45)
	private String name;
	@Column(nullable = false,columnDefinition = "tinyint(1) default 1" )
	private boolean active;

	@Embedded
	private Times times;
	
	 @Override
	    public Times getTimes() {
	        return times;
	    }

	    @Override
	    public void setTimes(Times times) {
	        this.times = times;
	    }
	

}
