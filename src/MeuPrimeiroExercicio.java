import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class MeuPrimeiroExercicio extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MeuPrimeiroExercicio frame = new MeuPrimeiroExercicio();
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
	public MeuPrimeiroExercicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLogin.setBounds(85, 72, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSenha.setBounds(85, 109, 46, 14);
		contentPane.add(lblSenha);
		
		JTextPane txtLogin = new JTextPane();
		txtLogin.setBounds(131, 66, 154, 20);
		contentPane.add(txtLogin);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(131, 106, 154, 20);
		contentPane.add(txtSenha);
		
		JButton btnNewButton = new JButton("Logar");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (checkLogin(txtLogin.getText(), new String (txtSenha.getPassword()))) {
					
					JOptionPane.showMessageDialog(contentPane, "Logado com sucesso!");
					
				
				} else 
					
					JOptionPane.showMessageDialog(contentPane, "Dados inválidos!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton.setBounds(167, 164, 89, 23);
		contentPane.add(btnNewButton);
	}
	
	public boolean checkLogin(String login, String senha) {
		return login.equals("admin") && senha.equals("swordfish");
	}
}


