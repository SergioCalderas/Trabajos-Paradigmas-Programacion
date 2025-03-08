/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 11 de enero del 2024
    
    La funcionalidad de la clase JFrame Pollo es mostrar los detalles del producto
    Pollo, ademas de poder crear un objeto de la clase comida con los atributos. 
    seleccionados
    Los Metodos de Pollo son
     - suma: Este Metodo va asociada con el botonMasPollo, cuando se hace clic 
       aumenta la cantidad de pollo que se van a comprar.
     - resta: Esta Metodo va asociada con el botonMenosPollo, cuando se hace clic 
       disminuye la cantidad de pollo que se van a comprar, no genera valores
       negativos.
     - Cantidad: Este Metodo se relaciona con el JLabel textoNumeroID y va a 
       transformar el int ID_pollo a un String para que sea visible el codigo unico
       de la pollo
*/

/* Nombre del paquete con las clases de la aplicacion*/
package carrito;

import javax.swing.*;

public class Pollo extends javax.swing.JFrame {
    public static int ID_pollo = 1; // Codigo unico de pollo

/* Constructor de Pollo */
    public Pollo() {
        initComponents();
        this.setTitle("Pollo"); // Nombre de la ventana
        // Establecer en texto el codigo unico de pollo que se tiene al momento
        textoNumeroID.setText(Cantidad(ID_pollo));
    }

    /* Esta seccion es la encargada de generar todos los elementos visibles de la aplicacion
       se va generando automaticamente al ingresar elementos al JFrame */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPollo = new javax.swing.JPanel();
        BarrasNegra = new javax.swing.JPanel();
        textoComprasOnline = new javax.swing.JLabel();
        volverPollo = new javax.swing.JButton();
        textoPrecioPollo = new javax.swing.JLabel();
        imagenPollo = new javax.swing.JLabel();
        descripcionPollo1 = new javax.swing.JLabel();
        textoNacionalPollo = new javax.swing.JLabel();
        textoCaducidadPollo1 = new javax.swing.JLabel();
        textoCantidadPollo = new javax.swing.JLabel();
        botonMasPollo = new javax.swing.JButton();
        botonMenosPollo = new javax.swing.JButton();
        llenadoCantidadPollo = new javax.swing.JTextField();
        botonAgregarPollo = new javax.swing.JPanel();
        textoAgregarCarrito = new javax.swing.JLabel();
        textoIDPlayera = new javax.swing.JLabel();
        textoNumeroID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundPollo.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPollo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarrasNegra.setBackground(new java.awt.Color(19, 25, 33));

        textoComprasOnline.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoComprasOnline.setForeground(new java.awt.Color(255, 255, 255));
        textoComprasOnline.setText("Compras Online");

