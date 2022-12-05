
package biblioteca.biblioteca;

import static biblioteca.biblioteca.Biblioteca.*;
import javax.swing.JOptionPane;

public class cadastrarLivros extends javax.swing.JFrame{

    public cadastrarLivros() {
        initComponents();
        getContentPane().setBackground(fundoCor);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoTitulo = new javax.swing.JTextField();
        salvarTitulo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        voltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(55, 87, 158));
        setBounds(new java.awt.Rectangle(850, 350, 380, 280));

        campoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTituloActionPerformed(evt);
            }
        });

        salvarTitulo.setText("Salvar");
        salvarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarTituloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Titulo do Livro");

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
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(salvarTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(salvarTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltarMenu)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTituloActionPerformed
        
    }//GEN-LAST:event_campoTituloActionPerformed

    private void salvarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarTituloActionPerformed

        Livros l = new Livros();

        l.setTitulo(campoTitulo.getText());
	l.setCodLivro(contL);
	livros[contL] = new Livros();
	livros[contL] = l;
	contL++;
	JOptionPane.showMessageDialog(null, "Livro cadastrado");
        this.setVisible(false);
    }//GEN-LAST:event_salvarTituloActionPerformed

    private void voltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_voltarMenuActionPerformed
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton salvarTitulo;
    private javax.swing.JButton voltarMenu;
    // End of variables declaration//GEN-END:variables
}
