package com.sever.dell.base;

public class CricketDto {
	private String country;
	private int noPlayer;
	private String captain;
	private String place;
	private String viceCaptin;
	private boolean forEntertainment;
	private int noWins;
	public CricketDto(String country, int noPlayer, String captain, String place, String viceCaptin,
			boolean forEntertainment, int noWins) {
		this.country = country;
		this.noPlayer = noPlayer;
		this.captain = captain;
		this.place = place;
		this.viceCaptin = viceCaptin;
		this.forEntertainment = forEntertainment;
		this.noWins = noWins;
	}
	@Override
	public String toString() {
		return "CricketDto [country=" + country + ", noPlayer=" + noPlayer + ", captain=" + captain + ", place=" + place
				+ ", viceCaptin=" + viceCaptin + ", forEntertainment=" + forEntertainment + ", noWins=" + noWins
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public CricketDto() {
		
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getNoPlayer() {
		return noPlayer;
	}
	public void setNoPlayer(int noPlayer) {
		this.noPlayer = noPlayer;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public String getCaptain() {
		return this.captain;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getViceCaptin() {
		return viceCaptin;
	}
	public void setViceCaptin(String viceCaptin) {
		this.viceCaptin = viceCaptin;
	}
	public boolean isForEntertainment() {
		return forEntertainment;
	}
	public void setForEntertainment(boolean forEntertainment) {
		this.forEntertainment = forEntertainment;
	}
	public int getNoWins() {
		return noWins;
	}
	public void setNoWins(int noWins) {
		this.noWins = noWins;
	}
	
	
	
}
