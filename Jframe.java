package Virtual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class PantallitaMatricula extends JFrame implements ActionListener {
	private static final long seriaVersion = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JLabel lblNewLabel;
	private JLabel lblNombre;
	private JLabel lblCurso;
	private JComboBox cmbCurso;
	private JButton btnEnviar;
	private JLabel lblBeca;
	private JRadioButton rdbtnSi;
	private JRadioButton rdbtnNo;
	private JTextArea textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallitaMatricula frame = new PantallitaMatricula();
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
	public PantallitaMatricula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textNombre = new JTextField();
		textNombre.setBounds(172, 26, 278, 29);
		contentPane.add(textNombre);
		textNombre.setColumns(10);

		lblNewLabel = new JLabel("Ingresa nombre");
		lblNewLabel.setBounds(51, 35, 57, 0);
		contentPane.add(lblNewLabel);

		lblNombre = new JLabel("Ingrese Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(61, 33, 117, 13);
		contentPane.add(lblNombre);

		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCurso.setBounds(117, 68, 45, 13);
		contentPane.add(lblCurso);

		cmbCurso = new JComboBox();
		cmbCurso.setModel(new DefaultComboBoxModel(new String[] { "Introducción Algoritmia",
				"Tecnología de la información ", "Gestion Empresarial", "Arquitectura de Entornos web " }));
		cmbCurso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cmbCurso.setBounds(172, 60, 278, 29);
		contentPane.add(cmbCurso);

		btnEnviar = new JButton("Matricular");
		btnEnviar.addActionListener(this);
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEnviar.setHorizontalAlignment(SwingConstants.LEADING);
		btnEnviar.setBounds(365, 155, 85, 21);
		contentPane.add(btnEnviar);

		lblBeca = new JLabel("¿Tienes beca?");
		lblBeca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBeca.setBounds(81, 118, 81, 13);
		contentPane.add(lblBeca);

		rdbtnSi = new JRadioButton("Si");
		rdbtnSi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnSi.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSi.setBounds(173, 114, 103, 21);
		contentPane.add(rdbtnSi);

		rdbtnNo = new JRadioButton("No");
		rdbtnNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNo.setHorizontalAlignment(SwingConstants.TRAILING);
		rdbtnNo.setBounds(248, 114, 103, 21);
		contentPane.add(rdbtnNo);

		ButtonGroup grupo = new ButtonGroup(); // control-espacio para el ButtonGroup
		grupo.add(rdbtnSi);
		grupo.add(rdbtnNo);

		textResultado = new JTextArea();
		textResultado.setBounds(62, 219, 399, 150);
		contentPane.add(textResultado);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnviar) {
			actionPerformedBtnEnviar(e);
		}
	}

	protected void actionPerformedBtnEnviar(ActionEvent e) {
		String nombre = textNombre.getText();
		String curso = (String) cmbCurso.getSelectedItem();
		boolean tieneBeca = false;
		if (rdbtnSi.isSelected()) {
			tieneBeca = true;
		} else if (rdbtnNo.isSelected()) {
			tieneBeca = false;
		}

		textResultado.append("		Matricula				\n");
		textResultado.append("Alumno: " + nombre + "\n");
		textResultado.append("Curso: " + curso + "\n");
		textResultado.append("Beca: " + tieneBeca + "\n");
		System.out.println("El nombre del usuario es: " + nombre);
		System.out.println("El curso seleccionado es: " + curso);
		System.out.println("El Usuario es becado: " + tieneBeca);
		System.out.println("El usuario hizo clic aqui!");
	}
}
