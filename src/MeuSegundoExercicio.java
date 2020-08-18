import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class MeuSegundoExercicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MeuSegundoExercicio frame = new MeuSegundoExercicio();
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
	public MeuSegundoExercicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel num1 = new JLabel("Digite um n\u00FAmero:");
		num1.setFont(new Font("Arial", Font.PLAIN, 12));
		num1.setBounds(135, 72, 119, 14);
		contentPane.add(num1);
		
		JLabel num2 = new JLabel("Digite outro n\u00FAmero:");
		num2.setFont(new Font("Arial", Font.PLAIN, 12));
		num2.setBounds(135, 109, 119, 14);
		contentPane.add(num2);
		
		JTextPane txt1 = new JTextPane();
		txt1.setBounds(252, 72, 45, 20);
		contentPane.add(txt1);
		
		JTextPane txt2 = new JTextPane();	
		txt2.setBounds(252, 103, 45, 20);
		contentPane.add(txt2);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String num1 = txt1.getText();
				String num2 = txt2.getText();
				
				int i = Integer.parseInt(num1);
				int j = Integer.parseInt(num2);
				String value = "";
				
				for (int x = i; x <= j; x++) {
					if (x > i && x < j) {
						value = value + "  " +x;
						
						
					}
					
				}
				JOptionPane.showMessageDialog(contentPane, "Os valores entre " +i+ " e " +j+ " são :" + value);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton.setBounds(165, 146, 89, 23);
		contentPane.add(btnNewButton);
	}

}
