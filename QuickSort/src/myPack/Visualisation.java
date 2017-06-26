package myPack;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.List;
import javax.swing.JPanel;

public class Visualisation extends JPanel{
    //Список состояний массива
    private List<int[]> mainList;
    //Линии, координаты которых основаны на индексах массива
    private List<int[]> linesList;
    
    final int radius = 20;
    
    public Visualisation(List<int[]> a, List<int[]> b){
        mainList = a;
        linesList = b;
    }
    
    public void paintComponents(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        for(int i = 0; i < mainList.size(); i++){
            for(int q = 0; q < mainList.get(i).length; q++){
                g2d.drawString(Integer.toString(mainList.get(i)[q]), 12 + 30*q, 20 + 40*i);
                g2d.draw(new Ellipse2D.Float(5 + q*(radius+10), 5 + 40*i , radius, radius));
            }
            
            if(i < linesList.size()){
                g2d.drawLine(15 + linesList.get(i)[0]*30, 25*(i+1) + i*15, 15 + linesList.get(i)[1]*30, (i+1)*43);
                g2d.drawLine(15 + linesList.get(i)[1]*30, 25*(i+1) + i*15, 15 + linesList.get(i)[0]*30, (i+1)*43);
            }            
        }
        
        //super.revalidate();
        //super.repaint();
    }
}
