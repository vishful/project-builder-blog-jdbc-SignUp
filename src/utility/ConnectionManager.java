package utility;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class ConnectionManager {
	
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();	
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
	}

	
	
	
	
public Connection getConnection() throws Exception {
	
	
	Properties prop=null;
	prop=loadPropertiesFile();
	
	
	final String driver=prop.getProperty("driver");
	final String url=prop.getProperty("url");
	final String username=prop.getProperty("username");
	final String password=prop.getProperty("password");
	
	//Register the driver class
	Class.forName(driver);
	//Create the connection object
	Connection con1=null;
	con1=DriverManager.getConnection(url,username,password);
	return con1;
	
}



}
