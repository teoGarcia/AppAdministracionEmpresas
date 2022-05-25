package CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class ImprimirLiquidacion extends JFrame implements Printable{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImprimirLiquidacion frame = new ImprimirLiquidacion();
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
	public ImprimirLiquidacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 584, 695);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MI PRIMERA IMPRESION");
		lblNewLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 23));
		lblNewLabel.setBounds(26, 100, 523, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FINAL DE LA HOJA");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(288, 616, 296, 57);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Imprimir");
		btnNewButton.setBounds(395, 706, 189, 44);
		contentPane.add(btnNewButton);
	}
	
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		if(pageIndex == 0) {
			return PAGE_EXISTS;	
			
		}else {
			return NO_SUCH_PAGE;
			
		}
		
	}
}
