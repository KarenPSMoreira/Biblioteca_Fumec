
package biblioteca.biblioteca;
import javax.swing.JOptionPane;
import static biblioteca.biblioteca.Biblioteca.*;
public class menuPrincipal extends javax.swing.JFrame {

    public menuPrincipal() {
        initComponents();
        getContentPane().setBackground(fundoCor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarLivros = new javax.swing.JButton();
        listarLivros = new javax.swing.JButton();
        realizarEmp = new javax.swing.JButton();
        consultarEmp = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(43, 69, 137));
        setBounds(new java.awt.Rectangle(850, 350, 380, 280));

        cadastrarLivros.setText("Cadastrar Livro");
        cadastrarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarLivrosActionPerformed(evt);
            }
        });

        listarLivros.setText("Listar Livros");
        listarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarLivrosActionPerformed(evt);
            }
        });

        realizarEmp.setText("Realizar Emprestimo");
        realizarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarEmpActionPerformed(evt);
            }
        });

        consultarEmp.setText("Consultar Emprestimo");
        consultarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEmpActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" BIBLIOTECA FUMEC ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listarLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrarLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(realizarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consultarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cadastrarLivros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listarLivros)
                .addGap(12, 12, 12)
                .addComponent(realizarEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(consultarEmp)
                .addGap(40, 40, 40)
                .addComponent(sair)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarLivrosActionPerformed
        new cadastrarLivros().setVisible(true);
    }//GEN-LAST:event_cadastrarLivrosActionPerformed

    private void listarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarLivrosActionPerformed
        new listarLivros().setVisible(true);
    }//GEN-LAST:event_listarLivrosActionPerformed

    private void realizarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarEmpActionPerformed
        new realizarEmprestimo().setVisible(true);
    }//GEN-LAST:event_realizarEmpActionPerformed

    private void consultarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEmpActionPerformed
        new consultarEmprestimo().setVisible(true);
   
    }//GEN-LAST:event_consultarEmpActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        JOptionPane.showMessageDialog(null, "Encerrando...");
        JOptionPane.showMessageDialog(null, "\nDESENVOLVIDO POR\n\nKaren Moreira\nSamuel Santos");
        this.setVisible(rootPaneCheckingEnabled);
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    /*public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarLivros;
    private javax.swing.JButton consultarEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton listarLivros;
    private javax.swing.JButton realizarEmp;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
