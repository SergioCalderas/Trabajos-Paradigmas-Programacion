/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 11 de enero del 2024
    
    La funcionalidad de la clase JFrame Pantalon es mostrar los detalles del producto
    Pantalon, ademas de poder crear un objeto de la clase ropa con los atributos. 
    seleccionados
    Los Metodos de Pantalon son
     - suma: Este Metodo va asociada con el botonMasPantalon, cuando se hace clic 
       aumenta la cantidad de los pantalones que se van a comprar.
     - resta: Este Metodo va asociada con el botonMenosPantalon, cuando se hace clic 
       disminuye la cantidad de los pantalones que se van a comprar, no genera valores
       negativos.
     - Cantidad: Este Metodo se relaciona con el JLabel textoNumeroID y va a 
       transformar el int ID_pantalon a un String para que sea visible el codigo unico
       del pantalon
*/

/* Nombre del paquete con las clases de la aplicacion*/
package carrito;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.*;


public class Pantalon extends javax.swing.JFrame {
    public static int ID_pantalon = 1; // Codigo unico del pantalon
    private char talla;     // Talla que puede ir cambiando en base al boton que se selecciona
    private String color;   // Color que puede ir cambiando en base al boton que se selecciona

/* Constructor de Pantalon */
    public Pantalon() {
        initComponents();
        this.setTitle("Pantalon"); // Nombre de la ventana
        // Establecer en texto el codigo unico del pantalon que se tiene al momento
        textoNumeroID.setText(Cantidad(ID_pantalon));
    }

