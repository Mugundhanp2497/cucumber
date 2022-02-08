package testRunner;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class jvmreport 
{
	public static void repmeth(String loc)
	{
		File f=new File("C:\\Users\\mugunthan\\eclipse-workspace\\cucumberframe\\report all\\jvm\\fbone.jvm");
		Configuration c=new Configuration(f,"fbone");
		c.addClassifications("windows 10","chrome");
		c.addClassifications("eclipse","java");
		c.addClassifications("selenium","framework");
		ArrayList<String> li=new ArrayList<String>();
		li.add(loc);
		ReportBuilder re=new ReportBuilder(li,c);
		re.generateReports();
		
		
		
	}

}
