package com.altimetrik.services;

import org.junit.Test;

import com.altiometrik.databaseconfig.DataBaseConnection;

public class TestSaas {
	
	@Test(expected = Exception.class)
	public void testProject(){
		DataBaseConnection obj = new DataBaseConnection();
		obj.saveData("Mihir", "LANE-64", "HELLO", "1234", "4567"); 
	}
}
