/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action.event.example;

/**
 *
 * @author Roshan
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ActionEventExample extends JFrame implements ActionListener{
    private JList list;
    private DefaultListModel model;
    
    public ActionEventExample(){
        initUI();
    }
}
public final void initUI(){
JPanel panel = new JPanel();
panel.setLayout(null);

model = new DefaultListModel();
list = new JList(model);
list.setBounds(150,30,220,150);

JButton okButton = new JButton("Ok");
okButton.setBounds(30,35,80,25);

okButton.addActionListener(this);

panel.add(okButton);
panel.add(list);
add(panel);

set Title("Event Example");
setSize(420,250);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);

}
public void actionPerformed(ActionEvent e){

Locale locale = locale.getDefault();
Date date = new Date(e.getWhen());
String s = DateFormat.getTimeInstance(DateFormat.SHORT,locale).format(date);

if(!model.isEmpty()){
model.clear();
}

if(e.getID() == ActionEvent.ACTION_PERFORMED){
 model.addElement("Event Id: ACTION_PERFORMED");
}

model.addElement("Time: " + s);

String source = e.getSource().getClass().getName();
model.addElement("Source: "+source);

int mod = e.getModifiers();

StringBuffer buffer = new StringBuffer("Modifiers:");

if((mod & ActionEvent.ALT_MASK) > 0){
 buffer.append("Alt");
 }
if((mod & ActionEvent.SHIFT_MASK)> 0){
buffer.append("Shift");
 }
if((mod & ActionEvent.META_MASK)>0){
buffer.append("Meta");
 }
if((mod & ActionEvent.CTRL_MASK)>0){
buffer.append("Ctrl");
 }
model.addElement(buffer);
}
public class ActionEventExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                ActionEventExample ex = new ActionEventExample();
                ex.setVisible(true);
            }
        });
    }
    
//}
