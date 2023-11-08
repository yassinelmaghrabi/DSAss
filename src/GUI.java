import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JTextField studenttextarea;
    private JTextField coursetextarea;
    private JButton addButton;
    private JButton printButton;
    private JTextArea textArea1;
    private JPanel Jpanel;
    private JLabel StudentLable;
    private JLabel CourseLable;

    public GUI(){
        JFrame mainFrame= new JFrame();
        mainFrame.setContentPane(Jpanel);
        mainFrame.setTitle("Student Course Manager");
        mainFrame.setVisible(true);
        mainFrame.setSize(500,300);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TwoDLinkedList data = new TwoDLinkedList();


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    data.append(Integer.parseInt(studenttextarea.getText()), Integer.parseInt(coursetextarea.getText()));
                    System.out.println(1);
                }catch (Exception e1){
                    System.out.println("either Text Area is null");
                    textArea1.setText("either Text Area is null");
                }
            }
        });
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (studenttextarea.getText().isEmpty()&&!coursetextarea.getText().isEmpty()){
                    textArea1.setText(data.xfromy(Integer.parseInt(coursetextarea.getText())));
                }else if (coursetextarea.getText().isEmpty()){
                    textArea1.setText(data.yfromx(Integer.parseInt(studenttextarea.getText())));
                }else {
                    textArea1.setText("Wrong usage");
                }
            }
        });
    }
}
