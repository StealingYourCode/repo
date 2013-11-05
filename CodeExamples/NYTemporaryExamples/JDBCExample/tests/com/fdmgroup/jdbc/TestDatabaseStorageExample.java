package com.fdmgroup.jdbc;

import org.junit.Test;

import com.fdmgroup.jdbc.DatabaseStorageExample;



public class TestDatabaseStorageExample {

	@Test
	public void testPrintAllRecords() {

		new DatabaseStorageExample().printAllRecordsInTable();
	}

}
