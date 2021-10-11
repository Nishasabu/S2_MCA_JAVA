                      

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
int n1,n2,n3,RESULT;
n1=Integer.parseInt(textField1.getText());
n2=Integer.parseInt(textField2.getText());
n3=Integer.parseInt(textField3.getText());


 if( n1 >= n2)
 {
      if(n1 >= n3)
 {
 label4.setText("" +n1);
 }
 }
 else
 {
  if (n2 >= n3)
  {
     label4.setText("" +n2); 
          }
  
  
  else
  {
          label4.setText(" " +n3);
          
  }
 }
          // TODO add your handling code here:
    }                                       