/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 11 de enero del 2024
    
    La funcionalidad de la clase JFrame MiCarrito es mostrar todos los productos que
    estan en el ArrayList listaProductos en una tabla junto con el total a pagar por
    los productos, tambien aqui se puede eliminar productos del carrito se se desea
    seleccionados
    Los Metodos de MiCarrito son
     - actualizarTabla: Este Metodo se encarga de mostrar en la tabla todos los 
       productos del ArrayList listaProductos separados por columnas segun la 
       informacion que se quiera mostrar en cada una.
     - Moneda: Este Metodo se relaciona con el JLabel cantidadTotal y va a 
       transformar el total a pagar por el carrito en un String junto con un $ .
*/

/* Nombre del paquete con las clases de la aplicacion*/
package carrito;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
        
public class MiCarrito extends javax.swing.JFrame {
    public static ArrayList<Producto> listaProductos = new ArrayList<>(); // ArrayList de los productos añadidos al carrito
    DefaultTableModel modelo=new DefaultTableModel(); // Modelo de la tabla que mostrara los productos del carrito
    public double total;  // Precio total de la compra    
    public static double totalPagoMC;     // Variable que representa el precio total del carrito y que se pasara a las demas clases
    
/* Constructor de MiCarrito */
    public MiCarrito() {
        initComponents();
        this.setTitle("Mi Carrito"); // Nombre de la ventana
        modelo.addColumn("Articulo"); // Nombre de la columana 1
        modelo.addColumn("Detalles"); // Nombre de la columana 2 
        modelo.addColumn("Cantidad"); // Nombre de la columana 3
        modelo.addColumn("Precio"); // Nombre de la columana 5
        
        actualizarTabla(); // Llamada al metotdo actualizarTabla para que se muestre la tabla con los productos al mostrarse el JFrame
    }

    /* Esta seccion es la encargada de generar todos los elementos visibles de la aplicacion
       se va generando automaticamente al ingresar elementos al JFrame */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundMiCarrito = new javax.swing.JPanel();
        BarrasNegra = new javax.swing.JPanel();
        textoComprasOnline1 = new javax.swing.JLabel();
        textoComprasOnline = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        textoTotal = new javax.swing.JLabel();
        textoPantalon1 = new javax.swing.JLabel();
        cantidadTotal = new javax.swing.JLabel();
        botonPagar = new javax.swing.JButton();
        volverMiCarito = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BackgroundMiCarrito.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundMiCarrito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarrasNegra.setBackground(new java.awt.Color(19, 25, 33));

        textoComprasOnline1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoComprasOnline1.setForeground(new java.awt.Color(255, 255, 255));
        textoComprasOnline1.setText("Compras Online");

