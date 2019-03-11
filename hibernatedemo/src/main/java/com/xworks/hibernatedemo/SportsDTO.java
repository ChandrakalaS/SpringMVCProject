package com.xworks.hibernatedemo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="sports_table")
public class SportsDTO implements Serializable
{
	@Id
	@GenericGenerator(name="sqlId",strategy="increment")
	@GeneratedValue(generator="sqlId")
	@Column(name="sports_id")
	private int sportId;
	
	@Column(name="sports_name")
	private String sportsName;
	
	@Column(name="sports_state")
	private String sportState;
	
	@Column(name="sports_numOfPlayers")
	private int numOfPlayers;
	
	public SportsDTO() {
		System.out.println("Created  \t"+this.getClass().getSimpleName());
	}

	public int getSportId() {
		return sportId;
	}

	public void setSportId(int sportId) {
		this.sportId = sportId;
	}

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}

	public String getSportState() {
		return sportState;
	}

	public void setSportState(String sportState) {
		this.sportState = sportState;
	}

	public int getNumOfPlayers() {
		return numOfPlayers;
	}

	public void setNumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}

	@Override
	public String toString() {
		return "SportsDTO [sportId=" + sportId + ", sportsName=" + sportsName + ", sportState=" + sportState
				+ ", numOfPlayers=" + numOfPlayers + "]";
	}
	

}
