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
    private JTextField loginT = new JTextField("Login");
    private JPasswordField passvord = new JPasswordField("passaword");
    private JLabel login = new JLabel("LOGIN");
    private JLabel senha = new JLabel("PASSWORD");
    private JLabel tuite = new JLabel("Last Twitts");
    private  JLabel status = new JLabel("Status");


    private BufferedImage backlist;
    private JList lixta1 = new JList();
    private JList listTuite = new JList();
    private JList listStatus = new JList();
    private JScrollPane scroll1 = new JScrollPane(lixta1);
    private JScrollPane tuitescroll = new JScrollPane(listTuite);
    private JScrollPane statusScroll = new JScrollPane(listStatus);
    public JLabel cred = new JLabel("MADE BY - LITTLE JAO- JILHERME && PANTENE");



    public Test(){


        super("My Personal Stump");
        try{
            backlist = ImageIO.read(new File("C:\\Users\\Thiago\\JASr\\lixta.jpg"));

        }catch (Exception e){
            e.printStackTrace();
        }
        add(status);
        add(tuite);
        add(senha);
        add(login);
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

        login.setSize(200,70);
        login.setLocation(200,140);
        login.setToolTipText(" Login");

        loginT.setSize(200,30);
        loginT.setLocation(300,160);
        loginT.setToolTipText("login");

        button1.setSize(65,30);
        button1.setLocation(520,160);
        button1.setToolTipText("Ok");



        cancel.setSize(65,30);
        cancel.setLocation(520,220);
        cancel.setToolTipText("cancel");


        senha.setSize(100,30);
        senha.setLocation(200,220);
        senha.setToolTipText("Password");

        passvord.setSize(200,30);
        passvord.setLocation(300,220);
        passvord.setToolTipText("password");

        scroll1.setLocation(780,100);
        scroll1.setSize(200,450);
        lixta1.setToolTipText("bots");

        tuitescroll.setLocation(450,400);
        tuitescroll.setSize(300,250);
        listTuite.setToolTipText("Last Tuites");
        tuite.setSize(100,80);
        tuite.setLocation(560,370);

        statusScroll.setLocation(80,400);
        statusScroll.setSize(300,250);
        listStatus.setToolTipText("Status");
        status.setLocation(200,370);
        status.setSize(100,80);


        cred.setLocation(350,1);
        cred.setSize(500,60);
        cred.setToolTipText("hhuehuehuehuhehueh");








        setSize(1000,700);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


    }



}


