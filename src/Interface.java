import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Interface implements Runnable{
	JFrame window_main;
	static JButton start_button;
	static JTextField info_text;
	static JTextField info_text1;
	static JTextField first_part_of_link;
	static JTextField quanity;
	JPanel console_holder;
	static JTextArea console;
	JScrollPane scrollPane;
	
	public  Interface(){
		window_main =new JFrame("Links generator");
		window_main.setBounds(800, 600, 800, 600);
	    window_main.getContentPane().setLayout(null);
		window_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		start_button = new JButton("Start");
		start_button.setLocation(new Point(350,20));
		start_button.setSize(new Dimension(100, 20));
		info_text = new JTextField("Quanity of sucsessful links:  0");
		info_text.setLocation(new Point(10,45));
		info_text.setSize(new Dimension(780, 20));
		info_text.setEditable(false);
		info_text1 = new JTextField("Quanity of parsed links:  0");
		info_text1.setLocation(new Point(10,70));
		info_text1.setSize(new Dimension(780, 20));
		info_text1.setEditable(false);
		first_part_of_link = new JTextField("insert here first part of link, if you want");
		first_part_of_link.setLocation(new Point(10,20));
		first_part_of_link.setSize(new Dimension(340, 20));
		quanity= new JTextField("insert here quanity of generations");
		quanity.setLocation(new Point(450,20));
		quanity.setSize(new Dimension(340, 20));
		console = new JTextArea(27, 27);
		console_holder = new JPanel();
		console_holder.setLocation(new Point(10,125));
		console_holder.setSize(new Dimension(780, 440));
		console_holder.setLayout(new BorderLayout());
		console_holder.add(console, BorderLayout.CENTER);
		console.append("Please make folder \"file\" in catalog: "+Checker.currentDir.toString()+"\r\n");
		scrollPane = new JScrollPane(console);
		
		console_holder.add(scrollPane, BorderLayout.CENTER);
		
		window_main.add(first_part_of_link);
		window_main.add(start_button);
		window_main.add(quanity);
		window_main.add(info_text);
		window_main.add(console_holder);
		window_main.add(info_text1);
		window_main.setVisible(true); 
        window_main.setResizable(false);
        window_main.setLocationRelativeTo(null);
        
		
		start_button.addActionListener(new ActionListener(){
	    	   @Override
				public void actionPerformed(ActionEvent e) {
	    		   Runnable Parsing = new Button();
	    		   Thread t2 = new Thread(Parsing);
	    		   t2.start();
	    	   }
	      });
		
		//DefaultCaret caret = (DefaultCaret)console.getCaret();
       // caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        window_main.validate(); 
	}	
	


	public void run() {
		window_main.setVisible(true);
	}

}
