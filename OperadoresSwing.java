    private void btnActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        int n1 = Integer.parseInt(v1.getText());//pegando e convertendo string para inteiro e guardando na variavel n1
        int n2 = Integer.parseInt(v2.getText());//pegando e convertendo string para inteiro e guardando na variavel n2
        String div = Integer.toString(n1/n2);//pegando o resultado da divisão das variaveis e convertendo para string
        String res = Integer.toString(n1%n2);;//pegando o resultado do resto das variaveis e convertendo para string
        lblDiv.setText(div);//configurando o label para o resultado da divisão
        lblResto.setText(res);//configurando o label para o resultado do resto
    }  
