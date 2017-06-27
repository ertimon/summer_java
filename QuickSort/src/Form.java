import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;

import java.util.Scanner;
import javax.swing.JFileChooser;

import myPack.Visualisation;
        
public class Form extends javax.swing.JFrame {
    public Form() {
        initComponents();
    }
    
    public Graphics2D g2;
    // ???
    
    int numArr[], curr_pos = 0;
    boolean draw = true;
    long start, end;
    
    //Список состояний массива
    private List<int[]> mainList = new ArrayList<int[]>();
    //Линии, координаты которых основаны на индексах массива
    private List<int[]> linesList = new ArrayList<int[]>();
        
    public Visualisation Draw = new Visualisation(mainList, linesList);
    //Draw.paintComponents(???);
    
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
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1411, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(jButton4)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Введите массив");
            return;
        }
        jPanel1.update(g2);
        
        mainList.clear();
        linesList.clear();
        
        GetNums();
        //mainList.add(numArr.clone());
        start = System.nanoTime();
        quickSort(0, numArr.length - 1);
        end = System.nanoTime();
        Draw.paintComponents(g2);
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
            jButton1ActionPerformed(null);
        }else{
            jButton3.setEnabled(true);
        }
        
        if(curr_pos + 1> mainList.size())
        {
            jButton4.setEnabled(false);
            jButton3.setEnabled(true);
            
            SetNums();
            
            return;
        }
        
        curr_pos++;
        //Draw.repaint_curr(curr_pos);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(curr_pos - 2 < 0)
        {
            jButton3.setEnabled(false);
            return;
        }
        jButton4.setEnabled(true);
        
        curr_pos--;
        //Draw.repaint_curr(curr_pos);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        curr_pos = 0;
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        draw = jCheckBox2.isSelected();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        Draw.repaint();
    }//GEN-LAST:event_formWindowStateChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        g2 = (Graphics2D) jPanel1.getGraphics();
    }//GEN-LAST:event_formComponentShown
   
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
        
       //JOptionPane.showMessageDialog(null, "Время сортировки: " + (end - start)/1000 + " мс" );
    }
    
    private void quickSort(int left, int right) {
      int i = left, j = right;
      int tmp, tmp_line[] = new int[2];
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
                    linesList.add(tmp_line);
                      
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
    
    /**private void DrawAll () {
        if(!draw) return;
        
        for(int i = 0; i < mainList.size(); i++){
            for(int q = 0; q < numArr.length; q++){
                g2.drawString(Integer.toString(mainList.get(i)[q]), 12 + 30*q, 20 + 40*i);
                g2.draw(new Ellipse2D.Float(5 + q*(radius+10), 5 + 40*i , radius, radius));
            }
            
            if(i < linesList.size()){
                g2.drawLine(15 + linesList.get(i)[0]*30, 25*(i+1) + i*15, 15 + linesList.get(i)[1]*30, (i+1)*43);
                g2.drawLine(15 + linesList.get(i)[1]*30, 25*(i+1) + i*15, 15 + linesList.get(i)[0]*30, (i+1)*43);
            }            
        }
        
        jPanel1.revalidate();
    }
    
    private void DrawCurr(int step) {
        for(int i = 0; i < step; i++){
            for(int q = 0; q < numArr.length; q++){
                g2.drawString(Integer.toString(mainList.get(i)[q]), 12 + 30*q, 20 + 40*i);
                g2.draw(new Ellipse2D.Float(5 + q*(radius+10), 5 + 40*i , radius, radius));
            }
            
            if(i < step - 1){
                g2.drawLine(15 + linesList.get(i)[0]*30, 25*(i+1) + i*15, 15 + linesList.get(i)[1]*30, (i+1)*43);
                g2.drawLine(15 + linesList.get(i)[1]*30, 25*(i+1) + i*15, 15 + linesList.get(i)[0]*30, (i+1)*43);
            }
        }
        
        jPanel1.revalidate();
    }*/
    
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
