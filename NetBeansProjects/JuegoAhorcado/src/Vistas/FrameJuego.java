/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.ClsFrase;
import Clases.ClsJuego;
import Clases.ClsJugador;
import Controladores.CtlFrases;
import Controladores.CtlJuego;
import java.awt.Color;
import java.text.Normalizer;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author TITANQ
 */
public class FrameJuego extends javax.swing.JFrame {

    private FramePrincipal framePrincipal;
    private CtlFrases controladorFrase;
    private CtlJuego controladorJuego;
    private ClsJuego juego;

    private String rutaImagenes = "./src/images/";
    private int numeroJugadores = 1;
    private int turnoActual = 0;

    private String frase = "";
    private String enunciado = "";

    private String[] fraseVector;
    private String[] fraseOcultaVector;

    private int vidas = 6; // Lo inicializamos en 7 para poder utilizar 
    private int vidasExtras = 3;

    //  LinkedList<String> letrasUsadas = new LinkedList<>();
    LinkedList<ClsJugador> jugadores = new LinkedList<>();

    /**
     * Creates new form FrameJuego
     */
    public FrameJuego(LinkedList<ClsJugador> jugadores) {

        initComponents();

        this.getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);//application will be closed when you close frame   

        this.controladorFrase = new CtlFrases();
        this.controladorJuego = new CtlJuego();
        this.juego = new ClsJuego();
        this.prepararJuego(jugadores);
    }

    /**
     * Este método se encarga de preparar el juego
     *
     * @param numeroJugadores, el número de jugadores que va a tener la partida,
     * pueden ser 1 o dos jugadores
     */
    public void prepararJuego(LinkedList<ClsJugador> jugadores) {

        //        LinkedList<ClsJugador> jugadoresAux = jugadores;
        //         this.jugadores.removeAll(this.jugadores);
        this.turnoActual = 0;

        this.jugadores = jugadores;
        this.numeroJugadores = this.jugadores.size();

        this.cargarFrase();
        this.habilitarBotones();

        this.numeroJugadores = numeroJugadores;
        this.jLabelEnunciado.setText(this.enunciado);

        if (this.numeroJugadores == 1) {

            // En caso de que solo sea un jugador, ocultamos todos los elmentos
            // en nuestra interfaz del jugador 2
            this.jLabelTituloJugador2.setText("");
            this.jLabelNombreJugador2.setText("");
            this.jLabelTituloVidas2.setText("");
            this.jLabelVidasJugador1.setText("");
            this.jLabelVidasJugador2.setText("");
            this.jLabelTurnoActual.setText("");
            this.jLabelIconJugador2.setIcon(null);

            this.jButtonVidasExtraJugador1.setText("Usar vida extra: " + this.vidasExtras);

            this.jugadores.get(0).setVidas(this.vidas);
            this.jugadores.get(0).setVidasExtras(this.vidasExtras);

            // Modificamos el nombre del jugador
            this.jLabelNombreJugador1.setText(this.jugadores.get(0).getNombre());
            this.asignarImagen(this.jugadores.get(0).getVidas() + 1, 0);

            this.jLabelTituloTurno.setText("");
            this.jLabelVidasJugador1.setText("" + this.jugadores.get(0).getVidas());

        } else { // En caso de que sean dos jugadores

            this.jugadores.get(0).setVidas(this.vidas);
            this.jugadores.get(0).setVidasExtras(this.vidasExtras);
            this.jLabelNombreJugador1.setText(this.jugadores.get(0).getNombre());
            this.asignarImagen(this.jugadores.get(0).getVidas() + 1, 0);

            this.jugadores.get(1).setVidas(this.vidas);
            this.jugadores.get(1).setVidasExtras(this.vidasExtras);
            this.jLabelNombreJugador2.setText(this.jugadores.get(1).getNombre());
            this.asignarImagen(this.jugadores.get(1).getVidas() + 1, 1);

            this.jLabelTurnoActual.setText(this.jugadores.get(0).getNombre());
            this.jLabelVidasJugador1.setText("" + (this.jugadores.get(0).getVidas()));
            this.jLabelVidasJugador2.setText("" + (this.jugadores.get(1).getVidas()));

            this.jLabelTituloTurno.setText("El turno es de:");

        }

    }

    public boolean juegoCompleto() {

        for (String letra : this.fraseOcultaVector) {
            if (letra.equals("_")) {
                return false;
            } else {
                continue;
            }
        }       
        return true;      
    }

    public void habilitarBotones() {
        this.jButtonA.setEnabled(true);
        this.jButtonB.setEnabled(true);
        this.jButtonC.setEnabled(true);
        this.jButtonD.setEnabled(true);
        this.jButtonE.setEnabled(true);
        this.jButtonF.setEnabled(true);
        this.jButtonG.setEnabled(true);
        this.jButtonH.setEnabled(true);
        this.jButtonI.setEnabled(true);
        this.jButtonJ.setEnabled(true);
        this.jButtonK.setEnabled(true);
        this.jButtonL.setEnabled(true);
        this.jButtonM.setEnabled(true);
        this.jButtonN.setEnabled(true);
        this.jButtonN2.setEnabled(true);
        this.jButtonO.setEnabled(true);
        this.jButtonP.setEnabled(true);
        this.jButtonQ.setEnabled(true);
        this.jButtonR.setEnabled(true);
        this.jButtonS.setEnabled(true);
        this.jButtonT.setEnabled(true);
        this.jButtonU.setEnabled(true);
        this.jButtonV.setEnabled(true);
        this.jButtonW.setEnabled(true);
        this.jButtonX.setEnabled(true);
        this.jButtonY.setEnabled(true);
        this.jButtonZ.setEnabled(true);

    }

    /**
     * Permite modificar imagen del ahorcado para cada jugador cuando el jugador
     * se equivoca
     *
     * @param indiceImage
     * @param indiceJugador
     */
    public void asignarImagen(int indiceImage, int indiceJugador) {
        try {

            String rutaImagen = this.rutaImagenes + "/" + indiceImage + ".jpg";
            this.jugadores.get(indiceJugador).setImage(rutaImagen);

            ImageIcon imagen = new ImageIcon(rutaImagen);

            if (indiceJugador == 0) {
                this.jLabelIconJugador1.setIcon(imagen);
            }

            if (indiceJugador == 1) {
                this.jLabelIconJugador2.setIcon(imagen);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setFramePrincipal(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    /**
     * Este método permite comunicarce con el controladorFrase para obtener la
     * frases eligir una frase aleatoria y construir los elementos necesarios
     * para que el juego funcione
     */
    public void cargarFrase() {

        // Obtenemos la frase a través de todo la arquitectura MVC
        LinkedList<ClsFrase> listaFrases = this.controladorFrase.consultarFrases();

        // obtenemos una posición aleatoria que oscila entre 0 y la longitud
        // de la lista
        int posicionAleatoria = (int) (Math.random() * (listaFrases.size() - 1));

        // Seleccionamos de la lista de frases el texto de la frase y el 
        // enunciado correspondiente
        this.frase = listaFrases.get(posicionAleatoria).getTexto();
        this.enunciado = listaFrases.get(posicionAleatoria).getEnunciado();

        this.agregarJuegoBaseDatos(listaFrases.get(posicionAleatoria).getId());

        // Inicializamos el vector de frases y el vector de frases oculta
        this.fraseVector = new String[this.frase.length()];
        this.fraseOcultaVector = new String[this.frase.length()];

        // Recorremos la frase y agregamos cada letra a nuestros vectores
        for (int i = 0; i < this.frase.length(); i++) {

            String caracter = "" + this.frase.charAt(i); // 
            this.fraseVector[i] = caracter;

            // this.fraseOcultaVector[i] =  caracter.equals(" ") ? caracter : "_";
            if (caracter.equals(" ")) { // En caso de que el caracter sea un espacio
                this.fraseOcultaVector[i] = " ";
            } else { // En caso de que el caracter sea cualquiera colocamos el simbolo guión al piso
                this.fraseOcultaVector[i] = "_";
            }
        }

        // Actualizamos en nuestra interfaz gráfica la frase oculta
        this.jLabelFrase.setText(this.getTextoFrase(this.fraseOcultaVector));
    }

    public void agregarJuegoBaseDatos(int idFrase) {

        this.juego.setIdFrase(idFrase);
        int idJuego = this.controladorJuego.agregarFrase(this.juego);        
        this.juego.setId(idJuego);
        
        this.controladorJuego.agregarJuegoPorJuegadores(this.juego, this.jugadores);
       
    }

    /**
     * Pendiente de desarrollo
     */
    public void obtenerConfiguracion() {

    }

    /**
     * Se genera un texto de frase a partir de un vector de frases
     *
     * @param frases
     * @return
     */
    public String getTextoFrase(String[] frases) {
        String frase = "";
        for (String letra : frases) {
            frase += letra + " ";
        }
        return frase;
    }

    /**
     * Este método se encarga de realizar el proceso cuando un jugador juega
     *
     * @param posJugadorActual
     * @param letra
     * @return
     */
    public boolean jugar(int posJugadorActual, String letra) {

        LinkedList<Integer> posiciones = new LinkedList();
        String letraNomalizada = this.eliminarAcentos(letra.toLowerCase());

        for (int i = 0; i < this.fraseVector.length; i++) {
            String letraFraseNormalizada = this.eliminarAcentos(this.fraseVector[i].toLowerCase());
            if (letraFraseNormalizada.equals(letraNomalizada)) {
                posiciones.add(i);
            }
        }

        if (posiciones.size() > 0) {

            for (int pos : posiciones) {
                this.fraseOcultaVector[pos] = letra;
            }
            this.jLabelFrase.setText(this.getTextoFrase(this.fraseOcultaVector));
            return true;

        } else {
            return false;
        }
    }

    /**
     * *
     * Este método se encarga de realizar la lógica cuando el jugador no acierta
     * y elige una letra que no está en la frase
     */
    public void turnoFallido() {

        this.jugadores.get(this.turnoActual).setVidas(this.jugadores.get(this.turnoActual).getVidas() - 1);

        if (this.jugadores.get(this.turnoActual).getVidas() < 0) {

            if (!this.jugadores.get(this.turnoActual).isFinalizoJuego()) {

                this.jugadores.get(this.turnoActual).setFinalizoJuego(true);
                JOptionPane.showMessageDialog(this, "GAME OVER, has perdido " + this.jugadores.get(this.turnoActual).getNombre());
                if (this.numeroJugadores == 2) {
                    this.turnoActual = this.turnoActual == 0 ? 1 : 0;
                }

                int idPerdedor = Integer.parseInt(this.jugadores.get(this.turnoActual).getId());
                this.juego.setIdPerdedor(idPerdedor);
                this.controladorJuego.actualizarPerdedor(this.juego);
            }
            return;
        } else {
            if (this.turnoActual == 0) {
                this.jLabelVidasJugador1.setText("" + this.jugadores.get(this.turnoActual).getVidas());
            } else if (this.turnoActual == 1) {
                this.jLabelVidasJugador2.setText("" + this.jugadores.get(this.turnoActual).getVidas());
            }
        }

        this.asignarImagen(
                this.jugadores.get(this.turnoActual).getVidas() + 1,
                this.turnoActual
        );

        if (this.numeroJugadores == 2) {
            this.turnoActual = this.turnoActual == 0 ? 1 : 0;
            this.jLabelTurnoActual.setText(this.jugadores.get(this.turnoActual).getNombre());
        }
    }

    // Este método permite eliminar acentos de un texto
    public String eliminarAcentos(String s) {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIconJugador1 = new javax.swing.JLabel();
        jButtonA = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
        jButtonF = new javax.swing.JButton();
        jButtonG = new javax.swing.JButton();
        jButtonH = new javax.swing.JButton();
        jButtonI = new javax.swing.JButton();
        jButtonJ = new javax.swing.JButton();
        jButtonK = new javax.swing.JButton();
        jButtonL = new javax.swing.JButton();
        jButtonM = new javax.swing.JButton();
        jButtonN = new javax.swing.JButton();
        jButtonN2 = new javax.swing.JButton();
        jButtonO = new javax.swing.JButton();
        jButtonP = new javax.swing.JButton();
        jButtonQ = new javax.swing.JButton();
        jButtonR = new javax.swing.JButton();
        jButtonS = new javax.swing.JButton();
        jButtonT = new javax.swing.JButton();
        jButtonU = new javax.swing.JButton();
        jButtonV = new javax.swing.JButton();
        jButtonW = new javax.swing.JButton();
        jButtonX = new javax.swing.JButton();
        jButtonY = new javax.swing.JButton();
        jButtonZ = new javax.swing.JButton();
        jLabelFrase = new javax.swing.JLabel();
        jLabelIconJugador2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelTituloJugador2 = new javax.swing.JLabel();
        jLabelTituloVidas2 = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jLabelEnunciado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelNombreJugador1 = new javax.swing.JLabel();
        jLabelNombreJugador2 = new javax.swing.JLabel();
        jLabelVidasJugador1 = new javax.swing.JLabel();
        jLabelVidasJugador2 = new javax.swing.JLabel();
        jLabelTituloTurno = new javax.swing.JLabel();
        jLabelTurnoActual = new javax.swing.JLabel();
        jButtonVidasExtraJugador1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabelIconJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButtonA.setText("A");
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });

        jButtonB.setText("B");
        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });

        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonD.setText("D");
        jButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDActionPerformed(evt);
            }
        });

        jButtonE.setText("E");
        jButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEActionPerformed(evt);
            }
        });

        jButtonF.setText("F");
        jButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFActionPerformed(evt);
            }
        });

        jButtonG.setText("G");
        jButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGActionPerformed(evt);
            }
        });

        jButtonH.setText("H");
        jButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHActionPerformed(evt);
            }
        });

        jButtonI.setText("I");
        jButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIActionPerformed(evt);
            }
        });

        jButtonJ.setText("J");
        jButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJActionPerformed(evt);
            }
        });

        jButtonK.setText("K");
        jButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKActionPerformed(evt);
            }
        });

        jButtonL.setText("L");
        jButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLActionPerformed(evt);
            }
        });

        jButtonM.setText("M");
        jButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMActionPerformed(evt);
            }
        });

        jButtonN.setText("N");
        jButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNActionPerformed(evt);
            }
        });

        jButtonN2.setText("Ñ");
        jButtonN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonN2ActionPerformed(evt);
            }
        });

        jButtonO.setText("O");
        jButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOActionPerformed(evt);
            }
        });

        jButtonP.setText("P");
        jButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPActionPerformed(evt);
            }
        });

        jButtonQ.setText("Q");
        jButtonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQActionPerformed(evt);
            }
        });

        jButtonR.setText("R");
        jButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRActionPerformed(evt);
            }
        });

        jButtonS.setText("S");
        jButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSActionPerformed(evt);
            }
        });

        jButtonT.setText("T");
        jButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTActionPerformed(evt);
            }
        });

        jButtonU.setText("U");
        jButtonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUActionPerformed(evt);
            }
        });

        jButtonV.setText("V");
        jButtonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVActionPerformed(evt);
            }
        });

        jButtonW.setText("w");
        jButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWActionPerformed(evt);
            }
        });

        jButtonX.setText("X");
        jButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXActionPerformed(evt);
            }
        });

        jButtonY.setText("Y");
        jButtonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYActionPerformed(evt);
            }
        });

        jButtonZ.setText("Z");
        jButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZActionPerformed(evt);
            }
        });

        jLabelFrase.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelIconJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Vidas: ");

        jLabel3.setText("Jugador 1:");

        jLabelTituloJugador2.setText(": Jugador 2");

        jLabelTituloVidas2.setText(": Vidas");

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jLabelEnunciado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelEnunciado.setForeground(new java.awt.Color(0, 102, 255));
        jLabelEnunciado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel4.setText("Enunciado:");

        jLabelNombreJugador2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabelVidasJugador1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelVidasJugador1.setForeground(new java.awt.Color(0, 204, 51));

        jLabelVidasJugador2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelVidasJugador2.setForeground(new java.awt.Color(0, 204, 51));
        jLabelVidasJugador2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabelTituloTurno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTituloTurno.setText("El turno es de:");

        jLabelTurnoActual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTurnoActual.setForeground(new java.awt.Color(0, 102, 255));

        jButtonVidasExtraJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVidasExtraJugador1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButtonVolver)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonM)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonN)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonN2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonQ)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonR)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonS)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonU)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonV)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonW))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonY)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonZ))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonA)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonB)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonC)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonF)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonG)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonH)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonI)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonJ)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonK)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonL))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabelIconJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonVidasExtraJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelVidasJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIconJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelVidasJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelTituloJugador2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabelTituloVidas2))))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelTituloTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTurnoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButtonVolver)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTituloTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTurnoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTituloVidas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelVidasJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTituloJugador2))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVidasExtraJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabelVidasJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIconJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonA)
                    .addComponent(jButtonB)
                    .addComponent(jButtonC)
                    .addComponent(jButtonD)
                    .addComponent(jButtonE)
                    .addComponent(jButtonF)
                    .addComponent(jButtonG)
                    .addComponent(jButtonH)
                    .addComponent(jButtonI)
                    .addComponent(jButtonJ)
                    .addComponent(jButtonK)
                    .addComponent(jButtonL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonM)
                    .addComponent(jButtonN)
                    .addComponent(jButtonN2)
                    .addComponent(jButtonO)
                    .addComponent(jButtonP)
                    .addComponent(jButtonQ)
                    .addComponent(jButtonR)
                    .addComponent(jButtonS)
                    .addComponent(jButtonT)
                    .addComponent(jButtonU)
                    .addComponent(jButtonV)
                    .addComponent(jButtonW))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonX)
                    .addComponent(jButtonY)
                    .addComponent(jButtonZ))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {

        if (this.jugar(this.turnoActual, "A")) {
            // En caso de que al jugar se acierte se inhabilita el botón
            this.jButtonA.setEnabled(false);
        } else {
            this.turnoFallido();
        }

    }

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.jugar(this.turnoActual, "B")) {
            this.jButtonB.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.jugar(this.turnoActual, "C")) {
            this.jButtonC.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }

    private void jButtonDActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.jugar(this.turnoActual, "D")) {
            this.jButtonD.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }

    private void jButtonEActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.jugar(this.turnoActual, "E")) {
            this.jButtonE.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        this.framePrincipal.setVisible(true);
    }

    private void jButtonVidasExtraJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVidasExtraJugador1ActionPerformed                                                        

        if (this.jugadores.get(0).getVidas() < 6) {
            if (this.jugadores.get(0).getVidasExtras() > 0) {
                this.jugadores.get(0).setVidas(this.jugadores.get(0).getVidas() + 1);
                this.jugadores.get(0).setVidasExtras(this.jugadores.get(0).getVidasExtras() - 1);

                this.asignarImagen(this.jugadores.get(0).getVidas() + 1, 0);
                this.jLabelVidasJugador1.setText("" + (this.jugadores.get(0).getVidas()));
                this.jButtonVidasExtraJugador1.setText("Usar vida extra: " + this.jugadores.get(0).getVidasExtras());

            }
        } else {
            JOptionPane.showMessageDialog(this, "No has perdido vidas");
        }
    }//GEN-LAST:event_jButtonVidasExtraJugador1ActionPerformed                                                        

    private void jButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "F")) {
            this.jButtonF.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonFActionPerformed

    private void jButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "K")) {
            this.jButtonK.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonKActionPerformed

    private void jButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "G")) {
            this.jButtonG.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonGActionPerformed

    private void jButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "H")) {
            this.jButtonH.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonHActionPerformed

    private void jButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "I")) {
            this.jButtonI.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonIActionPerformed

    private void jButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "J")) {
            this.jButtonJ.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonJActionPerformed

    private void jButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "L")) {
            this.jButtonL.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonLActionPerformed

    private void jButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "M")) {
            this.jButtonM.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonMActionPerformed

    private void jButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "N")) {
            this.jButtonN.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonNActionPerformed

    private void jButtonN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonN2ActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "Ñ")) {
            this.jButtonN2.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonN2ActionPerformed

    private void jButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "O")) {
            this.jButtonO.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonOActionPerformed

    private void jButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "P")) {
            this.jButtonP.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonPActionPerformed

    private void jButtonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "Q")) {
            this.jButtonQ.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonQActionPerformed

    private void jButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "R")) {
            this.jButtonR.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonRActionPerformed

    private void jButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "S")) {
            this.jButtonS.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonSActionPerformed

    private void jButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "T")) {
            this.jButtonT.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonTActionPerformed

    private void jButtonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "U")) {
            this.jButtonU.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonUActionPerformed

    private void jButtonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "V")) {
            this.jButtonV.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonVActionPerformed

    private void jButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "W")) {
            this.jButtonW.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonWActionPerformed

    private void jButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "X")) {
            this.jButtonX.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonXActionPerformed

    private void jButtonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "Y")) {
            this.jButtonY.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonYActionPerformed

    private void jButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZActionPerformed
        // TODO add your handling code here:
        if (this.jugar(this.turnoActual, "Z")) {
            this.jButtonZ.setEnabled(false);
        } else {
            this.turnoFallido();
        }
    }//GEN-LAST:event_jButtonZActionPerformed

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
            java.util.logging.Logger.getLogger(FrameJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameJuego(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonF;
    private javax.swing.JButton jButtonG;
    private javax.swing.JButton jButtonH;
    private javax.swing.JButton jButtonI;
    private javax.swing.JButton jButtonJ;
    private javax.swing.JButton jButtonK;
    private javax.swing.JButton jButtonL;
    private javax.swing.JButton jButtonM;
    private javax.swing.JButton jButtonN;
    private javax.swing.JButton jButtonN2;
    private javax.swing.JButton jButtonO;
    private javax.swing.JButton jButtonP;
    private javax.swing.JButton jButtonQ;
    private javax.swing.JButton jButtonR;
    private javax.swing.JButton jButtonS;
    private javax.swing.JButton jButtonT;
    private javax.swing.JButton jButtonU;
    private javax.swing.JButton jButtonV;
    private javax.swing.JButton jButtonVidasExtraJugador1;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JButton jButtonW;
    private javax.swing.JButton jButtonX;
    private javax.swing.JButton jButtonY;
    private javax.swing.JButton jButtonZ;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelEnunciado;
    private javax.swing.JLabel jLabelFrase;
    private javax.swing.JLabel jLabelIconJugador1;
    private javax.swing.JLabel jLabelIconJugador2;
    private javax.swing.JLabel jLabelNombreJugador1;
    private javax.swing.JLabel jLabelNombreJugador2;
    private javax.swing.JLabel jLabelTituloJugador2;
    private javax.swing.JLabel jLabelTituloTurno;
    private javax.swing.JLabel jLabelTituloVidas2;
    private javax.swing.JLabel jLabelTurnoActual;
    private javax.swing.JLabel jLabelVidasJugador1;
    private javax.swing.JLabel jLabelVidasJugador2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
