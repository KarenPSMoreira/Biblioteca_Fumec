
package biblioteca.biblioteca;

import static biblioteca.biblioteca.Biblioteca.*;
import javax.swing.JOptionPane;

public class consultarEmprestimo extends javax.swing.JFrame {


    public consultarEmprestimo() {
        initComponents();
        getContentPane().setBackground(fundoCor);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        codEmp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalhesEmprestimo = new javax.swing.JTextArea();
        buscar = new javax.swing.JButton();
        voltarMenu = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(55, 87, 158));
        setBounds(new java.awt.Rectangle(850, 350, 380, 280));

        codEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codEmpActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo do Emprestimo");

        detalhesEmprestimo.setColumns(20);
        detalhesEmprestimo.setRows(5);
        jScrollPane1.setViewportView(detalhesEmprestimo);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        voltarMenu.setText("Voltar");
        voltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(voltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(voltarMenu)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        int cde = 0; // variavel para receber o codigo do emprestimo jÃ¡ cadastrado
	int encontrou = 0;
	String continuar;
	String texto="";
        
        if(codEmp.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Digite um codigo para busca");
            detalhesEmprestimo.setText("");
        }else if(contE == 0){
            JOptionPane.showMessageDialog(null, "Nao ha emprestimos realizados.");
            codEmp.setText("");
	}else{
            
            op = Integer.parseInt(codEmp.getText());
            
            for (int i = 0; i < contE; i++) {
                cde = ((Emprestimo) emp[i]).getCodEmprestimo();
                if (cde == op) {
                    texto += "\nLivro: " + ((Livros) livros[(((Emprestimo) emp[i]).getCodLivroEmp())]).getTitulo() //dentro do vetor livros, busque o cod do livro enquivalente ao cod cadastrado no vetor emprestimo do responsavel
                            + "\nNome Responsável: " + ((Emprestimo) emp[i]).getNomePessoa()
                            + "\nData do Emprestimo: " + (((Emprestimo) emp[i]).getDataEmp()
                            + "\nData de Devolucao: " + ((Emprestimo) emp[i]).getDataDev());
                    encontrou = 1;
    
                    detalhesEmprestimo.setText(texto);
                    codEmp.setText("");
                }
            }
            
            if (encontrou == 0) {
                codEmp.setText("");
                detalhesEmprestimo.setText("");
                JOptionPane.showMessageDialog(null, "Emprestimo nao encontrado.");
            }
            
        }
         
    }//GEN-LAST:event_buscarActionPerformed

    private void voltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_voltarMenuActionPerformed

    private void codEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codEmpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField codEmp;
    private javax.swing.JTextArea detalhesEmprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton voltarMenu;
    // End of variables declaration//GEN-END:variables
}
