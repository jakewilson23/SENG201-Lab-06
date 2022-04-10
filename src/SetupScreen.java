import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SetupScreen {

	private JFrame frmRocketManager;
	private JTextField textField;
	private RocketManager manager;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetupScreen window = new SetupScreen(manager);
					window.frmRocketManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SetupScreen(RocketManager incomingManager) {
		manager = incomingManager;
		initialize();
		frmRocketManager.setVisible(true);
	}
	
	public void closeWindow() {
		frmRocketManager.dispose();
	}
	
	public void finishedWindow() {
		manager.closeSetupScreen(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRocketManager = new JFrame();
		frmRocketManager.setTitle("jwi187's Rocket Manager - Setup");
		frmRocketManager.setBounds(100, 100, 500, 500);
		frmRocketManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRocketManager.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Rocket Manager!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 289, 32);
		frmRocketManager.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please Enter Your Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 54, 199, 32);
		frmRocketManager.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(219, 54, 250, 32);
		frmRocketManager.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("How many Rockets do you need?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 97, 262, 32);
		frmRocketManager.getContentPane().add(lblNewLabel_2);
		
		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setMinorTickSpacing(1);
		slider.setBorder(null);
		slider.setMinimum(1);
		slider.setMaximum(3);
		slider.setToolTipText("");
		slider.setFont(new Font("Tahoma", Font.BOLD, 15));
		slider.setBounds(267, 97, 200, 50);
		frmRocketManager.getContentPane().add(slider);
		
		JButton btnNewButton = new JButton("Rocket 1");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 170, 100, 55);
		frmRocketManager.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rocket 3");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(10, 236, 100, 55);
		frmRocketManager.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Rocket 5");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(10, 302, 100, 55);
		frmRocketManager.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Rocket 2");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(120, 170, 100, 55);
		frmRocketManager.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Rocket 4");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_1.setBounds(120, 236, 100, 55);
		frmRocketManager.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("Rocket 6");
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_2.setBounds(120, 302, 100, 55);
		frmRocketManager.getContentPane().add(btnNewButton_3_2);
		
		JLabel lblRocketStatus = new JLabel("Rocket Status");
		lblRocketStatus.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRocketStatus.setBounds(305, 170, 125, 32);
		frmRocketManager.getContentPane().add(lblRocketStatus);
		
		JLabel lblNewLabel_3 = new JLabel("Name:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(253, 201, 53, 24);
		frmRocketManager.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Fuel:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(253, 226, 42, 24);
		frmRocketManager.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Cleanliness:");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(253, 251, 87, 24);
		frmRocketManager.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("FalconHeavy");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_2.setBounds(305, 201, 148, 24);
		frmRocketManager.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Full");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_2.setBounds(305, 226, 90, 24);
		frmRocketManager.getContentPane().add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Dirty");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_3.setBounds(344, 251, 63, 24);
		frmRocketManager.getContentPane().add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_4 = new JLabel("Selected:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(130, 368, 79, 14);
		frmRocketManager.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_2_1 = new JButton("Rocket 5");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_1.setBounds(10, 395, 100, 55);
		frmRocketManager.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Rocket 2");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_2.setBounds(120, 395, 100, 55);
		frmRocketManager.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("Rocket 5");
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_3.setBounds(230, 395, 100, 55);
		frmRocketManager.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_4 = new JButton("Accept");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(378, 413, 89, 23);
		frmRocketManager.getContentPane().add(btnNewButton_4);
	}
}
