/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 11 de enero del 2024
    
    La funcionalidad de la clase JFrame Chocolate es mostrar los detalles del producto
    Chocolate, ademas de poder crear un objeto de la clase comida con los atributos. 
    seleccionados
    Los Metodos de Chocolate son
     - suma: Este Metodo va asociada con el botonMasChocolate, cuando se hace clic 
       aumenta la cantidad de chocolate que se van a comprar.
     - resta: Este Metodo va asociada con el botonMenosChocolate, cuando se hace clic 
       disminuye la cantidad de chocolate que se van a comprar, no genera valores
       negativos.
     - Cantidad: Este Metodo se relaciona con el JLabel textoNumeroID y va a 
       transformar el int ID_chocolate a un String para que sea visible el codigo unico
       de la chocolate
*/

/* Nombre del paquete con las clases de la aplicacion*/
package carrito;

import javax.swing.*;

public class Chocolate extends javax.swing.JFrame {
    public static int ID_chocolate = 1; // Codigo unico de chocolate

/* Constructor de Chocolate */
    public Chocolate() {
        initComponents();
        this.setTitle("Chocolate"); // Nombre de la ventana
        // Establecer en texto el codigo unico de chocolate que se tiene al momento
        textoNumeroID.setText(Cantidad(ID_chocolate));
    }

