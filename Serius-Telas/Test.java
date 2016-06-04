import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.text.AttributedCharacterIterator;

/**
 * Created by Thiago on 03/06/2016.
 */
public class Test extends JFrame{
    private JPanel panel;
    private JLabel back = new JLabel(new ImageIcon("C:\\Users\\Thiago\\JASr\\wallhaven-367832.png"));
    private JButton button1 = new JButton("OK");
    private JButton cancel = new JButton("Cancel");
    private JTextField loginT = new JTextField();
    private JPasswordField passvord = new JPasswordField();

    private BufferedImage backlist;
    private JList lixta1 = new JList();
    private JList listTuite = new JList();
    private JList listStatus = new JList();
    private JScrollPane scroll1 = new JScrollPane(lixta1);
    private JScrollPane tuitescroll = new JScrollPane(listTuite);
    private JScrollPane statusScroll = new JScrollPane(listStatus);
    public JLabel cred = new JLabel("MADE BY - LITTLE JAO- JILHERME && PANTENE");



    public Test(){


        super("Login");
        try{
            backlist = ImageIO.read(new File("C:\\Users\\Thiago\\JASr\\lixta.jpg"));

        }catch (Exception e){
            e.printStackTrace();
        }
        add(cred);
        add(scroll1);
        add(tuitescroll);
        add(statusScroll);
        add(tuitescroll);
        add(statusScroll);
        add(passvord);
        add(cancel);
        add(loginT);
        add(button1);
        add(back);

        loginT.setSize(200,30);
        loginT.setLocation(300,160);
        loginT.setToolTipText("login");

        button1.setSize(65,30);
        button1.setLocation(520,160);
        button1.setToolTipText("Ok");



        cancel.setSize(65,30);
        cancel.setLocation(520,220);
        cancel.setToolTipText("cancel");

        passvord.setSize(200,30);
        passvord.setLocation(300,220);
        passvord.setToolTipText("password");

        scroll1.setLocation(780,100);
        scroll1.setSize(200,450);
        lixta1.setToolTipText("bots");

        tuitescroll.setLocation(450,400);
        tuitescroll.setSize(300,250);
        listTuite.setToolTipText("Last Tuites");


        statusScroll.setLocation(80,400);
        statusScroll.setSize(300,250);
        listStatus.setToolTipText("Status");



        cred.setLocation(350,1);
        cred.setSize(500,60);
        cred.setToolTipText("hhuehuehuehuhehueh");








        setSize(1000,700);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


    }



}


