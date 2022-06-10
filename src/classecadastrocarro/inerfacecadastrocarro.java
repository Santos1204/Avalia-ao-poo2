package classecadastrocarro;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import classes.carro;

public class inerfacecadastrocarro extends JFrame {

	private JPanel contentPane;
	private JTextField textMarca;
	private JTextField textModelo;
	private JTextField textPlaca;
	private JTextField textNome;
	private JTextField textTelefone;
	private JTextField textPesquisa;
	public carro Plaquita;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inerfacecadastrocarro frame = new inerfacecadastrocarro();
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
	public inerfacecadastrocarro() {
		carro P = new carro();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel JLMarca = new JLabel("Marca :");
		JLMarca.setFont(new Font("GodOfWar", Font.PLAIN, 11));
		
		JLabel JLModelo = new JLabel("Modelo :");
		JLModelo.setFont(new Font("GodOfWar", Font.PLAIN, 11));
		
		JLabel JLPlaca = new JLabel("Placa :");
		JLPlaca.setFont(new Font("GodOfWar", Font.PLAIN, 11));
		
		JLabel JLNome = new JLabel("Nome :");
		JLNome.setFont(new Font("GodOfWar", Font.PLAIN, 11));
		
		JLabel JLTelefone = new JLabel("Telefone :");
		JLTelefone.setFont(new Font("GodOfWar", Font.PLAIN, 11));
		
		textMarca = new JTextField();
		textMarca.setColumns(10);
		
		textModelo = new JTextField();
		textModelo.setColumns(10);
		
		textPlaca = new JTextField();
		textPlaca.setColumns(10);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setText("(  )     -    ");
		textTelefone.setColumns(10);
		
		JButton JBInserir = new JButton("Inserir");
		JBInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Plaquita = inserir (P);
				
			}
		});
		JBInserir.setForeground(Color.GREEN);
		JBInserir.setFont(new Font("GodOfWar", Font.PLAIN, 11));
		
		JButton JBPesquisar = new JButton("Pesquisar ");
		JBPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			TrataEventoBotaoPesquisar (P);
			}
		});
		
		textPesquisa = new JTextField();
		textPesquisa.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(JLMarca, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(JLModelo)
							.addGap(18)
							.addComponent(textModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(JLPlaca)
							.addGap(18)
							.addComponent(textPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(JLNome)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(JLTelefone)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(JBInserir)
							.addGap(103)
							.addComponent(JBPesquisar)
							.addGap(18)
							.addComponent(textPesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(JLMarca, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(JLModelo)
						.addComponent(textModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(JLPlaca)
						.addComponent(textPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(JLNome)
						.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(JLTelefone)
						.addComponent(textTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(JBInserir, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(JBPesquisar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
public carro inserir(carro P) {
	P.setMarca(textMarca.getText());
	P.setModelo(textModelo.getText());
	P.setNome(textNome.getText());		
	P.setTelefone(textTelefone.getText());
	P.setPlaca(textPlaca.getText());
	
	
	textMarca.setText("");
	textModelo.setText("");
	textTelefone.setText("");
	textPlaca.setText("");
	textNome.setText("");
	

	return P;

	}
public void TrataEventoBotaoPesquisar (carro P) {
	System.out.println(P.getPlaca()); 
	
	if(textPesquisa.getText().equals(P.getPlaca()))
	{
	textPlaca.setText("");
	textNome.setText("");
	textMarca.setText("");
	textModelo.setText("");
	textTelefone.setText("");
	
		
	}

	else
		{
JOptionPane.showMessageDialog(this, "N pesquisado" );
}
	
	


}
//if(getteconfPlaca.gettext().equals(P.getPlaca()){

}






