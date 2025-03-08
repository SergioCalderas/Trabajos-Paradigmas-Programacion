/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 11 de enero del 2024
    
    La funcionalidad de la clase JFrame Ticket es mostrarle al usuario los detalles
    de su compra, los articulos que compro, el total por los articulos, el cambio y
    la cantidad que ingreso para pagar
    Los Metodos de Pago son
     - Moneda: Este Metodo se relaciona con los JLabel que muestran el total por los articulos, el cambio y
    la cantidad que ingreso para pagar transformar el total a pagar por el carrito en un String junto con un $ .
*/

/* Nombre del paquete con las clases de la aplicacion*/
package carrito;

import javax.swing.table.DefaultTableModel;

public class Ticket extends javax.swing.JFrame {
    DefaultTableModel modelo=new DefaultTableModel();           // Modelo de la tabla que mostrara los productos del carrito
    public double valorTotal; // Varible que muestra el total por los articulos
    public double valorPago; // Varible que muestra lo que pago el usuario
    public double valorCambio; // Varible que muestra el cambio en la transaccion

/* Constructor de Ticket */
    public Ticket() {
        initComponents();
        this.setTitle("Ticket"); // Nombre de la ventana
        valorTotal = MiCarrito.totalPagoMC; // Obtener el total por los articulos del carrito
        textoValorTotal.setText(Moneda(valorTotal)); // Establecer en textoValorTotal el valorTotal co un $
        
        valorPago = Pago.totalPagoUsuario; // Obtener lo que pago el usuario por su carrito
        textoValorPago.setText(Moneda(valorPago)); // Establecer en textoValorPago el valorPago co un $
        
        valorCambio = valorPago - valorTotal; // Hacer la resta para calcular el cambio
        textoValorCambio.setText(Moneda(valorCambio)); // Establecer en textoValorCambio el valorCambio co un $
        
        modelo.addColumn("Articulo"); // Nombre de la columana 1
        modelo.addColumn("Detalles"); // Nombre de la columana 2
        modelo.addColumn("Cantidad"); // Nombre de la columana 3
        modelo.addColumn("Precio Unitario"); // Nombre de la columana 4
        modelo.addColumn("Precio Total"); // Nombre de la columana 5
         
        actualizarTabla(); // Llamada al metotdo actualizarTabla para que se muestre la tabla con los productos al mostrarse el JFrame
    }

       /* Esta seccion es la encargada de generar todos los elementos visibles de la aplicacion
       se va generando automaticamente al ingresar elementos al JFrame */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BarrasNegra = new javax.swing.JPanel();
        textoPagoRealizado = new javax.swing.JLabel();
        textoTicket = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTicket = new javax.swing.JTable();
        textoCambio = new javax.swing.JLabel();
        textoTotal = new javax.swing.JLabel();
        textoPago = new javax.swing.JLabel();
        lineaDivisora = new javax.swing.JLabel();
        textoValorCambio = new javax.swing.JLabel();
        textoValorTotal = new javax.swing.JLabel();
        textoValorPago = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarrasNegra.setBackground(new java.awt.Color(19, 25, 33));

        textoPagoRealizado.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        textoPagoRealizado.setForeground(new java.awt.Color(255, 255, 255));
        textoPagoRealizado.setText("Pago Realizado");

