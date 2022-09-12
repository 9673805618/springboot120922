package com.employeeTravel.main.domain;

import java.util.Objects;

public class SlabDetails {

	private int slabId;
	private String designation;
	private String modeOfTravel;
	private double slabBudget;
	
	  public SlabDetails() {
		// TODO Auto-generated constructor stub
	}

	public SlabDetails(int slabId, String designation, String modeOfTravel, double slabBudget) {
		super();
		this.slabId = slabId;
		this.designation = designation;
		this.modeOfTravel = modeOfTravel;
		this.slabBudget = slabBudget;
	}

	public int getSlabId() {
		return slabId;
	}

	public void setSlabId(int slabId) {
		this.slabId = slabId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getModeOfTravel() {
		return modeOfTravel;
	}

	public void setModeOfTravel(String modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}

	public double getSlabBudget() {
		return slabBudget;
	}

	public void setSlabBudget(double slabBudget) {
		this.slabBudget = slabBudget;
	}

	@Override
	public int hashCode() {
		return Objects.hash(designation, modeOfTravel, slabBudget, slabId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SlabDetails other = (SlabDetails) obj;
		return Objects.equals(designation, other.designation) && Objects.equals(modeOfTravel, other.modeOfTravel)
				&& Double.doubleToLongBits(slabBudget) == Double.doubleToLongBits(other.slabBudget)
				&& slabId == other.slabId;
	}

	@Override
	public String toString() {
		return "SlabDetails [slabId=" + slabId + ", designation=" + designation + ", modeOfTravel=" + modeOfTravel
				+ ", slabBudget=" + slabBudget + "]";
	}
	  
}
