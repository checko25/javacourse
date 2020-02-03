/* Ввести любой символ, и определить его порядковый номер, а также указать предыдущий и последующий символы
*/
package by.htp.les01.main; 
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
    public class task33 extends JFrame
    {
    JTextField Field;
    public task33()
    {
        super("Введите текст");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Field = new JTextField(30);
        Field.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String m = Field.getText();
        int count = 0;
        int c = 0;
        String  message = "";
        String noright = ", справа нет символа";
        String noleft = ", слева нет символа";
        for (int i = 0; i < m.length(); i++) {
             c++;
            }
        for (int i = 0; i < m.length(); i++) {
            count++;
            System.out.println(count + "" + c);
             if (i == 0 && count == c){
                message = "Позиция символа " + "(" + m.charAt(i)+")" +" - " +  (i+1) + 
                noright + noleft + '\n';
             }
            if (i == 0 && count != c){
                message = "Позиция символа " + "(" + m.charAt(i)+")" +" - " +  (i+1) + 
                ", справа находится символ "  + "(" +m.charAt(i+1)+")" + noleft + '\n';
            }
            if (count < c && i != 0){
                message = message + ("Позиция символа " + "(" + m.charAt(i)+")" +" - " +  (i+1) + 
                ", слева находится символ "  + "(" +m.charAt(i-1)+")" + ", справа находится символ "  + "(" +m.charAt(i+1)+")" + '\n' );
                }
            if (i != 0 && count == c){
                message = message + "Позиция символа " + "(" + m.charAt(i)+")" +" - " +  (i+1) + 
                ", слева находится символ " + "(" +m.charAt(i-1)+")" + noright + '\n';
        }
        }
        JOptionPane.showMessageDialog(task33.this, 
                message);
            }
        });
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(Field);
        setContentPane(contents);
        setSize(700, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new task33();
   }
}
 
 
 

        
        
   

 
