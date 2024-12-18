package com.jdc.ttw.entity.InventoryData;

import java.io.Serializable;

import jakarta.persistence.Column;

public class FilmActorPk implements Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "actor_id")
	private int actorId;
	@Column(name = "film_id")
	private int filmId;
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public int getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

}
