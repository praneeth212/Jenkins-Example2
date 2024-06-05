package com.example.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class Branches {
	
	private List<Branch> branchList;

	public Branches() {
	super();
	// 	// TODO Auto-generated constructor stub
	}

	public Branches(List<Branch> branchList) {
		super();
	 	this.branchList = branchList;
	 }

	@Override
	public String toString() {
		return "Branches [branchList=" + branchList + "]";
	}

	public List<Branch> getBranchList() {
		return branchList;
	}

	public void setBranchList(List<Branch> branchList) {
		this.branchList = branchList;
	}

}
