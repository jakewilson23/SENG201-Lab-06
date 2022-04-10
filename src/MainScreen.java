import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen {

	private JFrame frmJwisRocketManager;
	private RocketManager manager;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frmJwisRocketManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen(RocketManager incomingManager) {
		manager = incomingManager;
		initialize();
		frmJwisRocketManager.setVisible(true);
	}
	
	public void closeWindow() {
		frmJwisRocketManager.dispose();
	}
	
	public void finishedWindow() {
		manager.closeMainScreen(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJwisRocketManager = new JFrame();
		frmJwisRocketManager.setTitle("jwi187's Rocket Manager - Main Screen");
		frmJwisRocketManager.setBounds(100, 100, 500, 400);
		frmJwisRocketManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJwisRocketManager.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello Starman!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 158, 29);
		frmJwisRocketManager.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Rocket 5");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 51, 140, 81);
		frmJwisRocketManager.getContentPane().add(btnNewButton);
		
		JButton btnRocket = new JButton("Rocket 2");
		btnRocket.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRocket.setBounds(160, 51, 140, 81);
		frmJwisRocketManager.getContentPane().add(btnRocket);
		
		JButton btnRocket_1 = new JButton("Rocket 3");
		btnRocket_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRocket_1.setBounds(310, 51, 140, 81);
		frmJwisRocketManager.getContentPane().add(btnRocket_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 143, 46, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(160, 143, 46, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Name:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(310, 143, 46, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Space Shuttle");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(10, 159, 140, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Space Shuttle");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(160, 159, 140, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Space Shuttle");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_2.setBounds(310, 159, 140, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("Fuel:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(10, 184, 46, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Fuel:");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_1.setBounds(160, 184, 46, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Fuel:");
		lblNewLabel_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_2.setBounds(310, 184, 46, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Empty");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_3.setBounds(10, 199, 140, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_3_1 = new JLabel("Empty");
		lblNewLabel_1_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_3_1.setBounds(160, 199, 140, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_3_3_1);
		
		JLabel lblNewLabel_1_3_3_2 = new JLabel("Empty");
		lblNewLabel_1_3_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_3_2.setBounds(310, 199, 140, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_3_3_2);
		
		JLabel lblNewLabel_1_4_3 = new JLabel("Cleanliness:");
		lblNewLabel_1_4_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_3.setBounds(10, 224, 85, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_4_3);
		
		JLabel lblNewLabel_1_4_3_1 = new JLabel("Cleanliness:");
		lblNewLabel_1_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_3_1.setBounds(160, 226, 85, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_4_3_1);
		
		JLabel lblNewLabel_1_4_3_2 = new JLabel("Cleanliness:");
		lblNewLabel_1_4_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_3_2.setBounds(310, 226, 85, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_4_3_2);
		
		JLabel lblNewLabel_1_3_3_3 = new JLabel("Clean");
		lblNewLabel_1_3_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_3_3.setBounds(10, 240, 140, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_3_3_3);
		
		JLabel lblNewLabel_1_3_3_4 = new JLabel("Dirty");
		lblNewLabel_1_3_3_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_3_4.setBounds(160, 242, 140, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_3_3_4);
		
		JLabel lblNewLabel_1_3_3_5 = new JLabel("Clean");
		lblNewLabel_1_3_3_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_3_5.setBounds(310, 242, 140, 14);
		frmJwisRocketManager.getContentPane().add(lblNewLabel_1_3_3_5);
		
		JButton btnNewButton_1 = new JButton("Clean Rocket");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(10, 314, 140, 23);
		frmJwisRocketManager.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Refuel Rocket");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(160, 314, 140, 23);
		frmJwisRocketManager.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Quit");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2.setBounds(310, 314, 140, 23);
		frmJwisRocketManager.getContentPane().add(btnNewButton_1_2);
	}
}
