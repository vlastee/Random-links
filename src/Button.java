import java.io.IOException;


public class Button implements Runnable{
	
	@Override
	public void run() {
			Generator.n1 =0;
			Generator.n2 =0;
			Generator.n3 =0;
			Generator.n4 =0;
			Generator.n5 =0;
			Generator.n6 =0;
			Generator.n7 =0;
			Generator.n8 =0;
			Generator.n9=0;
			Generator.n10 =0;
			Generator.n11 =0;
		   Interface.start_button.setEnabled(false);
		   Interface.console.append("Program started. \r\n");
		   long i = Long.parseLong( Interface.quanity.getText()) ;
	  
	  
		   for(long k=0;k<i;k++){
			   try {
				   k++;
				   Interface.info_text1.setText("Quanity of parsed links: "+k);
				   Checker.url_check(Generator.generate_one_link( Interface.first_part_of_link.getText()));
				   
				   //Checker.url_check("http://cs412121.vk.me/v412121944/721a/OLaCEul7tgE.jpg");
				   k--;
				   
				 
			   } catch (IOException e1) {
				   // TODO Auto-generated catch block
				   e1.printStackTrace();
			   }	    			  
		   }
		   Interface.console.append("DONE!!!!!WORKING LINKS WITH INFORMATION YOU CAN GET IN "+Checker.fileDir+"/workLinks.txt \r\n");
		   Interface.start_button.setEnabled(true);
		
	}

}