    /* Esta seccion es la encargada de generar todos los elementos visibles de la aplicacion
       se va generando automaticamente al ingresar elementos al JFrame */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundChocolate = new javax.swing.JPanel();
        BarrasNegra = new javax.swing.JPanel();
        textoComprasOnline = new javax.swing.JLabel();
        volverChocolate = new javax.swing.JButton();
        textoPrecioChocolate = new javax.swing.JLabel();
        imagenChocolate = new javax.swing.JLabel();
        descripcionChocolate1 = new javax.swing.JLabel();
        descripcionChocolate2 = new javax.swing.JLabel();
        textoCaducidadChocolate = new javax.swing.JLabel();
        textoImportadoChocolate = new javax.swing.JLabel();
        textoCantidadChocolate = new javax.swing.JLabel();
        botonMasChocolate = new javax.swing.JButton();
        botonMenosChocolate = new javax.swing.JButton();
        llenadoCantidadChocolate = new javax.swing.JTextField();
        botonAgregarChocolate = new javax.swing.JPanel();
        textoAgregarCarrito = new javax.swing.JLabel();
        textoIDPlayera = new javax.swing.JLabel();
        textoNumeroID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundChocolate.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundChocolate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        BackgroundChocolate.add(BarrasNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 90));

        volverChocolate.setBackground(new java.awt.Color(230, 122, 0));
        volverChocolate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        volverChocolate.setForeground(new java.awt.Color(255, 255, 255));
        volverChocolate.setText("Volver");
        volverChocolate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverChocolate.setFocusable(false);
        volverChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverChocolateActionPerformed(evt);
            }
        });
        BackgroundChocolate.add(volverChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        textoPrecioChocolate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoPrecioChocolate.setText("Precio: $70.00 kg");
        BackgroundChocolate.add(textoPrecioChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 190, 40));

        imagenChocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito/imagenes/imagenChocolate.png"))); // NOI18N
        BackgroundChocolate.add(imagenChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        descripcionChocolate1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        descripcionChocolate1.setText("Chocolate con Cacahuate Tradicional");
        BackgroundChocolate.add(descripcionChocolate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 370, -1));

        descripcionChocolate2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        descripcionChocolate2.setText("Mexicano");
        BackgroundChocolate.add(descripcionChocolate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 370, -1));

        textoCaducidadChocolate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoCaducidadChocolate.setText("Fecha caducidad: 15-04-2023");
        BackgroundChocolate.add(textoCaducidadChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 240, 40));

        textoImportadoChocolate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoImportadoChocolate.setText("Producto Importado");
        BackgroundChocolate.add(textoImportadoChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 180, 40));

        textoCantidadChocolate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoCantidadChocolate.setText("Cantidad kg");
        BackgroundChocolate.add(textoCantidadChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 100, 40));

        botonMasChocolate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonMasChocolate.setText("+");
        botonMasChocolate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMasChocolate.setFocusable(false);
        botonMasChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasChocolateActionPerformed(evt);
            }
        });
        BackgroundChocolate.add(botonMasChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 61, 33));

        botonMenosChocolate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonMenosChocolate.setText("-");
        botonMenosChocolate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMenosChocolate.setFocusable(false);
        botonMenosChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosChocolateActionPerformed(evt);
            }
        });
        BackgroundChocolate.add(botonMenosChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 61, 33));

        llenadoCantidadChocolate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        llenadoCantidadChocolate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        llenadoCantidadChocolate.setText("0");
        llenadoCantidadChocolate.setFocusable(false);
        llenadoCantidadChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenadoCantidadChocolateActionPerformed(evt);
            }
        });
        BackgroundChocolate.add(llenadoCantidadChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 61, 33));

        botonAgregarChocolate.setBackground(new java.awt.Color(255, 216, 20));
        botonAgregarChocolate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarChocolate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarChocolateMouseClicked(evt);
            }
        });

        textoAgregarCarrito.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoAgregarCarrito.setText("Agregar al Carrito");

        javax.swing.GroupLayout botonAgregarChocolateLayout = new javax.swing.GroupLayout(botonAgregarChocolate);
        botonAgregarChocolate.setLayout(botonAgregarChocolateLayout);
        botonAgregarChocolateLayout.setHorizontalGroup(
            botonAgregarChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAgregarChocolateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoAgregarCarrito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonAgregarChocolateLayout.setVerticalGroup(
            botonAgregarChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonAgregarChocolateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoAgregarCarrito)
                .addContainerGap())
        );

        BackgroundChocolate.add(botonAgregarChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 140, 30));

        textoIDPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoIDPlayera.setText("ID:");
        BackgroundChocolate.add(textoIDPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 40, 40));

        textoNumeroID.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoNumeroID.setText("id");
        BackgroundChocolate.add(textoNumeroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton que regresa a la ventana Carrito, princial de la aplicacion
    private void volverChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverChocolateActionPerformed
        Carrito newframe = new Carrito();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverChocolateActionPerformed

    // Si hace clic en el boton + de chocolate
    private void botonMasChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasChocolateActionPerformed
        double cantidad = Double.parseDouble(llenadoCantidadChocolate.getText()); // Obtener el valor en llenadoCantidadChocolate
        String resultado = String.valueOf(suma(cantidad)); // Sumar 0.1 en el valor de cantidad  
        llenadoCantidadChocolate.setText(resultado);  // Establecer el resultado de la suma
    }//GEN-LAST:event_botonMasChocolateActionPerformed

    // Si hace clic en el boton - de chocolate
    private void botonMenosChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenosChocolateActionPerformed
        Double cantidad = Double.parseDouble(llenadoCantidadChocolate.getText()); // Obtener el valor en llenadoCantidadChocolate
        String resultado = String.valueOf(resta(cantidad)); // Sumar 0.1 en el valor de cantidad
        llenadoCantidadChocolate.setText(resultado); // Establecer el resultado de la suma
    }//GEN-LAST:event_botonMenosChocolateActionPerformed

    // Aqui se mostraran los resultados del uso de los botones
    private void llenadoCantidadChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenadoCantidadChocolateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_llenadoCantidadChocolateActionPerformed

    // Si se añade al carrito se llama al contructor de Comida con las caracteristicas que se eligieron
    private void botonAgregarChocolateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarChocolateMouseClicked
        // Llamada al constructor
        Comida comida = new Comida("Chocolate", "15-04-2023", "Importado", 
                                   (int) (74 * Double.parseDouble(llenadoCantidadChocolate.getText())),"Comida", ID_chocolate, 
                                   Double.parseDouble(llenadoCantidadChocolate.getText())); 
        ID_chocolate ++; // Aumentar el ID de Chocolate
        MiCarrito.listaProductos.add(comida); // Llamada al ArrayList listaProductos para añador la comida creada
        JOptionPane.showMessageDialog(null, "Chocolates agregados al carrito"); // Mostrar mensaje que se añadadio al carrito
    }//GEN-LAST:event_botonAgregarChocolateMouseClicked

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
            java.util.logging.Logger.getLogger(Chocolate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chocolate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chocolate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chocolate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chocolate().setVisible(true);
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
    
    // Metodo para mostrar el ID_chocolate como un String
    public String Cantidad(int ID){
        return "# " + ID_chocolate;
    }
    
    // Declaracion de la variablees de los elementos que se muestran en el JFrame Pollo
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundChocolate;
    private javax.swing.JPanel BarrasNegra;
    private javax.swing.JPanel botonAgregarChocolate;
    private javax.swing.JButton botonMasChocolate;
    private javax.swing.JButton botonMenosChocolate;
    private javax.swing.JLabel descripcionChocolate1;
    private javax.swing.JLabel descripcionChocolate2;
    private javax.swing.JLabel imagenChocolate;
    private javax.swing.JTextField llenadoCantidadChocolate;
    private javax.swing.JLabel textoAgregarCarrito;
    private javax.swing.JLabel textoCaducidadChocolate;
    private javax.swing.JLabel textoCantidadChocolate;
    private javax.swing.JLabel textoComprasOnline;
    private javax.swing.JLabel textoIDPlayera;
    private javax.swing.JLabel textoImportadoChocolate;
    private javax.swing.JLabel textoNumeroID;
    private javax.swing.JLabel textoPrecioChocolate;
    private javax.swing.JButton volverChocolate;
    // End of variables declaration//GEN-END:variables
}
