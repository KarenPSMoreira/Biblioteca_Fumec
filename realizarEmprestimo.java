
package biblioteca.biblioteca;
import static biblioteca.biblioteca.Biblioteca.*;
import javax.swing.JOptionPane;
public class realizarEmprestimo extends javax.swing.JFrame {

    public realizarEmprestimo() {
        initComponents();
        getContentPane().setBackground(fundoCor);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeResponsavel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        listarLivros = new javax.swing.JButton();
        diaEmp = new javax.swing.JSpinner();
        mesEmp = new javax.swing.JSpinner();
        anoEmp = new javax.swing.JSpinner();
        Salvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        diaDev = new javax.swing.JSpinner();
        mesDev = new javax.swing.JSpinner();
        anoDev = new javax.swing.JSpinner();
        codLivro = new javax.swing.JTextField();
        voltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emprestimo");
        setBackground(new java.awt.Color(55, 87, 158));
        setBounds(new java.awt.Rectangle(850, 350, 380, 280));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nomeResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeResponsavelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome do Responsável");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data do Emprestimo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código do Livro");

        listarLivros.setText("Consultar Lista");
        listarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarLivrosActionPerformed(evt);
            }
        });

        diaEmp.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        mesEmp.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        anoEmp.setModel(new javax.swing.SpinnerNumberModel(20, 20, 22, 1));

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data de Devolucao");

        diaDev.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        mesDev.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        anoDev.setModel(new javax.swing.SpinnerNumberModel(20, 20, 22, 1));

        codLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codLivroActionPerformed(evt);
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
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(listarLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(codLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nomeResponsavel)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(diaDev, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mesDev))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(diaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mesEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(anoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(anoDev, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(voltarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(codLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listarLivros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltarMenu)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeResponsavelActionPerformed

    }//GEN-LAST:event_nomeResponsavelActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        int cdl = 0; // recebe cod livro ja cadastrado
	int encontrou = 0;
        String texto = "";
        Emprestimo e = new Emprestimo();
     
        op = Integer.parseInt(codLivro.getText());
        for(int j=0; j<contL; j++) {
        cdl = ((Livros)livros[j]).getCodLivro(); // armazena o cod do livro listado para fazer comparacao
            if (cdl == op) { // compara o cod atual com a opcao digitad
                e.setCodLivroEmp(op);
                e.setNomePessoa(nomeResponsavel.getText());
                String data = (diaEmp.getValue() + "/" + mesEmp.getValue() + "/" + anoEmp.getValue());
                e.setDataEmp(data);
                data = (diaDev.getValue() + "/" + mesDev.getValue() + "/" + anoDev.getValue());
                e.setDataDev(data);
                e.setCodEmprestimo(contE);
                JOptionPane.showMessageDialog(null, "Codigo do emprestimo:  " + contE);

                emp[contE] = new Emprestimo();
                emp[contE] = e;
                contE++;
                encontrou = 1;

                this.setVisible(false);
            }
        }
					
        if(encontrou == 0) {
            JOptionPane.showMessageDialog(null, "Livro não cadastrado.\nTente novamente");
            codLivro.setText("");
        }
      

    }//GEN-LAST:event_SalvarActionPerformed

    private void listarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarLivrosActionPerformed
        String texto="";
        for(int i=0;i<contL;i++) { //listagem de livros
            texto += + i + " - " + (((Livros)livros[i]).getTitulo()) + "\n";
	}
        JOptionPane.showMessageDialog(null,texto);
        
    }//GEN-LAST:event_listarLivrosActionPerformed

    private void codLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codLivroActionPerformed

    private void voltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_voltarMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JSpinner anoDev;
    private javax.swing.JSpinner anoEmp;
    private javax.swing.JTextField codLivro;
    private javax.swing.JSpinner diaDev;
    private javax.swing.JSpinner diaEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton listarLivros;
    private javax.swing.JSpinner mesDev;
    private javax.swing.JSpinner mesEmp;
    private javax.swing.JTextField nomeResponsavel;
    private javax.swing.JButton voltarMenu;
    // End of variables declaration//GEN-END:variables
}
