package myPack;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.List;
import javax.swing.JPanel;

public class Vizualization extends JPanel{
    //Список состояний массива
    private List<int[]> mainList;
    //Линии, координаты которых основаны на индексах массива
    //private List<int[]> linesList;

    final int radius = 20;

    public Graphics2D g2d;

    public Vizualization(List<int[]> a){
        mainList = a;
    }

    @Override
    public void paintComponents(Graphics g){
        super.paintComponent(g);

        g2d = (Graphics2D) g;
        //JOptionPane.showMessageDialog(null, mainList.size());

        for(int i = 0; i < mainList.size(); i++){
            for(int q = 0; q < mainList.get(i).length; q++){
                if (mainList.get(i)[q]!=100000) Krug(Integer.toString(mainList.get(i)[q]), q, i);
            }

            /**if(i < linesList.size()){
             g2d.drawLine(15 + linesList.get(i)[0]*30, 25*(i+1) + i*15, 15 + linesList.get(i)[1]*30, (i+1)*43);
             g2d.drawLine(15 + linesList.get(i)[1]*30, 25*(i+1) + i*15, 15 + linesList.get(i)[0]*30, (i+1)*43);
             }*/
        }

        super.revalidate();
    }

    public void Krug(String str, int x, int y){
        g2d.draw(new Ellipse2D.Float(5 + (radius+10)*x, 5 + 40*y, radius, radius));
        g2d.drawString(str, 12 + 30*x, 20 + 40*y);
    }
}