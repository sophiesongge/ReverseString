import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class EventListener1 extends JFrame implements ActionListener {
    private JButton bt1, bt2;
    private JTextArea jtf1;
    private JPanel jpanel;
    private String Text = "!UOY EVOL I";
    /**
     * Java事件监听处理——自身类实现ActionListener接口，作为事件监听器
     *
     * @author codebrother
     */
    // 构造方法
    public EventListener1() {
        // 设置标题栏内容
        setTitle("反转字符串");
        // 设置初始化窗口位置
        setBounds(200, 200, 700, 200);
        // 设置窗口布局
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        // 创建按钮对象
        bt1 = new JButton("Text");
        bt2 = new JButton("ReverseText");
        // 将按钮添加事件监听器
        bt1.addActionListener(this);
        bt2.addActionListener(this);

        jtf1 = new JTextArea(10,8);
        jtf1.setFont(new Font("Helvetica", Font.BOLD, 106));
        jtf1.setBackground(Color.pink);
        this.add("Center", jtf1);

        jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(1, 3));


        // 把按钮容器添加到JFrame容器上
        jpanel.add(bt1);
        jpanel.add(bt2);
        //jpanel.add("Center", jtf1);
        contentPane.add(jpanel, BorderLayout.SOUTH);
        // 设置窗口可视化
        setVisible(true);
        // 设置窗口关闭
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1){
            jtf1.setText(Text);
        } else if (e.getSource() == bt2){
            String text2 = this.reverse(Text);
            jtf1.setText(text2);
        }
    }

    public static void main(String[] args) {
        new EventListener1();
    }

    //*******************************************************
    //******************** À implémenter ********************
    public String reverse(String s) {
        if(s == null || s.length() == 0) {
            return s;
        }
        char[] chars = s.toCharArray();

        int i = 0;
int j = s.length() - 1;
while(i<j) {
    char temps = chars[i];
    chars[i] = chars[j];
    chars[j] = temps;
    i++;
    j--;
}




        return String.valueOf(chars);
    }
}

