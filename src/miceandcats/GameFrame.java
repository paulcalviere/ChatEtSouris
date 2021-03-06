package miceandcats;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Paul et Bruno
 */
public class GameFrame extends javax.swing.JFrame implements Observateur{

    //importation des images
    private static final ImageIcon IN = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/In.png");
    private static final ImageIcon OUT = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/OUT.png");
    private static final ImageIcon FLECHEDROITE = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/flecheDroite.png");
    private static final ImageIcon FLECHEGAUCHE = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/flecheGauche.png");
    private static final ImageIcon FLECHEHAUT = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/flecheHaut.png");
    private static final ImageIcon FLECHEBAS = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/flecheBas.png");
    private static final ImageIcon TELIN = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/TELIN.png");
    private static final ImageIcon TELOUT = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/TELOUT.png");
    private static final ImageIcon CHIEN = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/CHIEN1.png");
    private static final ImageIcon SOURIS = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/SOURIS1.png");
    private static final ImageIcon CHAT = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/CHAT2.png");
    private static final ImageIcon HERBE = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/HERBE.png");
    private static final ImageIcon MUR = new ImageIcon("C:/Users/Paul/Documents/NetBeansProjects/MiceAndCats/src/miceandcats/img/MUR.png");
   
    //Creation du jboard
    JLabel[][] jboard;
    
    //Import du modele
    JeuModele modele;
    
    public GameFrame() {
        initComponents();
        
        //import du modele
        modele = new JeuModele();
        
        //implementation du jboard
        jboard = new JLabel[8][10];
        
        for (int i=0; i<8;i++){
            for(int j=0;j<10;j++){
                makeframe(modele.getPlateau()[i][j],(jboard[i][j]=new JLabel()));
                
                panelLab.add(jboard[i][j]);
                
                jboard[i][j].addMouseListener(
                        new ControlFleche(i,j,this.modele));
            }
        }
        
        //affichage des jLabels
        lblFleches.setText(modele.getNbFleches()+" flèches restantes");
        lblSouris.setText(modele.getSourisSafe()+" souris sauvées");
        
        modele.addObservateur(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelH = new javax.swing.JPanel();
        panelLab = new javax.swing.JPanel();
        panelB = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblFleches = new javax.swing.JLabel();
        lblSouris = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 550));
        setResizable(false);

        panelH.setBackground(new java.awt.Color(0, 0, 0));

        panelLab.setBackground(new java.awt.Color(0, 0, 0));
        panelLab.setPreferredSize(new java.awt.Dimension(400, 300));
        panelLab.setLayout(new java.awt.GridLayout(8, 10));

        javax.swing.GroupLayout panelHLayout = new javax.swing.GroupLayout(panelH);
        panelH.setLayout(panelHLayout);
        panelHLayout.setHorizontalGroup(
            panelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelHLayout.setVerticalGroup(
            panelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLab, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        btnNew.setText("Commencer la partie");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnReset.setText("Réinitialiser partie");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblFleches.setText("flèches restantes");

        lblSouris.setText("souris sauvés");

        javax.swing.GroupLayout panelBLayout = new javax.swing.GroupLayout(panelB);
        panelB.setLayout(panelBLayout);
        panelBLayout.setHorizontalGroup(
            panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSouris)
                    .addComponent(lblFleches))
                .addGap(199, 199, 199))
        );
        panelBLayout.setVerticalGroup(
            panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFleches)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSouris))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {                                       
        TimerTask tt = new TimerTask() {
            
            @Override
            public void run() {
                System.out.println("MAJ");
                for(Animal a: modele.getAnimaux())
                {
//                for(int k=0;k<modele.getAnimaux().size();k++){
                    if(a.getEtat()==EtatAnimal.VIVANT)
                    {
                        
                        // pour deplacer les animaux selon leur id utile our les tests
                        /*
                        if(a.getId()==3 || a.getId()==4)
                        {
                        a.Deplacement();
                        System.out.println("deplacement");
                        }
                        */
                        a.Deplacement();
                        System.out.println("deplacement");
                        
                        
                      
                    }
                }
                miseajour();
            }
        };
        Timer timer = new Timer();
        timer.schedule(tt,0,1500);
    }    
    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("NEW");
        this.dispose();
        GameFrame newgame = new GameFrame();
        newgame.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblFleches;
    private javax.swing.JLabel lblSouris;
    private javax.swing.JPanel panelB;
    private javax.swing.JPanel panelH;
    private javax.swing.JPanel panelLab;
    // End of variables declaration                   

    public JLabel[][] getJboard() {
        return jboard;
    }

    public javax.swing.JButton getBtnNew() {
        return btnNew;
    }

    public javax.swing.JButton getBtnReset() {
        return btnReset;
    }
    
    public static ImageIcon getIN() {
        return IN;
    }

    public static ImageIcon getOUT() {
        return OUT;
    }

    public static ImageIcon getTELIN() {
        return TELIN;
    }

    public static ImageIcon getTELOUT() {
        return TELOUT;
    }

    public static ImageIcon getCHIEN() {
        return CHIEN;
    }

    public static ImageIcon getSOURIS() {
        return SOURIS;
    }

    public static ImageIcon getCHAT() {
        return CHAT;
    }

    public static ImageIcon getHERBE() {
        return HERBE;
    }
    
    public static ImageIcon getFLECHEDROITE() {
        return FLECHEDROITE;
    }

    public static ImageIcon getFLECHEGAUCHE() {
        return FLECHEGAUCHE;
    }

    public static ImageIcon getFLECHEHAUT() {
        return FLECHEHAUT;
    }

    public static ImageIcon getFLECHEBAS() {
        return FLECHEBAS;
    }
    
    public static ImageIcon getMUR() {
        return MUR;
    }
    
    public void makeframe(Case c, JLabel j){
        switch (c.getType()){
            case MUR:
                j.setIcon(getMUR());
            break;
                
            case CHEMIN:
                j.setIcon(getHERBE());
            break;
                
            case IN:
                j.setIcon(getIN());
            break;
                
            case OUT:
                j.setIcon(getOUT());
            break;
                
            case TELIN:
                j.setIcon(getTELIN());
            break;
                
            case TELOUT:
                j.setIcon(getTELOUT());
            break;
            
            case FBAS:
                j.setIcon(getFLECHEBAS());
            break;
                
            case FHAUT:
                j.setIcon(getFLECHEHAUT());
            break;
                
            case FGAUCHE:
                j.setIcon(getFLECHEGAUCHE());
            break;
            
            case FDROITE:
                j.setIcon(getFLECHEDROITE());
            break;
                
            case CHAT:
                j.setIcon(getCHAT());
            break;
                
            case CHIEN:
                j.setIcon(getCHIEN());
            break;
                
            case SOURIS:
                j.setIcon(getSOURIS());
            break;
        }
    }
    
    public void miseajour(){
        for (int i=0; i<8;i++){
            for(int j=0;j<10;j++){
                makeframe(modele.getPlateau()[i][j],(jboard[i][j]));
            }
        }
        lblFleches.setText(modele.getNbFleches()+" flèches restantes");
        lblSouris.setText(modele.getSourisSafe()+" souris sauvées");
    }

    @Override
    public void avertir() {
        miseajour();
    }
}