package TelaFornecedor;

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

public class TelaFornecedor extends JFrame {

	JLabel title = new JLabel("Cadastro de Fornecedores");

	JLabel lblNomeRazao = new JLabel("Nome/Razão");
	JTextField txtNomeRazao = new JTextField();
	JLabel lblCpfCnpj = new JLabel("CPF/CNPJ");
	JTextField txtCpfCnpj = new JTextField();
	JLabel lblRg = new JLabel("RG");
	JTextField txtRg = new JTextField();
	JLabel lblEstado = new JLabel("Estado");
	String estados[] = { "SP", "RJ", "MG", "Al", "BA", "SC" };
	JComboBox cmbEstado = new JComboBox(estados);
	JLabel lblCep = new JLabel("CEP");
	JTextField txtCep = new JTextField();
	JButton btnBuscarCep = new JButton("Buscar CEP");
	JLabel lblEndereco = new JLabel("Rua");
	JTextField txtEndereco = new JTextField();
	JLabel lblComplemento = new JLabel("Complemento");
	JTextField txtComplemento = new JTextField();
	JLabel lblBairro = new JLabel("Bairro");
	JTextField txtBairro = new JTextField();
	JLabel lblEmail = new JLabel("E-mail");
	JTextField txtEmail = new JTextField();
	JLabel lblTelefone = new JLabel("Telefone");
	JTextField txtTelefone = new JTextField();
	JLabel lblInformacoesAdicionais = new JLabel("Informacões adicionais");
	JTextArea areaInformacoesAdicionais = new JTextArea();
	JButton btnSalvar = new JButton("Salvar");
	JButton btnLimpar = new JButton("Limpar");
	JButton btnVoltar = new JButton("Voltar");

	public TelaFornecedor() {

		Container c = getContentPane();
		c.setBackground(new Color(33, 72, 82));
		setLayout(null);
		setResizable(false);
		setVisible(true);
		setSize(1000, 700);
		setTitle("Fornecedores");

		c.add(title);
		c.add(lblNomeRazao);
		c.add(txtNomeRazao);
		c.add(lblCpfCnpj);
		c.add(txtCpfCnpj);
		c.add(lblRg);
		c.add(txtRg);
		c.add(lblEstado);
		c.add(cmbEstado);
		c.add(lblCep);
		c.add(txtCep);
		c.add(btnBuscarCep);
		c.add(lblEndereco);
		c.add(txtEndereco);
		c.add(lblComplemento);
		c.add(txtComplemento);
		c.add(lblBairro);
		c.add(txtBairro);
		c.add(lblEmail);
		c.add(txtEmail);
		c.add(lblTelefone);
		c.add(txtTelefone);
		c.add(lblInformacoesAdicionais);
		c.add(areaInformacoesAdicionais);
		c.add(btnSalvar);
		c.add(btnLimpar);
		c.add(btnVoltar);

		title.setBounds(200, 30, 700, 50);
		lblNomeRazao.setBounds(150, 110, 100, 30);
		txtNomeRazao.setBounds(150, 140, 300, 30);
		lblCpfCnpj.setBounds(150, 180, 100, 30);
		txtCpfCnpj.setBounds(150, 210, 300, 30);
		lblRg.setBounds(150, 250, 100, 30);
		txtRg.setBounds(150, 280, 300, 30);
		lblEstado.setBounds(550, 110, 100, 30);
		cmbEstado.setBounds(550, 140, 150, 30);
		lblCep.setBounds(550, 180, 100, 30);
		txtCep.setBounds(550, 210, 150, 30);
		btnBuscarCep.setBounds(730, 210, 120, 30);
		lblEndereco.setBounds(550, 250, 100, 30);
		txtEndereco.setBounds(550, 280, 300, 30);
		lblComplemento.setBounds(550, 320, 100, 30);
		txtComplemento.setBounds(550, 350, 300, 30);
		lblBairro.setBounds(550, 390, 100, 30);
		txtBairro.setBounds(550, 420, 300, 30);
		lblEmail.setBounds(150, 320, 100, 30);
		txtEmail.setBounds(150, 350, 300, 30);
		lblTelefone.setBounds(150, 390, 100, 30);
		txtTelefone.setBounds(150, 420, 300, 30);
		lblInformacoesAdicionais.setBounds(150, 460, 200, 30);
		areaInformacoesAdicionais.setBounds(150, 490, 550, 110);
		btnSalvar.setBounds(730, 490, 100, 30);
		btnLimpar.setBounds(730, 530, 100, 30);
		btnVoltar.setBounds(730, 570, 100, 30);

		ArrayList<JLabel> labels = new ArrayList<JLabel>();

		labels.add(lblNomeRazao);
		labels.add(lblCpfCnpj);
		labels.add(lblRg);
		labels.add(lblEstado);
		labels.add(lblCep);
		labels.add(lblEndereco);
		labels.add(lblComplemento);
		labels.add(lblBairro);
		labels.add(lblEmail);
		labels.add(lblTelefone);
		labels.add(lblInformacoesAdicionais);

		ArrayList<JTextField> texts = new ArrayList<JTextField>();

		texts.add(txtNomeRazao);
		texts.add(txtCpfCnpj);
		texts.add(txtRg);
		texts.add(txtCep);
		texts.add(txtComplemento);
		texts.add(txtEndereco);
		texts.add(txtBairro);
		texts.add(txtEmail);
		texts.add(txtTelefone);

		for (JLabel item : labels) {
			item.setFont(new Font("Roboto", Font.BOLD, 14));
			item.setForeground(new Color(74, 168, 134));
		}

		for (JTextField item : texts) {
			item.setFont(new Font("Roboto", Font.BOLD, 15));
			item.setForeground(new Color(47, 71, 60));
			item.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
		}

		title.setFont(new Font("Roboto", Font.BOLD, 50));
		title.setForeground(new Color(74, 168, 134));

		cmbEstado.setFont(new Font("Roboto", Font.BOLD, 15));
		areaInformacoesAdicionais.setFont(new Font("Roboto", Font.BOLD, 15));

		cmbEstado.setForeground(new Color(47, 71, 60));
		areaInformacoesAdicionais.setForeground(new Color(47, 71, 60));

		ArrayList<JButton> buttons = new ArrayList<JButton>();

		buttons.add(btnLimpar);
		buttons.add(btnBuscarCep);
		buttons.add(btnSalvar);
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
					lblNomeRazao.requestFocus();
				}
			});
		}

		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (JTextField item : texts) {
					item.setText("");
				}
				areaInformacoesAdicionais.setText("");
			}
		});

		areaInformacoesAdicionais.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
		areaInformacoesAdicionais.setLineWrap(true);
		areaInformacoesAdicionais.setWrapStyleWord(true);
	}

}
