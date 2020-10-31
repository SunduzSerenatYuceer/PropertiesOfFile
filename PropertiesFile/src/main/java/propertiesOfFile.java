import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;


public class propertiesOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties prop  = new Properties();
		OutputStream output = null;
		
		try {
			output = new FileOutputStream(System.getProperty("user.dir") + "/config.properties");
			
			System.out.println(System.getProperty("user.dir") + "/config.properties");
			
			// Set the properties value
			
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "mylib");
			prop.setProperty("dbpassword", "password");
			
			
			prop.store(output, null);
			
		}catch(IOException io){
			io.printStackTrace();
			
		}finally {
			
			if(output != null) {
				
				try {
					output.close();
					
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}

	}

}
