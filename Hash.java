package dodatkowe;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Hashtable;

public class Hash {
    JFrame f;
    JTextArea t,tr;
    String text;
    Hash hash;
    HashMap hm;
    Hashtable<String, Integer> ht = new Hashtable<>();

    Hash(){
        f = new JFrame();
        f.setLayout(null);
        f.setDefaultCloseOperation(2);
        f.getBackground().getGreen();
        f.setSize(600,700);

        t = new JTextArea();
        t.setBounds(5,5,200,200);
        t.setLayout(null);

        tr = new JTextArea();
        tr.setBounds(300,5,500,300);
        t.setLayout(null);
        t.addKeyListener(new KeyListener() {
            @Override public void keyTyped(KeyEvent e) {
                try {
                    if (e.getKeyCode()==0){
                        text = t.getText();
                        t.setText("");
                        ht.put(text,1);
                        tr.setText(t.getText()+ht);
                    }else{
                        tr.setText(t.getText()+e.getKeyCode());
                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }
            }
            @Override public void keyPressed(KeyEvent e) {

            }
            @Override public void keyReleased(KeyEvent e) {

            }
        });
        f.add(t);
        f.add(tr);
        f.setVisible(true);
    }

    public static void main(String[] args) {
//        Hash h = new Hash();
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1,"Karol");

        System.out.println(ht);
    }
}
