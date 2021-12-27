    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int valor1 = Integer.parseInt(n1.getText());
        int valor2 = Integer.parseInt(n2.getText());
        String soma = Integer.toString( valor1 + valor2 );
        lbl.setText(soma);
