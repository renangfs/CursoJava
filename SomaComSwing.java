    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int valor1 = Integer.parseInt(n1.getText());//pegando valores do campo de texto e convertendo para inteiro
        int valor2 = Integer.parseInt(n2.getText());//pegando valores do campo de texto e convertendo para inteiro
        String resultado = Integer.toString( valor1 + valor2 );//somando valores inteiros e convertendo para string
        lbl.setText(resultado);//configurando texto para o resultado
