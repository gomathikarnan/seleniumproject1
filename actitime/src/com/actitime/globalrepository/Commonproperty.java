package com.actitime.globalrepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Commonproperty {
	public String commonproperty(String data) throws IOException {
FileInputStream f=new FileInputStream("F:\\Softwares\\photon program\\actitime\\generaldata.properties");
Properties p=new Properties();
	p.load(f);
	
	return p.getProperty(data);
	}
}