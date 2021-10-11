 private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        


float a,b,c,d,e, sum,percentage;
    a=Float.parseFloat(textField1.getText());
    b=Float.parseFloat(textField2.getText());
    c=Float.parseFloat(textField3.getText());
    d=Float.parseFloat(textField4.getText());
    e=Float.parseFloat(textField5.getText());
    sum=(a+b+c+d+e);
    percentage=(sum/500)*100;
    label6.setText(" " +percentage);
ImageIcon image1;
if(percentage > 50)
{
    image1=new ImageIcon("C:\\Users\\student.MCALAB\\Documents\\NetBeansProjects\\JavaApplication2\\src\\happieee.jpg");
}
else
{
    image1=new ImageIcon("C:\\Users\\student.MCALAB\\Documents\\NetBeansProjects\\JavaApplication2\\src\\sad smileee.png");
}
smile.setIcon(image1);





        // TODO add your handling code here:
    }                           
