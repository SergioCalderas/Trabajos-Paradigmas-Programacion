/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 11 de enero del 2024
    
    La funcionalidad de la clase JFrame Carrito es ser la vista principal
    de la aplicacion en la cual se mostraran los distintos productos de
    la aplicacion y tener los botones para acceder a los detalles de cada 
    uno de los productos, y el boton para ir al carrito con todos los
    productos añadidos
    Los Metodos de Carrito son
      Esta clase no tiene metodos
*/

/* Nombre del paquete con las clases de la aplicacion*/
package carrito;

/* Libreria usada para que al pasar el mouse por encima de los productos cambien de color */
import java.awt.Color;

public class Carrito extends javax.swing.JFrame {
    
    /* Constructor de carrito */
    public Carrito() {
        initComponents();
        this.setTitle("Compras Online"); // Nombre de la ventana
    }

    /* Esta seccion es la encargada de generar todos los elementos visibles de la aplicacion
       se va generando automaticamente al ingresar elementos al JFrame */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoGeneral = new javax.swing.JPanel();
        BarrasNegra = new javax.swing.JPanel();
        textoComprasOnline = new javax.swing.JLabel();
        imagenCarrito = new javax.swing.JLabel();
        FondoBlanco = new javax.swing.JPanel();
        textoRopa = new javax.swing.JLabel();
        textoComida = new javax.swing.JLabel();
        fondoPlayera = new javax.swing.JPanel();
        textoPlayera = new javax.swing.JLabel();
        precioPlayera = new javax.swing.JLabel();
        detallesPlayera = new javax.swing.JButton();
        imagenPlayera = new javax.swing.JLabel();
        fondoPantalon = new javax.swing.JPanel();
        textoPantalon = new javax.swing.JLabel();
        precioPantalon = new javax.swing.JLabel();
        detallesPantalon = new javax.swing.JButton();
        imagenPantalon = new javax.swing.JLabel();
        fondoFalda = new javax.swing.JPanel();
        textoFalda = new javax.swing.JLabel();
        precioFalda = new javax.swing.JLabel();
        detallesFalda = new javax.swing.JButton();
        imagenFalda = new javax.swing.JLabel();
        fondoManzana = new javax.swing.JPanel();
        textoManzana = new javax.swing.JLabel();
        precioManzana = new javax.swing.JLabel();
        detallesManzana = new javax.swing.JButton();
        imagenManzana = new javax.swing.JLabel();
        fondoPollo = new javax.swing.JPanel();
        textoPollo = new javax.swing.JLabel();
        precioPollo = new javax.swing.JLabel();
        detallesPollo = new javax.swing.JButton();
        imagenPollo = new javax.swing.JLabel();
        fondoChocolate = new javax.swing.JPanel();
        precioChocolate = new javax.swing.JLabel();
        detallesChocolate = new javax.swing.JButton();
        imagenChocolate = new javax.swing.JLabel();
        textoChocolate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoGeneral.setBackground(new java.awt.Color(255, 255, 255));
        FondoGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarrasNegra.setBackground(new java.awt.Color(19, 25, 33));

        textoComprasOnline.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoComprasOnline.setForeground(new java.awt.Color(255, 255, 255));
        textoComprasOnline.setText("Compras Online");

        imagenCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito/imagenes/imagenCarritoDef.png"))); // NOI18N
        imagenCarrito.setText("jLabel2");
        imagenCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagenCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenCarritoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BarrasNegraLayout = new javax.swing.GroupLayout(BarrasNegra);
        BarrasNegra.setLayout(BarrasNegraLayout);
        BarrasNegraLayout.setHorizontalGroup(
            BarrasNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarrasNegraLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(textoComprasOnline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 586, Short.MAX_VALUE)
                .addComponent(imagenCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        BarrasNegraLayout.setVerticalGroup(
            BarrasNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarrasNegraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(textoComprasOnline)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BarrasNegraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        FondoGeneral.add(BarrasNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 90));

        FondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        textoRopa.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoRopa.setText("Comida");

        textoComida.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoComida.setText("Ropa");

        fondoPlayera.setBackground(new java.awt.Color(255, 255, 255));
        fondoPlayera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fondoPlayeraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fondoPlayeraMouseExited(evt);
            }
        });

        textoPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        textoPlayera.setText("Playera");

        precioPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        precioPlayera.setText("$300");

        detallesPlayera.setBackground(new java.awt.Color(230, 122, 0));
        detallesPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        detallesPlayera.setForeground(new java.awt.Color(255, 255, 255));
        detallesPlayera.setText("Detalles");
        detallesPlayera.setBorderPainted(false);
        detallesPlayera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detallesPlayera.setFocusPainted(false);
        detallesPlayera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                detallesPlayeraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                detallesPlayeraMouseExited(evt);
            }
        });
        detallesPlayera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesPlayeraActionPerformed(evt);
            }
        });

        imagenPlayera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito/imagenes/Playera.png"))); // NOI18N

        javax.swing.GroupLayout fondoPlayeraLayout = new javax.swing.GroupLayout(fondoPlayera);
        fondoPlayera.setLayout(fondoPlayeraLayout);
        fondoPlayeraLayout.setHorizontalGroup(
            fondoPlayeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPlayeraLayout.createSequentialGroup()
                .addGroup(fondoPlayeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPlayeraLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(imagenPlayera))
                    .addGroup(fondoPlayeraLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(fondoPlayeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(detallesPlayera)
                            .addGroup(fondoPlayeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(fondoPlayeraLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(precioPlayera))
                                .addComponent(textoPlayera, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        fondoPlayeraLayout.setVerticalGroup(
            fondoPlayeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPlayeraLayout.createSequentialGroup()
                .addComponent(imagenPlayera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoPlayera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioPlayera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detallesPlayera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondoPantalon.setBackground(new java.awt.Color(255, 255, 255));
        fondoPantalon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fondoPantalonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fondoPantalonMouseExited(evt);
            }
        });

        textoPantalon.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        textoPantalon.setText("Pantalon");

        precioPantalon.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        precioPantalon.setText("$450");

        detallesPantalon.setBackground(new java.awt.Color(230, 122, 0));
        detallesPantalon.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        detallesPantalon.setForeground(new java.awt.Color(255, 255, 255));
        detallesPantalon.setText("Detalles");
        detallesPantalon.setBorderPainted(false);
        detallesPantalon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detallesPantalon.setFocusPainted(false);
        detallesPantalon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                detallesPantalonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                detallesPantalonMouseExited(evt);
            }
        });
        detallesPantalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesPantalonActionPerformed(evt);
            }
        });

        imagenPantalon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito/imagenes/Pantalon.png"))); // NOI18N

        javax.swing.GroupLayout fondoPantalonLayout = new javax.swing.GroupLayout(fondoPantalon);
        fondoPantalon.setLayout(fondoPantalonLayout);
        fondoPantalonLayout.setHorizontalGroup(
            fondoPantalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPantalonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(detallesPantalon)
                .addGap(61, 61, 61))
            .addGroup(fondoPantalonLayout.createSequentialGroup()
                .addGroup(fondoPantalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPantalonLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(textoPantalon))
                    .addGroup(fondoPantalonLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(imagenPantalon))
                    .addGroup(fondoPantalonLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(precioPantalon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoPantalonLayout.setVerticalGroup(
            fondoPantalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPantalonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenPantalon)
                .addGap(16, 16, 16)
                .addComponent(textoPantalon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioPantalon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detallesPantalon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondoFalda.setBackground(new java.awt.Color(255, 255, 255));
        fondoFalda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fondoFaldaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fondoFaldaMouseExited(evt);
            }
        });

        textoFalda.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        textoFalda.setText("Falda");

        precioFalda.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        precioFalda.setText("$350");

        detallesFalda.setBackground(new java.awt.Color(230, 122, 0));
        detallesFalda.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        detallesFalda.setForeground(new java.awt.Color(255, 255, 255));
        detallesFalda.setText("Detalles");
        detallesFalda.setBorderPainted(false);
        detallesFalda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detallesFalda.setFocusPainted(false);
        detallesFalda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                detallesFaldaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                detallesFaldaMouseExited(evt);
            }
        });
        detallesFalda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesFaldaActionPerformed(evt);
            }
        });

        imagenFalda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito/imagenes/Falda.png"))); // NOI18N

        javax.swing.GroupLayout fondoFaldaLayout = new javax.swing.GroupLayout(fondoFalda);
        fondoFalda.setLayout(fondoFaldaLayout);
        fondoFaldaLayout.setHorizontalGroup(
            fondoFaldaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoFaldaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(detallesFalda)
                .addGap(64, 64, 64))
            .addGroup(fondoFaldaLayout.createSequentialGroup()
                .addGroup(fondoFaldaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoFaldaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(imagenFalda))
                    .addGroup(fondoFaldaLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(fondoFaldaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoFaldaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(precioFalda))
                            .addComponent(textoFalda))))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        fondoFaldaLayout.setVerticalGroup(
            fondoFaldaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoFaldaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imagenFalda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoFalda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(precioFalda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detallesFalda)
                .addGap(18, 18, 18))
        );

        fondoManzana.setBackground(new java.awt.Color(255, 255, 255));
        fondoManzana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fondoManzanaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fondoManzanaMouseExited(evt);
            }
        });

        textoManzana.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        textoManzana.setText("Manzana");

        precioManzana.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        precioManzana.setText("$54 kg");

        detallesManzana.setBackground(new java.awt.Color(230, 122, 0));
        detallesManzana.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        detallesManzana.setForeground(new java.awt.Color(255, 255, 255));
        detallesManzana.setText("Detalles");
        detallesManzana.setBorderPainted(false);
        detallesManzana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detallesManzana.setFocusPainted(false);
        detallesManzana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                detallesManzanaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                detallesManzanaMouseExited(evt);
            }
        });
        detallesManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesManzanaActionPerformed(evt);
            }
        });

        imagenManzana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito/imagenes/imagenManzana.png"))); // NOI18N

        javax.swing.GroupLayout fondoManzanaLayout = new javax.swing.GroupLayout(fondoManzana);
        fondoManzana.setLayout(fondoManzanaLayout);
        fondoManzanaLayout.setHorizontalGroup(
            fondoManzanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoManzanaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(imagenManzana)
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(fondoManzanaLayout.createSequentialGroup()
                .addGroup(fondoManzanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoManzana)
                    .addGroup(fondoManzanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fondoManzanaLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(detallesManzana))
                        .addGroup(fondoManzanaLayout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(precioManzana))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoManzanaLayout.setVerticalGroup(
            fondoManzanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoManzanaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenManzana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoManzana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioManzana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detallesManzana)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondoPollo.setBackground(new java.awt.Color(255, 255, 255));
        fondoPollo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fondoPolloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fondoPolloMouseExited(evt);
            }
        });

        textoPollo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        textoPollo.setText("Pollo");

        precioPollo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        precioPollo.setText("$110 kg");

        detallesPollo.setBackground(new java.awt.Color(230, 122, 0));
        detallesPollo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        detallesPollo.setForeground(new java.awt.Color(255, 255, 255));
        detallesPollo.setText("Detalles");
        detallesPollo.setBorderPainted(false);
        detallesPollo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detallesPollo.setFocusPainted(false);
        detallesPollo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                detallesPolloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                detallesPolloMouseExited(evt);
            }
        });
        detallesPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesPolloActionPerformed(evt);
            }
        });

        imagenPollo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito/imagenes/imagenPollo.png"))); // NOI18N

        javax.swing.GroupLayout fondoPolloLayout = new javax.swing.GroupLayout(fondoPollo);
        fondoPollo.setLayout(fondoPolloLayout);
        fondoPolloLayout.setHorizontalGroup(
            fondoPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPolloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPolloLayout.createSequentialGroup()
                        .addComponent(textoPollo)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPolloLayout.createSequentialGroup()
                        .addComponent(imagenPollo)
                        .addGap(20, 20, 20))))
            .addGroup(fondoPolloLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(fondoPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(precioPollo)
                    .addComponent(detallesPollo))
                .addGap(64, 70, Short.MAX_VALUE))
        );
        fondoPolloLayout.setVerticalGroup(
            fondoPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPolloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenPollo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoPollo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioPollo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detallesPollo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondoChocolate.setBackground(new java.awt.Color(255, 255, 255));
        fondoChocolate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fondoChocolateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fondoChocolateMouseExited(evt);
            }
        });

        precioChocolate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        precioChocolate.setText("$70 kg");

        detallesChocolate.setBackground(new java.awt.Color(230, 122, 0));
        detallesChocolate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        detallesChocolate.setForeground(new java.awt.Color(255, 255, 255));
        detallesChocolate.setText("Detalles");
        detallesChocolate.setBorderPainted(false);
        detallesChocolate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detallesChocolate.setFocusPainted(false);
        detallesChocolate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                detallesChocolateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                detallesChocolateMouseExited(evt);
            }
        });
        detallesChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesChocolateActionPerformed(evt);
            }
        });

        imagenChocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito/imagenes/imagenChocolate.png"))); // NOI18N

        textoChocolate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        textoChocolate.setText("Chocolate");

        javax.swing.GroupLayout fondoChocolateLayout = new javax.swing.GroupLayout(fondoChocolate);
        fondoChocolate.setLayout(fondoChocolateLayout);
        fondoChocolateLayout.setHorizontalGroup(
            fondoChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoChocolateLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(imagenChocolate)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoChocolateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(precioChocolate)
                        .addComponent(detallesChocolate))
                    .addComponent(textoChocolate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(64, 64, 64))
        );
        fondoChocolateLayout.setVerticalGroup(
            fondoChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoChocolateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenChocolate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoChocolate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioChocolate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detallesChocolate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FondoBlancoLayout = new javax.swing.GroupLayout(FondoBlanco);
        FondoBlanco.setLayout(FondoBlancoLayout);
        FondoBlancoLayout.setHorizontalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoRopa)
                            .addComponent(textoComida)))
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoBlancoLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(fondoPlayera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBlancoLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(fondoManzana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fondoPantalon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fondoPollo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fondoChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fondoFalda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        FondoBlancoLayout.setVerticalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoComida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fondoPantalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fondoPlayera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fondoFalda, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoRopa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fondoChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fondoPollo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fondoManzana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        FondoGeneral.add(FondoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 1070, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 958, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Cambiar el color del fondo de la playera a gris cuando en mouse entra en esta seccion
    private void fondoPlayeraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPlayeraMouseEntered
        fondoPlayera.setBackground(new Color(222,222,222));
    }//GEN-LAST:event_fondoPlayeraMouseEntered

    // Cambiar el color del fondo de la playera a blanco cuando en mouse sale en esta seccion
    private void fondoPlayeraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPlayeraMouseExited
        fondoPlayera.setBackground(Color. white);
    }//GEN-LAST:event_fondoPlayeraMouseExited

    // Cambiar el color del fondo del pantalon a gris cuando en mouse entra en esta seccion
    private void fondoPantalonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPantalonMouseEntered
        fondoPantalon.setBackground(new Color(222,222,222));
    }//GEN-LAST:event_fondoPantalonMouseEntered

    // Cambiar el color del fondo del pantalon a blanco cuando en mouse sale en esta seccion
    private void fondoPantalonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPantalonMouseExited
        fondoPantalon.setBackground(Color. white);
    }//GEN-LAST:event_fondoPantalonMouseExited

    // Cambiar el color del fondo de la falda a gris cuando en mouse entra en esta seccion
    private void fondoFaldaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoFaldaMouseEntered
        fondoFalda.setBackground(new Color(222,222,222));
    }//GEN-LAST:event_fondoFaldaMouseEntered

    // Cambiar el color del fondo de la falda a blanco cuando en mouse sale en esta seccion
    private void fondoFaldaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoFaldaMouseExited
        fondoFalda.setBackground(Color. white);
    }//GEN-LAST:event_fondoFaldaMouseExited

    // Cuando se hace clic en el boton "Detalles" de Playera se mostrara la ventana de Playera
    private void detallesPlayeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesPlayeraActionPerformed
        Camisa newframe = new Camisa();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_detallesPlayeraActionPerformed

    // Cambiar el color del fondo de la playera a gris cuando en mouse entra en la seccion del boton
    private void detallesPlayeraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesPlayeraMouseEntered
        fondoPlayera.setBackground(new Color(222,222,222));
    }//GEN-LAST:event_detallesPlayeraMouseEntered

    // Cambiar el color del fondo del pantalon a gris cuando en mouse entra en la seccion del boton
    private void detallesPantalonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesPantalonMouseEntered
        fondoPantalon.setBackground(new Color(222,222,222));
    }//GEN-LAST:event_detallesPantalonMouseEntered

    // Cuando se hace clic en el boton "Detalles" de Pantalon se mostrara la ventana de Pantalon
    private void detallesPantalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesPantalonActionPerformed
        Pantalon newframe = new Pantalon();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_detallesPantalonActionPerformed

    // Cambiar el color del fondo de la playera a blanco cuando en mouse sale de la seccion del boton
    private void detallesPlayeraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesPlayeraMouseExited
        fondoPlayera.setBackground(Color. white);
    }//GEN-LAST:event_detallesPlayeraMouseExited

    // Cambiar el color del fondo del pantalon a blanco cuando en mouse sale de la seccion del boton
    private void detallesPantalonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesPantalonMouseExited
        fondoPantalon.setBackground(Color. white);
    }//GEN-LAST:event_detallesPantalonMouseExited

    // Cambiar el color del fondo de la falda a gris cuando en mouse entra en la seccion del boton
    private void detallesFaldaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesFaldaMouseEntered
        fondoFalda.setBackground(new Color(222,222,222));
    }//GEN-LAST:event_detallesFaldaMouseEntered

    // Cambiar el color del fondo de la falda a blanco cuando en mouse sale de la seccion del boton
    private void detallesFaldaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesFaldaMouseExited
        fondoFalda.setBackground(Color. white);
    }//GEN-LAST:event_detallesFaldaMouseExited

    // Cuando se hace clic en el boton "Detalles" de Falda se mostrara la ventana de Falda
    private void detallesFaldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesFaldaActionPerformed
        Falda newframe = new Falda();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_detallesFaldaActionPerformed

    // Cambiar el color del fondo de la falda a gris cuando en mouse entra en la seccion del boton
    private void detallesManzanaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesManzanaMouseEntered
        fondoManzana.setBackground(new Color(222,222,222));
    }//GEN-LAST:event_detallesManzanaMouseEntered

    // Cambiar el color del fondo de la falda a blanco cuando en mouse entra en la seccion del boton
    private void detallesManzanaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesManzanaMouseExited
        fondoManzana.setBackground(Color. white);
    }//GEN-LAST:event_detallesManzanaMouseExited

    // Cuando se hace clic en el boton "Detalles" de Manzana se mostrara la ventana de Manzana
    private void detallesManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesManzanaActionPerformed
        Manzana newframe = new Manzana();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_detallesManzanaActionPerformed

    // Cambiar el color del fondo de la manzana a gris cuando en mouse entra en esta seccion
    private void fondoManzanaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoManzanaMouseEntered
        fondoManzana.setBackground(new Color(222,222,222));        
    }//GEN-LAST:event_fondoManzanaMouseEntered

    // Cambiar el color del fondo de la manzana a blanco cuando en mouse sale de esta seccion
    private void fondoManzanaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoManzanaMouseExited
        fondoManzana.setBackground(Color. white);        
    }//GEN-LAST:event_fondoManzanaMouseExited

    // Cambiar el color del fondo de pollo a gris cuando en mouse entra en la seccion del boton
    private void detallesPolloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesPolloMouseEntered
        fondoPollo.setBackground(new Color(222,222,222));
    }//GEN-LAST:event_detallesPolloMouseEntered

    // Cambiar el color del fondo de pollo a blanco cuando en mouse sale de la seccion del boton
    private void detallesPolloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesPolloMouseExited
        fondoPollo.setBackground(Color. white);
    }//GEN-LAST:event_detallesPolloMouseExited

    // Cuando se hace clic en el boton "Detalles" de Pollo se mostrara la ventana de Pollo
    private void detallesPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesPolloActionPerformed
        Pollo newframe = new Pollo();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_detallesPolloActionPerformed

    // Cambiar el color del fondo de pollo a gris cuando en mouse entra en esta seccion
    private void fondoPolloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPolloMouseEntered
        fondoPollo.setBackground(new Color(222,222,222));        
    }//GEN-LAST:event_fondoPolloMouseEntered

    // Cambiar el color del fondo de pollo a blanco cuando en mouse sale de esta seccion
    private void fondoPolloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPolloMouseExited
        fondoPollo.setBackground(Color. white);
    }//GEN-LAST:event_fondoPolloMouseExited

    // Cambiar el color del fondo del chocolate a gris cuando en mouse entra en la seccion del boton
    private void detallesChocolateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesChocolateMouseEntered
        fondoChocolate.setBackground(new Color(222,222,222));
    }//GEN-LAST:event_detallesChocolateMouseEntered

    // Cambiar el color del fondo del chocolate a blanco cuando en mouse sale de la seccion del boton
    private void detallesChocolateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesChocolateMouseExited
        fondoChocolate.setBackground(Color. white);
    }//GEN-LAST:event_detallesChocolateMouseExited

    // Cuando se hace clic en el boton "Detalles" de Chocolate se mostrara la ventana de Chocolate
    private void detallesChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesChocolateActionPerformed
        Chocolate newframe = new Chocolate();
        newframe.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_detallesChocolateActionPerformed

    // Cambiar el color del fondo del chocolate a gris cuando en mouse entra en esta seccion
    private void fondoChocolateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoChocolateMouseEntered
        fondoChocolate.setBackground(new Color(222,222,222));        
    }//GEN-LAST:event_fondoChocolateMouseEntered

    // Cambiar el color del fondo del chocolate a blanco cuando en mouse sale de esta seccion
    private void fondoChocolateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoChocolateMouseExited
        fondoChocolate.setBackground(Color. white);
    }//GEN-LAST:event_fondoChocolateMouseExited

    // Cuando se hace clic en la imagen del carrito se mostrara la ventana de MiCarrito
    private void imagenCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenCarritoMouseClicked
        MiCarrito newframe = new MiCarrito();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imagenCarritoMouseClicked

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
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Declaracion de la variablees de los elementos que se muestran en el JFrame Carrito
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarrasNegra;
    private javax.swing.JPanel FondoBlanco;
    private javax.swing.JPanel FondoGeneral;
    private javax.swing.JButton detallesChocolate;
    private javax.swing.JButton detallesFalda;
    private javax.swing.JButton detallesManzana;
    private javax.swing.JButton detallesPantalon;
    private javax.swing.JButton detallesPlayera;
    private javax.swing.JButton detallesPollo;
    private javax.swing.JPanel fondoChocolate;
    private javax.swing.JPanel fondoFalda;
    private javax.swing.JPanel fondoManzana;
    private javax.swing.JPanel fondoPantalon;
    private javax.swing.JPanel fondoPlayera;
    private javax.swing.JPanel fondoPollo;
    private javax.swing.JLabel imagenCarrito;
    private javax.swing.JLabel imagenChocolate;
    private javax.swing.JLabel imagenFalda;
    private javax.swing.JLabel imagenManzana;
    private javax.swing.JLabel imagenPantalon;
    private javax.swing.JLabel imagenPlayera;
    private javax.swing.JLabel imagenPollo;
    private javax.swing.JLabel precioChocolate;
    private javax.swing.JLabel precioFalda;
    private javax.swing.JLabel precioManzana;
    private javax.swing.JLabel precioPantalon;
    private javax.swing.JLabel precioPlayera;
    private javax.swing.JLabel precioPollo;
    private javax.swing.JLabel textoChocolate;
    private javax.swing.JLabel textoComida;
    private javax.swing.JLabel textoComprasOnline;
    private javax.swing.JLabel textoFalda;
    private javax.swing.JLabel textoManzana;
    private javax.swing.JLabel textoPantalon;
    private javax.swing.JLabel textoPlayera;
    private javax.swing.JLabel textoPollo;
    private javax.swing.JLabel textoRopa;
    // End of variables declaration//GEN-END:variables
}
