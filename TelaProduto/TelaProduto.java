package TelaProduto;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaProduto extends JFrame {

	JLabel title = new JLabel("Cadastro de Produtos");

	JLabel lblDescricao = new JLabel("Descrição");
	JTextField txtDescricao = new JTextField();
	JLabel lblEspecie = new JLabel("Espécie");
	JTextField txtEspecie = new JTextField();
	JLabel lblUnidadeEntrada = new JLabel("Unidade Entrada");
	JTextField txtUnidadeEntrada = new JTextField();
	JLabel lblSubdivisivel = new JLabel("Subdivisivel?");
	String subdivisivel[] = { "SIM", "NÂO" };
	JComboBox cmbSubdivisivel = new JComboBox(subdivisivel);
	JLabel lblUnidadeSaida = new JLabel("Unidade Saida");
	JTextField txtUnidadeSaida = new JTextField();
	JLabel lblQtSubdivisao = new JLabel("Qt. Subdivisão");
	JTextField txtQtSubdivisao = new JTextField();
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnLimpar = new JButton("Limpar");
	JButton btnVoltar = new JButton("Voltar");

	public TelaProduto() {
		Container c = getContentPane();
		c.setBackground(new Color(33, 72, 82));
		setLayout(null);
		setResizable(false);
		setVisible(true);
		setSize(900, 500);
		setTitle("Cadastro de Produtos");

		c.add(title);
		c.add(lblDescricao);
		c.add(txtDescricao);
		c.add(lblEspecie);
		c.add(txtEspecie);
		c.add(lblUnidadeEntrada);
		c.add(txtUnidadeEntrada);
		c.add(lblSubdivisivel);
		c.add(cmbSubdivisivel);
		c.add(lblUnidadeSaida);
		c.add(txtUnidadeSaida);
		c.add(lblQtSubdivisao);
		c.add(txtQtSubdivisao);
		c.add(btnCadastrar);
		c.add(btnLimpar);
		c.add(btnVoltar);

		cmbSubdivisivel.setSelectedItem(0);
		title.setBounds(200, 30, 700, 50);
		lblDescricao.setBounds(100, 100, 300, 50);
		txtDescricao.setBounds(100, 140, 300, 30);
		lblEspecie.setBounds(500, 100, 300, 50);
		txtEspecie.setBounds(500, 140, 300, 30);
		lblUnidadeEntrada.setBounds(100, 180, 300, 50);
		txtUnidadeEntrada.setBounds(100, 220, 300, 30);
		lblUnidadeSaida.setBounds(500, 180, 300, 50);
		txtUnidadeSaida.setBounds(500, 220, 300, 30);
		lblSubdivisivel.setBounds(100, 260, 300, 50);
		cmbSubdivisivel.setBounds(100, 300, 300, 30);
		lblQtSubdivisao.setBounds(500, 260, 300, 50);
		txtQtSubdivisao.setBounds(500, 300, 300, 30);
		btnCadastrar.setBounds(220, 380, 100, 50);
		btnLimpar.setBounds(370, 380, 100, 50);
		btnVoltar.setBounds(520, 380, 100, 50);

		title.setFont(new Font("Roboto", Font.BOLD, 50));
		title.setForeground(new Color(74, 168, 134));

		ArrayList<JLabel> labels = new ArrayList<JLabel>();

		labels.add(lblDescricao);
		labels.add(lblEspecie);
		labels.add(lblUnidadeEntrada);
		labels.add(lblUnidadeSaida);
		labels.add(lblSubdivisivel);
		labels.add(lblQtSubdivisao);

		for (JLabel item : labels) {
			item.setFont(new Font("Roboto", Font.BOLD, 14));
			item.setForeground(new Color(74, 168, 134));
		}

		ArrayList<JTextField> texts = new ArrayList<JTextField>();

		texts.add(txtDescricao);
		texts.add(txtEspecie);
		texts.add(txtUnidadeEntrada);
		texts.add(txtUnidadeSaida);
		texts.add(txtQtSubdivisao);

		for (JTextField item : texts) {
			item.setFont(new Font("Roboto", Font.BOLD, 15));
			item.setForeground(new Color(47, 71, 60));
			item.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
		}

		cmbSubdivisivel.setFont(new Font("Roboto", Font.BOLD, 15));
		ArrayList<JButton> buttons = new ArrayList<JButton>();

		buttons.add(btnCadastrar);
		buttons.add(btnLimpar);
		buttons.add(btnVoltar);

		for (JButton item : buttons) {

			item.setForeground(new Color(255, 255, 255));
			item.setBackground(new Color(74, 168, 134));
			item.setBorder(null);
			item.setFont(new Font("Roboto", Font.BOLD, 15));

			item.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					setCursor(Cursor.HAND_CURSOR);
					item.setBorder(null);
					item.setBackground(new Color(63, 153, 120));
				}

				public void mouseExited(MouseEvent e) {
					setCursor(Cursor.DEFAULT_CURSOR);
					item.setBackground(new Color(74, 168, 134));
					lblDescricao.requestFocus();
				}
			});
		}

		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (JTextField item : texts) {
					item.setText("");

				}
			}
		});

	}
}
