import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        Panel p = new Panel();
        p.setLayout(new BorderLayout());
        JLabel one = new JLabel("0", SwingConstants.CENTER);
        JLabel two = new JLabel("0", SwingConstants.CENTER);
        JLabel three = new JLabel("0", SwingConstants.CENTER);

        p.add(one, BorderLayout.WEST);
        p.add(two, BorderLayout.CENTER);
        p.add(three, BorderLayout.EAST);
        JButton b = new JButton("Spin");
        p.add(b, BorderLayout.SOUTH);
        frame.getContentPane().add(p);
        frame.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                for (int i = 0; i < 10; i++) {
                    try{
                        Thread.sleep(200);
                        int n = rand.nextInt(61);
                        one.setText(getNum(n) + "");
                        System.out.println(getNum(n));
                    }catch(InterruptedException ex){
                        //do stuff
                    }
                }
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ex){
                    //do stuff
                }
                for (int i = 0; i < 10; i++) {
                    try{
                        Thread.sleep(200);
                        int n = rand.nextInt(61);
                        two.setText(getNum(n) + "");
                        System.out.println(getNum(n));
                    }catch(InterruptedException ex){
                        //do stuff
                    }
                }
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ex){
                    //do stuff
                }
                for (int i = 0; i < 10; i++) {
                    try{
                        Thread.sleep(200);
                        int n = rand.nextInt(61);
                        three.setText(getNum(n) + "");
                        System.out.println(getNum(n));
                    }catch(InterruptedException ex){
                        //do stuff
                    }
                }
            }
        });
    }

    static int getNum(int x) {
        if(x < 10) {
            return 1;
        }
        else if(x < 20) {
            return 2;
        }
        else if(x < 30) {
            return 3;
        }
        else if(x < 40) {
            return 4;
        }
        else if(x < 50) {
            return 5;
        }
        else if(x < 60) {
            return 6;
        }
        else {
            return 7;
        }
    }

}
