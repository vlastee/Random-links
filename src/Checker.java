import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;


public class Checker {
	public static long sucsessful_links_quanity=0;
	static String currentDir = new File("").getAbsolutePath();
	static String fileDir = currentDir + "/file";
	static URLConnection urlConnection;
	static URL url;
	static File file = new File(fileDir+"/workLinks.txt");
	public static void url_check(String URL) throws IOException{
		url = new URL(URL); 
		urlConnection = url.openConnection();
		int bytes = urlConnection.getContentLength();
		Interface.console.append("Link >>> "+URL+" >>> SIZE(bytes) - "+bytes+"\r\n");
		Interface.console.setCaretPosition(Interface.console.getDocument().getLength());
		if(bytes>10000){
			try {
				if(!file.exists()){
					file.createNewFile();
				}
           
				FileWriter out = new FileWriter(file.getAbsoluteFile(),true);
				// Interface.console.append("Link >>> "+URL+" >>> SIZE(bytes) - "+bytes+"\r\n");
				
            
            		try {
            			out.write(URL.toString()+ "\r\n");
            			sucsessful_links_quanity++;
            			
            			Interface.info_text.setText("Quanity of sucsessful links: "+sucsessful_links_quanity);
            			Interface.console.append("Link "+URL.toString()+" have some information! \r\n");
            		} 
            		finally {
            			out.close();
            		}
			
			}catch(IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

