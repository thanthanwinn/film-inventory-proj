package com.jdc.ttw.entity.Listeners;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
import lombok.Data;


@Embeddable

public class Times implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	 public LocalDateTime getCreateTime() {
	        return createTime;
	    }

	    public void setCreateTime(LocalDateTime createTime) {
	        this.createTime = createTime;
	    }

	    public LocalDateTime getUpdateTime() {
	        return updateTime;
	    }

	    public void setUpdateTime(LocalDateTime updateTime) {
	        this.updateTime = updateTime;
	    }
	

	
	
	

}
