package com.xworks.hibernatedemo;

public class Tester {

	public static void main(String[] args) 
	{
		SportsDTO dto=new SportsDTO();
		dto.setSportsName("Chess");
		dto.setSportState("Karnataka");
		dto.setNumOfPlayers(2);
		
		SportsDAO dao=new SportsDAO();
		SportsDAO dao2=new SportsDAO();
		dao.save(dto);
		dao2.save(dto);
		
		
		
		

	}

}