        javax.swing.GroupLayout BarrasNegraLayout = new javax.swing.GroupLayout(BarrasNegra);
        BarrasNegra.setLayout(BarrasNegraLayout);
        BarrasNegraLayout.setHorizontalGroup(
            BarrasNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarrasNegraLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(textoPagoRealizado)
                .addContainerGap(521, Short.MAX_VALUE))
        );
        BarrasNegraLayout.setVerticalGroup(
            BarrasNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarrasNegraLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(textoPagoRealizado)
                .addGap(21, 21, 21))
        );

        jPanel1.add(BarrasNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 90));

        textoTicket.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoTicket.setForeground(new java.awt.Color(51, 51, 51));
        textoTicket.setText("Ticket");
        jPanel1.add(textoTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        TablaTicket.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaTicket);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 750, 290));

        textoCambio.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        textoCambio.setText("Cambio:");
        jPanel1.add(textoCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, 30));

        textoTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        textoTotal.setText("Total: ");
        jPanel1.add(textoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

        textoPago.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        textoPago.setText("Pagó: ");
        jPanel1.add(textoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, 30));

        lineaDivisora.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        lineaDivisora.setText("___________");
        jPanel1.add(lineaDivisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, -1, -1));

        textoValorCambio.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        textoValorCambio.setText("cambio");
        jPanel1.add(textoValorCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 120, 30));

        textoValorTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        textoValorTotal.setText("total");
        jPanel1.add(textoValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 120, 30));

        textoValorPago.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        textoValorPago.setText("pago");
        jPanel1.add(textoValorPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 120, 30));

        botonSalir.setBackground(new java.awt.Color(230, 122, 0));
        botonSalir.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.setFocusable(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton para cerrar la aplicacion
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    public void actualizarTabla(){
        // Mostrar todos los elementos de listaProductos
        for(Producto p : MiCarrito.listaProductos){
            Object x[] = new Object[5];
            x[0] = p.getNombre();
            if(p.getTipo() == "Ropa"){ // Verificar si p es Ropa y mostrar sus atributos
                x[1] = p.getTipo() + ", Talla " + ((Ropa) p).getTalla() + ", Color " + ((Ropa) p).getColor() + ", ID #" + p.getCodigo_unico();
                x[2] = p.getCantidad();
            } else { // Si no es Ropa es Comida, mostrar sus atributos
                x[1] = p.getTipo() + ", Fecha caducidad " + ((Comida) p).getFecha_caducidad() + ", Origen " + ((Comida) p).getOrigen() +
                       ", ID #" + p.getCodigo_unico();
                x[2] = p.getCantidad() + " kg";
            }
            if(p.getTipo() == "Ropa"){ // Verificar si p es Ropa para asignar sus precios
                if(p.getNombre() == "Playera"){ // Si p es Playera asignar su precio unitario
                  x[3] = " $300.00 ";  
                }
                if(p.getNombre() == "Pantalon"){ // Si p es Playera asignar su precio unitario
                  x[3] = " $450.00 ";  
                }
                if(p.getNombre() == "Falda"){ // Si p es Pantalon asignar su precio unitario
                  x[3] = " $350.00 ";  
                }
            } else { // Si p no es Ropa, es Comida, asignar sus precios
                if(p.getNombre() == "Manzana"){ // Si p es Falda asignar su precio unitario
                  x[3] = " $54.00 kg ";  
                }
                if(p.getNombre() == "Pollo"){ // Si p es Pollo asignar su precio unitario
                  x[3] = " $110.00 kg";  
                }
                if(p.getNombre() == "Chocolate"){ // Si p es Chocolate asignar su precio unitario
                  x[3] = " $70.00 kg";  
                }
            }
            x[4] = Moneda(p.getPrecio()); // Mostrar el precio total por cada articulo
            modelo.addRow(x); // Añadir fila a la tabla
        }
        TablaTicket.setModel(modelo); // Establecer el modelo de la tabla
    }
    
    // Metodo para mostrar el total como un String
    public String Moneda(double precio){
        return "$" + Math.round(precio * 100.00) / 100.00;
    }
    
    // Declaracion de la variablees de los elementos que se muestran en el JFrame Pollo
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarrasNegra;
    private javax.swing.JTable TablaTicket;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lineaDivisora;
    private javax.swing.JLabel textoCambio;
    private javax.swing.JLabel textoPago;
    private javax.swing.JLabel textoPagoRealizado;
    private javax.swing.JLabel textoTicket;
    private javax.swing.JLabel textoTotal;
    private javax.swing.JLabel textoValorCambio;
    private javax.swing.JLabel textoValorPago;
    private javax.swing.JLabel textoValorTotal;
    // End of variables declaration//GEN-END:variables
}
