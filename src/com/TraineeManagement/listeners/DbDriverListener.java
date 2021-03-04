package com.TraineeManagement.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DbDriverListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException ex) {

		}
	}

	public void contextDestroyed(ServletContextEvent sce) {

	}

}