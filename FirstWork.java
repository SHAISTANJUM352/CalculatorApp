import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstWork extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JLabel lblNewLabel_2;
	private JTextField tfb;
	private JTextField tfres;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWork frame = new FirstWork();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstWork() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(152, 24, 124, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A");
		lblNewLabel_1.setForeground(new Color(75, 0, 130));
		lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(78, 77, 12, 24);
		contentPane.add(lblNewLabel_1);
		
		tfa = new JTextField();
		tfa.setBackground(new Color(211, 211, 211));
		tfa.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		tfa.setBounds(103, 79, 86, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		lblNewLabel_2 = new JLabel("B");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(75, 0, 130));
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(251, 75, 12, 24);
		contentPane.add(lblNewLabel_2);
		
		tfb = new JTextField();
		tfb.setBackground(new Color(211, 211, 211));
		tfb.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		tfb.setColumns(10);
		tfb.setBounds(273, 79, 86, 20);
		contentPane.add(tfb);
		
		tfres = new JTextField();
		tfres.setBackground(new Color(211, 211, 211));
		tfres.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		tfres.setColumns(10);
		tfres.setBounds(206, 128, 86, 20);
		contentPane.add(tfres);
		
		lblNewLabel_3 = new JLabel("RESULT");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(75, 0, 130));
		lblNewLabel_3.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(123, 128, 66, 24);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//logic to add
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1+var2;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		btnNewButton.setBounds(30, 187, 77, 33);
		contentPane.add(btnNewButton);
		
		JButton btnSub = new JButton("SUB");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//logic to sub
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1-var2;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		btnSub.setForeground(new Color(128, 0, 128));
		btnSub.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		btnSub.setBackground(new Color(211, 211, 211));
		btnSub.setBounds(113, 187, 77, 33);
		contentPane.add(btnSub);
		
		JButton btnMul = new JButton("MUL");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to multiplication
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1*var2;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		btnMul.setForeground(new Color(128, 0, 128));
		btnMul.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		btnMul.setBackground(new Color(211, 211, 211));
		btnMul.setBounds(193, 187, 77, 33);
		contentPane.add(btnMul);
		
		JButton btnDiv = new JButton("DIV");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to division
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1/var2;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		btnDiv.setForeground(new Color(128, 0, 128));
		btnDiv.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		btnDiv.setBackground(new Color(211, 211, 211));
		btnDiv.setBounds(273, 187, 66, 33);
		contentPane.add(btnDiv);
		
		JButton btnRem = new JButton("REM");
		btnRem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to remainder
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1%var2;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		btnRem.setForeground(new Color(128, 0, 128));
		btnRem.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		btnRem.setBackground(new Color(211, 211, 211));
		btnRem.setBounds(344, 187, 80, 33);
		contentPane.add(btnRem);
	}
}
