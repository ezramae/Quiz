/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizproject;
import javax.swing.JOptionPane;
/**
 *
 * @author acer
 */
public class KidQiz extends javax.swing.JFrame {

    int angka=1;
    int Angka=0;
    String jawaban="";
    String Betul="";
    int Benar=0;
    int Salah=0;
    String Soal1[]={"Beberapa sekolah di kota mempunyai halaman yang sempit.\n" + "Lawan dari kata sempit pada kalimat diatas ialah?","A. Besar","B. Longgar","C. Lebar","D. Luas"};
    String Soal2[]={"Apabila diperhatikan tumbuhan tersebut terlihat pendek.\n" + "Sebutkanlah Antonim dari kata pendek pada kalimat diatas?.","A. Besar","B. Tinggi","C. Panjang","D. Rimbun"};
    String Soal3[]={"Penjahat itu menodongkan pistol untuk menakuti korban perampokan.\n"+"Sinonim menodongkan pada kalimat tersebut adalah","A. Mengarahkan","B. Menembakkan","C. Menghadapkan","D. Mengalamatkan"};
    String Soal4[]={"Hasil dari 7.598 - 1.637 - 2.893 + 4.716 adalah","A. 7.784","B. 7.812","C. 7.856","D. 7.903"};
    String Soal5[]={"Hasil pengerjaan dari 64 x 826 : 28 adalah","A. 1.678","B. 1.762","C. 1.888","D. 1.916"};
    String Soal6[]={"KPK dari 85, 90, dan 125 dalam bentuk faktorisasi prima adalah","A. 2 x 3 x 5²","B.  2 x 3² x 5²","C. 2 x 3³ x 5²","D. 2 x 3² x 5³"};
    String Soal7[]={"Hasil dari 8/5 - 90% + 0,45 × 1 1/2 adalah","A. 1,325","B. 1,375","C. 1,415","D. 1,425"};
    String Soal8[]={"Hasil dari 75% x 0,8 : 3/5 adalah","A. 4/5","B. 1","C. 1 1/5","D. 1 2/5"};
    String Soal9[]={"Sebuah lingkaran mempunyai keliling 176 cm. Luas lingkaran tersebut adalah","A. 2.386","B. 2.464","C. 2.492","D. 2.496"};
    String Soal10[]={"Sebuah balok memiliki ukuran panjang 25 cm, lebar 15 cm, dan tinggi 10 cm.\n"+"Luas permukaan balok tersebut adalah cm²","A. 1.500","B. 1.525","C. 1.550","D. 1.575"};
    /**
     * Creates new form KidQiz
     */
    public KidQiz() {
        initComponents();
        txtSoal.setText(""+Soal1[0]);
        A.setText(""+Soal1[1]);
        B.setText(""+Soal1[2]);
        C.setText(""+Soal1[3]);
        D.setText(""+Soal1[4]);
        txtAngka.setText(""+angka);
    }
    public void Clear(){
        buttonGroup1.clearSelection();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtAngka = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSoal = new javax.swing.JTextArea();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KidQiz");
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 219, 141));
        jPanel1.setMaximumSize(new java.awt.Dimension(626, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(626, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(626, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAngka.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAngka.setForeground(new java.awt.Color(255, 255, 255));
        txtAngka.setText("jLabel3");
        jPanel1.add(txtAngka, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SOAL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/download.png"))); // NOI18N
        jLabel3.setText("QUIZ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        txtSoal.setEditable(false);
        txtSoal.setColumns(20);
        txtSoal.setRows(5);
        jScrollPane1.setViewportView(txtSoal);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 560, 170));

        buttonGroup1.add(A);
        A.setForeground(new java.awt.Color(255, 255, 255));
        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        jPanel1.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        buttonGroup1.add(B);
        B.setForeground(new java.awt.Color(255, 255, 255));
        B.setText("B");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        jPanel1.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        buttonGroup1.add(C);
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        jPanel1.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        buttonGroup1.add(D);
        D.setForeground(new java.awt.Color(255, 255, 255));
        D.setText("D");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        jPanel1.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        btnResult.setText("RESULT");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });
        jPanel1.add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        btnPrev.setText("PREV");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/starry-night-sky_1048-11828.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 627, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        Angka-=1;
        angka-=1;
        txtAngka.setText(""+angka);
        
        if (angka==0) {
            txtAngka.setText("");
        }else{
            txtAngka.setText(""+angka);
    }if (angka <= 0) {
            Home frame1 = new Home();
            frame1.setVisible(true);
            this.dispose();
        }
        if (angka == 1) {
            txtSoal.setText(""+Soal1[0]);
            A.setText(""+Soal1[1]);
            B.setText(""+Soal1[2]);
            C.setText(""+Soal1[3]);
            D.setText(""+Soal1[4]);
        }else if(angka == 2){
            txtSoal.setText(""+Soal1[0]);
            A.setText(""+Soal1[1]);
            B.setText(""+Soal1[2]);
            C.setText(""+Soal1[3]);
            D.setText(""+Soal1[4]);
        }else if(angka == 3){
            txtSoal.setText(""+Soal2[0]);
            A.setText(""+Soal2[1]);
            B.setText(""+Soal2[2]);
            C.setText(""+Soal2[3]);
            D.setText(""+Soal2[4]);
        }else if(angka == 4){
            txtSoal.setText(""+Soal3[0]);
            A.setText(""+Soal3[1]);
            B.setText(""+Soal3[2]);
            C.setText(""+Soal3[3]);
            D.setText(""+Soal3[4]);
        }else if(angka == 5){
            txtSoal.setText(""+Soal4[0]);
            A.setText(""+Soal4[1]);
            B.setText(""+Soal4[2]);
            C.setText(""+Soal4[3]);
            D.setText(""+Soal4[4]);
        }else if(angka == 6){
            txtSoal.setText(""+Soal5[0]);
            A.setText(""+Soal5[1]);
            B.setText(""+Soal5[2]);
            C.setText(""+Soal5[3]);
            D.setText(""+Soal5[4]);
        }else if(angka == 7){
            txtSoal.setText(""+Soal6[0]);
            A.setText(""+Soal6[1]);
            B.setText(""+Soal6[2]);
            C.setText(""+Soal6[3]);
            D.setText(""+Soal6[4]);
        }else if(angka == 8){
            txtSoal.setText(""+Soal7[0]);
            A.setText(""+Soal7[1]);
            B.setText(""+Soal7[2]);
            C.setText(""+Soal7[3]);
            D.setText(""+Soal7[4]);
        }else if(angka == 9){
            txtSoal.setText(""+Soal8[0]);
            A.setText(""+Soal8[1]);
            B.setText(""+Soal8[2]);
            C.setText(""+Soal8[3]);
            D.setText(""+Soal8[4]);
        }else if(angka == 10){
            txtSoal.setText(""+Soal9[0]);
            A.setText(""+Soal9[1]);
            B.setText(""+Soal9[2]);
            C.setText(""+Soal9[3]);
            D.setText(""+Soal9[4]);
        }
        Clear();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        Angka+=1;
        angka+=1;
        txtAngka.setText(""+angka);
        if (Angka==1) {
            if (B.isSelected()) {
                Benar +=1;
            }else{
                Salah +=1;
            }
        }if (angka == 2) {
            txtSoal.setText(""+Soal2[0]);
            A.setText(""+Soal2[1]);
            B.setText(""+Soal2[2]);
            C.setText(""+Soal2[3]);
            D.setText(""+Soal2[4]);
        }if (Angka==2) {
            if (B.isSelected()) {
                Benar +=1;
            }else{
                Salah +=1;
            } 
        }
        if (angka == 3) {
            txtSoal.setText(""+Soal3[0]);
            A.setText(""+Soal3[1]);
            B.setText(""+Soal3[2]);
            C.setText(""+Soal3[3]);
            D.setText(""+Soal3[4]);
        }if (Angka==3) {
            if (A.isSelected()) {
                Benar +=1;
            }else{
                Salah +=1;
            }
        }
        if (angka == 4) {
            txtSoal.setText(""+Soal4[0]);
            A.setText(""+Soal4[1]);
            B.setText(""+Soal4[2]);
            C.setText(""+Soal4[3]);
            D.setText(""+Soal4[4]);
        }if (Angka==4) {
            if (A.isSelected()) {
                Benar +=1;
            }else{
                Salah +=1;
            }
        }
        if (angka == 5) {
            txtSoal.setText(""+Soal5[0]);
            A.setText(""+Soal5[1]);
            B.setText(""+Soal5[2]);
            C.setText(""+Soal5[3]);
            D.setText(""+Soal5[4]);
        }if (Angka==5) {
            if (C.isSelected()) {
                Benar +=1;
            }else{
                Salah +=1;
            }
        }
        if (angka == 6) {
            txtSoal.setText(""+Soal6[0]);
            A.setText(""+Soal6[1]);
            B.setText(""+Soal6[2]);
            C.setText(""+Soal6[3]);
            D.setText(""+Soal6[4]);
        }if (Angka==6) {
            if (D.isSelected()) {
                Benar +=1;
            }else{
                Salah +=1;
            }
        }
        if (angka == 7) {
            txtSoal.setText(""+Soal7[0]);
            A.setText(""+Soal7[1]);
            B.setText(""+Soal7[2]);
            C.setText(""+Soal7[3]);
            D.setText(""+Soal7[4]);
        }if (Angka==7) {
            if (B.isSelected()) {
                Benar +=1;
            }else{
                Salah +=1;
            }
        }
        if (angka == 8) {
            txtSoal.setText(""+Soal8[0]);
            A.setText(""+Soal8[1]);
            B.setText(""+Soal8[2]);
            C.setText(""+Soal8[3]);
            D.setText(""+Soal8[4]);
        }if (Angka==8) {
            if (B.isSelected()) {
                Benar +=1;
            }else{
                Salah +=1;
            }
        }
        if (angka == 9) {
            txtSoal.setText(""+Soal9[0]);
            A.setText(""+Soal9[1]);
            B.setText(""+Soal9[2]);
            C.setText(""+Soal9[3]);
            D.setText(""+Soal9[4]);
        }if (Angka==9) {
            if (B.isSelected()) {
                Benar +=1;
            }else{
                Salah +=1;
            }
        }
        if (angka == 10) {
            txtSoal.setText(""+Soal10[0]);
            A.setText(""+Soal10[1]);
            B.setText(""+Soal10[2]);
            C.setText(""+Soal10[3]);
            D.setText(""+Soal10[4]);
        }if (Angka==10) {
            if (C.isSelected()) {
                Benar +=1;
            }else{
                Salah +=1;
            }
        }
        if(angka == 11) {
            Home frame1 = new Home();
            frame1.setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "Betul : "+Benar+"\n"+"Salah : "+Salah);
        }
        
        Clear();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "Betul : "+Benar+"\n"+"Salah : "+Salah);
    }//GEN-LAST:event_btnResultActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
        jawaban ="A";
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
        jawaban ="B";
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
        jawaban ="C";
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
        jawaban ="D";
    }//GEN-LAST:event_DActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KidQiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KidQiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KidQiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KidQiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KidQiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnResult;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtAngka;
    private javax.swing.JTextArea txtSoal;
    // End of variables declaration//GEN-END:variables
}