        javax.swing.GroupLayout BarrasNegraLayout = new javax.swing.GroupLayout(BarrasNegra);
        BarrasNegra.setLayout(BarrasNegraLayout);
        BarrasNegraLayout.setHorizontalGroup(
            BarrasNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
            .addGroup(BarrasNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BarrasNegraLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(textoComprasOnline1)
                    .addContainerGap(581, Short.MAX_VALUE)))
        );
        BarrasNegraLayout.setVerticalGroup(
            BarrasNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(BarrasNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarrasNegraLayout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addComponent(textoComprasOnline1)
                    .addGap(20, 20, 20)))
        );

        BackgroundMiCarrito.add(BarrasNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 90));

        textoComprasOnline.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoComprasOnline.setForeground(new java.awt.Color(51, 51, 51));
        textoComprasOnline.setText("Articulos en el Carrito");
        BackgroundMiCarrito.add(textoComprasOnline, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaProductos);

        BackgroundMiCarrito.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 740, 210));

        textoTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        textoTotal.setText("Total: ");
        BackgroundMiCarrito.add(textoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 40));

        textoPantalon1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        textoPantalon1.setText("Pantalon");
        BackgroundMiCarrito.add(textoPantalon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cantidadTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        cantidadTotal.setText("cantidadTotal");
        BackgroundMiCarrito.add(cantidadTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, 20));

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
        BackgroundMiCarrito.add(botonPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));

        volverMiCarito.setBackground(new java.awt.Color(230, 122, 0));
        volverMiCarito.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        volverMiCarito.setForeground(new java.awt.Color(255, 255, 255));
        volverMiCarito.setText("Volver");
        volverMiCarito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverMiCarito.setFocusable(false);
        volverMiCarito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMiCaritoActionPerformed(evt);
            }
        });
        BackgroundMiCarrito.add(volverMiCarito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        botonEliminar.setBackground(new java.awt.Color(230, 122, 0));
        botonEliminar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("Eliminar");
        botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminar.setFocusable(false);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        BackgroundMiCarrito.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundMiCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundMiCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton que se usara si ya se quiere pagar los articulos del carrito se mostrara la ventana Pago
    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed
        totalPagoMC = total; // Asignar a totalPagoMC en valor total de los productos del carrito
        Pago newframe = new Pago();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonPagarActionPerformed

    // Boton que regresa a la ventana Carrito, princial de la aplicacion
    private void volverMiCaritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMiCaritoActionPerformed
        Carrito newframe = new Carrito();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverMiCaritoActionPerformed

    // Si se quiere eliminar un producto del ArrayList listaProductos
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int productoEliminar = TablaProductos.getSelectedRow(); // Seleccionar el indice del producto a eliminar
        
        if(productoEliminar >= 0){
            listaProductos.remove(productoEliminar); // Remover el producto del ArrayList listaProductos
            total = 0; // Establecer el precio de nuevo a 0 para que al actualizar la tabla se sumen los precio de los
                       // productos que estan en la tabla ya eliminado el anterior
            actualizarTabla();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(MiCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiCarrito().setVisible(true);
            }
        });
    }
    
    public void actualizarTabla(){
        while(modelo.getRowCount()>0){  // Verificar si la tabla tiene alguna fila, si asi es se eliminan
            modelo.removeRow(0);        // los elementos previos y se agregan los que esten en el ArrayList 
        }
        for(Producto p : listaProductos){
            Object x[] = new Object[4];
            x[0] = p.getNombre();
            if(p.getTipo() == "Ropa"){ //  Verificar si p es Ropa para acceder a sus metodos y mostrar sus detalles
                x[1] = p.getTipo() + ", Talla " + ((Ropa) p).getTalla() + ", Color " + ((Ropa) p).getColor() + ", ID #" + p.getCodigo_unico();
                x[2] = p.getCantidad();
            } else { // Si no es Ropa es Comida, mostrar sus detalles
                x[1] = p.getTipo() + ", Fecha caducidad " + ((Comida) p).getFecha_caducidad() + ", Origen " + ((Comida) p).getOrigen() +
                       ", ID #" + p.getCodigo_unico();;
                x[2] = p.getCantidad() + " kg";
            }
            x[3] = Moneda(p.getPrecio()); // Mostrar el total con un $ indicando que es la cantidad a pagar
            total += p.getPrecio(); // Sumar los precios de los productos
            modelo.addRow(x); // Añadir fila a la tabla
        }
        cantidadTotal.setText(Moneda(total)); // Establecer en cantidadTotal el total a pagar
        TablaProductos.setModel(modelo); // Establecer el modelo de la tabla
    }
    
    // Metodo para mostrar el total como un String
    public String Moneda(double precio){
        return "$" + Math.round(precio * 100.00) / 100.00;
    }
    
    // Declaracion de la variablees de los elementos que se muestran en el JFrame Pollo
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundMiCarrito;
    private javax.swing.JPanel BarrasNegra;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonPagar;
    private javax.swing.JLabel cantidadTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel textoComprasOnline;
    private javax.swing.JLabel textoComprasOnline1;
    private javax.swing.JLabel textoPantalon1;
    private javax.swing.JLabel textoTotal;
    private javax.swing.JButton volverMiCarito;
    // End of variables declaration//GEN-END:variables
}
