import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.List;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.io.File;
import java.io.IOException;

import java.util.Scanner;
import javax.swing.JFileChooser;

public class Form extends javax.swing.JFrame {

    public Form() {
        initComponents();
    }
    
    private Ellipse2D circbuffer;
    private Graphics2D g2;
    private JLabel label;
    
    final int radius = 20;
    final int step = 25;
    int numArr[], curr_pos = 0;
    boolean draw = true;
    
    //Список состояний массива
    private List<int[]> mainList = new ArrayList<int[]>();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
        );

        jButton2.setText("File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Steps");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        jButton3.setText("Prev");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Next");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jCheckBox1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.removeAll();
        
        if(jTextField1.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Введи массив, сука!");
            return;
        }
        
        if (g2 == null) g2 = (Graphics2D) jPanel1.getGraphics();
        jPanel1.update(g2);
        
        GetNums();
        quickSort(0, numArr.length - 1);
        SetNums();
        
        if(draw) DrawAll();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        try(Scanner in = new Scanner(f))
        {
            jTextField1.setText(in.nextLine());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        if(jCheckBox1.isSelected()){
            //jButton3.setEnabled(true);
            jButton4.setEnabled(true);
        }else{
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(curr_pos == 0){
            draw = false;
            jButton1ActionPerformed(null);
        }else{
            jButton3.setEnabled(true);
        }
        
        if(curr_pos + 1 > mainList.size())
        {
            jButton4.setEnabled(false);
            jButton3.setEnabled(true);
            return;
        }
        
        //Нужно удалить всё и отрисовать заного
        jPanel1.removeAll();
        jPanel1.revalidate();
        //jPanel1.repaint();
        
        curr_pos++;
        DrawCurr(curr_pos);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(curr_pos - 1 < 0)
        {
            jButton4.setEnabled(true);
            jButton3.setEnabled(false);
            return;
        }
        
        //Нужно удалить всё и отрисовать заного
        jPanel1.removeAll();
        jPanel1.revalidate();
        //jPanel1.repaint();
        
        curr_pos--;
        DrawCurr(curr_pos);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void GetNums(){
        String strArr[] = jTextField1.getText().split(" ");
        numArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            numArr[i] = Integer.parseInt(strArr[i]);
        }
    }
    
    private void SetNums(){
        String result = "";
        
        for(int i = 0; i < numArr.length; i++)
            result += Integer.toString(numArr[i]) + " ";
        jTextField1.setText(result);       
    }
    
    private void quickSort(int left, int right) {
      //Добавляем в общий список только на первом нажатии
      //if(tap_count == 1) 
          mainList.add(numArr.clone());  
        
      int i = left, j = right;
      int tmp;
      int pivot = numArr[(left + right) / 2];

      /* partition */
      while (i <= j) {
            while (numArr[i] < pivot)
                  i++;
            while (numArr[j] > pivot)
                  j--;
            if (i <= j) {
                  tmp = numArr[i];
                  numArr[i] = numArr[j];
                  numArr[j] = tmp;
                  i++;
                  j--;
            }
      }

      /* recursion */
      if (left < j){
            quickSort(left, j);
      }
      if (i < right){
            quickSort(i, right);
      }
    }
    
    private void DrawAll () {
        for(int i = 0; i < mainList.size(); i++){
            for(int q = 0; q < mainList.get(i).length; q++){
                circbuffer = new Ellipse2D.Float(5 + q*(radius+10), 5 + 30*i , radius, radius);

                /**label = new JLabel(Integer.toString(mainList.get(i)[q]), JLabel.CENTER);
                label.setVisible(true);
                label.setSize(50, 200);
                label.setLocation(-10 + 30*q, -85 + 30*i);*/
                
                g2.drawString(Integer.toString(mainList.get(i)[q]), 12 + 30*q, 20 + 30*i);
                g2.draw(circbuffer);
                //jPanel1.add(label);
            }
        }
        
        jPanel1.revalidate();
    }
    
    private void DrawCurr(int step) {
           for(int i = 0; i < step; i++){
            for(int q = 0; q < mainList.get(i).length; q++){
                circbuffer = new Ellipse2D.Float(5 + q*(radius+10), 5 + 30*i , radius, radius);

                /**label = new JLabel(Integer.toString(mainList.get(i)[q]), JLabel.CENTER);
                label.setVisible(true);
                label.setSize(50, 200);
                label.setLocation(-10 + 30*q, -85 + 30*i);*/
                
                g2.drawString(Integer.toString(mainList.get(i)[q]), 12 + 30*q, 20 + 30*i);
                g2.draw(circbuffer);
                //jPanel1.add(label);
            }
        }
        
        jPanel1.revalidate();
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
