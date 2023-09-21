package agenda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Agenda extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldTelefone;
	private JTable table;
	private ArrayList<Pessoa> dados=new  ArrayList<Pessoa>();
	private int pessoaIndex=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
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
	public Agenda() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 36, 46, 14);
		contentPane.add(lblTelefone);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(94, 8, 86, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		textFieldTelefone.setBounds(94, 33, 86, 20);
		contentPane.add(textFieldTelefone);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pessoaIndex=table.rowAtPoint(e.getPoint());
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NOME", "TELEFONE"
			}
		));
		table.setBounds(10, 98, 289, 152);
		contentPane.add(table);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pessoa pessoa=new Pessoa();
				pessoa.setNome(textFieldNome.getText());
				pessoa.setTelefone(textFieldTelefone.getText());
				dados.add(pessoa);
				pessoaIndex++;
				atualizaTabela();
			}
		});
		btnAdicionar.setBounds(20, 64, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnNewButton_1_1 = new JButton("Editar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((pessoaIndex>-1)&&(pessoaIndex<dados.size())) {
					Pessoa pessoa=dados.get(pessoaIndex);
					textFieldNome.setText(pessoa.getNome());
					textFieldTelefone.setText(pessoa.getTelefone());
				}
			}
		});
		btnNewButton_1_1.setBounds(119, 64, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Excluir");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((pessoaIndex>-1)&&(pessoaIndex<dados.size())) {
						dados.remove(pessoaIndex);
				}
				atualizaTabela();
			}
		});
		btnNewButton_1_2.setBounds(218, 64, 89, 23);
		contentPane.add(btnNewButton_1_2);
	}

	protected void atualizaTabela() {
		Object[][] dadosTabela=new Object[this.dados.size()][2];
		int i=0;
		for(Pessoa pessoa:dados){
			dadosTabela[i][0]=pessoa.getNome();
			dadosTabela[i][1]=pessoa.getTelefone();
			i++;
		}
	           
		table.setModel(new DefaultTableModel(
				dadosTabela,	            
	            new String[] { "NOME", "TELEFONE"}
	      ));
		
	}
}