        javax.swing.GroupLayout BarrasNegraLayout = new javax.swing.GroupLayout(BarrasNegra);
        BarrasNegra.setLayout(BarrasNegraLayout);
        BarrasNegraLayout.setHorizontalGroup(
            BarrasNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarrasNegraLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(textoComprasOnline)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BarrasNegraLayout.setVerticalGroup(
            BarrasNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarrasNegraLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(textoComprasOnline)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundPollo.add(BarrasNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 90));

        volverPollo.setBackground(new java.awt.Color(230, 122, 0));
        volverPollo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        volverPollo.setForeground(new java.awt.Color(255, 255, 255));
        volverPollo.setText("Volver");
        volverPollo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverPollo.setFocusable(false);
        volverPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverPolloActionPerformed(evt);
            }
        });
        BackgroundPollo.add(volverPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        textoPrecioPollo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoPrecioPollo.setText("Precio: $110.00 kg");
        BackgroundPollo.add(textoPrecioPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 150, 40));

        imagenPollo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito/imagenes/imagenPollo.png"))); // NOI18N
        BackgroundPollo.add(imagenPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        descripcionPollo1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        descripcionPollo1.setText("Pollo Entero Fresco");
        BackgroundPollo.add(descripcionPollo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 200, -1));

        textoNacionalPollo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoNacionalPollo.setText("Producto Nacional");
        BackgroundPollo.add(textoNacionalPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 150, 40));

        textoCaducidadPollo1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoCaducidadPollo1.setText("Fecha caducidad: 20-01-2023");
        BackgroundPollo.add(textoCaducidadPollo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 240, 40));

        textoCantidadPollo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoCantidadPollo.setText("Cantidad kg");
        BackgroundPollo.add(textoCantidadPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 100, 40));

        botonMasPollo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonMasPollo.setText("+");
        botonMasPollo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMasPollo.setFocusable(false);
        botonMasPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasPolloActionPerformed(evt);
            }
        });
        BackgroundPollo.add(botonMasPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 61, 33));

        botonMenosPollo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonMenosPollo.setText("-");
        botonMenosPollo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMenosPollo.setFocusable(false);
        botonMenosPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosPolloActionPerformed(evt);
            }
        });
        BackgroundPollo.add(botonMenosPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 61, 33));

        llenadoCantidadPollo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        llenadoCantidadPollo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        llenadoCantidadPollo.setText("0");
        llenadoCantidadPollo.setFocusable(false);
        llenadoCantidadPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenadoCantidadPolloActionPerformed(evt);
            }
        });
        BackgroundPollo.add(llenadoCantidadPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 61, 33));

        botonAgregarPollo.setBackground(new java.awt.Color(255, 216, 20));
        botonAgregarPollo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarPollo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarPolloMouseClicked(evt);
            }
        });

        textoAgregarCarrito.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoAgregarCarrito.setText("Agregar al Carrito");

        javax.swing.GroupLayout botonAgregarPolloLayout = new javax.swing.GroupLayout(botonAgregarPollo);
        botonAgregarPollo.setLayout(botonAgregarPolloLayout);
        botonAgregarPolloLayout.setHorizontalGroup(
            botonAgregarPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAgregarPolloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoAgregarCarrito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonAgregarPolloLayout.setVerticalGroup(
            botonAgregarPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonAgregarPolloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoAgregarCarrito)
                .addContainerGap())
        );

        BackgroundPollo.add(botonAgregarPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 140, 30));

        textoIDPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoIDPlayera.setText("ID:");
        BackgroundPollo.add(textoIDPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 40, 40));

        textoNumeroID.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoNumeroID.setText("id");
        BackgroundPollo.add(textoNumeroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton que regresa a la ventana Carrito, princial de la aplicacion
    private void volverPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverPolloActionPerformed
        Carrito newframe = new Carrito();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverPolloActionPerformed

    // Si hace clic en el boton + de pollo
    private void botonMasPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasPolloActionPerformed
        double cantidad = Double.parseDouble(llenadoCantidadPollo.getText());
        String resultado = String.valueOf(suma(cantidad));        
        llenadoCantidadPollo.setText(resultado);
    }//GEN-LAST:event_botonMasPolloActionPerformed

    // Si hace clic en el boton - de pollo
    private void botonMenosPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenosPolloActionPerformed
        Double cantidad = Double.parseDouble(llenadoCantidadPollo.getText()); // Obtener el valor en llenadoCantidadPollo
        String resultado = String.valueOf(resta(cantidad)); // Sumar 0.1 en el valor de cantidad
        llenadoCantidadPollo.setText(resultado);  // Establecer el resultado de la suma
    }//GEN-LAST:event_botonMenosPolloActionPerformed

    // Aqui se mostraran los resultados del uso de los botones
    private void llenadoCantidadPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenadoCantidadPolloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_llenadoCantidadPolloActionPerformed

    // Si se añade al carrito se llama al contructor de Comida con las caracteristicas que se eligieron
    private void botonAgregarPolloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarPolloMouseClicked
        // Llamada al constructor
        Comida comida = new Comida("Pollo", "20-01-2023", "Nacional", 
                                   (int) (110 * Double.parseDouble(llenadoCantidadPollo.getText())),"Comida", ID_pollo, 
                                   Double.parseDouble(llenadoCantidadPollo.getText())); 
        ID_pollo ++; // Aumentar el ID de pollo
        MiCarrito.listaProductos.add(comida); // Llamada al ArrayList listaProductos para añador la comida creada
        JOptionPane.showMessageDialog(null, "Pollo agregado al carrito"); // Mostrar mensaje que se añadadio al carrito
    }//GEN-LAST:event_botonAgregarPolloMouseClicked

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
            java.util.logging.Logger.getLogger(Pollo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pollo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pollo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pollo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pollo().setVisible(true);
            }
        });
    }
    
    // Sumar 0.1 a la cantidad del pollo
    private double suma(double cantidad){
        cantidad = cantidad + 0.1;
        return cantidad;
    }
    
    // Restar 0.1 a la cantidad del pollo
    private double resta(double cantidad){
        if(cantidad>0){
            cantidad = cantidad - 0.1;
        }
        return cantidad;
    }
    
    // Metodo para mostrar el ID_pollo como un String
    public String Cantidad(int ID){
        return "# " + ID_pollo;
    }

    // Declaracion de la variablees de los elementos que se muestran en el JFrame Pollo
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPollo;
    private javax.swing.JPanel BarrasNegra;
    private javax.swing.JPanel botonAgregarPollo;
    private javax.swing.JButton botonMasPollo;
    private javax.swing.JButton botonMenosPollo;
    private javax.swing.JLabel descripcionPollo1;
    private javax.swing.JLabel imagenPollo;
    private javax.swing.JTextField llenadoCantidadPollo;
    private javax.swing.JLabel textoAgregarCarrito;
    private javax.swing.JLabel textoCaducidadPollo1;
    private javax.swing.JLabel textoCantidadPollo;
    private javax.swing.JLabel textoComprasOnline;
    private javax.swing.JLabel textoIDPlayera;
    private javax.swing.JLabel textoNacionalPollo;
    private javax.swing.JLabel textoNumeroID;
    private javax.swing.JLabel textoPrecioPollo;
    private javax.swing.JButton volverPollo;
    // End of variables declaration//GEN-END:variables
}
