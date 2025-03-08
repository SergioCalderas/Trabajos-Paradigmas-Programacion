/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 11 de enero del 2024
    
    La funcionalidad de la clase JFrame Manzana es mostrar los detalles del producto
    Manzana, ademas de poder crear un objeto de la clase comida con los atributos. 
    seleccionados
    Los Metodos de Manzana son
     - suma: Este Metodo va asociada con el botonMasManzana, cuando se hace clic 
       aumenta la cantidad de las manzanas que se van a comprar.
     - resta: Este Metodo va asociada con el botonMenosManzana, cuando se hace clic 
       disminuye la cantidad de las manzanas que se van a comprar, no genera valores
       negativos.
     - Cantidad: Este Metodo se relaciona con el JLabel textoNumeroID y va a 
       transformar el int ID_manzana a un String para que sea visible el codigo unico
       de la manzana
*/

/* Nombre del paquete con las clases de la aplicacion*/
package carrito;

import javax.swing.*;

public class Manzana extends javax.swing.JFrame {
    public static int ID_manzana = 1; // Codigo unico de la manzana

/* Constructor de Manzana */
    public Manzana() {
        initComponents();
        this.setTitle("Manzana"); // Nombre de la ventana
        // Establecer en texto el codigo unico de la mazana que se tiene al momento
        textoNumeroID.setText(Cantidad(ID_manzana));
    }

