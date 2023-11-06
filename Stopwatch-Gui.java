import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StopwatchJava extends javax.swing.JFrame {

    private JFrame frame;
    private JLabel timerLabel;
    private Timer timer;
    private int seconds = 0;
    
    public StopwatchJava() {
        initComponents();
        setTitle("Stopwatch");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        secTxt = new javax.swing.JTextField();
        minTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        stopBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 400));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText(":");

        secTxt.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        secTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secTxt.setText("00");
        secTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secTxtActionPerformed(evt);
            }
        });

        minTxt.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        minTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minTxt.setText("00");
        minTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minTxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel1.setText("Minutes");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel2.setText("Seconds");

        startBtn.setBackground(new java.awt.Color(0, 204, 51));
        startBtn.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        startBtn.setForeground(new java.awt.Color(255, 255, 255));
        startBtn.setText("START");
        startBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(255, 204, 0));
        resetBtn.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("RESET");
        resetBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        stopBtn.setBackground(new java.awt.Color(204, 0, 0));
        stopBtn.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        stopBtn.setForeground(new java.awt.Color(255, 255, 255));
        stopBtn.setText("STOP");
        stopBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        stopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setText("STOPWATCH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(minTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(startBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(secTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(23, 23, 23)))
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void stopBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        stopTimer();
    }                                       

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (timer == null || !timer.isRunning()) {
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    seconds++;
                    updateDisplay();
                }
            });
            timer.start();
        }
    }                                        
    private void stopTimer() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
    }
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        stopTimer();
        seconds = 0;
        minTxt.setText("00");
        secTxt.setText("00");
    }                                        

    private void minTxtActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }                                      

    private void secTxtActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }                                      

    public void updateDisplay(){
        int minutes = seconds / 60;
        int secs = seconds % 60;
        
        if(Integer.parseInt(minTxt.getText()) < 10 || Integer.parseInt(secTxt.getText()) < 10){
            minTxt.setText("0" + String.valueOf(minutes));
            if(Integer.parseInt(secTxt.getText()) >= 9){
                secTxt.setText(String.valueOf(secs));
            }else{
                if(Integer.parseInt(secTxt.getText()) <= 59){
                    secTxt.setText("0" + String.valueOf(secs));
                }else{
                    secTxt.setText(String.valueOf(secs));
                }
            }
        }else{
            minTxt.setText(String.valueOf(minutes));
            secTxt.setText(String.valueOf(secs));
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StopwatchJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField minTxt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField secTxt;
    private javax.swing.JButton startBtn;
    private javax.swing.JButton stopBtn;
    // End of variables declaration                   
}
