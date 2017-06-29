package myPack;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.List;
import javax.swing.JPanel;

public class Vizualization extends JPanel{
    //Список состояний массива
    private List<int[]> mainList;
    
    final int radius = 20;
    final BasicStroke[] stroke = {new BasicStroke(1), new BasicStroke(2), new BasicStroke(3)};

    public Graphics2D g2d;

    public Vizualization(List<int[]> a){
        mainList = a;
    }

    @Override
    public void paintComponents(Graphics g){
        super.paintComponent(g);

        g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(1));

        for(int i = 0; i < mainList.size(); i++){
            for(int q = 0; q < mainList.get(i).length; q++){
                if (mainList.get(i)[q]!=100000)
                    Krug(Integer.toString(mainList.get(i)[q]), q, i);
            }
        }

        super.revalidate();
    }
    
    public void paintOne(int numArr[], int tmp){
        g2d.setStroke(stroke[1]);
        
        for(int q = 0; q < numArr.length; q++){
            Krug(Integer.toString(numArr[q]), q, tmp);
        }
    }

    public void Krug(String str, int x, int y){
        g2d.draw(new Ellipse2D.Float(5 + (radius+10)*x, 5 + 40*y, radius, radius));
        g2d.drawString(str, 12 + 30*x, 20 + 40*y);
    }
}