import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RISJFrame extends javax.swing.JFrame {

    public RISJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    //function
    public void ItemCost(){
        double sum = 0;
        for (int i = 0; i <jTable1.getRowCount(); i++){
            sum = sum + Double.parseDouble(jTable1.getValueAt(i, 2).toString());
        }
        txtSTotal.setText(Double.toString(sum));
        double cTotal1 = Double.parseDouble(txtSTotal.getText());
        
        double cTax = (cTotal1 * 12)/100;
        String iTaxTotal = String.format("P %.2f", cTax);
        txtTax.setText(iTaxTotal);
        
        String iSubTotal = String.format("P %.2f", cTotal1);
        txtSTotal.setText(iSubTotal);
        
        String iTotal = String.format("P %.2f", cTotal1 + cTax);
        txtTotal.setText(iTotal);
        }
    
    public void Change(){
        double sum = 0;
        double tax = 12;
        double cash = Double.parseDouble(Display.getText());
        
        for (int i = 0; i <jTable1.getRowCount(); i++){
            sum = sum + Double.parseDouble(jTable1.getValueAt(i, 2).toString());
    }
        double cTax = (sum *12)/100;
        double cChange = (cash - (sum + cTax));
        
        String ChangeGiven = String.format(" P %.2f",cChange);
        Change.setText(ChangeGiven);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnclr = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lungo = new javax.swing.JButton();
        black = new javax.swing.JButton();
        americano = new javax.swing.JButton();
        redeye = new javax.swing.JButton();
        cappuccino = new javax.swing.JButton();
        latte = new javax.swing.JButton();
        macchiato = new javax.swing.JButton();
        flatwhite = new javax.swing.JButton();
        galao = new javax.swing.JButton();
        mocha = new javax.swing.JButton();
        irish = new javax.swing.JButton();
        affogato = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        lblSubTotal1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtSTotal = new javax.swing.JTextField();
        txtTax = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        lvlPmethod = new javax.swing.JLabel();
        lblCash = new javax.swing.JLabel();
        lblChange = new javax.swing.JLabel();
        Display = new javax.swing.JTextField();
        Change = new javax.swing.JTextField();
        Payment = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(195, 176, 144));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 100));

        btn8.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, 100));

        btn4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 100));

        btn5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 80, 100));

        btn6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 80, 100));

        btn1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, 100));

        btn2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, 100));

        btn3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 80, 100));

        btndot.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        btndot.setText(".");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });
        jPanel1.add(btndot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, 100));

        btn0.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 80, 100));

        btnclr.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        btnclr.setText("c");
        btnclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclrActionPerformed(evt);
            }
        });
        jPanel1.add(btnclr, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 80, 100));

        btn9.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 80, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 510));

        jPanel2.setBackground(new java.awt.Color(195, 176, 144));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lungo.setBackground(new java.awt.Color(147, 110, 78));
        lungo.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        lungo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lungo.jpg"))); // NOI18N
        lungo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lungoActionPerformed(evt);
            }
        });
        jPanel2.add(lungo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 170, 150));

        black.setBackground(new java.awt.Color(147, 110, 78));
        black.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        black.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/black.jpg"))); // NOI18N
        black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackActionPerformed(evt);
            }
        });
        jPanel2.add(black, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 150));

        americano.setBackground(new java.awt.Color(147, 110, 78));
        americano.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        americano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/americano.jpg"))); // NOI18N
        americano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americanoActionPerformed(evt);
            }
        });
        jPanel2.add(americano, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 170, 150));

        redeye.setBackground(new java.awt.Color(147, 110, 78));
        redeye.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        redeye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/red eye.jpg"))); // NOI18N
        redeye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redeyeActionPerformed(evt);
            }
        });
        jPanel2.add(redeye, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 170, 150));

        cappuccino.setBackground(new java.awt.Color(147, 110, 78));
        cappuccino.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        cappuccino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/capuccino.jpg"))); // NOI18N
        cappuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cappuccinoActionPerformed(evt);
            }
        });
        jPanel2.add(cappuccino, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 150));

        latte.setBackground(new java.awt.Color(147, 110, 78));
        latte.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        latte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/latte.jpg"))); // NOI18N
        latte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latteActionPerformed(evt);
            }
        });
        jPanel2.add(latte, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 170, 150));

        macchiato.setBackground(new java.awt.Color(147, 110, 78));
        macchiato.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        macchiato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/macchiato.jpg"))); // NOI18N
        macchiato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macchiatoActionPerformed(evt);
            }
        });
        jPanel2.add(macchiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 170, 150));

        flatwhite.setBackground(new java.awt.Color(147, 110, 78));
        flatwhite.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        flatwhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled-2.jpg"))); // NOI18N
        flatwhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flatwhiteActionPerformed(evt);
            }
        });
        jPanel2.add(flatwhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 170, 150));

        galao.setBackground(new java.awt.Color(147, 110, 78));
        galao.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        galao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/galao.jpg"))); // NOI18N
        galao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                galaoActionPerformed(evt);
            }
        });
        jPanel2.add(galao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 170, 150));

        mocha.setBackground(new java.awt.Color(147, 110, 78));
        mocha.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        mocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mocha.jpg"))); // NOI18N
        mocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mochaActionPerformed(evt);
            }
        });
        jPanel2.add(mocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 170, 150));

        irish.setBackground(new java.awt.Color(147, 110, 78));
        irish.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        irish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/irish.jpg"))); // NOI18N
        irish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irishActionPerformed(evt);
            }
        });
        jPanel2.add(irish, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 170, 150));

        affogato.setBackground(new java.awt.Color(147, 110, 78));
        affogato.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        affogato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/affogato.jpg"))); // NOI18N
        affogato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affogatoActionPerformed(evt);
            }
        });
        jPanel2.add(affogato, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 170, 150));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 770, 510));

        jTable1.setBackground(new java.awt.Color(195, 176, 144));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "QTY", "AMOUNT"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 270, 510));

        jPanel3.setBackground(new java.awt.Color(195, 176, 144));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(169, 156, 115));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotal.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        lblTotal.setText("Total");
        jPanel5.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lblTax.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        lblTax.setText("Tax");
        jPanel5.add(lblTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lblSubTotal1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        lblSubTotal1.setText("SubTotal");
        jPanel5.add(lblSubTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtTotal.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jPanel5.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, 40));

        txtSTotal.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jPanel5.add(txtSTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 210, 40));

        txtTax.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        txtTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaxActionPerformed(evt);
            }
        });
        jPanel5.add(txtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 210, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 420, 200));

        jPanel6.setBackground(new java.awt.Color(169, 156, 115));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lvlPmethod.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 32)); // NOI18N
        lvlPmethod.setText("Payment method");
        jPanel6.add(lvlPmethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblCash.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        lblCash.setText("Cash");
        jPanel6.add(lblCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lblChange.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        lblChange.setText("Change");
        jPanel6.add(lblChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        Display.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });
        jPanel6.add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 210, 40));

        Change.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeActionPerformed(evt);
            }
        });
        jPanel6.add(Change, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 210, 40));

        Payment.setFont(new java.awt.Font("Trebuchet MS", 0, 30)); // NOI18N
        Payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Visa Card", "Master Card", " " }));
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });
        jPanel6.add(Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 210, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 460, 200));

        jPanel7.setBackground(new java.awt.Color(169, 156, 115));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReset.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        btnReset.setText("R E S E T");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel7.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 180, 50));

        btnPay.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        btnPay.setText("P A Y");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        jPanel7.add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 50));

        btnExit.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        btnExit.setText("E  X  I  T");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel7.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 360, 50));

        btnRemove.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        btnRemove.setText("R E M O V E");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel7.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 50));

        jButton5.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jButton5.setText("jButton1");
        jPanel7.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 50));

        jButton6.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jButton6.setText("jButton1");
        jPanel7.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 170, 50));

        btnPrint.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        btnPrint.setText("P R I N T");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel7.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 50));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 380, 200));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 1360, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclrActionPerformed
        Display.setText("");
        Change.setText("");
    }//GEN-LAST:event_btnclrActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
         String Enternumber = Display.getText();
       if (Enternumber == ""){
           Display.setText(btn6.getText());
       }
       else{
           Enternumber = Display.getText() + btn6.getText();
           Display.setText(Enternumber);
       }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         String Enternumber = Display.getText();
       if (Enternumber == ""){
           Display.setText(btn8.getText());
       }
       else{
           Enternumber = Display.getText() + btn8.getText();
           Display.setText(Enternumber);
       }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
         String Enternumber = Display.getText();
       if (Enternumber == ""){
           Display.setText(btn1.getText());
       }
       else{
           Enternumber = Display.getText() + btn1.getText();
           Display.setText(Enternumber);
       }
    }//GEN-LAST:event_btn1ActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayActionPerformed

    private void ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangeActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         String Enternumber = Display.getText();
       if (Enternumber == ""){
           Display.setText(btn2.getText());
       }
       else{
           Enternumber = Display.getText() + btn2.getText();
           Display.setText(Enternumber);
       }
    }//GEN-LAST:event_btn2ActionPerformed

    private void txtTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaxActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
         String Enternumber = Display.getText();
       if (Enternumber == ""){
           Display.setText(btn9.getText());
       }
       else{
           Enternumber = Display.getText() + btn9.getText();
           Display.setText(Enternumber);
       }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String Enternumber = Display.getText();
       if (Enternumber == ""){
           Display.setText(btn7.getText());
       }
       else{
           Enternumber = Display.getText() + btn7.getText();
           Display.setText(Enternumber);
       }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
         String Enternumber = Display.getText();
       if (Enternumber == ""){
           Display.setText(btn4.getText());
       }
       else{
           Enternumber = Display.getText() + btn4.getText();
           Display.setText(Enternumber);
       }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
         String Enternumber = Display.getText();
       if (Enternumber == ""){
           Display.setText(btn5.getText());
       }
       else{
           Enternumber = Display.getText() + btn5.getText();
           Display.setText(Enternumber);
       }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        if (! Display.getText().contains("."))
        {   
            Display.setText(Display.getText() + btndot.getText());
        }
    }//GEN-LAST:event_btndotActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
         String Enternumber = Display.getText();
       if (Enternumber == ""){
           Display.setText(btn0.getText());
       }
       else{
           Enternumber = Display.getText() + btn0.getText();
           Display.setText(Enternumber);
       }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         String Enternumber = Display.getText();
       if (Enternumber == ""){
           Display.setText(btn3.getText());
       }
       else{
           Enternumber = Display.getText() + btn3.getText();
           Display.setText(Enternumber);
       }
    }//GEN-LAST:event_btn3ActionPerformed

    private void blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackActionPerformed
        double Price = 39;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Black", "1", Price});
        ItemCost();
    }//GEN-LAST:event_blackActionPerformed

    private void americanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americanoActionPerformed
        double Price = 79;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Americano", "1", Price});
        ItemCost();
    }//GEN-LAST:event_americanoActionPerformed

    private void redeyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redeyeActionPerformed
        double Price = 79;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Red Eye", "1", Price});
        ItemCost();
    }//GEN-LAST:event_redeyeActionPerformed

    private void lungoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lungoActionPerformed
        double Price = 79;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Lungo", "1", Price});
        ItemCost();
    }//GEN-LAST:event_lungoActionPerformed

    private void cappuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cappuccinoActionPerformed
        double Price = 99;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Cappuccino", "1", Price});
        ItemCost();
    }//GEN-LAST:event_cappuccinoActionPerformed

    private void latteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latteActionPerformed
        double Price = 99;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Latte", "1", Price});
        ItemCost();
    }//GEN-LAST:event_latteActionPerformed

    private void macchiatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macchiatoActionPerformed
        double Price = 99;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Macchiato", "1", Price});
        ItemCost();
    }//GEN-LAST:event_macchiatoActionPerformed

    private void flatwhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flatwhiteActionPerformed
        double Price = 99;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Flat White", "1", Price});
        ItemCost();
    }//GEN-LAST:event_flatwhiteActionPerformed

    private void galaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_galaoActionPerformed
        double Price = 99;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Galao", "1", Price});
        ItemCost();
    }//GEN-LAST:event_galaoActionPerformed

    private void mochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mochaActionPerformed
        double Price = 109;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Mocha", "1", Price});
        ItemCost();
    }//GEN-LAST:event_mochaActionPerformed

    private void irishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irishActionPerformed
        double Price = 109;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Irish", "1", Price});
        ItemCost();
    }//GEN-LAST:event_irishActionPerformed

    private void affogatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affogatoActionPerformed
        double Price = 149;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Affogato", "1", Price});
        ItemCost();
    }//GEN-LAST:event_affogatoActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        if (Payment.getSelectedItem().equals("Cash")){
        Change();
    }
        else
               {
                Change.setText("");
                Display.setText("");
                }
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        Change.setText("");
        txtTax.setText("");
        txtTotal.setText("");
        txtSTotal.setText("");
        Display.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        MessageFormat header = new MessageFormat("COFFEE & CHILL");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try{
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e){
            System.err.format("No Printer found", e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        int RemoveItem = jTable1.getSelectedRow();
        if(RemoveItem >= 0){
            model.removeRow(RemoveItem);
        }
        ItemCost();
        
        if (Payment.getSelectedItem().equals("Cash")){
        Change();
    }
        else
               {
                Change.setText("");
                Display.setText("");
                }
    }//GEN-LAST:event_btnRemoveActionPerformed
    private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to EXIT","COFFEE & CHILL", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }     
    }//GEN-LAST:event_btnExitActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RISJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RISJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RISJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RISJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RISJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Change;
    private javax.swing.JTextField Display;
    private javax.swing.JComboBox<String> Payment;
    private javax.swing.JButton affogato;
    private javax.swing.JButton americano;
    private javax.swing.JButton black;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnclr;
    private javax.swing.JButton btndot;
    private javax.swing.JButton cappuccino;
    private javax.swing.JButton flatwhite;
    private javax.swing.JButton galao;
    private javax.swing.JButton irish;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton latte;
    private javax.swing.JLabel lblCash;
    private javax.swing.JLabel lblChange;
    private javax.swing.JLabel lblSubTotal1;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JButton lungo;
    private javax.swing.JLabel lvlPmethod;
    private javax.swing.JButton macchiato;
    private javax.swing.JButton mocha;
    private javax.swing.JButton redeye;
    private javax.swing.JTextField txtSTotal;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    
}
