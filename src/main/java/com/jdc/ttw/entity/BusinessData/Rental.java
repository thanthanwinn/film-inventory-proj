package com.jdc.ttw.entity.BusinessData;

import java.time.LocalDateTime;

import com.jdc.ttw.entity.Listeners.EnableTimesListeners;
import com.jdc.ttw.entity.Listeners.Times;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
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
@Table(name = "rental_tbl")

public class Rental implements EnableTimesListeners {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Embedded
	private Times times;
	
	private LocalDateTime returnTime;
	
	
	
	@Override
	@AttributeOverride(name = "createTime", column = @Column(name = "rental_time"))
    public Times getTimes() {
        return times;
    }

    @Override
    public void setTimes(Times times) {
        this.times = times;
    }

	public LocalDateTime getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(LocalDateTime returnTime) {
		this.returnTime = returnTime;
	}

}
