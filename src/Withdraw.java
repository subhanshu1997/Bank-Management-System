import javax.swing.JOptionPane;
import java.sql.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Withdraw.java
 *
 * Created on Aug 8, 2014, 8:46:19 AM
 */

/**
 *
 * @author IVPS
 */
public class Withdraw extends javax.swing.JFrame {
	Connection con = null;
	Statement stmt = null;
	Connection con1 = null;
	Statement stmt1 = null;
	ResultSet rs1 = null;

	/** Creates new form Withdraw */
	public Withdraw() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
//GEN-BEGIN:initComponents
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {

jTextField2 = new javax.swing.JTextField();
jTextField4 = new javax.swing.JTextField();
jButton1 = new javax.swing.JButton();
jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jTextField5 = new javax.swing.JTextField();
jLabel5 = new javax.swing.JLabel();
jComboBox1 = new javax.swing.JComboBox();
jComboBox2 = new javax.swing.JComboBox();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();

jTextField2.setText("jTextField2");

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
addWindowListener(new java.awt.event.WindowAdapter() {
public void windowOpened(java.awt.event.WindowEvent evt) {
formWindowOpened(evt);
}
});

jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseExited(java.awt.event.MouseEvent evt) {
jTextField4MouseExited(evt);
}
});
jTextField4.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jTextField4ActionPerformed(evt);
}
});
jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
public void focusLost(java.awt.event.FocusEvent evt) {
jTextField4FocusLost(evt);
}
});

jButton1.setText("Withdraw");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});

jLabel1.setText("Username");

jLabel2.setText("Pin");

jLabel3.setText("Amount");

jLabel4.setText("Withdraw");

jLabel5.setText("Date");

//jComboBox1.setModel(javax.swing.DefaultComboBoxModel@6aac43);
jComboBox1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jComboBox1ActionPerformed(evt);
}
});

//jComboBox2.setModel(javax.swing.DefaultComboBoxModel@164329);

jButton2.setText("Back To Menu");
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton2ActionPerformed(evt);
}
});

jButton3.setText("Clear");
jButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton3ActionPerformed(evt);
}
});

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap(175, Short.MAX_VALUE)
.addComponent(jLabel4)
.addGap(186, 186, 186))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addContainerGap(220, Short.MAX_VALUE)
.addComponent(jButton3)
.addGap(133, 133, 133))
.addGroup(layout.createSequentialGroup()
.addGap(101, 101, 101)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(50, 50, 50)
.addComponent(jButton1)
.addGap(28, 28, 28)
.addComponent(jButton2)
.addContainerGap(43, Short.MAX_VALUE))
.addGroup(layout.createSequentialGroup()
.addGap(40, 40, 40)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel1)
.addComponent(jLabel5)
.addComponent(jLabel2)
.addComponent(jLabel3))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
.addComponent(jComboBox2, 0, 136, Short.MAX_VALUE)
.addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
.addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 136, Short.MAX_VALUE))
.addGap(77, 77, 77))))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(22, 22, 22)
.addComponent(jLabel4)
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel1)
.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(9, 9, 9)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel5)
.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel2)
.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)
.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(30, 30, 30)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton1)
.addComponent(jButton2))
.addGap(18, 18, 18)
.addComponent(jButton3)
.addContainerGap(39, Short.MAX_VALUE))
);

pack();
}// </editor-fold>

	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		String d, l = "Withdrawn";
		int Amount;
		try {
			stmt = dao.getCon().createStatement();
			Amount = Integer.parseInt(jTextField4.getText());
			d = jTextField5.getText();
			String s = "update customer set Balance = Balance-" + Amount
					+ " where username='" + jComboBox1.getSelectedItem()
					+ "' AND pin=" + jComboBox2.getSelectedItem();
			String f = "insert into Withdraw values('"
					+ jComboBox1.getSelectedItem() + "',"
					+ jComboBox2.getSelectedItem() + "," + Amount + ",'" + d
					+ "')";
			stmt.executeUpdate(s);
			stmt.executeUpdate(f);
			JOptionPane.showMessageDialog(null, "Rs" + Amount + "-" + l);
		} catch (Exception e) {
			System.out.println(e);
		}

		// TODO add your handling code here:
	}//GEN-LAST:event_jButton1ActionPerformed

	private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
		try {
			stmt = dao.getCon().createStatement();
			String qry = "select Username from customer";
			ResultSet rs = stmt.executeQuery(qry);
			while (rs.next()) {
				String snl = rs.getString(1);
				jComboBox1.addItem(snl);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		} // TODO add your handling code here:
	}//GEN-LAST:event_formWindowOpened

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
		try {
			stmt = dao.getCon().createStatement();
			String qry = "select pin from customer where username='"
					+ jComboBox1.getSelectedItem() + "'";
			ResultSet rs = stmt.executeQuery(qry);
			while (rs.next()) {
				int snl = rs.getInt(1);
				jComboBox2.addItem(snl);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		} // TODO add your handling code here:
	}//GEN-LAST:event_jComboBox1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		new NewJFrame().setVisible(true);
		this.dispose();// TODO add your handling code here:
	}//GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		int a;
		String b;
		a = Integer.parseInt(jTextField4.getText());
		b = jTextField5.getName();
		jTextField4.setText("");
		jTextField5.setText("");
		// TODO add your handling code here:
	}//GEN-LAST:event_jButton3ActionPerformed

	private void jTextField4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseExited
		int sn1 = 0;
		try {
			stmt1 = dao.getCon().createStatement();
			String qry = "Select Balance from customer where Username = '"
					+ jComboBox1.getSelectedItem() + "'";
			ResultSet rs1 = stmt1.executeQuery(qry);
			while (rs1.next()) {
				sn1 = rs1.getInt(1);
			}
			int a = Integer.parseInt(jTextField4.getText());
			if (sn1 - a < 1000) {
				JOptionPane.showMessageDialog(null, "Not Enough Balance");
			}
			rs1.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		// TODO add your handling code here:
	}//GEN-LAST:event_jTextField4MouseExited

	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jTextField4ActionPerformed

	private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
		// TODO add your handling code here:
	}//GEN-LAST:event_jTextField4FocusLost

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Withdraw().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	// End of variables declaration//GEN-END:variables

}
