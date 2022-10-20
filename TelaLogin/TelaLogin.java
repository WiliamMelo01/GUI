package TelaLogin;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JFrame {

	JLabel title = new JLabel("LOGIN");
	JLabel lblUsuario = new JLabel("Usuario");
	JTextField txtUsuario = new JTextField();
	JLabel lblSenha = new JLabel("Senha");
	JPasswordField pssSenha = new JPasswordField();
	JLabel lblEsqueceuSenha = new JLabel("Esqueceu sua senha?");
	JButton btnLogar = new JButton("Logar");

	public TelaLogin() {

		Container c = getContentPane();
		c.setBackground(new Color(33, 72, 82));
		setLayout(null);
		setResizable(false);
		setVisible(true);
		setSize(600, 500);
		setTitle("Login");

		c.add(title);
		c.add(lblUsuario);
		c.add(txtUsuario);
		c.add(lblSenha);
		c.add(pssSenha);
		c.add(lblEsqueceuSenha);
		c.add(btnLogar);

		title.setBounds(220, 60, 250, 40);
		lblUsuario.setBounds(150, 150, 100, 40);
		txtUsuario.setBounds(150, 190, 300, 40);
		lblSenha.setBounds(150, 230, 220, 40);
		pssSenha.setBounds(150, 270, 300, 40);
		lblEsqueceuSenha.setBounds(150, 330, 150, 30);
		btnLogar.setBounds(350, 320, 100, 50);

		title.setFont(new Font("Roboto", Font.BOLD, 50));
		lblUsuario.setFont(new Font("Roboto", Font.BOLD, 14));
		lblSenha.setFont(new Font("Roboto", Font.BOLD, 14));
		txtUsuario.setFont(new Font("Roboto", Font.BOLD, 15));
		btnLogar.setFont(new Font("Roboto", Font.BOLD, 15));
		btnLogar.setForeground(Color.WHITE);
		txtUsuario.setForeground(new Color(47, 71, 60));
		pssSenha.setForeground(new Color(47, 71, 60));
		title.setForeground(new Color(74, 168, 134));
		lblUsuario.setForeground(new Color(74, 168, 134));
		lblSenha.setForeground(new Color(74, 168, 134));
		lblEsqueceuSenha.setForeground(new Color(255, 255, 255));
		btnLogar.setBackground(new Color(74, 168, 134));
		txtUsuario.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
		pssSenha.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));

		btnLogar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.HAND_CURSOR);
				btnLogar.setBorder(null);
				btnLogar.setBackground(new Color(63, 153, 120));
			}

			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.DEFAULT_CURSOR);
				btnLogar.setBackground(new Color(74, 168, 134));
				lblUsuario.requestFocus();
			}
		});
		
		lblEsqueceuSenha.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.DEFAULT_CURSOR);
			}

		});

	}

}
