package com.xworks.hibernatedemo;

public class Tester {

	public static void main(String[] args) 
	{
		SportsDTO dto=new SportsDTO();
		dto.setSportsName("Chess");
		dto.setSportState("Karnataka");
		dto.setNumOfPlayers(2);
		
		SportsDAO dao=new SportsDAO();
		dao.save(dto);
		
		

	}

}
