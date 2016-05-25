import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import name.fraser.neil.plaintext.*;
import name.fraser.neil.plaintext.diff_match_patch.Diff;

public class TestWB extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWB frame = new TestWB();
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
	public TestWB() {
		setResizable(false);
		setTitle("SimpleMerge");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
				
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);		
		
		JMenu mnf = new JMenu(" \uD30C\uC77C (F)");
		menuBar.add(mnf);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\uC0C8\uB85C \uB9CC\uB4E4\uAE30 (N)");
		mnf.add(mntmNewMenuItem);		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\uB05D\uB0B4\uAE30 (X)");		
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\uC5F4\uAE30 (O)...");
		mnf.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\uBD88\uC77C\uCE58 \uD30C\uC77C \uC5F4\uAE30(E)...");
		mnf.add(mntmNewMenuItem_4);
		
		JSeparator separator_1 = new JSeparator();
		mnf.add(separator_1);
		
		JMenuItem menuItem_1 = new JMenuItem("\uD504\uB85C\uC81D\uD2B8 \uC5F4\uAE30...");
		mnf.add(menuItem_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\uD504\uB85C\uC81D\uD2B8 \uC800\uC7A5(V)...");
		mnf.add(mntmNewMenuItem_5);
		
		JSeparator separator_2 = new JSeparator();
		mnf.add(separator_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("\uCD5C\uADFC \uD504\uB85C\uC81D\uD2B8");
		mnf.add(mntmNewMenuItem_6);
		
		JSeparator separator = new JSeparator();
		mnf.add(separator);
		
		mnf.add(mntmNewMenuItem_1);		
		
		JMenu mne = new JMenu("\uD3B8\uC9D1 (E)");
		menuBar.add(mne);		
		
		JMenuItem mntmo = new JMenuItem("\uC124\uC815(O)...");
		mne.add(mntmo);
		
		JMenu mnNewMenu = new JMenu("\uBCF4\uAE30 (V)");
		menuBar.add(mnNewMenu);		
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("\uAE00\uAF34 \uC120\uD0DD(F)...");
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("\uAE30\uBCF8 \uAE00\uAF34 \uC0AC\uC6A9(O)");
		mnNewMenu.add(mntmNewMenuItem_8);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu.add(separator_3);
		
		JMenu mnNewMenu_5 = new JMenu("\uB3C4\uAD6C \uBAA8\uC74C(T)");
		mnNewMenu.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("\uC5C6\uC74C(N)");
		mnNewMenu_5.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("\uC791\uAC8C(S)");
		mnNewMenu_5.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("\uD06C\uAC8C(B)");
		mnNewMenu_5.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("\uC0C1\uD0DC \uD45C\uC2DC\uC904(S)");
		mnNewMenu.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("\uD0ED \uB3C4\uAD6C \uBAA8\uC74C(B)");
		mnNewMenu.add(mntmNewMenuItem_10);
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu.add(separator_4);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("\uC5B8\uC5B4(L)...");
		mnNewMenu.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_1 = new JMenu("\uB3C4\uAD6C (T)");
		menuBar.add(mnNewMenu_1);		
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("\uD544\uD130(F)");
		mnNewMenu_1.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("\uD328\uCE58 \uC0DD\uC131(G)");
		mnNewMenu_1.add(mntmNewMenuItem_16);
		
		JMenu mnNewMenu_2 = new JMenu("\uD50C\uB7EC\uADF8\uC778 (P)");
		menuBar.add(mnNewMenu_2);		
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("List...");
		mnNewMenu_2.add(mntmNewMenuItem_17);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_2.add(separator_5);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("Manual Prediffer");
		mnNewMenu_2.add(mntmNewMenuItem_18);
		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("Automatic Prediffer");
		mnNewMenu_2.add(mntmNewMenuItem_19);
		
		JSeparator separator_6 = new JSeparator();
		mnNewMenu_2.add(separator_6);
		
		JMenuItem mntmNewMenuItem_20 = new JMenuItem("\uC218\uB3D9 \uC5B8\uD329(M)");
		mnNewMenu_2.add(mntmNewMenuItem_20);
		
		JMenuItem mntmNewMenuItem_21 = new JMenuItem("\uC790\uB3D9 \uC5B8\uD329(A)");
		mnNewMenu_2.add(mntmNewMenuItem_21);
		
		JSeparator separator_7 = new JSeparator();
		mnNewMenu_2.add(separator_7);
		
		JMenuItem mntmNewMenuItem_22 = new JMenuItem("\uC5B8\uD329\uCEE4 \uC0AC\uC6A9 \uD3B8\uC9D1(E)");
		mnNewMenu_2.add(mntmNewMenuItem_22);
		
		JSeparator separator_8 = new JSeparator();
		mnNewMenu_2.add(separator_8);
		
		JMenuItem mntmNewMenuItem_23 = new JMenuItem("\uD50C\uB7EC\uADF8\uC778 \uB2E4\uC2DC \uB85C\uB4DC(R)");
		mnNewMenu_2.add(mntmNewMenuItem_23);
		
		JMenu mnNewMenu_3 = new JMenu("\uCC3D (W)");
		menuBar.add(mnNewMenu_3);		
		
		JMenuItem mntmNewMenuItem_24 = new JMenuItem("\uB2EB\uAE30(Q)");
		mnNewMenu_3.add(mntmNewMenuItem_24);
		
		JMenuItem mntmNewMenuItem_25 = new JMenuItem("\uBAA8\uB450 \uB2EB\uAE30(S)");
		mnNewMenu_3.add(mntmNewMenuItem_25);
		
		JSeparator separator_9 = new JSeparator();
		mnNewMenu_3.add(separator_9);
		
		JMenuItem mntmNewMenuItem_26 = new JMenuItem("\uCC3D \uC804\uD658(P)");
		mnNewMenu_3.add(mntmNewMenuItem_26);
		
		JSeparator separator_10 = new JSeparator();
		mnNewMenu_3.add(separator_10);
		
		JMenuItem mntmNewMenuItem_27 = new JMenuItem("\uC218\uC9C1 \uC815\uB82C(H)");
		mnNewMenu_3.add(mntmNewMenuItem_27);
		
		JMenuItem mntmNewMenuItem_28 = new JMenuItem("\uC218\uD3C9 \uC815\uB82C(V)");
		mnNewMenu_3.add(mntmNewMenuItem_28);
		
		JMenuItem mntmNewMenuItem_29 = new JMenuItem("\uACC4\uB2E8\uC2DD \uC815\uB82C(C)");
		mnNewMenu_3.add(mntmNewMenuItem_29);
		
		JMenu mnNewMenu_4 = new JMenu("\uB3C4\uC6C0\uB9D0 (H)");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_30 = new JMenuItem("SimpleMerge \uB3C4\uC6C0\uB9D0(W)");
		mnNewMenu_4.add(mntmNewMenuItem_30);
		
		JSeparator separator_12 = new JSeparator();
		mnNewMenu_4.add(separator_12);
		
		JMenuItem mntmNewMenuItem_31 = new JMenuItem("\uB9B4\uB9AC\uC988 \uB178\uD2B8(E)");
		mnNewMenu_4.add(mntmNewMenuItem_31);
		
		JMenuItem mntmNewMenuItem_32 = new JMenuItem("\uBC88\uC5ED(T)");
		mnNewMenu_4.add(mntmNewMenuItem_32);
		
		JMenuItem mntmNewMenuItem_33 = new JMenuItem("\uC124\uC815(O)");
		mnNewMenu_4.add(mntmNewMenuItem_33);
		
		JMenuItem mntmNewMenuItem_34 = new JMenuItem("\uC555\uCD95 \uD30C\uC77C \uC9C0\uC6D0(R)");
		mnNewMenu_4.add(mntmNewMenuItem_34);
		
		JSeparator separator_11 = new JSeparator();
		mnNewMenu_4.add(separator_11);
		
		JMenuItem mntmNewMenuItem_35 = new JMenuItem("GNU \uB77C\uC774\uC13C\uC2A4(G)");
		mnNewMenu_4.add(mntmNewMenuItem_35);
		
		JMenuItem mntmNewMenuItem_36 = new JMenuItem("SimpleMerge \uC815\uBCF4(A)...");
		mnNewMenu_4.add(mntmNewMenuItem_36);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(0, 0, 656, 28);
		getContentPane().add(menuBar_1);
		
		JMenuItem menuItem = new JMenuItem("");
		menuItem.setIcon(new ImageIcon(TestWB.class.getResource("/com/sun/java/swing/plaf/windows/icons/File.gif")));
		menuBar_1.add(menuItem);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 26, 784, 514);
		getContentPane().add(tabbedPane);		
		
		JPanel panel = new JPanel();
		//tabbedPane.addTab("New tab", null, panel, null);
		

		JPanel panel_1 = new JPanel();
		//tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(12, 10, 360, 300);
		panel_1.add(scrollPane);
		
		JEditorPane editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(407, 10, 360, 300);
		panel_1.add(scrollPane_1);
		
		JEditorPane editorPane_1 = new JEditorPane();
		scrollPane_1.setViewportView(editorPane_1);
		
		JButton btnNewButton = new JButton("New button");
		
		btnNewButton.setBounds(12, 320, 103, 23);
		panel_1.add(btnNewButton);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 353, 755, 122);
		panel_1.add(scrollPane_2);
		
		JEditorPane editorPane_2 = new JEditorPane();
		scrollPane_2.setViewportView(editorPane_2);
		
		//
		//
		// actionlistener	
		//
		//
		mntmNewMenuItem_1.addActionListener(new ActionListener() {	// 종료(X) 이벤트
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {	// diff 버튼 이벤트
			public void actionPerformed(ActionEvent e) {
				diff_match_patch a = new diff_match_patch();
				LinkedList<Diff> b = a.diff_main(editorPane.getText(), editorPane_1.getText());
				editorPane_2.setText("");
				for(int c=0; c<b.size(); c++){
					editorPane_2.setText(editorPane_2.getText() + b.get(c).toString() + "\n");
				}
			}
		});
		
		mntmNewMenuItem.addActionListener(new ActionListener() {	// 새로 만들기(N) 이벤트
			public void actionPerformed(ActionEvent e) {
				while(true){
					if(tabbedPane.getTabCount()==0) break;
					tabbedPane.removeTabAt(0);
				}
				tabbedPane.addTab("New tab2", null, panel, null);
				{					
					;
				}
				tabbedPane.addTab("New tab2", null, panel_1, null);
				{
					editorPane.setText("");
					editorPane_1.setText("");
					editorPane_2.setText("");
				}
			}
		});		
	}
}
