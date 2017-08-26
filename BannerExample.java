/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner.example;

/**
 *
 * @author Roshan
 */
import java.awt.*;
import java.applet.*;
public class BannerExample extends Applet {

    /**
     * @param args the command line arguments
     */
    implements Runnable{
    String str = "This is a simple Banner";
    Thread t;
    boolean b;
    
    public void init(){
        setBackground(Color.gray);
        setForeground(Color.yellow);
    }
    public void start(){
        t = new Thread(this);
        b = false;
        t.start();
    }
    public void run(){
        char ch;
        for(;;){
            try{
                repaint();
                Thread.sleep(250);
                ch = str.charAt(0);
                str = str.substring(1,str.length());
                str = str + ch;
            }catch(InterruptedException e){
                
            }
        }
    }
    public void paint(Graphics g){
        g.drawRect(1,1,300,150);
        g.setColor(Color.yellow);
        g.fillRect(1, 1, 300, 150);
        g.setColor(Color.red);
        g.drawString(str,1,150);
    }
}
//Now compile the above code and call the generated
//class in your HTML code as follows:
<!--/*--------------------------------------------------
<HTML>
<HEAD>
</HEAD>
<BODY>
<div>
<APPLET CODE="BannerExample.class" WIDTH ="600" HEIGHT="400">
</APPLET>
</div>
</BODY>
</HTML>
--------------------------------------------------------------*/ -->

   public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
