import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JOptionPane;
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
        if (g2 == null)
            g2 = (Graphics2D) jPanel1.getGraphics();
        jPanel1.update(g2);
    }
    
    private Ellipse2D circbuffer;
    private Graphics2D g2;
    
    final int radius = 20;
    final int step = 25;

    int numArr[], curr_pos = 0;
    boolean draw = true;
    
    //Список состояний массива
    private List<int[]> mainList = new ArrayList<int[]>();
    //Обводка
    private List<int[]> linesList = new ArrayList<int[]>();
    
    //@SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
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

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("View");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jButton4)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Введите массив");
            return;
        }
        
        mainList.clear();
        linesList.clear();
        jPanel1.removeAll();
        jPanel1.update(g2);
        jPanel1.revalidate();
        
        GetNums();
        mainList.add(numArr.clone());
        quickSort(0, numArr.length - 1);
        
        if(draw) Draw(mainList.size());
        SetNums();
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(curr_pos == 0){
            draw = false;
            jButton1ActionPerformed(evt);
        }else{
            jButton3.setEnabled(true);
        }
         
        //JOptionPane.showMessageDialog(null, mainList.size());
        
        if(curr_pos + 1> mainList.size())
        {
            jButton4.setEnabled(false);
            jButton3.setEnabled(true);
            
            SetNums();
            
            return;
        }
        
        //Нужно удалить всё и отрисовать заного
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.update(g2);
        //jPanel1.repaint();
        
        curr_pos++;
        Draw(curr_pos);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(curr_pos - 2 < 0)
        {
            jButton3.setEnabled(false);
            return;
        }
        jButton4.setEnabled(true);
        
        //Нужно удалить всё и отрисовать заного
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.update(g2);
        //jPanel1.repaint();
        
        curr_pos--;
        Draw(curr_pos);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        curr_pos = 0;
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        draw = jCheckBox2.isSelected();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
        
        //JOptionPane.showMessageDialog(null, "Массив отсортирован, наслаждайся!");
    }
    
    private void quickSort(int left, int right) {
        int i = left, j = right;
        int tmp, tmp_line[] = new int[3];
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
                
                if(i != j){
                    tmp_line[0] = i;
                    tmp_line[1] = j;
                    tmp_line[2] = (left + right) / 2;

                    linesList.add(tmp_line.clone());
                    mainList.add(numArr.clone()); //ADD
                }

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
    
    private void Draw (int step) {
        if(!draw && !jCheckBox2.isSelected()) return;
        
        for(int i = 0; i < step; i++){
            for(int q = 0; q < numArr.length; q++){
                if(i < step - 1 && (q == linesList.get(i)[0] || q == linesList.get(i)[1] || q == linesList.get(i)[2])){
                    if(q == linesList.get(i)[2]){
                        g2.setStroke(new BasicStroke(2));
                        g2.setColor(Color.red);
                    }else{
                        g2.setColor(Color.blue);
                        
                        g2.drawLine(-5 + linesList.get(i)[0]*(radius+10) + radius, 5 + 40*i + radius, -5 + linesList.get(i)[1]*(radius+10) + radius, 5 + (i+1)*40);
                        g2.drawLine(-5 + linesList.get(i)[1]*(radius+10) + radius, 5 + 40*i + radius, -5 + linesList.get(i)[0]*(radius+10) + radius, 5 + (i+1)*40);
                    }
                }

                g2.drawString(Integer.toString(mainList.get(i)[q]), 12 + 30*q, 20 + 40*i);
                g2.draw(new Ellipse2D.Float(5 + q*(radius+10), 5 + 40*i , radius, radius));
                
                g2.setStroke(new BasicStroke(1));
                g2.setColor(Color.BLACK);
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
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
