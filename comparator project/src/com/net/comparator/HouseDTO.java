package com.net.comparator;

import java.io.Serializable;

public class HouseDTO implements Serializable {
	    private Integer id;
		private String name;
		private String owner;
		private Type type;
		private Integer noOfFloors;
		private Boolean loan;
		private PropertyType owningType;
		private Double sqft;
		
		public HouseDTO() {

		System.out.println("default constructor");
		}
		@Override
		public String toString() {
			return "HouseDTO [id=" + id + ", name=" + name + ", owner=" + owner + ", type=" + type + ", noOfFloors="
					+ noOfFloors + ", loan=" + loan + ", owningType=" + owningType + ", sqft=" + sqft + "]";
		}
		public HouseDTO(Integer id, String name, String owner, Type type, Integer noOfFloors, Boolean loan,
				PropertyType owningType, Double sqft) {
			super();
			this.id = id;
			this.name = name;
			this.owner = owner;
			this.type = type;
			this.noOfFloors = noOfFloors;
			this.loan = loan;
			this.owningType = owningType;
			this.sqft = sqft;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Type getType() {
			return type;
		}

		public void setType(Type type) {
			this.type = type;
		}

		public Integer getNoOfFloors() {
			return noOfFloors;
		}

		public void setNoOfFloors(Integer noOfFloors) {
			this.noOfFloors = noOfFloors;
		}

		public Boolean getLoan() {
			return loan;
		}

		public void setLoan(Boolean loan) {
			this.loan = loan;
		}

		public PropertyType getOwningType() {
			return owningType;
		}

		public void setOwningType(PropertyType owningType) {
			this.owningType = owningType;
		}

		public Double getSqft() {
			return sqft;
		}

		public void setSqft(Double sqft) {
			this.sqft = sqft;
		}
		
		
		
}
