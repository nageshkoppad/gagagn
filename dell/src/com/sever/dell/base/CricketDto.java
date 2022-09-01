package com.sever.dell.base;

public class CricketDto {
	public String country;
	public int noPlayer;
	public String captain;
	public String place;
	public String viceCaptin;
	public boolean forEntertainment;
	public int noWins;
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
	
	
}
