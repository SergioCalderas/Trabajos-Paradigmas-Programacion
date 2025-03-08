/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 11 de enero del 2024
    
    La funcionalidad de la clase JFrame Pago es permitirle al usuario pagar el 
    total por los productos en su carrito
    Los Metodos de Pago son
     - Moneda: Este Metodo se relaciona con el JLabel textoTotal y va a 
       transformar el total a pagar por el carrito en un String junto con un $ .
*/

/* Nombre del paquete con las clases de la aplicacion*/
package carrito;
import javax.swing.*;


public class Pago extends javax.swing.JFrame {
    public double totalPago;
    public static double totalPagoUsuario;
    
/* Constructor de Pago */
    public Pago() {
        initComponents();
        this.setTitle("Pago"); // Nombre de la ventana
        totalPago = MiCarrito.totalPagoMC; // Obtener el total a pagar por el carrito en la clase MiCarrito
        textoTotal.setText(Moneda(totalPago)); // Establecer en textoTotal lo que se va a pagar
    }

    /* Esta seccion es la encargada de generar todos los elementos visibles de la aplicacion
       se va generando automaticamente al ingresar elementos al JFrame */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPago = new javax.swing.JPanel();
        textoPago = new javax.swing.JPanel();
        textoComprasOnline = new javax.swing.JLabel();
        textoIngresePago = new javax.swing.JLabel();
        llenarPago = new javax.swing.JTextField();
        textoTotalPagar = new javax.swing.JLabel();
        volverPago = new javax.swing.JButton();
        botonPagar = new javax.swing.JButton();
        textoTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BackgroundPago.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoPago.setBackground(new java.awt.Color(19, 25, 33));

        textoComprasOnline.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        textoComprasOnline.setForeground(new java.awt.Color(255, 255, 255));
        textoComprasOnline.setText("Pago");

        javax.swing.GroupLayout textoPagoLayout = new javax.swing.GroupLayout(textoPago);
        textoPago.setLayout(textoPagoLayout);
        textoPagoLayout.setHorizontalGroup(
            textoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textoPagoLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(textoComprasOnline)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        textoPagoLayout.setVerticalGroup(
            textoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textoPagoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(textoComprasOnline)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        BackgroundPago.add(textoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        textoIngresePago.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoIngresePago.setText("Ingrese su pago:");
        BackgroundPago.add(textoIngresePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        llenarPago.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        llenarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarPagoActionPerformed(evt);
            }
        });
        BackgroundPago.add(llenarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 100, 30));

        textoTotalPagar.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoTotalPagar.setText("Total a pagar:");
        BackgroundPago.add(textoTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 30));

        volverPago.setBackground(new java.awt.Color(230, 122, 0));
        volverPago.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        volverPago.setForeground(new java.awt.Color(255, 255, 255));
        volverPago.setText("Volver");
        volverPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverPago.setFocusable(false);
        volverPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverPagoActionPerformed(evt);
            }
        });
        BackgroundPago.add(volverPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        botonPagar.setBackground(new java.awt.Color(230, 122, 0));
        botonPagar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonPagar.setForeground(new java.awt.Color(255, 255, 255));
        botonPagar.setText("Pagar");
        botonPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPagar.setFocusable(false);
        botonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagarActionPerformed(evt);
            }
        });
        BackgroundPago.add(botonPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        textoTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        textoTotal.setText("total");
        BackgroundPago.add(textoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 185, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPago, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Aqui el usuario va a ingresar lo que va a pagar por su carrito
    private void llenarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_llenarPagoActionPerformed

    // Boton que regresa a la ventana MiCarrito
    private void volverPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverPagoActionPerformed
        MiCarrito newframe = new MiCarrito();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverPagoActionPerformed

    // Boton que se encarga de evaluar si el pago ingresado es suficiente para liquidar su deuda
    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed
        float pagoUsuario= Float.parseFloat(llenarPago.getText()); // Obtener la cantidad ingresada por el usuario
        if(pagoUsuario < totalPago){ // Si es pago no es suficiente
            JOptionPane.showMessageDialog(null, "Pago insuficiente"); // Mostrar mensaje que no se liquida la deuda
        }else{ // Si es pago si es suficiente
            JOptionPane.showMessageDialog(null, "Pago realizado"); // Mostrar mensaje que si se liquida la deuda
            totalPagoUsuario = pagoUsuario; // Asignar a totalPagoUsuario el valor ingresado por el usuario
            Ticket newframe= new Ticket(); // Si el pago es correcto mostrar la ventana de Ticket
            this.setVisible(false);
            newframe.setVisible(true);
        }
    }//GEN-LAST:event_botonPagarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pago().setVisible(true);
            }
        });
    }
    
    // Metodo para mostrar el total como un String
    public String Moneda(double precio){
        return "$" + Math.round(precio * 100.00) / 100.00;
    }
    
    // Declaracion de la variablees de los elementos que se muestran en el JFrame Pollo
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPago;
    private javax.swing.JButton botonPagar;
    private javax.swing.JTextField llenarPago;
    private javax.swing.JLabel textoComprasOnline;
    private javax.swing.JLabel textoIngresePago;
    private javax.swing.JPanel textoPago;
    private javax.swing.JLabel textoTotal;
    private javax.swing.JLabel textoTotalPagar;
    private javax.swing.JButton volverPago;
    // End of variables declaration//GEN-END:variables
}
