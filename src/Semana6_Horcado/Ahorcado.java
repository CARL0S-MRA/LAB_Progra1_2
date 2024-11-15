//Carlos Mauricio Rodriguez Altamirano
//Aaron Estaban Archaga Rostran
package Semana6_Horcado;
import javax.swing.JOptionPane;
import java.util.Random;
public class Ahorcado extends javax.swing.JFrame {
    Random random;
    String palabraAdivina[];
    String[] adivinar;
    String palabraRandom;
    MENU r;
    
    
    
    public Ahorcado(MENU r) {
        initComponents();
        this.r=r;
        seteoPalabra();
        mostrarAdivinar();
        random=new Random();
        palabraAdivina=new String[10];
        salida.setEditable(false);

        
        
    }
    
    void seteoPalabra(){
        for (int i = 0; i < palabraAdivina.length; i++) {
            palabraAdivina[i]=JOptionPane.showInputDialog("Ingrese la palabra#"+i);
        }
        palabraRandom = palabraAdivina[random.nextInt(palabraAdivina.length)];
        System.out.println(palabraRandom);
        
        adivinar=new String[palabraRandom.length()];
        for (int i = 0; i < palabraRandom.length(); i++) {
            adivinar[i]="-";
        }
    }
    
    void mostrarAdivinar(){
        String mostrar="";
        for (int i = 0; i < adivinar.length; i++) {
            mostrar += adivinar[i];
        }
        salida.setText(mostrar);
    }
    
    void Adivinanzas(){
        char intentosAdivinar = entrada.getText().toUpperCase().charAt(0);
        
        for (int i = 0; i < palabraRandom.length(); i++) {
            if (palabraRandom.toUpperCase().charAt(i) == intentosAdivinar) {
                adivinar[i] = intentosAdivinar +"";
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLAhorcado = new javax.swing.JLabel();
        entrada = new javax.swing.JTextField();
        Adivinar = new javax.swing.JButton();
        salida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLAhorcado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLAhorcado.setText("AHORCADO");

        entrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });

        Adivinar.setText("Adivinar");
        Adivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdivinarActionPerformed(evt);
            }
        });

        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLAhorcado)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Adivinar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLAhorcado)
                .addGap(18, 18, 18)
                .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Adivinar)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaActionPerformed

    private void AdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdivinarActionPerformed
        Adivinanzas();
        mostrarAdivinar();
    }//GEN-LAST:event_AdivinarActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salidaActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adivinar;
    private javax.swing.JTextField entrada;
    private javax.swing.JLabel jLAhorcado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField salida;
    // End of variables declaration//GEN-END:variables
}
