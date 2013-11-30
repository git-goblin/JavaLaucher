import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;


	



public class launcherFrame extends JFrame implements ActionListener  {
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) 
	{ 
		//new launcherFrame(); 
		getFile();
	}
	
	public String FTPaddress;
	
	private JFrame window; 
	private JPanel pane; 
	private JButton btn_play;
	private JLabel lbl; 
	private JProgressBar load_bar;
	public launcherFrame() 
	{ 
		window = new JFrame("Java Launcher"); //declaring components
		pane = new JPanel();
		btn_play = new JButton("Play");
		lbl = new JLabel("Label Is Here!");
		load_bar = new JProgressBar();
		

		GridBagConstraints gc = new GridBagConstraints();
		
		gc.gridx = 5; 
		gc.gridy = 5;
		pane.add(btn_play, gc); 
		gc.gridx = 1; 
		gc.gridy = 5;
		pane.add(load_bar, gc);
		gc.gridx = 1;
		gc.gridy = 1; 
		pane.add(lbl, gc);
		
		window.add(pane);
		window.setSize(800, 400);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);  
		window.setVisible(true);
				
	}
	
	public static String getFile() 
	{
	String dir = System.getProperty("user.dir"); 
	return dir;
	} 
	
	public static String getOS()
	{ 
		String OS = System.getProperty("os.name"); 
		return OS;
	}
	
	public void sftpConnect() throws IOException
	{ 
			switch(getOS()) 
			{ 
			case "Mac OS":  
				FTPaddress = "MacLauncher";
				break;
			case "Windows":  
				FTPaddress = "WindowsLauncher";
				break;
			case "Linux":  
				FTPaddress = "WindowsLauncher";
				break;	
				
			}
		
		    URL url = new URL("ftp://peluche:password123@ftp.myserver.com/"+ FTPaddress +";type=i");
			URLConnection con = url.openConnection();
			BufferedInputStream in = new BufferedInputStream(con.getInputStream());
			FileOutputStream out = new FileOutputStream(getFile());

			int i = 0;
			byte[] bytesIn = new byte[1024];
			while ((i = in.read(bytesIn)) >= 0) {
				out.write(bytesIn, 0, i);
			}
			out.close();
			in.close();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_play);
		{ 
			System.out.println("Hello World!");
		}
	}
} 