     /* Esta seccion es la encargada de generar todos los elementos visibles de la aplicacion
       se va generando automaticamente al ingresar elementos al JFrame */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPantalon = new javax.swing.JPanel();
        BarrasNegra = new javax.swing.JPanel();
        textoComprasOnline = new javax.swing.JLabel();
        volverPantalon = new javax.swing.JButton();
        descripcionPantalon1 = new javax.swing.JLabel();
        descripcionPantalon2 = new javax.swing.JLabel();
        textoTallaPantalon = new javax.swing.JLabel();
        textoPrecioPantalon = new javax.swing.JLabel();
        textoColorPantalon = new javax.swing.JLabel();
        fondoColorCambiante = new javax.swing.JPanel();
        pantalonColorCambiante = new javax.swing.JLabel();
        botonMarron = new javax.swing.JPanel();
        textoMarron = new javax.swing.JLabel();
        botonAzul = new javax.swing.JPanel();
        textoAzul = new javax.swing.JLabel();
        botonGris = new javax.swing.JPanel();
        textoGris = new javax.swing.JLabel();
        botonTallaSmall = new javax.swing.JPanel();
        textoS = new javax.swing.JLabel();
        botonTallaMedium = new javax.swing.JPanel();
        textoM = new javax.swing.JLabel();
        botonTallaLarge = new javax.swing.JPanel();
        textoL = new javax.swing.JLabel();
        textoCantidadPantalon = new javax.swing.JLabel();
        botonMasPantalon = new javax.swing.JButton();
        botonMenosPantalon = new javax.swing.JButton();
        llenadoCantidadPantalon = new javax.swing.JTextField();
        textoAgregarCarrito = new javax.swing.JLabel();
        botonAgregarPantalon = new javax.swing.JPanel();
        textoAgregarCarrito1 = new javax.swing.JLabel();
        textoIDPlayera = new javax.swing.JLabel();
        textoNumeroID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BackgroundPantalon.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPantalon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        BackgroundPantalon.add(BarrasNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 90));

        volverPantalon.setBackground(new java.awt.Color(230, 122, 0));
        volverPantalon.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        volverPantalon.setForeground(new java.awt.Color(255, 255, 255));
        volverPantalon.setText("Volver");
        volverPantalon.setFocusable(false);
        volverPantalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverPantalonActionPerformed(evt);
            }
        });
        BackgroundPantalon.add(volverPantalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        descripcionPantalon1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        descripcionPantalon1.setText("Pantalon deportivo de algodón");
        BackgroundPantalon.add(descripcionPantalon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 320, -1));

        descripcionPantalon2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        descripcionPantalon2.setText("suave y liso.");
        BackgroundPantalon.add(descripcionPantalon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 130, 40));

        textoTallaPantalon.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoTallaPantalon.setText("Talla:");
        BackgroundPantalon.add(textoTallaPantalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 60, 40));

        textoPrecioPantalon.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoPrecioPantalon.setText("Precio: $450.00");
        BackgroundPantalon.add(textoPrecioPantalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 130, 40));

        textoColorPantalon.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoColorPantalon.setText("Color:");
        BackgroundPantalon.add(textoColorPantalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 60, 40));

        fondoColorCambiante.setBackground(new java.awt.Color(88, 88, 88));
        fondoColorCambiante.setPreferredSize(new java.awt.Dimension(180, 180));

        pantalonColorCambiante.setBackground(new java.awt.Color(255, 255, 255));
        pantalonColorCambiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito/imagenes/pantalonSinFondo.png"))); // NOI18N

        javax.swing.GroupLayout fondoColorCambianteLayout = new javax.swing.GroupLayout(fondoColorCambiante);
        fondoColorCambiante.setLayout(fondoColorCambianteLayout);
        fondoColorCambianteLayout.setHorizontalGroup(
            fondoColorCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoColorCambianteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pantalonColorCambiante, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fondoColorCambianteLayout.setVerticalGroup(
            fondoColorCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoColorCambianteLayout.createSequentialGroup()
                .addComponent(pantalonColorCambiante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BackgroundPantalon.add(fondoColorCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 165));

        botonMarron.setBackground(new java.awt.Color(164, 102, 88));
        botonMarron.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMarron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMarronMouseClicked(evt);
            }
        });

        textoMarron.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoMarron.setForeground(new java.awt.Color(255, 255, 255));
        textoMarron.setText("Marrón");

        javax.swing.GroupLayout botonMarronLayout = new javax.swing.GroupLayout(botonMarron);
        botonMarron.setLayout(botonMarronLayout);
        botonMarronLayout.setHorizontalGroup(
            botonMarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonMarronLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(textoMarron)
                .addGap(16, 16, 16))
        );
        botonMarronLayout.setVerticalGroup(
            botonMarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonMarronLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoMarron)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundPantalon.add(botonMarron, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 90, 30));

        botonAzul.setBackground(new java.awt.Color(30, 56, 211));
        botonAzul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAzulMouseClicked(evt);
            }
        });

        textoAzul.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoAzul.setForeground(new java.awt.Color(255, 255, 255));
        textoAzul.setText("Azul");

        javax.swing.GroupLayout botonAzulLayout = new javax.swing.GroupLayout(botonAzul);
        botonAzul.setLayout(botonAzulLayout);
        botonAzulLayout.setHorizontalGroup(
            botonAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAzulLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(textoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        botonAzulLayout.setVerticalGroup(
            botonAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoAzul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundPantalon.add(botonAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        botonGris.setBackground(new java.awt.Color(88, 88, 88));
        botonGris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGrisMouseClicked(evt);
            }
        });

        textoGris.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoGris.setForeground(new java.awt.Color(255, 255, 255));
        textoGris.setText("Gris");

        javax.swing.GroupLayout botonGrisLayout = new javax.swing.GroupLayout(botonGris);
        botonGris.setLayout(botonGrisLayout);
        botonGrisLayout.setHorizontalGroup(
            botonGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonGrisLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(textoGris, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        botonGrisLayout.setVerticalGroup(
            botonGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonGrisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoGris)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundPantalon.add(botonGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        botonTallaSmall.setBackground(new java.awt.Color(231, 231, 231));
        botonTallaSmall.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTallaSmall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTallaSmallMouseClicked(evt);
            }
        });

        textoS.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoS.setText("S");

        javax.swing.GroupLayout botonTallaSmallLayout = new javax.swing.GroupLayout(botonTallaSmall);
        botonTallaSmall.setLayout(botonTallaSmallLayout);
        botonTallaSmallLayout.setHorizontalGroup(
            botonTallaSmallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonTallaSmallLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(textoS)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        botonTallaSmallLayout.setVerticalGroup(
            botonTallaSmallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonTallaSmallLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundPantalon.add(botonTallaSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, 30));

        botonTallaMedium.setBackground(new java.awt.Color(231, 231, 231));
        botonTallaMedium.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTallaMedium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTallaMediumMouseClicked(evt);
            }
        });

        textoM.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoM.setText("M");

        javax.swing.GroupLayout botonTallaMediumLayout = new javax.swing.GroupLayout(botonTallaMedium);
        botonTallaMedium.setLayout(botonTallaMediumLayout);
        botonTallaMediumLayout.setHorizontalGroup(
            botonTallaMediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonTallaMediumLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(textoM)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        botonTallaMediumLayout.setVerticalGroup(
            botonTallaMediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonTallaMediumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoM)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundPantalon.add(botonTallaMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, 30));

        botonTallaLarge.setBackground(new java.awt.Color(231, 231, 231));
        botonTallaLarge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTallaLarge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTallaLargeMouseClicked(evt);
            }
        });

        textoL.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoL.setText("L");

        javax.swing.GroupLayout botonTallaLargeLayout = new javax.swing.GroupLayout(botonTallaLarge);
        botonTallaLarge.setLayout(botonTallaLargeLayout);
        botonTallaLargeLayout.setHorizontalGroup(
            botonTallaLargeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonTallaLargeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(textoL)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        botonTallaLargeLayout.setVerticalGroup(
            botonTallaLargeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonTallaLargeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundPantalon.add(botonTallaLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, 30));

        textoCantidadPantalon.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoCantidadPantalon.setText("Cantidad");
        BackgroundPantalon.add(textoCantidadPantalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 80, 40));

        botonMasPantalon.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonMasPantalon.setText("+");
        botonMasPantalon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMasPantalon.setFocusable(false);
        botonMasPantalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasPantalonActionPerformed(evt);
            }
        });
        BackgroundPantalon.add(botonMasPantalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 61, 33));

        botonMenosPantalon.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonMenosPantalon.setText("-");
        botonMenosPantalon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMenosPantalon.setFocusable(false);
        botonMenosPantalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosPantalonActionPerformed(evt);
            }
        });
        BackgroundPantalon.add(botonMenosPantalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 61, 33));

        llenadoCantidadPantalon.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        llenadoCantidadPantalon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        llenadoCantidadPantalon.setText("0");
        llenadoCantidadPantalon.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        llenadoCantidadPantalon.setFocusable(false);
        llenadoCantidadPantalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenadoCantidadPantalonActionPerformed(evt);
            }
        });
        BackgroundPantalon.add(llenadoCantidadPantalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 61, 33));

        textoAgregarCarrito.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoAgregarCarrito.setText("Agregar al Carrito");
        BackgroundPantalon.add(textoAgregarCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        botonAgregarPantalon.setBackground(new java.awt.Color(255, 216, 20));
        botonAgregarPantalon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarPantalon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarPantalonMouseClicked(evt);
            }
        });

        textoAgregarCarrito1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoAgregarCarrito1.setText("Agregar al Carrito");

        javax.swing.GroupLayout botonAgregarPantalonLayout = new javax.swing.GroupLayout(botonAgregarPantalon);
        botonAgregarPantalon.setLayout(botonAgregarPantalonLayout);
        botonAgregarPantalonLayout.setHorizontalGroup(
            botonAgregarPantalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAgregarPantalonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoAgregarCarrito1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonAgregarPantalonLayout.setVerticalGroup(
            botonAgregarPantalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonAgregarPantalonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoAgregarCarrito1)
                .addContainerGap())
        );

        BackgroundPantalon.add(botonAgregarPantalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 140, 30));

        textoIDPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoIDPlayera.setText("ID:");
        BackgroundPantalon.add(textoIDPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 40, 40));

        textoNumeroID.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoNumeroID.setText("id");
        BackgroundPantalon.add(textoNumeroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPantalon, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPantalon, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton que regresa a la ventana Carrito, princial de la aplicacion
    private void volverPantalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverPantalonActionPerformed
        Carrito newframe = new Carrito();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverPantalonActionPerformed

    // Si se selecciona el boton marron para el color de la playera
    private void botonMarronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMarronMouseClicked
        fondoColorCambiante.setBackground(new Color (164,102,68)); // Cambiar el color del fondo del pantalon
        botonMarron.setBorder(BorderFactory.createLineBorder(new Color(231,117,2), 2)); // Cambiar el color del borde a naranja del boton pulsado
        botonAzul.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonGris.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        color = "Marron"; // Establecer el valor de la variable a Marron para el constructor
    }//GEN-LAST:event_botonMarronMouseClicked

    // Si se selecciona el boton azul para el color de la playera
    private void botonAzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAzulMouseClicked
        fondoColorCambiante.setBackground(new Color (30,56,211)); // Cambiar el color del fondo del pantalon
        botonMarron.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonAzul.setBorder(BorderFactory.createLineBorder(new Color(231,117,2), 2)); // Cambiar el color del borde a naranja del boton pulsado
        botonGris.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        color = "Azul"; // Establecer el valor de la variable a Azul para el constructor
    }//GEN-LAST:event_botonAzulMouseClicked

    // Si se selecciona el boton gris para el color de la playera
    private void botonGrisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGrisMouseClicked
        fondoColorCambiante.setBackground(new Color (88,88,88)); // Cambiar el color del fondo del pantalon
        botonMarron.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonAzul.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonGris.setBorder(BorderFactory.createLineBorder(new Color(231,117,2), 2)); // Cambiar el color del borde a naranja del boton pulsado
        color = "Gris"; // Establecer el valor de la variable a Gris para el constructor
    }//GEN-LAST:event_botonGrisMouseClicked

    // Si se selecciona el boton S para la talla de la playera
    private void botonTallaSmallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTallaSmallMouseClicked
        botonTallaSmall.setBorder(BorderFactory.createLineBorder(new Color(231,117,2), 2)); // Cambiar el color del borde a naranja del boton pulsado
        botonTallaMedium.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonTallaLarge.setBorder(BorderFactory.createLineBorder(Color.white));  // Cambiar el color del borde a blanco del no seleccionado
        talla = 'S';  // Establecer el valor de la variable a S para el constructor
    }//GEN-LAST:event_botonTallaSmallMouseClicked

    // Si se selecciona el boton M para la talla de la playera
    private void botonTallaMediumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTallaMediumMouseClicked
        botonTallaSmall.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonTallaMedium.setBorder(BorderFactory.createLineBorder(new Color(231,117,2), 2)); // Cambiar el color del borde a naranja del boton pulsado
        botonTallaLarge.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        talla = 'M'; // Establecer el valor de la variable a M para el constructor
    }//GEN-LAST:event_botonTallaMediumMouseClicked

    // Si se selecciona el boton L para la talla de la playera
    private void botonTallaLargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTallaLargeMouseClicked
        botonTallaSmall.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonTallaMedium.setBorder(BorderFactory.createLineBorder(Color.white));// Cambiar el color del borde a blanco del no seleccionado
        botonTallaLarge.setBorder(BorderFactory.createLineBorder(new Color(231,117,2), 2)); // Cambiar el color del borde a naranja del boton pulsado
        talla = 'L'; // Establecer el valor de la variable a L para el constructor
    }//GEN-LAST:event_botonTallaLargeMouseClicked

    // Si hace clic en el boton + del pantalon
    private void botonMasPantalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasPantalonActionPerformed
        Integer cantidad = Integer.parseInt(llenadoCantidadPantalon.getText()); // Obtener el valor en llenadoCantidadPantalon
        String resultado = String.valueOf(suma(cantidad)); // Sumar 1 en el valor de cantidad
        llenadoCantidadPantalon.setText(resultado); // Establecer el resultado de la suma
    }//GEN-LAST:event_botonMasPantalonActionPerformed

    // Si hace clic en el boton - del pantalon
    private void botonMenosPantalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenosPantalonActionPerformed
        Integer cantidad =Integer.parseInt(llenadoCantidadPantalon.getText()); // Obtener el valor en llenadoCantidadPantalon
        String resultado = String.valueOf(resta(cantidad)); // Restar 1 en el valor de cantidad
        llenadoCantidadPantalon.setText(resultado); // Establecer el resultado de la resta
    }//GEN-LAST:event_botonMenosPantalonActionPerformed

    // Aqui se mostraran los resultados del uso de los botones
    private void llenadoCantidadPantalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenadoCantidadPantalonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_llenadoCantidadPantalonActionPerformed

    // Si se añade al carrito se llama al contructor de Ropa con las caracteristicas que se eligieron
    private void botonAgregarPantalonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarPantalonMouseClicked
        // Llamada al constructor
        Ropa ropa = new Ropa("Pantalon", talla, color, 450 * Integer.parseInt(llenadoCantidadPantalon.getText()), 
                             "Ropa", ID_pantalon, Integer.parseInt(llenadoCantidadPantalon.getText())); 
        ID_pantalon ++; // Aumentar el ID del pantalon
        MiCarrito.listaProductos.add(ropa); // Llamada al ArrayList listaProductos para añador la ropa creada
        JOptionPane.showMessageDialog(null, "Pantalon agregado al carrito"); // Mostrar mensaje que se añadadio al carrito
    }//GEN-LAST:event_botonAgregarPantalonMouseClicked

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
            java.util.logging.Logger.getLogger(Pantalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalon().setVisible(true);
            }
        });
    }

    // Sumar 1 a la cantidad de la playera
    private int suma(int cantidad){
        cantidad = cantidad + 1;
        return cantidad;
    }
    
    // Restar 1 a la cantidad de la playera
    private int resta(int cantidad){
        if(cantidad>0){
            cantidad = cantidad - 1;
        }
        return cantidad;
    }
    
    // Metodo para mostrar el ID_playera como un String
    public String Cantidad(int ID){
        return "# " + ID_pantalon;
    }
    
    // Declaracion de la variablees de los elementos que se muestran en el JFrame Pantalon
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPantalon;
    private javax.swing.JPanel BarrasNegra;
    private javax.swing.JPanel botonAgregarPantalon;
    private javax.swing.JPanel botonAzul;
    private javax.swing.JPanel botonGris;
    private javax.swing.JPanel botonMarron;
    private javax.swing.JButton botonMasPantalon;
    private javax.swing.JButton botonMenosPantalon;
    private javax.swing.JPanel botonTallaLarge;
    private javax.swing.JPanel botonTallaMedium;
    private javax.swing.JPanel botonTallaSmall;
    private javax.swing.JLabel descripcionPantalon1;
    private javax.swing.JLabel descripcionPantalon2;
    private javax.swing.JPanel fondoColorCambiante;
    private javax.swing.JTextField llenadoCantidadPantalon;
    private javax.swing.JLabel pantalonColorCambiante;
    private javax.swing.JLabel textoAgregarCarrito;
    private javax.swing.JLabel textoAgregarCarrito1;
    private javax.swing.JLabel textoAzul;
    private javax.swing.JLabel textoCantidadPantalon;
    private javax.swing.JLabel textoColorPantalon;
    private javax.swing.JLabel textoComprasOnline;
    private javax.swing.JLabel textoGris;
    private javax.swing.JLabel textoIDPlayera;
    private javax.swing.JLabel textoL;
    private javax.swing.JLabel textoM;
    private javax.swing.JLabel textoMarron;
    private javax.swing.JLabel textoNumeroID;
    private javax.swing.JLabel textoPrecioPantalon;
    private javax.swing.JLabel textoS;
    private javax.swing.JLabel textoTallaPantalon;
    private javax.swing.JButton volverPantalon;
    // End of variables declaration//GEN-END:variables
}
