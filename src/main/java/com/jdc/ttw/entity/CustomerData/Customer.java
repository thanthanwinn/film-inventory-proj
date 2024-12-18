package com.jdc.ttw.entity.CustomerData;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "customer_tbl")
public class Customer {
	@Id
	@GeneratedValue(generator="")
	@TableGenerator(name = "gen_cus_tbl",initialValue=1,allocationSize=1)
	private int id;
	@Column(nullable = false,length=45)
	private String name;
	@Column(nullable = false, columnDefinition = "tinyint(1) default 1")
	private boolean active;
	
	@Embedded
	private Contact contact;

}
