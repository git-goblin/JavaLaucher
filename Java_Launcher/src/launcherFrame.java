import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;


	



public class launcherFrame extends JFrame implements ActionListener  {
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) 
	{ 
		new launcherFrame();
	}
	
	private JFrame window; 
	private JPanel pane; 
	private JButton btn_play;
	private JLabel lbl; 
	private JProgressBar load_bar;
	public launcherFrame() 
	{ 
		window = new JFrame("Pandashan Java Launcher (FUCK OFF WOWBEEZ!)"); //declaring components
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

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_play);
		{ 
			System.out.println("Hello World!");
		}
	}
} 

