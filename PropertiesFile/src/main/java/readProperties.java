
import java.io.FileInputStream;
import java.util.Properties;


public class readPropertiesOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties prop  = new Properties();
;
		
		try {
			FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "/config.properties");
			
			System.out.println(System.getProperty("user.dir") + "/config.properties");
			
			prop.load(input);

			System.out.println(prop.getProperty("database"));

			
		}catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
