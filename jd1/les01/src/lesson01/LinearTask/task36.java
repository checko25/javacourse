/* Найти частное произведений четных и нечетных чисел четырехзначного числа.
*/
package by.htp.les01.main; 
import javax.swing.text.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
    public class task36 extends JFrame
    {
    JTextField Field;
    public task36 ()
    {
        super("Введите четырехзначное число");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        PlainDocument doc = new PlainDocument();
        doc.setDocumentFilter(new DocumentFilter() {
        @Override
    public void insertString(FilterBypass fb, int off, String str, AttributeSet attr) 
        throws BadLocationException 
    {
        fb.insertString(off, str.replaceAll("\\D++", ""), attr);  // remove non-digits
    } 
        @Override
    public void replace(FilterBypass fb, int off, int len, String str, AttributeSet attr) 
        throws BadLocationException 
    {
        fb.replace(off, len, str.replaceAll("\\D++", ""), attr);  // remove non-digits
    }
    });
        JTextField Field = new JTextField(30);
        Field.setDocument(doc);
        Field.addActionListener(new ActionListener() 
        {
        public void actionPerformed(ActionEvent e) 
        {
        String m = Field.getText();
        int so = 1;
        int se = 1;
        double s;
        int count = 0;
        for (int i = 0; i < m.length(); i++) 
        {
            int i1 = Character.getNumericValue(m.charAt(i));
            if (i1 % 2 == 0)
            {
            se = se*i1;
            }
            else
            {
            so = so*i1;    
            }
              count++;    
        }
        s = (double)se/so;
        if (count !=4)
        {
            JOptionPane.showMessageDialog(task36 .this,
               "Не четырехзначное число!");}
        else 
        {
            JOptionPane.showMessageDialog(task36 .this,
               "Частное произведений четных и нечетных чисел равно: " + s);
        }
    }
        });
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.CENTER));
        contents.add(Field);
        setContentPane(contents);
        setSize(400, 80);
        setVisible(true);
    }
    public static void main(String[] args) {
        new task36 ();
   }
}  
      
 
 
 

        
        
   

 
