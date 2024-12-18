package com.jdc.ttw.entity.InventoryData;

import com.jdc.ttw.entity.Listeners.EnableTimesListeners;
import com.jdc.ttw.entity.Listeners.Times;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class FilmActor implements EnableTimesListeners {
	
	
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
