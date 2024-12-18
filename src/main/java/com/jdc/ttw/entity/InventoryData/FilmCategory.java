package com.jdc.ttw.entity.InventoryData;

import com.jdc.ttw.entity.Listeners.Times;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class FilmCategory {
	@Embedded
	private FilmCategoryPk id;
	@Embedded
	private Times times;
	@MapsId("filmId")
	@ManyToOne
	private Film film;

}
