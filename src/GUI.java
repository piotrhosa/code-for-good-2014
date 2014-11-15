import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;


public class GUI {

	private JFrame frame;
	public LoanApplicant app;
	public AnalysedDatabase creditCalc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Loan Confidence Generator");
		frame.setBounds(100, 100, 391, 627);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Exit = new JButton("Exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Exit.setBounds(225, 513, 101, 31);
		frame.getContentPane().add(Exit);
		
		final JTextPane txtfirstName = new JTextPane();
		txtfirstName.setBounds(120, 11, 64, 31);
		frame.getContentPane().add(txtfirstName);
		
		final JTextPane txtsecondName = new JTextPane();
		txtsecondName.setBounds(120, 53, 64, 31);
		frame.getContentPane().add(txtsecondName);
		
		JLabel lblfirstName = new JLabel("First Name");
		lblfirstName.setBounds(20, 21, 73, 14);
		frame.getContentPane().add(lblfirstName);
		
		JLabel lblsecondName = new JLabel("Second Name");
		lblsecondName.setBounds(20, 59, 90, 14);
		frame.getContentPane().add(lblsecondName);
		
		final JTextPane txtAge = new JTextPane();
		txtAge.setBounds(120, 139, 64, 31);
		frame.getContentPane().add(txtAge);
		
		JLabel lblDOB = new JLabel("Year of birth");
		lblDOB.setBounds(34, 141, 36, 14);
		frame.getContentPane().add(lblDOB);
		
//		final JTextPane txtDOB = new JTextPane();
//		txtDOB.setBounds(120, 95, 64, 31);
//		frame.getContentPane().add(txtDOB);
		
		final JTextPane txtmiddleName = new JTextPane();
		txtmiddleName.setBounds(120, 95, 64, 31);
		frame.getContentPane().add(txtmiddleName);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setBounds(20, 105, 90, 14);
		frame.getContentPane().add(lblMiddleName);
		
		final JTextPane txtActivation = new JTextPane();
		txtActivation.setBounds(120, 181, 64, 32);
		frame.getContentPane().add(txtActivation);
		
		JLabel lblActivationDate = new JLabel("Activation Date");
		lblActivationDate.setBounds(10, 185, 100, 14);
		frame.getContentPane().add(lblActivationDate);
		
		JLabel lblTel = new JLabel("Tel. No.");
		lblTel.setBounds(20, 230, 73, 14);
		frame.getContentPane().add(lblTel);
		
		JLabel lblMobNo = new JLabel("Mob. No.");
		lblMobNo.setBounds(20, 277, 73, 14);
		frame.getContentPane().add(lblMobNo);
		
		final JTextPane txtTel = new JTextPane();
		txtTel.setBounds(120, 224, 64, 32);
		frame.getContentPane().add(txtTel);
		
		final JTextPane txtMob = new JTextPane();
		txtMob.setBounds(120, 271, 64, 32);
		frame.getContentPane().add(txtMob);
		
		JLabel lblLoanOfficer = new JLabel("Loan Officer");
		lblLoanOfficer.setBounds(20, 325, 73, 14);
		frame.getContentPane().add(lblLoanOfficer);
		
		final JTextPane txtLoan = new JTextPane();
		txtLoan.setBounds(120, 317, 64, 32);
		frame.getContentPane().add(txtLoan);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(20, 370, 73, 14);
		frame.getContentPane().add(lblState);
		
		final JTextPane txtState = new JTextPane();
		txtState.setBounds(120, 360, 64, 32);
		frame.getContentPane().add(txtState);
		
		JLabel lblTown = new JLabel("Town");
		lblTown.setBounds(20, 410, 73, 14);
		frame.getContentPane().add(lblTown);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(20, 460, 73, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblLoanPurpose = new JLabel("Loan Purpose");
		lblLoanPurpose.setBounds(10, 498, 100, 14);
		frame.getContentPane().add(lblLoanPurpose);
		
		JLabel lblInterest = new JLabel("Interest rate");
		lblInterest.setBounds(10, 541, 100, 14);
		frame.getContentPane().add(lblInterest);
		
		JLabel lblPrincipalAmount = new JLabel("Principal Amount");
		lblPrincipalAmount.setBounds(10, 594, 100, 14);
		frame.getContentPane().add(lblPrincipalAmount);
		
		final JTextPane txtTown = new JTextPane();
		txtTown.setBounds(120, 405, 64, 32);
		frame.getContentPane().add(txtTown);
		
		final JTextPane txtAddress = new JTextPane();
		txtAddress.setBounds(120, 448, 64, 32);
		frame.getContentPane().add(txtAddress);
		
		final JTextPane txtLP = new JTextPane();
		txtLP.setBounds(120, 491, 64, 32);
		frame.getContentPane().add(txtLP);
		
		final JTextPane txtInterest = new JTextPane();
		txtInterest.setBounds(120, 580, 64, 32);
		frame.getContentPane().add(txtInterest);
		
		final JTextPane txtPrincipal = new JTextPane();
		txtPrincipal.setBounds(120, 534, 64, 32);
		frame.getContentPane().add(txtPrincipal);

		
		final JTextPane txtSuccess = new JTextPane();
		txtSuccess.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtSuccess.setBounds(194, 124, 171, 80);
		frame.getContentPane().add(txtSuccess);
		
		JLabel lblConfidenceFactor = new JLabel("Confidence Factor:");
		lblConfidenceFactor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblConfidenceFactor.setBounds(194, 257, 171, 82);
		frame.getContentPane().add(lblConfidenceFactor);
		
		
		final JTextPane txtConfidence = new JTextPane();
		txtConfidence.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtConfidence.setBounds(194, 325, 171, 80);
		frame.getContentPane().add(txtConfidence);
		
		JButton btnClickToGenerate = new JButton("Generate");
		btnClickToGenerate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClickToGenerate.setBounds(194, 11, 171, 93);
		frame.getContentPane().add(btnClickToGenerate);
		btnClickToGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				app = new LoanApplicant(txtfirstName.getText(), txtsecondName.getText(),
						txtmiddleName.getText(), txtAge.getText(), txtActivation.getText(), txtTel.getText(), 
						txtMob.getText(), txtLoan.getText(), txtState.getText(), txtTown.getText(), 
						txtAddress.getText(), txtLP.getText(), txtPrincipal.getText(), txtInterest.getText());			
				
				creditCalc = new AnalysedDatabase(app);
				txtSuccess.setText(creditCalc.getScore());
			}
		});
		
		

	}
}