    /* Esta seccion es la encargada de generar todos los elementos visibles de la aplicacion
       se va generando automaticamente al ingresar elementos al JFrame */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundManzana = new javax.swing.JPanel();
        BarrasNegra = new javax.swing.JPanel();
        textoComprasOnline = new javax.swing.JLabel();
        volverManzana = new javax.swing.JButton();
        descripcionManzana = new javax.swing.JLabel();
        textoCaducidadManzana = new javax.swing.JLabel();
        imagenManzana = new javax.swing.JLabel();
        textoPrecioManzana1 = new javax.swing.JLabel();
        textoCantidadManzana = new javax.swing.JLabel();
        botonMasManzana = new javax.swing.JButton();
        botonMenosManzana = new javax.swing.JButton();
        llenadoCantidadManzana = new javax.swing.JTextField();
        textoNacionalManzana1 = new javax.swing.JLabel();
        botonAgregarManzana = new javax.swing.JPanel();
        textoAgregarCarrito = new javax.swing.JLabel();
        textoIDPlayera = new javax.swing.JLabel();
        textoNumeroID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundManzana.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundManzana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        BackgroundManzana.add(BarrasNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 90));

        volverManzana.setBackground(new java.awt.Color(230, 122, 0));
        volverManzana.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        volverManzana.setForeground(new java.awt.Color(255, 255, 255));
        volverManzana.setText("Volver");
        volverManzana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverManzana.setFocusable(false);
        volverManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverManzanaActionPerformed(evt);
            }
        });
        BackgroundManzana.add(volverManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        descripcionManzana.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        descripcionManzana.setText("Manzana Red Delicius por kilo");
        BackgroundManzana.add(descripcionManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 310, -1));

        textoCaducidadManzana.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoCaducidadManzana.setText("Fecha caducidad: 02-02-2023");
        BackgroundManzana.add(textoCaducidadManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 240, 40));

        imagenManzana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito/imagenes/imagenManzana.png"))); // NOI18N
        BackgroundManzana.add(imagenManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        textoPrecioManzana1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoPrecioManzana1.setText("Precio: $54.00 kg");
        BackgroundManzana.add(textoPrecioManzana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 140, 40));

        textoCantidadManzana.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoCantidadManzana.setText("Cantidad kg");
        BackgroundManzana.add(textoCantidadManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 100, 40));

        botonMasManzana.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonMasManzana.setText("+");
        botonMasManzana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMasManzana.setFocusable(false);
        botonMasManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasManzanaActionPerformed(evt);
            }
        });
        BackgroundManzana.add(botonMasManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 61, 33));

        botonMenosManzana.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonMenosManzana.setText("-");
        botonMenosManzana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMenosManzana.setFocusable(false);
        botonMenosManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosManzanaActionPerformed(evt);
            }
        });
        BackgroundManzana.add(botonMenosManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 61, 33));

        llenadoCantidadManzana.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        llenadoCantidadManzana.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        llenadoCantidadManzana.setText("0");
        llenadoCantidadManzana.setFocusable(false);
        llenadoCantidadManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenadoCantidadManzanaActionPerformed(evt);
            }
        });
        BackgroundManzana.add(llenadoCantidadManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 61, 33));

        textoNacionalManzana1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoNacionalManzana1.setText("Producto Nacional");
        BackgroundManzana.add(textoNacionalManzana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 150, 40));

        botonAgregarManzana.setBackground(new java.awt.Color(255, 216, 20));
        botonAgregarManzana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarManzana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarManzanaMouseClicked(evt);
            }
        });

        textoAgregarCarrito.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoAgregarCarrito.setText("Agregar al Carrito");

        javax.swing.GroupLayout botonAgregarManzanaLayout = new javax.swing.GroupLayout(botonAgregarManzana);
        botonAgregarManzana.setLayout(botonAgregarManzanaLayout);
        botonAgregarManzanaLayout.setHorizontalGroup(
            botonAgregarManzanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAgregarManzanaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoAgregarCarrito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonAgregarManzanaLayout.setVerticalGroup(
            botonAgregarManzanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonAgregarManzanaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoAgregarCarrito)
                .addContainerGap())
        );

        BackgroundManzana.add(botonAgregarManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 140, 30));

        textoIDPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoIDPlayera.setText("ID:");
        BackgroundManzana.add(textoIDPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 40, 40));

        textoNumeroID.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoNumeroID.setText("id");
        BackgroundManzana.add(textoNumeroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton que regresa a la ventana Carrito, princial de la aplicacion
    private void volverManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverManzanaActionPerformed
        Carrito newframe = new Carrito();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverManzanaActionPerformed

    // Si hace clic en el boton + de la manzana
    private void botonMasManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasManzanaActionPerformed
        double cantidad = Double.parseDouble(llenadoCantidadManzana.getText()); // Obtener el valor en llenadoCantidadPlayera
        String resultado = String.valueOf(suma(cantidad));  // Sumar 0.1 en el valor de cantidad
        llenadoCantidadManzana.setText(resultado);  // Establecer el resultado de la suma
    }//GEN-LAST:event_botonMasManzanaActionPerformed

    // Si hace clic en el boton + de la manzana
    private void botonMenosManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenosManzanaActionPerformed
        double cantidad = Double.parseDouble(llenadoCantidadManzana.getText()); // Obtener el valor en llenadoCantidadManzana
        String resultado = String.valueOf(resta(cantidad));  // Restar 0.1 en el valor de cantidad    
        llenadoCantidadManzana.setText(resultado); // Establecer el resultado de la resta
    }//GEN-LAST:event_botonMenosManzanaActionPerformed

    // Aqui se mostraran los resultados del uso de los botones
    private void llenadoCantidadManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenadoCantidadManzanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_llenadoCantidadManzanaActionPerformed

    // Si se añade al carrito se llama al contructor de Comida con las caracteristicas que se eligieron
    private void botonAgregarManzanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarManzanaMouseClicked
        // Llamada al constructor
        Comida comida = new Comida("Manzana", "02-02-2023", "Nacional", 
                                   (int) (54 * Double.parseDouble(llenadoCantidadManzana.getText())), "Comida", ID_manzana, 
                                   Double.parseDouble(llenadoCantidadManzana.getText())); 
        ID_manzana ++; // Aumentar el ID de la manzana
        MiCarrito.listaProductos.add(comida); // Llamada al ArrayList listaProductos para añador la comida creada
        JOptionPane.showMessageDialog(null, "Manzanas agregadas al carrito"); // Mostrar mensaje que se añadadio al carrito
    }//GEN-LAST:event_botonAgregarManzanaMouseClicked

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
            java.util.logging.Logger.getLogger(Manzana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manzana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manzana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manzana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manzana().setVisible(true);
            }
        });
    }
    
    // Sumar 0.1 a la cantidad de la manzana
    private double suma(double cantidad){
        cantidad = cantidad + 0.1;
        return cantidad;
    }
    
    // Restar 0.1 a la cantidad de la manzana
    private double resta(double cantidad){
        if(cantidad>0){
            cantidad = cantidad - 0.1;
        }
        return cantidad;
    }
    
    // Metodo para mostrar el ID_falda como un String
    public String Cantidad(int ID){
        return "# " + ID_manzana;
    }
    
    // Declaracion de la variablees de los elementos que se muestran en el JFrame Manzana
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundManzana;
    private javax.swing.JPanel BarrasNegra;
    private javax.swing.JPanel botonAgregarManzana;
    private javax.swing.JButton botonMasManzana;
    private javax.swing.JButton botonMenosManzana;
    private javax.swing.JLabel descripcionManzana;
    private javax.swing.JLabel imagenManzana;
    private javax.swing.JTextField llenadoCantidadManzana;
    private javax.swing.JLabel textoAgregarCarrito;
    private javax.swing.JLabel textoCaducidadManzana;
    private javax.swing.JLabel textoCantidadManzana;
    private javax.swing.JLabel textoComprasOnline;
    private javax.swing.JLabel textoIDPlayera;
    private javax.swing.JLabel textoNacionalManzana1;
    private javax.swing.JLabel textoNumeroID;
    private javax.swing.JLabel textoPrecioManzana1;
    private javax.swing.JButton volverManzana;
    // End of variables declaration//GEN-END:variables
}
