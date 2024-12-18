package com.jdc.ttw.entity.BusinessData;

import com.jdc.ttw.entity.CustomerData.Address;
import com.jdc.ttw.entity.CustomerData.Contact;
import com.jdc.ttw.entity.Listeners.EnableTimesListeners;
import com.jdc.ttw.entity.Listeners.Times;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table(name = "staff_tbl")
public class Staff  implements EnableTimesListeners{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length =45)
	private String name;
	
	@Column(nullable = false, length =45)
	private String loginId;
	
	@Column(nullable = false, length =45)
	private String password;
	
	@Embedded
	private Contact contact;
	@Embedded
	private Times times;
	@ManyToOne(fetch = FetchType.LAZY,optional = true)
	private Address address;
	
	 @Override
	    public Times getTimes() {
	        return times;
	    }

	    @Override
	    public void setTimes(Times times) {
	        this.times = times;
	    }

}
