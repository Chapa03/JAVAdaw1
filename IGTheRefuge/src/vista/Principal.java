package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class Principal {

	private JFrame frmTheRefuge;
	private JTextField textField;
	
	static Random rnd = new Random();
	static String [][] casilla = new String [20][20];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmTheRefuge.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static String pintarCasilla(String casilla) {
		
		return null;
	}
	
	/*
	 * Determina que casillas del mapa van a verse afectadas por una modificacion.
	 * int n es el numero de casillas que necesitaremos aleatorizar
	 * 
	 */
	public static String [] determinarAleatorios(int n) {
		int col = 0, fila = 0;
		String [] celdas = new String[n];
		for (int i = 0; i < n; i++) {
			col = rnd.nextInt(20);
		}
		for (int j = 0; j < n; j++) {
			fila = rnd.nextInt(20);
		}
		while ((col == 0 || col == 1) && (fila == 0 || fila == 1)) {
			col += rnd.nextInt(20);
			fila += rnd.nextInt(20);
		}
//		hacer un bucle para meter nuevas casillas en 
		celdas = (col < 10 ? "0" + col : "" + col) + (fila < 10 ? "0" + fila : "" + fila);
		return celdas;
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTheRefuge = new JFrame();
		frmTheRefuge.setTitle("The Refuge");
		frmTheRefuge.setResizable(false);
		frmTheRefuge.setBounds(100, 100, 900, 750);
		frmTheRefuge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTheRefuge.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorte = new JPanel();
		frmTheRefuge.getContentPane().add(panelNorte, BorderLayout.NORTH);
		panelNorte.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel centroMapa = new JPanel();
		frmTheRefuge.getContentPane().add(centroMapa, BorderLayout.CENTER);
		centroMapa.setLayout(new GridLayout(20, 20, 0, 0));
		
		JButton btn0000 = new JButton("");
		centroMapa.add(btn0000);
		btn0000.setBackground(new Color(60, 179, 113));

		JButton btn0001 = new JButton("");
		centroMapa.add(btn0001);
		btn0001.setBackground(new Color(60, 179, 113));

		JButton btn0002 = new JButton("");
		centroMapa.add(btn0002);
		btn0002.setBackground(new Color(60, 179, 113));

		JButton btn0003 = new JButton("");
		centroMapa.add(btn0003);
		btn0003.setBackground(new Color(60, 179, 113));

		JButton btn0004 = new JButton("");
		centroMapa.add(btn0004);
		btn0004.setBackground(new Color(60, 179, 113));

		JButton btn0005 = new JButton("");
		centroMapa.add(btn0005);
		btn0005.setBackground(new Color(60, 179, 113));

		JButton btn0006 = new JButton("");
		centroMapa.add(btn0006);
		btn0006.setBackground(new Color(60, 179, 113));

		JButton btn0007 = new JButton("");
		centroMapa.add(btn0007);
		btn0007.setBackground(new Color(60, 179, 113));

		JButton btn0008 = new JButton("");
		centroMapa.add(btn0008);
		btn0008.setBackground(new Color(60, 179, 113));

		JButton btn0009 = new JButton("");
		centroMapa.add(btn0009);
		btn0009.setBackground(new Color(60, 179, 113));

		JButton btn0010 = new JButton("");
		centroMapa.add(btn0010);
		btn0010.setBackground(new Color(60, 179, 113));

		JButton btn0011 = new JButton("");
		centroMapa.add(btn0011);
		btn0011.setBackground(new Color(60, 179, 113));

		JButton btn0012 = new JButton("");
		centroMapa.add(btn0012);
		btn0012.setBackground(new Color(60, 179, 113));

		JButton btn0013 = new JButton("");
		centroMapa.add(btn0013);
		btn0013.setBackground(new Color(60, 179, 113));

		JButton btn0014 = new JButton("");
		centroMapa.add(btn0014);
		btn0014.setBackground(new Color(60, 179, 113));

		JButton btn0015 = new JButton("");
		centroMapa.add(btn0015);
		btn0015.setBackground(new Color(60, 179, 113));

		JButton btn0016 = new JButton("");
		centroMapa.add(btn0016);
		btn0016.setBackground(new Color(60, 179, 113));

		JButton btn0017 = new JButton("");
		centroMapa.add(btn0017);
		btn0017.setBackground(new Color(60, 179, 113));

		JButton btn0018 = new JButton("");
		centroMapa.add(btn0018);
		btn0018.setBackground(new Color(60, 179, 113));

		JButton btn0019 = new JButton("");
		centroMapa.add(btn0019);
		btn0019.setBackground(new Color(60, 179, 113));

		JButton btn0100 = new JButton("");
		centroMapa.add(btn0100);
		btn0100.setBackground(new Color(60, 179, 113));

		JButton btn0101 = new JButton("");
		centroMapa.add(btn0101);
		btn0101.setBackground(new Color(60, 179, 113));

		JButton btn0102 = new JButton("");
		centroMapa.add(btn0102);
		btn0102.setBackground(new Color(60, 179, 113));

		JButton btn0103 = new JButton("");
		centroMapa.add(btn0103);
		btn0103.setBackground(new Color(60, 179, 113));

		JButton btn0104 = new JButton("");
		centroMapa.add(btn0104);
		btn0104.setBackground(new Color(60, 179, 113));

		JButton btn0105 = new JButton("");
		centroMapa.add(btn0105);
		btn0105.setBackground(new Color(60, 179, 113));

		JButton btn0106 = new JButton("");
		centroMapa.add(btn0106);
		btn0106.setBackground(new Color(60, 179, 113));

		JButton btn0107 = new JButton("");
		centroMapa.add(btn0107);
		btn0107.setBackground(new Color(60, 179, 113));

		JButton btn0108 = new JButton("");
		centroMapa.add(btn0108);
		btn0108.setBackground(new Color(60, 179, 113));

		JButton btn0109 = new JButton("");
		centroMapa.add(btn0109);
		btn0109.setBackground(new Color(60, 179, 113));

		JButton btn0110 = new JButton("");
		centroMapa.add(btn0110);
		btn0110.setBackground(new Color(60, 179, 113));

		JButton btn0111 = new JButton("");
		centroMapa.add(btn0111);
		btn0111.setBackground(new Color(60, 179, 113));

		JButton btn0112 = new JButton("");
		centroMapa.add(btn0112);
		btn0112.setBackground(new Color(60, 179, 113));

		JButton btn0113 = new JButton("");
		centroMapa.add(btn0113);
		btn0113.setBackground(new Color(60, 179, 113));

		JButton btn0114 = new JButton("");
		centroMapa.add(btn0114);
		btn0114.setBackground(new Color(60, 179, 113));

		JButton btn0115 = new JButton("");
		centroMapa.add(btn0115);
		btn0115.setBackground(new Color(60, 179, 113));

		JButton btn0116 = new JButton("");
		centroMapa.add(btn0116);
		btn0116.setBackground(new Color(60, 179, 113));

		JButton btn0117 = new JButton("");
		centroMapa.add(btn0117);
		btn0117.setBackground(new Color(60, 179, 113));

		JButton btn0118 = new JButton("");
		centroMapa.add(btn0118);
		btn0118.setBackground(new Color(60, 179, 113));

		JButton btn0119 = new JButton("");
		centroMapa.add(btn0119);
		btn0119.setBackground(new Color(60, 179, 113));

		JButton btn0200 = new JButton("");
		centroMapa.add(btn0200);
		btn0200.setBackground(new Color(60, 179, 113));

		JButton btn0201 = new JButton("");
		centroMapa.add(btn0201);
		btn0201.setBackground(new Color(60, 179, 113));

		JButton btn0202 = new JButton("");
		centroMapa.add(btn0202);
		btn0202.setBackground(new Color(60, 179, 113));

		JButton btn0203 = new JButton("");
		centroMapa.add(btn0203);
		btn0203.setBackground(new Color(60, 179, 113));

		JButton btn0204 = new JButton("");
		centroMapa.add(btn0204);
		btn0204.setBackground(new Color(60, 179, 113));

		JButton btn0205 = new JButton("");
		centroMapa.add(btn0205);
		btn0205.setBackground(new Color(60, 179, 113));

		JButton btn0206 = new JButton("");
		centroMapa.add(btn0206);
		btn0206.setBackground(new Color(60, 179, 113));

		JButton btn0207 = new JButton("");
		centroMapa.add(btn0207);
		btn0207.setBackground(new Color(60, 179, 113));

		JButton btn0208 = new JButton("");
		centroMapa.add(btn0208);
		btn0208.setBackground(new Color(60, 179, 113));

		JButton btn0209 = new JButton("");
		centroMapa.add(btn0209);
		btn0209.setBackground(new Color(60, 179, 113));

		JButton btn0210 = new JButton("");
		centroMapa.add(btn0210);
		btn0210.setBackground(new Color(60, 179, 113));

		JButton btn0211 = new JButton("");
		centroMapa.add(btn0211);
		btn0211.setBackground(new Color(60, 179, 113));

		JButton btn0212 = new JButton("");
		centroMapa.add(btn0212);
		btn0212.setBackground(new Color(60, 179, 113));

		JButton btn0213 = new JButton("");
		centroMapa.add(btn0213);
		btn0213.setBackground(new Color(60, 179, 113));

		JButton btn0214 = new JButton("");
		centroMapa.add(btn0214);
		btn0214.setBackground(new Color(60, 179, 113));

		JButton btn0215 = new JButton("");
		centroMapa.add(btn0215);
		btn0215.setBackground(new Color(60, 179, 113));

		JButton btn0216 = new JButton("");
		centroMapa.add(btn0216);
		btn0216.setBackground(new Color(60, 179, 113));

		JButton btn0217 = new JButton("");
		centroMapa.add(btn0217);
		btn0217.setBackground(new Color(60, 179, 113));

		JButton btn0218 = new JButton("");
		centroMapa.add(btn0218);
		btn0218.setBackground(new Color(60, 179, 113));

		JButton btn0219 = new JButton("");
		centroMapa.add(btn0219);
		btn0219.setBackground(new Color(60, 179, 113));

		JButton btn0300 = new JButton("");
		centroMapa.add(btn0300);
		btn0300.setBackground(new Color(60, 179, 113));

		JButton btn0301 = new JButton("");
		centroMapa.add(btn0301);
		btn0301.setBackground(new Color(60, 179, 113));

		JButton btn0302 = new JButton("");
		centroMapa.add(btn0302);
		btn0302.setBackground(new Color(60, 179, 113));

		JButton btn0303 = new JButton("");
		centroMapa.add(btn0303);
		btn0303.setBackground(new Color(60, 179, 113));

		JButton btn0304 = new JButton("");
		centroMapa.add(btn0304);
		btn0304.setBackground(new Color(60, 179, 113));

		JButton btn0305 = new JButton("");
		centroMapa.add(btn0305);
		btn0305.setBackground(new Color(60, 179, 113));

		JButton btn0306 = new JButton("");
		centroMapa.add(btn0306);
		btn0306.setBackground(new Color(60, 179, 113));

		JButton btn0307 = new JButton("");
		centroMapa.add(btn0307);
		btn0307.setBackground(new Color(60, 179, 113));

		JButton btn0308 = new JButton("");
		centroMapa.add(btn0308);
		btn0308.setBackground(new Color(60, 179, 113));

		JButton btn0309 = new JButton("");
		centroMapa.add(btn0309);
		btn0309.setBackground(new Color(60, 179, 113));

		JButton btn0310 = new JButton("");
		centroMapa.add(btn0310);
		btn0310.setBackground(new Color(60, 179, 113));

		JButton btn0311 = new JButton("");
		centroMapa.add(btn0311);
		btn0311.setBackground(new Color(60, 179, 113));

		JButton btn0312 = new JButton("");
		centroMapa.add(btn0312);
		btn0312.setBackground(new Color(60, 179, 113));

		JButton btn0313 = new JButton("");
		centroMapa.add(btn0313);
		btn0313.setBackground(new Color(60, 179, 113));

		JButton btn0314 = new JButton("");
		centroMapa.add(btn0314);
		btn0314.setBackground(new Color(60, 179, 113));

		JButton btn0315 = new JButton("");
		centroMapa.add(btn0315);
		btn0315.setBackground(new Color(60, 179, 113));

		JButton btn0316 = new JButton("");
		centroMapa.add(btn0316);
		btn0316.setBackground(new Color(60, 179, 113));

		JButton btn0317 = new JButton("");
		centroMapa.add(btn0317);
		btn0317.setBackground(new Color(60, 179, 113));

		JButton btn0318 = new JButton("");
		centroMapa.add(btn0318);
		btn0318.setBackground(new Color(60, 179, 113));

		JButton btn0319 = new JButton("");
		centroMapa.add(btn0319);
		btn0319.setBackground(new Color(60, 179, 113));

		JButton btn0400 = new JButton("");
		centroMapa.add(btn0400);
		btn0400.setBackground(new Color(60, 179, 113));

		JButton btn0401 = new JButton("");
		centroMapa.add(btn0401);
		btn0401.setBackground(new Color(60, 179, 113));

		JButton btn0402 = new JButton("");
		centroMapa.add(btn0402);
		btn0402.setBackground(new Color(60, 179, 113));

		JButton btn0403 = new JButton("");
		centroMapa.add(btn0403);
		btn0403.setBackground(new Color(60, 179, 113));

		JButton btn0404 = new JButton("");
		centroMapa.add(btn0404);
		btn0404.setBackground(new Color(60, 179, 113));

		JButton btn0405 = new JButton("");
		centroMapa.add(btn0405);
		btn0405.setBackground(new Color(60, 179, 113));

		JButton btn0406 = new JButton("");
		centroMapa.add(btn0406);
		btn0406.setBackground(new Color(60, 179, 113));

		JButton btn0407 = new JButton("");
		centroMapa.add(btn0407);
		btn0407.setBackground(new Color(60, 179, 113));

		JButton btn0408 = new JButton("");
		centroMapa.add(btn0408);
		btn0408.setBackground(new Color(60, 179, 113));

		JButton btn0409 = new JButton("");
		centroMapa.add(btn0409);
		btn0409.setBackground(new Color(60, 179, 113));

		JButton btn0410 = new JButton("");
		centroMapa.add(btn0410);
		btn0410.setBackground(new Color(60, 179, 113));

		JButton btn0411 = new JButton("");
		centroMapa.add(btn0411);
		btn0411.setBackground(new Color(60, 179, 113));

		JButton btn0412 = new JButton("");
		centroMapa.add(btn0412);
		btn0412.setBackground(new Color(60, 179, 113));

		JButton btn0413 = new JButton("");
		centroMapa.add(btn0413);
		btn0413.setBackground(new Color(60, 179, 113));

		JButton btn0414 = new JButton("");
		centroMapa.add(btn0414);
		btn0414.setBackground(new Color(60, 179, 113));

		JButton btn0415 = new JButton("");
		centroMapa.add(btn0415);
		btn0415.setBackground(new Color(60, 179, 113));

		JButton btn0416 = new JButton("");
		centroMapa.add(btn0416);
		btn0416.setBackground(new Color(60, 179, 113));

		JButton btn0417 = new JButton("");
		centroMapa.add(btn0417);
		btn0417.setBackground(new Color(60, 179, 113));

		JButton btn0418 = new JButton("");
		centroMapa.add(btn0418);
		btn0418.setBackground(new Color(60, 179, 113));

		JButton btn0419 = new JButton("");
		centroMapa.add(btn0419);
		btn0419.setBackground(new Color(60, 179, 113));

		JButton btn0500 = new JButton("");
		centroMapa.add(btn0500);
		btn0500.setBackground(new Color(60, 179, 113));

		JButton btn0501 = new JButton("");
		centroMapa.add(btn0501);
		btn0501.setBackground(new Color(60, 179, 113));

		JButton btn0502 = new JButton("");
		centroMapa.add(btn0502);
		btn0502.setBackground(new Color(60, 179, 113));

		JButton btn0503 = new JButton("");
		centroMapa.add(btn0503);
		btn0503.setBackground(new Color(60, 179, 113));

		JButton btn0504 = new JButton("");
		centroMapa.add(btn0504);
		btn0504.setBackground(new Color(60, 179, 113));

		JButton btn0505 = new JButton("");
		centroMapa.add(btn0505);
		btn0505.setBackground(new Color(60, 179, 113));

		JButton btn0506 = new JButton("");
		centroMapa.add(btn0506);
		btn0506.setBackground(new Color(60, 179, 113));

		JButton btn0507 = new JButton("");
		centroMapa.add(btn0507);
		btn0507.setBackground(new Color(60, 179, 113));

		JButton btn0508 = new JButton("");
		centroMapa.add(btn0508);
		btn0508.setBackground(new Color(60, 179, 113));

		JButton btn0509 = new JButton("");
		centroMapa.add(btn0509);
		btn0509.setBackground(new Color(60, 179, 113));

		JButton btn0510 = new JButton("");
		centroMapa.add(btn0510);
		btn0510.setBackground(new Color(60, 179, 113));

		JButton btn0511 = new JButton("");
		centroMapa.add(btn0511);
		btn0511.setBackground(new Color(60, 179, 113));

		JButton btn0512 = new JButton("");
		centroMapa.add(btn0512);
		btn0512.setBackground(new Color(60, 179, 113));

		JButton btn0513 = new JButton("");
		centroMapa.add(btn0513);
		btn0513.setBackground(new Color(60, 179, 113));

		JButton btn0514 = new JButton("");
		centroMapa.add(btn0514);
		btn0514.setBackground(new Color(60, 179, 113));

		JButton btn0515 = new JButton("");
		centroMapa.add(btn0515);
		btn0515.setBackground(new Color(60, 179, 113));

		JButton btn0516 = new JButton("");
		centroMapa.add(btn0516);
		btn0516.setBackground(new Color(60, 179, 113));

		JButton btn0517 = new JButton("");
		centroMapa.add(btn0517);
		btn0517.setBackground(new Color(60, 179, 113));

		JButton btn0518 = new JButton("");
		centroMapa.add(btn0518);
		btn0518.setBackground(new Color(60, 179, 113));

		JButton btn0519 = new JButton("");
		centroMapa.add(btn0519);
		btn0519.setBackground(new Color(60, 179, 113));

		JButton btn0600 = new JButton("");
		centroMapa.add(btn0600);
		btn0600.setBackground(new Color(60, 179, 113));

		JButton btn0601 = new JButton("");
		centroMapa.add(btn0601);
		btn0601.setBackground(new Color(60, 179, 113));

		JButton btn0602 = new JButton("");
		centroMapa.add(btn0602);
		btn0602.setBackground(new Color(60, 179, 113));

		JButton btn0603 = new JButton("");
		centroMapa.add(btn0603);
		btn0603.setBackground(new Color(60, 179, 113));

		JButton btn0604 = new JButton("");
		centroMapa.add(btn0604);
		btn0604.setBackground(new Color(60, 179, 113));

		JButton btn0605 = new JButton("");
		centroMapa.add(btn0605);
		btn0605.setBackground(new Color(60, 179, 113));

		JButton btn0606 = new JButton("");
		centroMapa.add(btn0606);
		btn0606.setBackground(new Color(60, 179, 113));

		JButton btn0607 = new JButton("");
		centroMapa.add(btn0607);
		btn0607.setBackground(new Color(60, 179, 113));

		JButton btn0608 = new JButton("");
		centroMapa.add(btn0608);
		btn0608.setBackground(new Color(60, 179, 113));

		JButton btn0609 = new JButton("");
		centroMapa.add(btn0609);
		btn0609.setBackground(new Color(60, 179, 113));

		JButton btn0610 = new JButton("");
		centroMapa.add(btn0610);
		btn0610.setBackground(new Color(60, 179, 113));

		JButton btn0611 = new JButton("");
		centroMapa.add(btn0611);
		btn0611.setBackground(new Color(60, 179, 113));

		JButton btn0612 = new JButton("");
		centroMapa.add(btn0612);
		btn0612.setBackground(new Color(60, 179, 113));

		JButton btn0613 = new JButton("");
		centroMapa.add(btn0613);
		btn0613.setBackground(new Color(60, 179, 113));

		JButton btn0614 = new JButton("");
		centroMapa.add(btn0614);
		btn0614.setBackground(new Color(60, 179, 113));

		JButton btn0615 = new JButton("");
		centroMapa.add(btn0615);
		btn0615.setBackground(new Color(60, 179, 113));

		JButton btn0616 = new JButton("");
		centroMapa.add(btn0616);
		btn0616.setBackground(new Color(60, 179, 113));

		JButton btn0617 = new JButton("");
		centroMapa.add(btn0617);
		btn0617.setBackground(new Color(60, 179, 113));

		JButton btn0618 = new JButton("");
		centroMapa.add(btn0618);
		btn0618.setBackground(new Color(60, 179, 113));

		JButton btn0619 = new JButton("");
		centroMapa.add(btn0619);
		btn0619.setBackground(new Color(60, 179, 113));

		JButton btn0700 = new JButton("");
		centroMapa.add(btn0700);
		btn0700.setBackground(new Color(60, 179, 113));

		JButton btn0701 = new JButton("");
		centroMapa.add(btn0701);
		btn0701.setBackground(new Color(60, 179, 113));

		JButton btn0702 = new JButton("");
		centroMapa.add(btn0702);
		btn0702.setBackground(new Color(60, 179, 113));

		JButton btn0703 = new JButton("");
		centroMapa.add(btn0703);
		btn0703.setBackground(new Color(60, 179, 113));

		JButton btn0704 = new JButton("");
		centroMapa.add(btn0704);
		btn0704.setBackground(new Color(60, 179, 113));

		JButton btn0705 = new JButton("");
		centroMapa.add(btn0705);
		btn0705.setBackground(new Color(60, 179, 113));

		JButton btn0706 = new JButton("");
		centroMapa.add(btn0706);
		btn0706.setBackground(new Color(60, 179, 113));

		JButton btn0707 = new JButton("");
		centroMapa.add(btn0707);
		btn0707.setBackground(new Color(60, 179, 113));

		JButton btn0708 = new JButton("");
		centroMapa.add(btn0708);
		btn0708.setBackground(new Color(60, 179, 113));

		JButton btn0709 = new JButton("");
		centroMapa.add(btn0709);
		btn0709.setBackground(new Color(60, 179, 113));

		JButton btn0710 = new JButton("");
		centroMapa.add(btn0710);
		btn0710.setBackground(new Color(60, 179, 113));

		JButton btn0711 = new JButton("");
		centroMapa.add(btn0711);
		btn0711.setBackground(new Color(60, 179, 113));

		JButton btn0712 = new JButton("");
		centroMapa.add(btn0712);
		btn0712.setBackground(new Color(60, 179, 113));

		JButton btn0713 = new JButton("");
		centroMapa.add(btn0713);
		btn0713.setBackground(new Color(60, 179, 113));

		JButton btn0714 = new JButton("");
		centroMapa.add(btn0714);
		btn0714.setBackground(new Color(60, 179, 113));

		JButton btn0715 = new JButton("");
		centroMapa.add(btn0715);
		btn0715.setBackground(new Color(60, 179, 113));

		JButton btn0716 = new JButton("");
		centroMapa.add(btn0716);
		btn0716.setBackground(new Color(60, 179, 113));

		JButton btn0717 = new JButton("");
		centroMapa.add(btn0717);
		btn0717.setBackground(new Color(60, 179, 113));

		JButton btn0718 = new JButton("");
		centroMapa.add(btn0718);
		btn0718.setBackground(new Color(60, 179, 113));

		JButton btn0719 = new JButton("");
		centroMapa.add(btn0719);
		btn0719.setBackground(new Color(60, 179, 113));

		JButton btn0800 = new JButton("");
		centroMapa.add(btn0800);
		btn0800.setBackground(new Color(60, 179, 113));

		JButton btn0801 = new JButton("");
		centroMapa.add(btn0801);
		btn0801.setBackground(new Color(60, 179, 113));

		JButton btn0802 = new JButton("");
		centroMapa.add(btn0802);
		btn0802.setBackground(new Color(60, 179, 113));

		JButton btn0803 = new JButton("");
		centroMapa.add(btn0803);
		btn0803.setBackground(new Color(60, 179, 113));

		JButton btn0804 = new JButton("");
		centroMapa.add(btn0804);
		btn0804.setBackground(new Color(60, 179, 113));

		JButton btn0805 = new JButton("");
		centroMapa.add(btn0805);
		btn0805.setBackground(new Color(60, 179, 113));

		JButton btn0806 = new JButton("");
		centroMapa.add(btn0806);
		btn0806.setBackground(new Color(60, 179, 113));

		JButton btn0807 = new JButton("");
		centroMapa.add(btn0807);
		btn0807.setBackground(new Color(60, 179, 113));

		JButton btn0808 = new JButton("");
		centroMapa.add(btn0808);
		btn0808.setBackground(new Color(60, 179, 113));

		JButton btn0809 = new JButton("");
		centroMapa.add(btn0809);
		btn0809.setBackground(new Color(60, 179, 113));

		JButton btn0810 = new JButton("");
		centroMapa.add(btn0810);
		btn0810.setBackground(new Color(60, 179, 113));

		JButton btn0811 = new JButton("");
		centroMapa.add(btn0811);
		btn0811.setBackground(new Color(60, 179, 113));

		JButton btn0812 = new JButton("");
		centroMapa.add(btn0812);
		btn0812.setBackground(new Color(60, 179, 113));

		JButton btn0813 = new JButton("");
		centroMapa.add(btn0813);
		btn0813.setBackground(new Color(60, 179, 113));

		JButton btn0814 = new JButton("");
		centroMapa.add(btn0814);
		btn0814.setBackground(new Color(60, 179, 113));

		JButton btn0815 = new JButton("");
		centroMapa.add(btn0815);
		btn0815.setBackground(new Color(60, 179, 113));

		JButton btn0816 = new JButton("");
		centroMapa.add(btn0816);
		btn0816.setBackground(new Color(60, 179, 113));

		JButton btn0817 = new JButton("");
		centroMapa.add(btn0817);
		btn0817.setBackground(new Color(60, 179, 113));

		JButton btn0818 = new JButton("");
		centroMapa.add(btn0818);
		btn0818.setBackground(new Color(60, 179, 113));

		JButton btn0819 = new JButton("");
		centroMapa.add(btn0819);
		btn0819.setBackground(new Color(60, 179, 113));

		JButton btn0900 = new JButton("");
		centroMapa.add(btn0900);
		btn0900.setBackground(new Color(60, 179, 113));

		JButton btn0901 = new JButton("");
		centroMapa.add(btn0901);
		btn0901.setBackground(new Color(60, 179, 113));

		JButton btn0902 = new JButton("");
		centroMapa.add(btn0902);
		btn0902.setBackground(new Color(60, 179, 113));

		JButton btn0903 = new JButton("");
		centroMapa.add(btn0903);
		btn0903.setBackground(new Color(60, 179, 113));

		JButton btn0904 = new JButton("");
		centroMapa.add(btn0904);
		btn0904.setBackground(new Color(60, 179, 113));

		JButton btn0905 = new JButton("");
		centroMapa.add(btn0905);
		btn0905.setBackground(new Color(60, 179, 113));

		JButton btn0906 = new JButton("");
		centroMapa.add(btn0906);
		btn0906.setBackground(new Color(60, 179, 113));

		JButton btn0907 = new JButton("");
		centroMapa.add(btn0907);
		btn0907.setBackground(new Color(60, 179, 113));

		JButton btn0908 = new JButton("");
		centroMapa.add(btn0908);
		btn0908.setBackground(new Color(60, 179, 113));

		JButton btn0909 = new JButton("");
		centroMapa.add(btn0909);
		btn0909.setBackground(new Color(60, 179, 113));

		JButton btn0910 = new JButton("");
		centroMapa.add(btn0910);
		btn0910.setBackground(new Color(60, 179, 113));

		JButton btn0911 = new JButton("");
		centroMapa.add(btn0911);
		btn0911.setBackground(new Color(60, 179, 113));

		JButton btn0912 = new JButton("");
		centroMapa.add(btn0912);
		btn0912.setBackground(new Color(60, 179, 113));

		JButton btn0913 = new JButton("");
		centroMapa.add(btn0913);
		btn0913.setBackground(new Color(60, 179, 113));

		JButton btn0914 = new JButton("");
		centroMapa.add(btn0914);
		btn0914.setBackground(new Color(60, 179, 113));

		JButton btn0915 = new JButton("");
		centroMapa.add(btn0915);
		btn0915.setBackground(new Color(60, 179, 113));

		JButton btn0916 = new JButton("");
		centroMapa.add(btn0916);
		btn0916.setBackground(new Color(60, 179, 113));

		JButton btn0917 = new JButton("");
		centroMapa.add(btn0917);
		btn0917.setBackground(new Color(60, 179, 113));

		JButton btn0918 = new JButton("");
		centroMapa.add(btn0918);
		btn0918.setBackground(new Color(60, 179, 113));

		JButton btn0919 = new JButton("");
		centroMapa.add(btn0919);
		btn0919.setBackground(new Color(60, 179, 113));

		JButton btn1000 = new JButton("");
		centroMapa.add(btn1000);
		btn1000.setBackground(new Color(60, 179, 113));

		JButton btn1001 = new JButton("");
		centroMapa.add(btn1001);
		btn1001.setBackground(new Color(60, 179, 113));

		JButton btn1002 = new JButton("");
		centroMapa.add(btn1002);
		btn1002.setBackground(new Color(60, 179, 113));

		JButton btn1003 = new JButton("");
		centroMapa.add(btn1003);
		btn1003.setBackground(new Color(60, 179, 113));

		JButton btn1004 = new JButton("");
		centroMapa.add(btn1004);
		btn1004.setBackground(new Color(60, 179, 113));

		JButton btn1005 = new JButton("");
		centroMapa.add(btn1005);
		btn1005.setBackground(new Color(60, 179, 113));

		JButton btn1006 = new JButton("");
		centroMapa.add(btn1006);
		btn1006.setBackground(new Color(60, 179, 113));

		JButton btn1007 = new JButton("");
		centroMapa.add(btn1007);
		btn1007.setBackground(new Color(60, 179, 113));

		JButton btn1008 = new JButton("");
		centroMapa.add(btn1008);
		btn1008.setBackground(new Color(60, 179, 113));

		JButton btn1009 = new JButton("");
		centroMapa.add(btn1009);
		btn1009.setBackground(new Color(60, 179, 113));

		JButton btn1010 = new JButton("");
		centroMapa.add(btn1010);
		btn1010.setBackground(new Color(60, 179, 113));

		JButton btn1011 = new JButton("");
		centroMapa.add(btn1011);
		btn1011.setBackground(new Color(60, 179, 113));

		JButton btn1012 = new JButton("");
		centroMapa.add(btn1012);
		btn1012.setBackground(new Color(60, 179, 113));

		JButton btn1013 = new JButton("");
		centroMapa.add(btn1013);
		btn1013.setBackground(new Color(60, 179, 113));

		JButton btn1014 = new JButton("");
		centroMapa.add(btn1014);
		btn1014.setBackground(new Color(60, 179, 113));

		JButton btn1015 = new JButton("");
		centroMapa.add(btn1015);
		btn1015.setBackground(new Color(60, 179, 113));

		JButton btn1016 = new JButton("");
		centroMapa.add(btn1016);
		btn1016.setBackground(new Color(60, 179, 113));

		JButton btn1017 = new JButton("");
		centroMapa.add(btn1017);
		btn1017.setBackground(new Color(60, 179, 113));

		JButton btn1018 = new JButton("");
		centroMapa.add(btn1018);
		btn1018.setBackground(new Color(60, 179, 113));

		JButton btn1019 = new JButton("");
		centroMapa.add(btn1019);
		btn1019.setBackground(new Color(60, 179, 113));

		JButton btn1100 = new JButton("");
		centroMapa.add(btn1100);
		btn1100.setBackground(new Color(60, 179, 113));

		JButton btn1101 = new JButton("");
		centroMapa.add(btn1101);
		btn1101.setBackground(new Color(60, 179, 113));

		JButton btn1102 = new JButton("");
		centroMapa.add(btn1102);
		btn1102.setBackground(new Color(60, 179, 113));

		JButton btn1103 = new JButton("");
		centroMapa.add(btn1103);
		btn1103.setBackground(new Color(60, 179, 113));

		JButton btn1104 = new JButton("");
		centroMapa.add(btn1104);
		btn1104.setBackground(new Color(60, 179, 113));

		JButton btn1105 = new JButton("");
		centroMapa.add(btn1105);
		btn1105.setBackground(new Color(60, 179, 113));

		JButton btn1106 = new JButton("");
		centroMapa.add(btn1106);
		btn1106.setBackground(new Color(60, 179, 113));

		JButton btn1107 = new JButton("");
		centroMapa.add(btn1107);
		btn1107.setBackground(new Color(60, 179, 113));

		JButton btn1108 = new JButton("");
		centroMapa.add(btn1108);
		btn1108.setBackground(new Color(60, 179, 113));

		JButton btn1109 = new JButton("");
		centroMapa.add(btn1109);
		btn1109.setBackground(new Color(60, 179, 113));

		JButton btn1110 = new JButton("");
		centroMapa.add(btn1110);
		btn1110.setBackground(new Color(60, 179, 113));

		JButton btn1111 = new JButton("");
		centroMapa.add(btn1111);
		btn1111.setBackground(new Color(60, 179, 113));

		JButton btn1112 = new JButton("");
		centroMapa.add(btn1112);
		btn1112.setBackground(new Color(60, 179, 113));

		JButton btn1113 = new JButton("");
		centroMapa.add(btn1113);
		btn1113.setBackground(new Color(60, 179, 113));

		JButton btn1114 = new JButton("");
		centroMapa.add(btn1114);
		btn1114.setBackground(new Color(60, 179, 113));

		JButton btn1115 = new JButton("");
		centroMapa.add(btn1115);
		btn1115.setBackground(new Color(60, 179, 113));

		JButton btn1116 = new JButton("");
		centroMapa.add(btn1116);
		btn1116.setBackground(new Color(60, 179, 113));

		JButton btn1117 = new JButton("");
		centroMapa.add(btn1117);
		btn1117.setBackground(new Color(60, 179, 113));

		JButton btn1118 = new JButton("");
		centroMapa.add(btn1118);
		btn1118.setBackground(new Color(60, 179, 113));

		JButton btn1119 = new JButton("");
		centroMapa.add(btn1119);
		btn1119.setBackground(new Color(60, 179, 113));

		JButton btn1200 = new JButton("");
		centroMapa.add(btn1200);
		btn1200.setBackground(new Color(60, 179, 113));

		JButton btn1201 = new JButton("");
		centroMapa.add(btn1201);
		btn1201.setBackground(new Color(60, 179, 113));

		JButton btn1202 = new JButton("");
		centroMapa.add(btn1202);
		btn1202.setBackground(new Color(60, 179, 113));

		JButton btn1203 = new JButton("");
		centroMapa.add(btn1203);
		btn1203.setBackground(new Color(60, 179, 113));

		JButton btn1204 = new JButton("");
		centroMapa.add(btn1204);
		btn1204.setBackground(new Color(60, 179, 113));

		JButton btn1205 = new JButton("");
		centroMapa.add(btn1205);
		btn1205.setBackground(new Color(60, 179, 113));

		JButton btn1206 = new JButton("");
		centroMapa.add(btn1206);
		btn1206.setBackground(new Color(60, 179, 113));

		JButton btn1207 = new JButton("");
		centroMapa.add(btn1207);
		btn1207.setBackground(new Color(60, 179, 113));

		JButton btn1208 = new JButton("");
		centroMapa.add(btn1208);
		btn1208.setBackground(new Color(60, 179, 113));

		JButton btn1209 = new JButton("");
		centroMapa.add(btn1209);
		btn1209.setBackground(new Color(60, 179, 113));

		JButton btn1210 = new JButton("");
		centroMapa.add(btn1210);
		btn1210.setBackground(new Color(60, 179, 113));

		JButton btn1211 = new JButton("");
		centroMapa.add(btn1211);
		btn1211.setBackground(new Color(60, 179, 113));

		JButton btn1212 = new JButton("");
		centroMapa.add(btn1212);
		btn1212.setBackground(new Color(60, 179, 113));

		JButton btn1213 = new JButton("");
		centroMapa.add(btn1213);
		btn1213.setBackground(new Color(60, 179, 113));

		JButton btn1214 = new JButton("");
		centroMapa.add(btn1214);
		btn1214.setBackground(new Color(60, 179, 113));

		JButton btn1215 = new JButton("");
		centroMapa.add(btn1215);
		btn1215.setBackground(new Color(60, 179, 113));

		JButton btn1216 = new JButton("");
		centroMapa.add(btn1216);
		btn1216.setBackground(new Color(60, 179, 113));

		JButton btn1217 = new JButton("");
		centroMapa.add(btn1217);
		btn1217.setBackground(new Color(60, 179, 113));

		JButton btn1218 = new JButton("");
		centroMapa.add(btn1218);
		btn1218.setBackground(new Color(60, 179, 113));

		JButton btn1219 = new JButton("");
		centroMapa.add(btn1219);
		btn1219.setBackground(new Color(60, 179, 113));

		JButton btn1300 = new JButton("");
		centroMapa.add(btn1300);
		btn1300.setBackground(new Color(60, 179, 113));

		JButton btn1301 = new JButton("");
		centroMapa.add(btn1301);
		btn1301.setBackground(new Color(60, 179, 113));

		JButton btn1302 = new JButton("");
		centroMapa.add(btn1302);
		btn1302.setBackground(new Color(60, 179, 113));

		JButton btn1303 = new JButton("");
		centroMapa.add(btn1303);
		btn1303.setBackground(new Color(60, 179, 113));

		JButton btn1304 = new JButton("");
		centroMapa.add(btn1304);
		btn1304.setBackground(new Color(60, 179, 113));

		JButton btn1305 = new JButton("");
		centroMapa.add(btn1305);
		btn1305.setBackground(new Color(60, 179, 113));

		JButton btn1306 = new JButton("");
		centroMapa.add(btn1306);
		btn1306.setBackground(new Color(60, 179, 113));

		JButton btn1307 = new JButton("");
		centroMapa.add(btn1307);
		btn1307.setBackground(new Color(60, 179, 113));

		JButton btn1308 = new JButton("");
		centroMapa.add(btn1308);
		btn1308.setBackground(new Color(60, 179, 113));

		JButton btn1309 = new JButton("");
		centroMapa.add(btn1309);
		btn1309.setBackground(new Color(60, 179, 113));

		JButton btn1310 = new JButton("");
		centroMapa.add(btn1310);
		btn1310.setBackground(new Color(60, 179, 113));

		JButton btn1311 = new JButton("");
		centroMapa.add(btn1311);
		btn1311.setBackground(new Color(60, 179, 113));

		JButton btn1312 = new JButton("");
		centroMapa.add(btn1312);
		btn1312.setBackground(new Color(60, 179, 113));

		JButton btn1313 = new JButton("");
		centroMapa.add(btn1313);
		btn1313.setBackground(new Color(60, 179, 113));

		JButton btn1314 = new JButton("");
		centroMapa.add(btn1314);
		btn1314.setBackground(new Color(60, 179, 113));

		JButton btn1315 = new JButton("");
		centroMapa.add(btn1315);
		btn1315.setBackground(new Color(60, 179, 113));

		JButton btn1316 = new JButton("");
		centroMapa.add(btn1316);
		btn1316.setBackground(new Color(60, 179, 113));

		JButton btn1317 = new JButton("");
		centroMapa.add(btn1317);
		btn1317.setBackground(new Color(60, 179, 113));

		JButton btn1318 = new JButton("");
		centroMapa.add(btn1318);
		btn1318.setBackground(new Color(60, 179, 113));

		JButton btn1319 = new JButton("");
		centroMapa.add(btn1319);
		btn1319.setBackground(new Color(60, 179, 113));

		JButton btn1400 = new JButton("");
		centroMapa.add(btn1400);
		btn1400.setBackground(new Color(60, 179, 113));

		JButton btn1401 = new JButton("");
		centroMapa.add(btn1401);
		btn1401.setBackground(new Color(60, 179, 113));

		JButton btn1402 = new JButton("");
		centroMapa.add(btn1402);
		btn1402.setBackground(new Color(60, 179, 113));

		JButton btn1403 = new JButton("");
		centroMapa.add(btn1403);
		btn1403.setBackground(new Color(60, 179, 113));

		JButton btn1404 = new JButton("");
		centroMapa.add(btn1404);
		btn1404.setBackground(new Color(60, 179, 113));

		JButton btn1405 = new JButton("");
		centroMapa.add(btn1405);
		btn1405.setBackground(new Color(60, 179, 113));

		JButton btn1406 = new JButton("");
		centroMapa.add(btn1406);
		btn1406.setBackground(new Color(60, 179, 113));

		JButton btn1407 = new JButton("");
		centroMapa.add(btn1407);
		btn1407.setBackground(new Color(60, 179, 113));

		JButton btn1408 = new JButton("");
		centroMapa.add(btn1408);
		btn1408.setBackground(new Color(60, 179, 113));

		JButton btn1409 = new JButton("");
		centroMapa.add(btn1409);
		btn1409.setBackground(new Color(60, 179, 113));

		JButton btn1410 = new JButton("");
		centroMapa.add(btn1410);
		btn1410.setBackground(new Color(60, 179, 113));

		JButton btn1411 = new JButton("");
		centroMapa.add(btn1411);
		btn1411.setBackground(new Color(60, 179, 113));

		JButton btn1412 = new JButton("");
		centroMapa.add(btn1412);
		btn1412.setBackground(new Color(60, 179, 113));

		JButton btn1413 = new JButton("");
		centroMapa.add(btn1413);
		btn1413.setBackground(new Color(60, 179, 113));

		JButton btn1414 = new JButton("");
		centroMapa.add(btn1414);
		btn1414.setBackground(new Color(60, 179, 113));

		JButton btn1415 = new JButton("");
		centroMapa.add(btn1415);
		btn1415.setBackground(new Color(60, 179, 113));

		JButton btn1416 = new JButton("");
		centroMapa.add(btn1416);
		btn1416.setBackground(new Color(60, 179, 113));

		JButton btn1417 = new JButton("");
		centroMapa.add(btn1417);
		btn1417.setBackground(new Color(60, 179, 113));

		JButton btn1418 = new JButton("");
		centroMapa.add(btn1418);
		btn1418.setBackground(new Color(60, 179, 113));

		JButton btn1419 = new JButton("");
		centroMapa.add(btn1419);
		btn1419.setBackground(new Color(60, 179, 113));

		JButton btn1500 = new JButton("");
		centroMapa.add(btn1500);
		btn1500.setBackground(new Color(60, 179, 113));

		JButton btn1501 = new JButton("");
		centroMapa.add(btn1501);
		btn1501.setBackground(new Color(60, 179, 113));

		JButton btn1502 = new JButton("");
		centroMapa.add(btn1502);
		btn1502.setBackground(new Color(60, 179, 113));

		JButton btn1503 = new JButton("");
		centroMapa.add(btn1503);
		btn1503.setBackground(new Color(60, 179, 113));

		JButton btn1504 = new JButton("");
		centroMapa.add(btn1504);
		btn1504.setBackground(new Color(60, 179, 113));

		JButton btn1505 = new JButton("");
		centroMapa.add(btn1505);
		btn1505.setBackground(new Color(60, 179, 113));

		JButton btn1506 = new JButton("");
		centroMapa.add(btn1506);
		btn1506.setBackground(new Color(60, 179, 113));

		JButton btn1507 = new JButton("");
		centroMapa.add(btn1507);
		btn1507.setBackground(new Color(60, 179, 113));

		JButton btn1508 = new JButton("");
		centroMapa.add(btn1508);
		btn1508.setBackground(new Color(60, 179, 113));

		JButton btn1509 = new JButton("");
		centroMapa.add(btn1509);
		btn1509.setBackground(new Color(60, 179, 113));

		JButton btn1510 = new JButton("");
		centroMapa.add(btn1510);
		btn1510.setBackground(new Color(60, 179, 113));

		JButton btn1511 = new JButton("");
		centroMapa.add(btn1511);
		btn1511.setBackground(new Color(60, 179, 113));

		JButton btn1512 = new JButton("");
		centroMapa.add(btn1512);
		btn1512.setBackground(new Color(60, 179, 113));

		JButton btn1513 = new JButton("");
		centroMapa.add(btn1513);
		btn1513.setBackground(new Color(60, 179, 113));

		JButton btn1514 = new JButton("");
		centroMapa.add(btn1514);
		btn1514.setBackground(new Color(60, 179, 113));

		JButton btn1515 = new JButton("");
		centroMapa.add(btn1515);
		btn1515.setBackground(new Color(60, 179, 113));

		JButton btn1516 = new JButton("");
		centroMapa.add(btn1516);
		btn1516.setBackground(new Color(60, 179, 113));

		JButton btn1517 = new JButton("");
		centroMapa.add(btn1517);
		btn1517.setBackground(new Color(60, 179, 113));

		JButton btn1518 = new JButton("");
		centroMapa.add(btn1518);
		btn1518.setBackground(new Color(60, 179, 113));

		JButton btn1519 = new JButton("");
		centroMapa.add(btn1519);
		btn1519.setBackground(new Color(60, 179, 113));

		JButton btn1600 = new JButton("");
		centroMapa.add(btn1600);
		btn1600.setBackground(new Color(60, 179, 113));

		JButton btn1601 = new JButton("");
		centroMapa.add(btn1601);
		btn1601.setBackground(new Color(60, 179, 113));

		JButton btn1602 = new JButton("");
		centroMapa.add(btn1602);
		btn1602.setBackground(new Color(60, 179, 113));

		JButton btn1603 = new JButton("");
		centroMapa.add(btn1603);
		btn1603.setBackground(new Color(60, 179, 113));

		JButton btn1604 = new JButton("");
		centroMapa.add(btn1604);
		btn1604.setBackground(new Color(60, 179, 113));

		JButton btn1605 = new JButton("");
		centroMapa.add(btn1605);
		btn1605.setBackground(new Color(60, 179, 113));

		JButton btn1606 = new JButton("");
		centroMapa.add(btn1606);
		btn1606.setBackground(new Color(60, 179, 113));

		JButton btn1607 = new JButton("");
		centroMapa.add(btn1607);
		btn1607.setBackground(new Color(60, 179, 113));

		JButton btn1608 = new JButton("");
		centroMapa.add(btn1608);
		btn1608.setBackground(new Color(60, 179, 113));

		JButton btn1609 = new JButton("");
		centroMapa.add(btn1609);
		btn1609.setBackground(new Color(60, 179, 113));

		JButton btn1610 = new JButton("");
		centroMapa.add(btn1610);
		btn1610.setBackground(new Color(60, 179, 113));

		JButton btn1611 = new JButton("");
		centroMapa.add(btn1611);
		btn1611.setBackground(new Color(60, 179, 113));

		JButton btn1612 = new JButton("");
		centroMapa.add(btn1612);
		btn1612.setBackground(new Color(60, 179, 113));

		JButton btn1613 = new JButton("");
		centroMapa.add(btn1613);
		btn1613.setBackground(new Color(60, 179, 113));

		JButton btn1614 = new JButton("");
		centroMapa.add(btn1614);
		btn1614.setBackground(new Color(60, 179, 113));

		JButton btn1615 = new JButton("");
		centroMapa.add(btn1615);
		btn1615.setBackground(new Color(60, 179, 113));

		JButton btn1616 = new JButton("");
		centroMapa.add(btn1616);
		btn1616.setBackground(new Color(60, 179, 113));

		JButton btn1617 = new JButton("");
		centroMapa.add(btn1617);
		btn1617.setBackground(new Color(60, 179, 113));

		JButton btn1618 = new JButton("");
		centroMapa.add(btn1618);
		btn1618.setBackground(new Color(60, 179, 113));

		JButton btn1619 = new JButton("");
		centroMapa.add(btn1619);
		btn1619.setBackground(new Color(60, 179, 113));

		JButton btn1700 = new JButton("");
		centroMapa.add(btn1700);
		btn1700.setBackground(new Color(60, 179, 113));

		JButton btn1701 = new JButton("");
		centroMapa.add(btn1701);
		btn1701.setBackground(new Color(60, 179, 113));

		JButton btn1702 = new JButton("");
		centroMapa.add(btn1702);
		btn1702.setBackground(new Color(60, 179, 113));

		JButton btn1703 = new JButton("");
		centroMapa.add(btn1703);
		btn1703.setBackground(new Color(60, 179, 113));

		JButton btn1704 = new JButton("");
		centroMapa.add(btn1704);
		btn1704.setBackground(new Color(60, 179, 113));

		JButton btn1705 = new JButton("");
		centroMapa.add(btn1705);
		btn1705.setBackground(new Color(60, 179, 113));

		JButton btn1706 = new JButton("");
		centroMapa.add(btn1706);
		btn1706.setBackground(new Color(60, 179, 113));

		JButton btn1707 = new JButton("");
		centroMapa.add(btn1707);
		btn1707.setBackground(new Color(60, 179, 113));

		JButton btn1708 = new JButton("");
		centroMapa.add(btn1708);
		btn1708.setBackground(new Color(60, 179, 113));

		JButton btn1709 = new JButton("");
		centroMapa.add(btn1709);
		btn1709.setBackground(new Color(60, 179, 113));

		JButton btn1710 = new JButton("");
		centroMapa.add(btn1710);
		btn1710.setBackground(new Color(60, 179, 113));

		JButton btn1711 = new JButton("");
		centroMapa.add(btn1711);
		btn1711.setBackground(new Color(60, 179, 113));

		JButton btn1712 = new JButton("");
		centroMapa.add(btn1712);
		btn1712.setBackground(new Color(60, 179, 113));

		JButton btn1713 = new JButton("");
		centroMapa.add(btn1713);
		btn1713.setBackground(new Color(60, 179, 113));

		JButton btn1714 = new JButton("");
		centroMapa.add(btn1714);
		btn1714.setBackground(new Color(60, 179, 113));

		JButton btn1715 = new JButton("");
		centroMapa.add(btn1715);
		btn1715.setBackground(new Color(60, 179, 113));

		JButton btn1716 = new JButton("");
		centroMapa.add(btn1716);
		btn1716.setBackground(new Color(60, 179, 113));

		JButton btn1717 = new JButton("");
		centroMapa.add(btn1717);
		btn1717.setBackground(new Color(60, 179, 113));

		JButton btn1718 = new JButton("");
		centroMapa.add(btn1718);
		btn1718.setBackground(new Color(60, 179, 113));

		JButton btn1719 = new JButton("");
		centroMapa.add(btn1719);
		btn1719.setBackground(new Color(60, 179, 113));

		JButton btn1800 = new JButton("");
		centroMapa.add(btn1800);
		btn1800.setBackground(new Color(60, 179, 113));

		JButton btn1801 = new JButton("");
		centroMapa.add(btn1801);
		btn1801.setBackground(new Color(60, 179, 113));

		JButton btn1802 = new JButton("");
		centroMapa.add(btn1802);
		btn1802.setBackground(new Color(60, 179, 113));

		JButton btn1803 = new JButton("");
		centroMapa.add(btn1803);
		btn1803.setBackground(new Color(60, 179, 113));

		JButton btn1804 = new JButton("");
		centroMapa.add(btn1804);
		btn1804.setBackground(new Color(60, 179, 113));

		JButton btn1805 = new JButton("");
		centroMapa.add(btn1805);
		btn1805.setBackground(new Color(60, 179, 113));

		JButton btn1806 = new JButton("");
		centroMapa.add(btn1806);
		btn1806.setBackground(new Color(60, 179, 113));

		JButton btn1807 = new JButton("");
		centroMapa.add(btn1807);
		btn1807.setBackground(new Color(60, 179, 113));

		JButton btn1808 = new JButton("");
		centroMapa.add(btn1808);
		btn1808.setBackground(new Color(60, 179, 113));

		JButton btn1809 = new JButton("");
		centroMapa.add(btn1809);
		btn1809.setBackground(new Color(60, 179, 113));

		JButton btn1810 = new JButton("");
		centroMapa.add(btn1810);
		btn1810.setBackground(new Color(60, 179, 113));

		JButton btn1811 = new JButton("");
		centroMapa.add(btn1811);
		btn1811.setBackground(new Color(60, 179, 113));

		JButton btn1812 = new JButton("");
		centroMapa.add(btn1812);
		btn1812.setBackground(new Color(60, 179, 113));

		JButton btn1813 = new JButton("");
		centroMapa.add(btn1813);
		btn1813.setBackground(new Color(60, 179, 113));

		JButton btn1814 = new JButton("");
		centroMapa.add(btn1814);
		btn1814.setBackground(new Color(60, 179, 113));

		JButton btn1815 = new JButton("");
		centroMapa.add(btn1815);
		btn1815.setBackground(new Color(60, 179, 113));

		JButton btn1816 = new JButton("");
		centroMapa.add(btn1816);
		btn1816.setBackground(new Color(60, 179, 113));

		JButton btn1817 = new JButton("");
		centroMapa.add(btn1817);
		btn1817.setBackground(new Color(60, 179, 113));

		JButton btn1818 = new JButton("");
		centroMapa.add(btn1818);
		btn1818.setBackground(new Color(60, 179, 113));

		JButton btn1819 = new JButton("");
		centroMapa.add(btn1819);
		btn1819.setBackground(new Color(60, 179, 113));

		JButton btn1900 = new JButton("");
		centroMapa.add(btn1900);
		btn1900.setBackground(new Color(60, 179, 113));

		JButton btn1901 = new JButton("");
		centroMapa.add(btn1901);
		btn1901.setBackground(new Color(60, 179, 113));

		JButton btn1902 = new JButton("");
		centroMapa.add(btn1902);
		btn1902.setBackground(new Color(60, 179, 113));

		JButton btn1903 = new JButton("");
		centroMapa.add(btn1903);
		btn1903.setBackground(new Color(60, 179, 113));

		JButton btn1904 = new JButton("");
		centroMapa.add(btn1904);
		btn1904.setBackground(new Color(60, 179, 113));

		JButton btn1905 = new JButton("");
		centroMapa.add(btn1905);
		btn1905.setBackground(new Color(60, 179, 113));

		JButton btn1906 = new JButton("");
		centroMapa.add(btn1906);
		btn1906.setBackground(new Color(60, 179, 113));

		JButton btn1907 = new JButton("");
		centroMapa.add(btn1907);
		btn1907.setBackground(new Color(60, 179, 113));

		JButton btn1908 = new JButton("");
		centroMapa.add(btn1908);
		btn1908.setBackground(new Color(60, 179, 113));

		JButton btn1909 = new JButton("");
		centroMapa.add(btn1909);
		btn1909.setBackground(new Color(60, 179, 113));

		JButton btn1910 = new JButton("");
		centroMapa.add(btn1910);
		btn1910.setBackground(new Color(60, 179, 113));

		JButton btn1911 = new JButton("");
		centroMapa.add(btn1911);
		btn1911.setBackground(new Color(60, 179, 113));

		JButton btn1912 = new JButton("");
		centroMapa.add(btn1912);
		btn1912.setBackground(new Color(60, 179, 113));

		JButton btn1913 = new JButton("");
		centroMapa.add(btn1913);
		btn1913.setBackground(new Color(60, 179, 113));

		JButton btn1914 = new JButton("");
		centroMapa.add(btn1914);
		btn1914.setBackground(new Color(60, 179, 113));

		JButton btn1915 = new JButton("");
		centroMapa.add(btn1915);
		btn1915.setBackground(new Color(60, 179, 113));

		JButton btn1916 = new JButton("");
		centroMapa.add(btn1916);
		btn1916.setBackground(new Color(60, 179, 113));

		JButton btn1917 = new JButton("");
		centroMapa.add(btn1917);
		btn1917.setBackground(new Color(60, 179, 113));

		JButton btn1918 = new JButton("");
		centroMapa.add(btn1918);
		btn1918.setBackground(new Color(60, 179, 113));

		JButton btn1919 = new JButton("");
		centroMapa.add(btn1919);
		btn1919.setBackground(new Color(60, 179, 113));
		
		JButton btnNewGame = new JButton("Nuevo juego");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				GRAFICOS
//				Posicionar enemigo y flechas que le apuntan
				btn1900.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/malo.png")));
				btn1900.setBackground(new Color(255, 0, 0));
				btn1800.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fAbajo.png")));
				btn1901.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fIzquierda.png")));
				btn1801.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fAbajoIzq.png")));
				
//				Posicion inicial del jugador y flechas que le apuntan
				btn1315.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/heroe.png")));
				btn1214.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fAbajoDer.png")));
				btn1216.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fAbajoIzq.png")));
				btn1414.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fArribaDer.png")));
				btn1416.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fArribaIzq.png")));
				
//				Posicionar refugio
				btn0000.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/r1.jpg")));
				btn0001.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/r2.jpg")));
				btn0100.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/r3.jpg")));
				btn0101.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/r4.jpg")));
				
//				LOGICA (Refugio | Jugador | Malo | Escondite | Obstaculo)
//				Posicionar elementos en array
//				Malo
				casilla [19][00] = "1900.00100";
//				Heroe
				casilla [13][15] = "1315.01000";
//				Refugio
				casilla [00][00] = "0000.10010";
				casilla [00][01] = "0001.10010";
				casilla [01][00] = "0100.10010";
				casilla [01][01] = "0101.10010";
			}
		});
		
		JLabel lblNick = new JLabel("Introduce tu apodo:");
		panelNorte.add(lblNick);
		
		textField = new JTextField();
		panelNorte.add(textField);
		textField.setColumns(10);
		panelNorte.add(btnNewGame);
		
		JButton btnHistory = new JButton("Historia");
		panelNorte.add(btnHistory);
		
		JButton btnInstructions = new JButton("Instrucciones");
		panelNorte.add(btnInstructions);
		
		JButton btnPoints = new JButton("Clasificaci\u00F3n");
		panelNorte.add(btnPoints);
		
		JButton btnAbout = new JButton("Acerca de...");
		panelNorte.add(btnAbout);
		
		JPanel panelControlEste = new JPanel();
		frmTheRefuge.getContentPane().add(panelControlEste, BorderLayout.EAST);
		panelControlEste.setLayout(new BorderLayout(0, 0));
		
		JPanel subpanelNorte = new JPanel();
		panelControlEste.add(subpanelNorte, BorderLayout.CENTER);
		subpanelNorte.setLayout(new GridLayout(1, 0, 0, 0));
		
		JTextArea textArea = new JTextArea();
		subpanelNorte.add(textArea);
		
		JPanel subpanelSur = new JPanel();
		panelControlEste.add(subpanelSur, BorderLayout.SOUTH);
		subpanelSur.setLayout(new GridLayout(4, 3, 0, 0));
		
		JSeparator separator_1 = new JSeparator();
		subpanelSur.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Controles");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		subpanelSur.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		subpanelSur.add(separator);
		
		JButton btnUL = new JButton("");
		btnUL.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fArribaIzq.png")));
		subpanelSur.add(btnUL);
		
		JButton btnUp = new JButton("");
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnUp.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fArriba.png")));
		subpanelSur.add(btnUp);
		
		JButton btnUR = new JButton("");
		btnUR.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fArribaDer.png")));
		subpanelSur.add(btnUR);
		
		JButton btnLeft = new JButton("");
		btnLeft.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fIzquierda.png")));
		subpanelSur.add(btnLeft);
		
		JSeparator separator_2 = new JSeparator();
		subpanelSur.add(separator_2);
		
		JButton btnRight = new JButton("");
		btnRight.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fDerecha.png")));
		subpanelSur.add(btnRight);
		
		JButton btnDL = new JButton("");
		btnDL.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fAbajoIzq.png")));
		subpanelSur.add(btnDL);
		
		JButton btnDown = new JButton("");
		btnDown.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fAbajo.png")));
		subpanelSur.add(btnDown);
		
		JButton btnDR = new JButton("");
		btnDR.setIcon(new ImageIcon(Principal.class.getResource("/vista/graphics/fAbajoDer.png")));
		subpanelSur.add(btnDR);

	}
}




















