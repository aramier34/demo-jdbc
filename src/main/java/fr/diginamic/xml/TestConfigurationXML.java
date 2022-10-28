package fr.diginamic.xml;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class TestConfigurationXML {

	public static void main(String[] args) throws ConfigurationException {

		Configurations configs= new Configurations(); 
		Configuration config= configs.properties("config.xml");
		String nomBase= config.getString("database[@nom]");
		
		System.out.println(nomBase);
		
		
	}

}
