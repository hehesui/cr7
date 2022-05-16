import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class DemoFrame extends Frame implements MouseListner{
    Label l;
    DemoFrame(){
        super("AWT Frame");
        l = new Label();
        l.setBounds(25,60,250,30);
        l.setAlignment(Label.CENTER)

        this.add(l);
        this.setSize(300,300);
        this.setLayout(null);
        this.setVisible(true);

        this.addMouseListner(this);
        this.addWindowListner(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                @Override
                dispose();
            }
        })
    }

    public static void main(String[] args) {
        DemoFrame d=new DemoFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e){
        l.setText("Mouse Clicked");
    }
    @Override
    public void mousePressed(MouseEvent e){
    }
    @Override
    public void mouseReleased(MouseEvent e){
    }
    @Override
    public void mouseEntered(MouseEvent e){
    l.setText("Mouse Entered");
    }
    @Override
    public void mouseExited(MouseEvent e){
    l.setText("Mouse Exited");
    }
}