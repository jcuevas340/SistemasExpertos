import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class adivinaQuien extends JFrame implements ActionListener {
    //Elementos para bienvenida
    private JPanel panel_bienvenida;
    private JLabel label_bienvenida, label_imagen_bienvenida;
    private JButton button_bienvenida;
    private ImageIcon imagen;

    //Elementos panel personajes
    private JPanel panel_personajes;
    private JLabel label_karime, label_karime_imagen, label_mich, label_mich_imagen, label_kono, label_kono_imagen, label_nicky, label_nicky_imagen, label_poblanita, label_poblanita_imagen;
    private JLabel label_cuevas, label_cuevas_imagen, label_bryan, label_bryan_imagen, label_monche, label_monche_imagen, label_porter, label_porter_imagen, label_pablo, label_pablo_imagen;
    public ImageIcon i_konoBN, i_cuevasBN, i_karimeBN, i_moncheBN, i_poblanitaBN, i_pabloBN, i_bryanBN, i_nickyBN, i_porterBN, i_mich;
    public Icon icon_konoBN, icon_cuevasBN, icon_karimeBN, icon_moncheBN, icon_poblanitaBN, icon_pabloBN, icon_bryanBN, icon_nickyBN, icon_porterBN, icon_mich;

    //Elementos genio
    private JLabel label_genio ,label_genio_imagen;
    private JButton button_genio_siguiente, button_indicacion1, button_indicacion2, button_indicacion3, buttonVolverAJugar;

    //Elementos preguntas
    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton radio_hombre, radio_lentes, radio_no_lentes, radio_bigote, radio_no_bigote, radio_gorra, radio_no_gorra, radio_ojos_verdes, radio_ojos_cafes;
    JRadioButton radio_mujer, radio_lentes_m, radio_no_lentes_m, radio_pelirroja, radio_no_pelirroja, radio_rubia, radio_china, radio_no_china, radio_pelinegro;

    public Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    public Rectangle rectangle = new Rectangle(screensize);

    public adivinaQuien(){
        //----- Frame -----
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Adivina Quien");
        setSize(1550, 838);
        setLocationRelativeTo(null);
        //setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("AdivinaQuienLogo.png"))).getImage());
        Font fuente = new Font("Impact", Font.BOLD, 40);
        Font fuentePreguntas = new Font("Arial", Font.PLAIN, 18);

        //----- Bienvenida -----
        panel_bienvenida = new JPanel();
        panel_bienvenida.setLayout(null);
        panel_bienvenida.setBounds(rectangle);
        panel_bienvenida.setBackground(Color.RED);
        panel_bienvenida.setVisible(true);
        add(panel_bienvenida);

        label_bienvenida = new JLabel("Bienvenido al juego de Adivina Quien");
        label_bienvenida.setBounds(400, 250, 800, 40);
        label_bienvenida.setFont(fuente);
        label_bienvenida.setForeground(Color.white);
        panel_bienvenida.add(label_bienvenida);

        imagen = new ImageIcon("AdivinaQuienLogo.png");
        label_imagen_bienvenida = new JLabel(imagen);
        label_imagen_bienvenida.setBounds(700, 100, 150, 150);
        Icon icon_bienvenida = new ImageIcon(imagen.getImage().getScaledInstance(label_imagen_bienvenida.getWidth(), label_imagen_bienvenida.getHeight(), Image.SCALE_SMOOTH));
        label_imagen_bienvenida.setIcon(icon_bienvenida);
        label_imagen_bienvenida.setVisible(true);
        panel_bienvenida.add(label_imagen_bienvenida);

        button_bienvenida = new JButton("Jugar");
        button_bienvenida.setBounds(700, 450, 100, 50);
        button_bienvenida.setVisible(true);
        button_bienvenida.addActionListener(this);
        panel_bienvenida.add(button_bienvenida);

        //----- Personajes -----
        panel_personajes = new JPanel();
        panel_personajes.setBounds(rectangle);
        panel_personajes.setLayout(null);
        panel_personajes.setBackground(Color.blue);
        panel_personajes.setVisible(false);
        add(panel_personajes);

        ImageIcon i_cuevasBN = new ImageIcon("cuevasBN.png");
        ImageIcon i_cuevas = new ImageIcon("cuevas.png");
        label_cuevas_imagen = new JLabel(i_cuevas);
        label_cuevas_imagen.setBounds(350, 420, 150, 150);
        Icon icon_cuevasBN = new ImageIcon(i_cuevas.getImage().getScaledInstance(label_cuevas_imagen.getWidth(), label_cuevas_imagen.getHeight(), Image.SCALE_SMOOTH));
        Icon icon_cuevas = new ImageIcon(i_cuevas.getImage().getScaledInstance(label_cuevas_imagen.getWidth(), label_cuevas_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_cuevas_imagen.setIcon(icon_cuevas);
        panel_personajes.add(label_cuevas_imagen);
        label_cuevas = new JLabel("Cuevas");
        label_cuevas.setBounds(395, 580, 100, 20);
        label_cuevas.setForeground(Color.white);
        panel_personajes.add(label_cuevas);
        label_cuevas_imagen.setVisible(false);
        label_cuevas.setVisible(false);

        ImageIcon i_karimeBN = new ImageIcon("karimeBN.png");
        ImageIcon i_karime = new ImageIcon("karime.png");
        label_karime_imagen = new JLabel(i_karime);
        label_karime_imagen.setBounds(520, 420, 150, 150);
        Icon icon_karimeBN = new ImageIcon(i_karime.getImage().getScaledInstance(label_karime_imagen.getWidth(), label_karime_imagen.getHeight(), Image.SCALE_SMOOTH));
        Icon icon_karime = new ImageIcon(i_karime.getImage().getScaledInstance(label_karime_imagen.getWidth(), label_karime_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_karime_imagen.setIcon(icon_karime);
        panel_personajes.add(label_karime_imagen);
        label_karime = new JLabel("Karime");
        label_karime.setBounds(565, 580, 100, 20);
        label_karime.setForeground(Color.white);
        panel_personajes.add(label_karime);
        label_karime_imagen.setVisible(false);
        label_karime.setVisible(false);

        ImageIcon i_monche = new ImageIcon("monche.png");
        label_monche_imagen = new JLabel(i_monche);
        label_monche_imagen.setBounds(690, 420, 150, 150);
        Icon icon_monche = new ImageIcon(i_monche.getImage().getScaledInstance(label_monche_imagen.getWidth(), label_monche_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_monche_imagen.setIcon(icon_monche);
        panel_personajes.add(label_monche_imagen);
        label_monche = new JLabel("Monche");
        label_monche.setBounds(735, 580, 100, 20);
        label_monche.setForeground(Color.white);
        panel_personajes.add(label_monche);
        label_monche.setVisible(false);
        label_monche_imagen.setVisible(false);

        ImageIcon i_poblanita = new ImageIcon("poblanita.png");
        label_poblanita_imagen = new JLabel(i_poblanita);
        label_poblanita_imagen.setBounds(860, 420, 150, 150);
        Icon icon_poblanita = new ImageIcon(i_poblanita.getImage().getScaledInstance(label_poblanita_imagen.getWidth(), label_poblanita_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_poblanita_imagen.setIcon(icon_poblanita);
        panel_personajes.add(label_poblanita_imagen);
        label_poblanita = new JLabel("Poblanita");
        label_poblanita.setBounds(905, 580, 100, 20);
        label_poblanita.setForeground(Color.white);
        panel_personajes.add(label_poblanita);
        label_poblanita.setVisible(false);
        label_poblanita_imagen.setVisible(false);

        ImageIcon i_bryan = new ImageIcon("bryan.png");
        label_bryan_imagen = new JLabel(i_bryan);
        label_bryan_imagen.setBounds(1030, 420, 150, 150);
        Icon icon_bryan = new ImageIcon(i_bryan.getImage().getScaledInstance(label_bryan_imagen.getWidth(), label_bryan_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_bryan_imagen.setIcon(icon_bryan);
        panel_personajes.add(label_bryan_imagen);
        label_bryan = new JLabel("Bryan");
        label_bryan.setBounds(1085, 580, 100, 20);
        label_bryan.setForeground(Color.white);
        panel_personajes.add(label_bryan);
        label_bryan.setVisible(false);
        label_bryan_imagen.setVisible(false);

        ImageIcon i_konoBN = new ImageIcon("konoBN.png");
        ImageIcon i_kono = new ImageIcon("kono.png");
        label_kono_imagen = new JLabel(i_kono);
        label_kono_imagen.setBounds(350, 600, 150, 150);
        Icon icon_konoBN = new ImageIcon(i_konoBN.getImage().getScaledInstance(label_kono_imagen.getWidth(), label_kono_imagen.getHeight(), Image.SCALE_SMOOTH));
        Icon icon_kono = new ImageIcon(i_kono.getImage().getScaledInstance(label_kono_imagen.getWidth(), label_kono_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_kono_imagen.setIcon(icon_kono);
        panel_personajes.add(label_kono_imagen);
        label_kono = new JLabel("Kono");
        label_kono.setBounds(405, 760, 100, 20);
        label_kono.setForeground(Color.white);
        panel_personajes.add(label_kono);
        label_kono.setVisible(false);
        label_kono_imagen.setVisible(false);

        ImageIcon i_porter = new ImageIcon("porter.png");
        label_porter_imagen = new JLabel(i_porter);
        label_porter_imagen.setBounds(520, 600, 150, 150);
        Icon icon_porter = new ImageIcon(i_porter.getImage().getScaledInstance(label_porter_imagen.getWidth(), label_porter_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_porter_imagen.setIcon(icon_porter);
        panel_personajes.add(label_porter_imagen);
        label_porter = new JLabel("Porter");
        label_porter.setBounds(575, 760, 100, 20);
        label_porter.setForeground(Color.white);
        panel_personajes.add(label_porter);
        label_porter.setVisible(false);
        label_porter_imagen.setVisible(false);

        ImageIcon i_nicky = new ImageIcon("nicky.png");
        label_nicky_imagen = new JLabel(i_nicky);
        label_nicky_imagen.setBounds(690, 600, 150, 150);
        Icon icon_nicky = new ImageIcon(i_nicky.getImage().getScaledInstance(label_nicky_imagen.getWidth(), label_nicky_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_nicky_imagen.setIcon(icon_nicky);
        panel_personajes.add(label_nicky_imagen);
        label_nicky = new JLabel("Nicky");
        label_nicky.setBounds(745, 760, 100, 20);
        label_nicky.setForeground(Color.white);
        panel_personajes.add(label_nicky);
        label_nicky.setVisible(false);
        label_nicky_imagen.setVisible(false);

        ImageIcon i_pablo = new ImageIcon("pablo.png");
        label_pablo_imagen = new JLabel(i_pablo);
        label_pablo_imagen.setBounds(860, 600, 150, 150);
        Icon icon_pablo = new ImageIcon(i_pablo.getImage().getScaledInstance(label_pablo_imagen.getWidth(), label_pablo_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_pablo_imagen.setIcon(icon_pablo);
        panel_personajes.add(label_pablo_imagen);
        label_pablo = new JLabel("Pablo");
        label_pablo.setBounds(915, 760, 100, 20);
        label_pablo.setForeground(Color.white);
        panel_personajes.add(label_pablo);
        label_pablo.setVisible(false);
        label_pablo_imagen.setVisible(false);

        ImageIcon i_mich = new ImageIcon("mich.png");
        label_mich_imagen = new JLabel(i_mich);
        label_mich_imagen.setBounds(1030, 600, 150, 150);
        Icon icon_mich = new ImageIcon(i_mich.getImage().getScaledInstance(label_mich_imagen.getWidth(), label_mich_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_mich_imagen.setIcon(icon_mich);
        panel_personajes.add(label_mich_imagen);
        label_mich = new JLabel("Mich");
        label_mich.setBounds(1095, 760, 100, 20);
        label_mich.setForeground(Color.white);
        panel_personajes.add(label_mich);
        label_mich.setVisible(false);
        label_mich_imagen.setVisible(false);

        //----- Genio -----
        ImageIcon i_genio = new ImageIcon("genioSeguro.png");
        label_genio_imagen = new JLabel(i_genio);
        label_genio_imagen.setBounds(100, 50, 300, 300);
        Icon icon_genio = new ImageIcon(i_genio.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio);
        panel_personajes.add(label_genio_imagen);
        label_genio = new JLabel("Hola, soy el genio del juego.");
        label_genio.setBounds(400, 50, 700, 100);
        label_genio.setForeground(Color.white);
        label_genio.setFont(fuentePreguntas);
        panel_personajes.add(label_genio);

        button_genio_siguiente = new JButton("Siguiente");
        button_genio_siguiente.setBounds(1250, 50, 90, 30);
        panel_personajes.add(button_genio_siguiente);
        button_genio_siguiente.addActionListener(this);

        button_indicacion1 = new JButton("Siguiente");
        button_indicacion1.setBounds(1250, 50, 90, 30);
        panel_personajes.add(button_indicacion1);
        button_indicacion1.addActionListener(this);

        button_indicacion2 = new JButton("Siguiente");
        button_indicacion2.setBounds(1250, 50, 90, 30);
        panel_personajes.add(button_indicacion2);
        button_indicacion2.addActionListener(this);

        button_indicacion3 = new JButton("Siguiente");
        button_indicacion3.setBounds(1250, 50, 90, 30);
        panel_personajes.add(button_indicacion3);
        button_indicacion3.addActionListener(this);

        buttonVolverAJugar = new JButton("Volver a jugar!");
        buttonVolverAJugar.setBounds(900, 350, 250, 70);
        buttonVolverAJugar.setFont(new Font("Arial", Font.BOLD, 30));
        panel_personajes.add(buttonVolverAJugar);
        buttonVolverAJugar.setForeground(Color.RED);
        buttonVolverAJugar.setVisible(false);
        buttonVolverAJugar.addActionListener(this);

        //----- Preguntas -----
        radio_hombre = new JRadioButton("Es hombre.");
        radio_hombre.setBounds(400, 150, 300, 30);
        radio_hombre.setBackground(Color.blue);
        radio_hombre.setForeground(Color.white);
        radio_hombre.setVisible(false);
        panel_personajes.add(radio_hombre);
        radio_hombre.setFont(fuentePreguntas);
        radio_hombre.addActionListener(this);

        radio_mujer = new JRadioButton("Es mujer.");
        radio_mujer.setBounds(400, 200, 300, 30);
        radio_mujer.setBackground(Color.blue);
        radio_mujer.setForeground(Color.white);
        radio_mujer.setFont(fuentePreguntas);
        radio_mujer.setVisible(false);
        panel_personajes.add(radio_mujer);
        radio_mujer.addActionListener(this);

        radio_lentes = new JRadioButton("Si, usa lentes.");
        radio_lentes.setBounds(400, 150, 300, 30);
        radio_lentes.setBackground(Color.blue);
        radio_lentes.setForeground(Color.white);
        radio_lentes.setFont(fuentePreguntas);
        radio_lentes.setVisible(false);
        panel_personajes.add(radio_lentes);
        radio_lentes.addActionListener(this);

        radio_no_lentes = new JRadioButton("No, no usa lentes.");
        radio_no_lentes.setBounds(400, 200, 300, 30);
        radio_no_lentes.setBackground(Color.blue);
        radio_no_lentes.setForeground(Color.white);
        radio_no_lentes.setFont(fuentePreguntas);
        radio_no_lentes.setVisible(false);
        panel_personajes.add(radio_no_lentes);
        radio_no_lentes.addActionListener(this);

        radio_bigote = new JRadioButton("Si, si tiene bigote.");
        radio_bigote.setBounds(400, 150, 300, 30);
        radio_bigote.setBackground(Color.blue);
        radio_bigote.setForeground(Color.white);
        radio_bigote.setFont(fuentePreguntas);
        radio_bigote.setVisible(false);
        panel_personajes.add(radio_bigote);
        radio_bigote.addActionListener(this);

        radio_no_bigote = new JRadioButton("No, no tengo bigote.");
        radio_no_bigote.setBounds(400, 200, 300, 30);
        radio_no_bigote.setBackground(Color.blue);
        radio_no_bigote.setForeground(Color.white);
        radio_no_bigote.setFont(fuentePreguntas);
        radio_no_bigote.setVisible(false);
        panel_personajes.add(radio_no_bigote);
        radio_no_bigote.addActionListener(this);

        radio_ojos_cafes = new JRadioButton("Si, si tiene ojos cafes.");
        radio_ojos_cafes.setBounds(400, 150, 300, 30);
        radio_ojos_cafes.setBackground(Color.blue);
        radio_ojos_cafes.setForeground(Color.white);
        radio_ojos_cafes.setFont(fuentePreguntas);
        radio_ojos_cafes.setVisible(false);
        panel_personajes.add(radio_ojos_cafes);
        radio_ojos_cafes.addActionListener(this);

        radio_ojos_verdes = new JRadioButton("No, tiene ojos verdes.");
        radio_ojos_verdes.setBounds(400, 200, 300, 30);
        radio_ojos_verdes.setBackground(Color.blue);
        radio_ojos_verdes.setForeground(Color.white);
        radio_ojos_verdes.setFont(fuentePreguntas);
        radio_ojos_verdes.setVisible(false);
        panel_personajes.add(radio_ojos_verdes);
        radio_ojos_verdes.addActionListener(this);

        radio_lentes_m = new JRadioButton("Si, usa lentes.");
        radio_lentes_m.setBounds(400, 150, 300, 30);
        radio_lentes_m.setBackground(Color.blue);
        radio_lentes_m.setForeground(Color.white);
        radio_lentes_m.setFont(fuentePreguntas);
        radio_lentes_m.setVisible(false);
        panel_personajes.add(radio_lentes_m);
        radio_lentes_m.addActionListener(this);

        radio_no_lentes_m = new JRadioButton("No, no usa lentes.");
        radio_no_lentes_m.setBounds(400, 200, 300, 30);
        radio_no_lentes_m.setBackground(Color.blue);
        radio_no_lentes_m.setForeground(Color.white);
        radio_no_lentes_m.setFont(fuentePreguntas);
        radio_no_lentes_m.setVisible(false);
        panel_personajes.add(radio_no_lentes_m);
        radio_no_lentes_m.addActionListener(this);

        radio_china = new JRadioButton("Si, es china.");
        radio_china.setBounds(400, 150, 300, 30);
        radio_china.setBackground(Color.blue);
        radio_china.setForeground(Color.white);
        radio_china.setFont(fuentePreguntas);
        radio_china.setVisible(false);
        panel_personajes.add(radio_china);
        radio_china.addActionListener(this);

        radio_no_china = new JRadioButton("No, es lacia.");
        radio_no_china.setBounds(400, 200, 300, 30);
        radio_no_china.setBackground(Color.blue);
        radio_no_china.setForeground(Color.white);
        radio_no_china.setFont(fuentePreguntas);
        radio_no_china.setVisible(false);
        panel_personajes.add(radio_no_china);
        radio_no_china.addActionListener(this);

        radio_pelirroja = new JRadioButton("Si, es pelirroja.");
        radio_pelirroja.setBounds(400, 150, 300, 30);
        radio_pelirroja.setBackground(Color.blue);
        radio_pelirroja.setForeground(Color.white);
        radio_pelirroja.setFont(fuentePreguntas);
        radio_pelirroja.setVisible(false);
        panel_personajes.add(radio_pelirroja);
        radio_pelirroja.addActionListener(this);

        radio_no_pelirroja = new JRadioButton("No, no es pelirroja.");
        radio_no_pelirroja.setBounds(400, 200, 300, 30);
        radio_no_pelirroja.setBackground(Color.blue);
        radio_no_pelirroja.setForeground(Color.white);
        radio_no_pelirroja.setFont(fuentePreguntas);
        radio_no_pelirroja.setVisible(false);
        panel_personajes.add(radio_no_pelirroja);
        radio_no_pelirroja.addActionListener(this);

        radio_rubia = new JRadioButton("Si, es rubia.");
        radio_rubia.setBounds(400, 150, 300, 30);
        radio_rubia.setBackground(Color.blue);
        radio_rubia.setForeground(Color.white);
        radio_rubia.setFont(fuentePreguntas);
        radio_rubia.setVisible(false);
        panel_personajes.add(radio_rubia);
        radio_rubia.addActionListener(this);

        radio_pelinegro = new JRadioButton("No, tiene el cabello negro.");
        radio_pelinegro.setBounds(400, 200, 300, 30);
        radio_pelinegro.setBackground(Color.blue);
        radio_pelinegro.setForeground(Color.white);
        radio_pelinegro.setFont(fuentePreguntas);
        radio_pelinegro.setVisible(false);
        panel_personajes.add(radio_pelinegro);
        radio_pelinegro.addActionListener(this);

        radio_gorra = new JRadioButton("Si, es tiene gorra.");
        radio_gorra.setBounds(400, 150, 300, 30);
        radio_gorra.setBackground(Color.blue);
        radio_gorra.setForeground(Color.white);
        radio_gorra.setFont(fuentePreguntas);
        radio_gorra.setVisible(false);
        panel_personajes.add(radio_gorra);
        radio_gorra.addActionListener(this);

        radio_no_gorra = new JRadioButton("No, no tiene gorra.");
        radio_no_gorra.setBounds(400, 200, 300, 30);
        radio_no_gorra.setBackground(Color.blue);
        radio_no_gorra.setForeground(Color.white);
        radio_no_gorra.setFont(fuentePreguntas);
        radio_no_gorra.setVisible(false);
        panel_personajes.add(radio_no_gorra);
        radio_no_gorra.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button_bienvenida){
            panel_personajes.setVisible(true);
            panel_bienvenida.setVisible(false);
        }
        if (e.getSource() == button_genio_siguiente) {
            label_genio.setText("<HTML>Te voy a mostrar una serie de personajes, de los cuales te voy a hacer una serie de preguntas para adivinar tu personaje.</HTML>");
            button_genio_siguiente.setVisible(false);
            button_indicacion1.setVisible(true);
        }
        if (e.getSource() == button_indicacion1) {
            label_genio.setText("Estos son los personajes:");
            button_indicacion1.setVisible(false);
            button_indicacion2.setVisible(true);
            label_cuevas.setVisible(true);
            label_cuevas_imagen.setVisible(true);
            label_karime_imagen.setVisible(true);
            label_karime.setVisible(true);
            label_monche.setVisible(true);
            label_monche_imagen.setVisible(true);
            label_poblanita.setVisible(true);
            label_poblanita_imagen.setVisible(true);
            label_bryan.setVisible(true);
            label_bryan_imagen.setVisible(true);
            label_kono.setVisible(true);
            label_kono_imagen.setVisible(true);
            label_porter.setVisible(true);
            label_porter_imagen.setVisible(true);
            label_nicky.setVisible(true);
            label_nicky_imagen.setVisible(true);
            label_pablo.setVisible(true);
            label_pablo_imagen.setVisible(true);
            label_mich.setVisible(true);
            label_mich_imagen.setVisible(true);
        }
        if(e.getSource() == button_indicacion2){
            label_genio.setText("Bien, comencemos.");
            button_indicacion2.setVisible(false);
            button_indicacion3.setVisible(true);
        }
        if(e.getSource() == button_indicacion3){
            label_genio.setText("<HTML>Tu personaje es <b>HOMBRE o MUJER</b>?</HTML>");
            button_indicacion3.setVisible(false);
            radio_hombre.setVisible(true);
            radio_mujer.setVisible(true);
            cambia_icon_genio_dudoso();
        }
        if(e.getSource() == radio_hombre){
            label_genio.setText("<HTML>Tu personaje usa <b>LENTES</b>?</HTML>");
            radio_hombre.setVisible(false);
            radio_mujer.setVisible(false);
            cambia_icon_karime_BN();
            cambia_icon_poblanita_BN();
            cambia_icon_mich_BN();
            cambia_icon_nicky_BN();
            cambia_icon_kono_BN();
            radio_lentes.setVisible(true);
            radio_no_lentes.setVisible(true);
            cambia_icon_genio_cubriendoCara();
        }
        if(e.getSource() == radio_lentes){
            label_genio.setText("<HTML>Tu personaje tiene <b>BIGOTE</b>?</HTML>");
            radio_lentes.setVisible(false);
            radio_no_lentes.setVisible(false);
            cambia_icon_pablo_BN();
            cambia_icon_bryan_BN();
            radio_no_bigote.setVisible(true);
            radio_bigote.setVisible(true);
            cambia_icon_genio_maldiciendo();
        }
        if(e.getSource() == radio_bigote){
            label_genio.setText("<HTML>Tu personaje es <b>Cuevas!</b></HTML>");
            radio_bigote.setVisible(false);
            radio_no_bigote.setVisible(false);
            cambia_icon_porter_BN();
            cambia_icon_monche_BN();
            cambia_icon_genio_emocionado();
            buttonVolverAJugar.setVisible(true);
        }
        if(e.getSource() == radio_no_lentes){
            label_genio.setText("<HTML>Tu personaje tiene <b>OJOS CAFES</b>?</HTML>");
            radio_lentes.setVisible(false);
            radio_no_lentes.setVisible(false);
            radio_ojos_cafes.setVisible(true);
            radio_ojos_verdes.setVisible(true);
            cambia_icon_cuevas_BN();
            cambia_icon_monche_BN();
            cambia_icon_porter_BN();
            cambia_icon_genio_bolas();
        }
        if(e.getSource() == radio_ojos_cafes){
            label_genio.setText("<HTML>Tu personaje es <b>Bryan!</b></HTML>");
            radio_ojos_verdes.setVisible(false);
            radio_ojos_cafes.setVisible(false);
            cambia_icon_pablo_BN();
            cambia_icon_genio_sonriente();
            buttonVolverAJugar.setVisible(true);
        }
        if (e.getSource() == radio_ojos_verdes) {
            label_genio.setText("<HTML>Tu personaje es <b>Pablo!</b></HTML>");
            radio_ojos_verdes.setVisible(false);
            radio_ojos_cafes.setVisible(false);
            cambia_icon_bryan_BN();
            cambia_icon_genio_orden();
            buttonVolverAJugar.setVisible(true);
        }
        if(e.getSource() == radio_mujer){
            label_genio.setText("<HTML>Tu personaje usa </b>LENTES</b>?</HTML>");
            radio_hombre.setVisible(false);
            radio_mujer.setVisible(false);
            radio_lentes_m.setVisible(true);
            radio_no_lentes_m.setVisible(true);
            cambia_icon_pablo_BN();
            cambia_icon_cuevas_BN();
            cambia_icon_monche_BN();
            cambia_icon_bryan_BN();
            cambia_icon_porter_BN();
            cambia_icon_genio_cubriendoCara();
        }
        if(e.getSource() == radio_lentes_m){
            label_genio.setText("<HTML>Tu personaje tiene <b>CABELLO CHINO</b>?</HTML>");
            radio_lentes_m.setVisible(false);
            radio_no_lentes_m.setVisible(false);
            radio_china.setVisible(true);
            radio_no_china.setVisible(true);
            cambia_icon_kono_BN();
            cambia_icon_nicky_BN();
            cambia_icon_mich_BN();
            cambia_icon_genio_YaNoPuede();
        }
        if(e.getSource() == radio_china){
            label_genio.setText("<HTML>Tu personaje es <b>Karime!</b></HTML>");
            cambia_icon_poblanita_BN();
            radio_china.setVisible(false);
            radio_no_china.setVisible(false);
            cambia_icon_genio_like();
            buttonVolverAJugar.setVisible(true);
        }
        if(e.getSource() == radio_no_china){
            label_genio.setText("<HTML>Tu personaje es <b>Poblanita!</b></HTML>");
            cambia_icon_karime_BN();
            radio_china.setVisible(false);
            radio_no_china.setVisible(false);
            cambia_icon_genio_seguro();
            buttonVolverAJugar.setVisible(true);
        }
        if(e.getSource() == radio_no_lentes_m){
            label_genio.setText("<HTML>Tu personaje es <b>PELIRROJA</b>?</HTML>");
            radio_lentes_m.setVisible(false);
            radio_no_lentes_m.setVisible(false);
            radio_pelirroja.setVisible(true);
            radio_no_pelirroja.setVisible(true);
            cambia_icon_karime_BN();
            cambia_icon_poblanita_BN();
            cambia_icon_genio_sorprendido();
        }
        if(e.getSource() == radio_pelirroja){
            label_genio.setText("<HTML>Tu personaje es <b>Nicky!</b></HTML>");
            radio_no_pelirroja.setVisible(false);
            radio_pelirroja.setVisible(false);
            cambia_icon_mich_BN();
            cambia_icon_kono_BN();
            cambia_icon_genio_emocionado();
            buttonVolverAJugar.setVisible(true);
        }
        if(e.getSource() == radio_no_pelirroja){
            label_genio.setText("<HTML>Tu personaje es <b>RUBIA</b>?</HTML>");
            cambia_icon_nicky_BN();
            radio_pelirroja.setVisible(false);
            radio_no_pelirroja.setVisible(false);
            radio_rubia.setVisible(true);
            radio_pelinegro.setVisible(true);
            cambia_icon_genio_senanlando();
        }
        if(e.getSource() == radio_rubia){
            label_genio.setText("<HTML>Tu personaje es <b>Mich!</b></HTML>");
            cambia_icon_kono_BN();
            radio_rubia.setVisible(false);
            radio_pelinegro.setVisible(false);
            cambia_icon_genio_like();
            buttonVolverAJugar.setVisible(true);
        }
        if(e.getSource() == radio_pelinegro){
            label_genio.setText("<HTML>Tu personaje es <b>Kono!</b></HTML>");
            cambia_icon_mich_BN();
            radio_pelinegro.setVisible(false);
            radio_rubia.setVisible(false);
            cambia_icon_genio_sonriente();
            buttonVolverAJugar.setVisible(true);
        }
        if(e.getSource() == radio_no_bigote){
            label_genio.setText("<HTML>Tu personaje tiene <b>GORRA</b>?</HTML>");
            cambia_icon_cuevas_BN();
            radio_bigote.setVisible(false);
            radio_no_bigote.setVisible(false);
            radio_gorra.setVisible(true);
            radio_no_gorra.setVisible(true);
            cambia_icon_genio_cansado();
        }
        if(e.getSource() == radio_gorra){
            label_genio.setText("<HTML>Tu personaje es <b>Monche!</b></HTML>");
            cambia_icon_porter_BN();
            radio_gorra.setVisible(false);
            radio_gorra.setVisible(false);
            cambia_icon_genio_sonriente();
            buttonVolverAJugar.setVisible(true);
        }
        if(e.getSource() == radio_no_gorra){
            label_genio.setText("<HTML>Tu personaje es <b>Porter!</b></HTML>");
            cambia_icon_monche_BN();
            radio_gorra.setVisible(false);
            radio_gorra.setVisible(false);
            cambia_icon_genio_seguro();
            buttonVolverAJugar.setVisible(true);
        }
        if(e.getSource() == buttonVolverAJugar){
            juegaOtraVez();
        }
    }

    public static void main(String[] args) {
        adivinaQuien juego = new adivinaQuien();
        juego.setVisible(true);
    }

    public void cambia_icon_kono_BN(){
        ImageIcon i_konoBN = new ImageIcon("konoBN.png");
        Icon icon_konoBN = new ImageIcon(i_konoBN.getImage().getScaledInstance(label_kono_imagen.getWidth(), label_kono_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_kono_imagen.setIcon(icon_konoBN);
        label_kono.setForeground(Color.black);
    }

    public void cambia_icon_karime_BN(){
        ImageIcon i_karimeBN = new ImageIcon("karimeBN.png");
        Icon icon_karimeBN = new ImageIcon(i_karimeBN.getImage().getScaledInstance(label_karime_imagen.getWidth(), label_karime_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_karime_imagen.setIcon(icon_karimeBN);
        label_karime.setForeground(Color.black);
    }

    public void cambia_icon_monche_BN(){
        ImageIcon i_moncheBN = new ImageIcon("moncheBN.png");
        Icon icon_moncheBN = new ImageIcon(i_moncheBN.getImage().getScaledInstance(label_monche_imagen.getWidth(), label_monche_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_monche_imagen.setIcon(icon_moncheBN);
        label_monche.setForeground(Color.black);
    }

    public void cambia_icon_poblanita_BN(){
        ImageIcon i_poblanitaBN = new ImageIcon("poblanitaBN.png");
        Icon icon_poblanitaBN = new ImageIcon(i_poblanitaBN.getImage().getScaledInstance(label_poblanita_imagen.getWidth(), label_poblanita_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_poblanita_imagen.setIcon(icon_poblanitaBN);
        label_poblanita.setForeground(Color.black);
    }

    public void cambia_icon_porter_BN(){
        ImageIcon i_porterBN = new ImageIcon("porterBN.png");
        Icon icon_porterBN = new ImageIcon(i_porterBN.getImage().getScaledInstance(label_porter_imagen.getWidth(), label_porter_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_porter_imagen.setIcon(icon_porterBN);
        label_porter.setForeground(Color.black);
    }

    public void cambia_icon_nicky_BN(){
        ImageIcon i_nickyBN = new ImageIcon("nickyBN.png");
        Icon icon_nickyBN = new ImageIcon(i_nickyBN.getImage().getScaledInstance(label_nicky_imagen.getWidth(), label_nicky_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_nicky_imagen.setIcon(icon_nickyBN);
        label_nicky.setForeground(Color.black);
    }

    public void cambia_icon_mich_BN(){
        ImageIcon i_michBN = new ImageIcon("michBN.png");
        Icon icon_michBN = new ImageIcon(i_michBN.getImage().getScaledInstance(label_mich_imagen.getWidth(), label_mich_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_mich_imagen.setIcon(icon_michBN);
        label_mich.setForeground(Color.black);
    }

    public void cambia_icon_pablo_BN(){
        ImageIcon i_pabloBN = new ImageIcon("pabloBN.png");
        Icon icon_pabloBN = new ImageIcon(i_pabloBN.getImage().getScaledInstance(label_pablo_imagen.getWidth(), label_pablo_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_pablo_imagen.setIcon(icon_pabloBN);
        label_pablo.setForeground(Color.black);
    }

    public void cambia_icon_cuevas_BN(){
        ImageIcon i_cuevasBN = new ImageIcon("cuevasBN.png");
        Icon icon_cuevasBN = new ImageIcon(i_cuevasBN.getImage().getScaledInstance(label_cuevas_imagen.getWidth(), label_cuevas_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_cuevas_imagen.setIcon(icon_cuevasBN);
        label_cuevas.setForeground(Color.black);
    }

    public void cambia_icon_bryan_BN(){
        ImageIcon i_bryanBN = new ImageIcon("bryanBN.png");
        Icon icon_bryanBN = new ImageIcon(i_bryanBN.getImage().getScaledInstance(label_bryan_imagen.getWidth(), label_bryan_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_bryan_imagen.setIcon(icon_bryanBN);
        label_bryan.setForeground(Color.black);
    }

    public void cambia_icon_genio_dudoso(){
        ImageIcon i_genio_dudoso = new ImageIcon("genioDudoso.png");
        Icon icon_genio_dudoso = new ImageIcon(i_genio_dudoso.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_dudoso);
    }

    public void cambia_icon_genio_cubriendoCara(){
        ImageIcon i_genio_cubriendo = new ImageIcon("genioCubriendoCara.png");
        Icon icon_genio_cubriendo = new ImageIcon(i_genio_cubriendo.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_cubriendo);
    }

    public void cambia_icon_genio_bolas(){
        ImageIcon i_genio_bolas = new ImageIcon("genioEchoBolas.png");
        Icon icon_genio_bolas = new ImageIcon(i_genio_bolas.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_bolas);
    }

    public void cambia_icon_genio_cansado(){
        ImageIcon i_genio_cansado = new ImageIcon("genioCansado.png");
        Icon icon_genio_cansado = new ImageIcon(i_genio_cansado.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_cansado);
    }

    public void cambia_icon_genio_orden(){
        ImageIcon i_genio_orden = new ImageIcon("genioALaOrden.png");
        Icon icon_genio_orden = new ImageIcon(i_genio_orden.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_orden);
    }

    public void cambia_icon_genio_YaNoPuede(){
        ImageIcon i_genio_YaNoPuede = new ImageIcon("genioYaNoPuede.png");
        Icon icon_genio_YaNoPuede = new ImageIcon(i_genio_YaNoPuede.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_YaNoPuede);
    }

    public void cambia_icon_genio_sorprendido(){
        ImageIcon i_genio_sorprendido = new ImageIcon("genioSorprendido.png");
        Icon icon_genio_sorprendido = new ImageIcon(i_genio_sorprendido.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_sorprendido);
    }

    public void cambia_icon_genio_sonriente(){
        ImageIcon i_genio_sonriente = new ImageIcon("genioSonriente.png");
        Icon icon_genio_sonriente = new ImageIcon(i_genio_sonriente.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_sonriente);
    }

    public void cambia_icon_genio_senanlando(){
        ImageIcon i_genio_senanlando = new ImageIcon("genioSenalando.png");
        Icon icon_genio_senanlando = new ImageIcon(i_genio_senanlando.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_senanlando);
    }

    public void cambia_icon_genio_seguro(){
        ImageIcon i_genio_seguro = new ImageIcon("genioSeguro.png");
        Icon icon_genio_seguro = new ImageIcon(i_genio_seguro.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_seguro);
    }

    public void cambia_icon_genio_maldiciendo(){
        ImageIcon i_genio_maldiciendo = new ImageIcon("genioMaldiciendo.png");
        Icon icon_genio_maldiciendo = new ImageIcon(i_genio_maldiciendo.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_maldiciendo);
    }

    public void cambia_icon_genio_like(){
        ImageIcon i_genio_like = new ImageIcon("genioLike.png");
        Icon icon_genio_like = new ImageIcon(i_genio_like.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_like);
    }

    public void cambia_icon_genio_emocionado(){
        ImageIcon i_genio_emocionado = new ImageIcon("genioEmocionado.png");
        Icon icon_genio_emocionado = new ImageIcon(i_genio_emocionado.getImage().getScaledInstance(label_genio_imagen.getWidth(), label_genio_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_genio_imagen.setIcon(icon_genio_emocionado);
    }

    public void reset_icon_kono(){
        ImageIcon i_kono = new ImageIcon("kono.png");
        Icon icon_kono = new ImageIcon(i_kono.getImage().getScaledInstance(label_kono_imagen.getWidth(), label_kono_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_kono_imagen.setIcon(icon_kono);
        label_kono.setForeground(Color.white);
    }

    public void reset_icon_karime(){
        ImageIcon i_karime = new ImageIcon("karime.png");
        Icon icon_karime = new ImageIcon(i_karime.getImage().getScaledInstance(label_karime_imagen.getWidth(), label_karime_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_karime_imagen.setIcon(icon_karime);
        label_karime.setForeground(Color.white);
    }

    public void reset_icon_monche(){
        ImageIcon i_monche = new ImageIcon("monche.png");
        Icon icon_monche = new ImageIcon(i_monche.getImage().getScaledInstance(label_monche_imagen.getWidth(), label_monche_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_monche_imagen.setIcon(icon_monche);
        label_monche.setForeground(Color.white);
    }

    public void reset_icon_poblanita(){
        ImageIcon i_poblanita = new ImageIcon("poblanita.png");
        Icon icon_poblanita = new ImageIcon(i_poblanita.getImage().getScaledInstance(label_poblanita_imagen.getWidth(), label_poblanita_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_poblanita_imagen.setIcon(icon_poblanita);
        label_poblanita.setForeground(Color.white);
    }

    public void reset_icon_porter(){
        ImageIcon i_porter = new ImageIcon("porter.png");
        Icon icon_porter = new ImageIcon(i_porter.getImage().getScaledInstance(label_porter_imagen.getWidth(), label_porter_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_porter_imagen.setIcon(icon_porter);
        label_porter.setForeground(Color.white);
    }

    public void reset_icon_nicky(){
        ImageIcon i_nicky = new ImageIcon("nicky.png");
        Icon icon_nicky = new ImageIcon(i_nicky.getImage().getScaledInstance(label_nicky_imagen.getWidth(), label_nicky_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_nicky_imagen.setIcon(icon_nicky);
        label_nicky.setForeground(Color.white);
    }

    public void reset_icon_mich(){
        ImageIcon i_mich = new ImageIcon("mich.png");
        Icon icon_mich = new ImageIcon(i_mich.getImage().getScaledInstance(label_mich_imagen.getWidth(), label_mich_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_mich_imagen.setIcon(icon_mich);
        label_mich.setForeground(Color.white);
    }

    public void reset_icon_pablo(){
        ImageIcon i_pablo = new ImageIcon("pablo.png");
        Icon icon_pablo = new ImageIcon(i_pablo.getImage().getScaledInstance(label_pablo_imagen.getWidth(), label_pablo_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_pablo_imagen.setIcon(icon_pablo);
        label_pablo.setForeground(Color.white);
    }

    public void reset_icon_cuevas(){
        ImageIcon i_cuevas = new ImageIcon("cuevas.png");
        Icon icon_cuevas = new ImageIcon(i_cuevas.getImage().getScaledInstance(label_cuevas_imagen.getWidth(), label_cuevas_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_cuevas_imagen.setIcon(icon_cuevas);
        label_cuevas.setForeground(Color.white);
    }

    public void reset_icon_bryan(){
        ImageIcon i_bryan = new ImageIcon("bryan.png");
        Icon icon_bryan = new ImageIcon(i_bryan.getImage().getScaledInstance(label_bryan_imagen.getWidth(), label_bryan_imagen.getHeight(), Image.SCALE_SMOOTH));
        label_bryan_imagen.setIcon(icon_bryan);
        label_bryan.setForeground(Color.white);
    }

    public void juegaOtraVez(){
        label_genio.setText("Hola, soy el genio del juego.");
        cambia_icon_genio_seguro();
        buttonVolverAJugar.setVisible(false);
        button_genio_siguiente.setVisible(true);
        reset_icon_bryan();
        reset_icon_cuevas();
        reset_icon_karime();
        reset_icon_kono();
        reset_icon_monche();
        reset_icon_pablo();
        reset_icon_poblanita();
        reset_icon_porter();
        reset_icon_nicky();
        reset_icon_mich();
        radio_hombre.setSelected(false);
        radio_mujer.setSelected(false);
        radio_lentes.setSelected(false);
        radio_no_lentes.setSelected(false);
        radio_bigote.setSelected(false);
        radio_no_bigote.setSelected(false);
        radio_ojos_cafes.setSelected(false);
        radio_ojos_verdes.setSelected(false);
        radio_lentes_m.setSelected(false);
        radio_no_lentes_m.setSelected(false);
        radio_china.setSelected(false);
        radio_no_china.setSelected(false);
        radio_pelirroja.setSelected(false);
        radio_no_pelirroja.setSelected(false);
        radio_rubia.setSelected(false);
        radio_pelinegro.setSelected(false);
        radio_gorra.setSelected(false);
        radio_no_gorra.setSelected(false);
    }
}