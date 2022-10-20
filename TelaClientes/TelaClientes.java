package TelaClientes;

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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaClientes extends JFrame {

	JLabel title = new JLabel("Cadastro de Cientes");

	JLabel lblNome = new JLabel("Nome");
	JTextField txtNome = new JTextField();
	JLabel lblCpf = new JLabel("CPF");
	JTextField txtCpf = new JTextField();
	JLabel lblEndereco = new JLabel("Endereço");
	JTextField txtEndereco = new JTextField();
	JLabel lblBairro = new JLabel("Bairro");
	JTextField txtBairro = new JTextField();
	JLabel lblCidade = new JLabel("Cidade");
	JTextField txtCidade = new JTextField();
	JLabel lblEstado = new JLabel("Estado");
	String estados[] = { "SP", "RJ", "MG", "SA", "BA", "SC" };
	JComboBox cmbEstado = new JComboBox(estados);
	JLabel lblCep = new JLabel("Cep");
	JTextField txtCep = new JTextField();
	JLabel lblTelefone = new JLabel("Telefone");
	JTextField txtTelefone = new JTextField();
	JLabel lblEmail = new JLabel("Email");
	JTextField txtEmail = new JTextField();
	JLabel lblInformacoesAdicionais = new JLabel("Informações adicionais");
	JTextArea areaInformaçõesAdicionais = new JTextArea();
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnLimpar = new JButton("Limpar");
	JButton btnAlterar = new JButton("Alterar");
	JButton btnExcluir = new JButton("Excluir");
	JButton btnVoltar = new JButton("Voltar");

	public TelaClientes() {
		Container c = getContentPane();
		c.setBackground(new Color(33, 72, 82));
		setLayout(null);
		setResizable(false);
		setVisible(true);
		setSize(1000, 700);
		setTitle("Fornecedores");

		c.add(title);
		c.add(lblNome);
		c.add(txtNome);
		c.add(lblCpf);
		c.add(txtCpf);
		c.add(lblEndereco);
		c.add(txtEndereco);
		c.add(lblBairro);
		c.add(txtBairro);
		c.add(lblCidade);
		c.add(txtCidade);
		c.add(lblEstado);
		c.add(cmbEstado);
		c.add(lblCep);
		c.add(txtCep);
		c.add(lblTelefone);
		c.add(txtTelefone);
		c.add(lblEmail);
		c.add(txtEmail);
		c.add(lblInformacoesAdicionais);
		c.add(areaInformaçõesAdicionais);
		c.add(btnCadastrar);
		c.add(btnAlterar);
		c.add(btnLimpar);
		c.add(btnExcluir);
		c.add(btnVoltar);

		title.setBounds(200, 20, 500, 50);
		lblNome.setBounds(100, 80, 200, 50);
		txtNome.setBounds(100, 120, 300, 30);
		lblCpf.setBounds(500, 80, 300, 50);
		txtCpf.setBounds(500, 120, 300, 30);
		lblEndereco.setBounds(100, 160, 200, 50);
		txtEndereco.setBounds(100, 200, 300, 30);
		lblBairro.setBounds(500, 160, 300, 50);
		txtBairro.setBounds(500, 200, 300, 30);
		lblCidade.setBounds(100, 240, 200, 50);
		txtCidade.setBounds(100, 280, 300, 30);
		lblEstado.setBounds(500, 240, 100, 50);
		cmbEstado.setBounds(500, 280, 130, 30);
		lblCep.setBounds(670, 240, 100, 50);
		txtCep.setBounds(670, 280, 130, 30);
		lblTelefone.setBounds(100, 320, 200, 50);
		txtTelefone.setBounds(100, 360, 300, 30);
		lblEmail.setBounds(500, 320, 100, 50);
		txtEmail.setBounds(500, 360, 300, 30);
		lblInformacoesAdicionais.setBounds(100, 400, 200, 50);
		areaInformaçõesAdicionais.setBounds(100, 440, 700, 100);
		btnCadastrar.setBounds(100, 560, 100, 50);
		btnAlterar.setBounds(250, 560, 100, 50);
		btnLimpar.setBounds(400, 560, 100, 50);
		btnExcluir.setBounds(550, 560, 100, 50);
		btnVoltar.setBounds(700, 560, 100, 50);

		title.setFont(new Font("Roboto", Font.BOLD, 50));
		title.setForeground(new Color(74, 168, 134));

		ArrayList<JLabel> labels = new ArrayList<JLabel>();

		labels.add(lblNome);
		labels.add(lblCpf);
		labels.add(lblEndereco);
		labels.add(lblBairro);
		labels.add(lblCidade);
		labels.add(lblEstado);
		labels.add(lblCep);
		labels.add(lblTelefone);
		labels.add(lblEmail);
		labels.add(lblInformacoesAdicionais);

		for (JLabel item : labels) {
			item.setFont(new Font("Roboto", Font.BOLD, 14));
			item.setForeground(new Color(74, 168, 134));
		}

		ArrayList<JTextField> texts = new ArrayList<JTextField>();

		texts.add(txtNome);
		texts.add(txtCpf);
		texts.add(txtEndereco);
		texts.add(txtBairro);
		texts.add(txtCidade);
		texts.add(txtCep);
		texts.add(txtTelefone);
		texts.add(txtEmail);

		for (JTextField item : texts) {
			item.setFont(new Font("Roboto", Font.BOLD, 15));
			item.setForeground(new Color(47, 71, 60));
			item.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
		}

		areaInformaçõesAdicionais.setFont(new Font("Roboto", Font.BOLD, 15));
		areaInformaçõesAdicionais.setForeground(new Color(47, 71, 60));
		areaInformaçõesAdicionais.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
		areaInformaçõesAdicionais.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
		areaInformaçõesAdicionais.setLineWrap(true);
		areaInformaçõesAdicionais.setWrapStyleWord(true);

		ArrayList<JButton> buttons = new ArrayList<JButton>();

		buttons.add(btnAlterar);
		buttons.add(btnCadastrar);
		buttons.add(btnExcluir);
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
					lblNome.requestFocus();
				}
			});
		}

		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (JTextField item : texts) {
					item.setText("");
				}
				areaInformaçõesAdicionais.setText("");
			}
		});

	}

}
