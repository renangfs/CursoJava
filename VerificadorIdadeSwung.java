    private void btnActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        int ano = Integer.parseInt(txtAno.getText());
        int idade = (2021-ano);
        lblIdade.setText(Integer.toString(idade));
        if (idade>=16 && idade<18 || idade>60){
            lblSituacao.setText("Voto Opicional");
        }
        else if(idade<16){
            lblSituacao.setText("Não vota");
        }
        else{
            lblSituacao.setText("Voto Obrigatorio!!");
        }
    }  
