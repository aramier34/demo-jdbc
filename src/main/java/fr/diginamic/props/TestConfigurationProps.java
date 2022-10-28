package fr.diginamic.props;

import java.util.ResourceBundle;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;

public class TestConfigurationProps {

	public static void main(String[] args) {


		ResourceBundle config= ResourceBundle.getBundle("database");
		
		String driverName= config.getString("database.driver");
		
		System.out.println(driverName);
		
		Configurations configs= new Configurations(); 
		Configuration config = configs.properties("config.properties");
		String nomBase= config.getString("database.nom");
	}

}
