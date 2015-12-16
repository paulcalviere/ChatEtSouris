package miceandcats;

import java.util.Random;

/**
 *
 * @author Paul et Bruno
 */

public class Chien extends Animal {

    public Chien(int id, Case c, JeuModele jm) {
        super(id, c, jm);
    }


    @Override
    public void Deplacement() {
        int ligne = randomi();
        int colonne = randomj();
        
        if (this.jeu.getPlateau()[ligne][colonne].getType()==TypeCase.CHEMIN){
            
        }
    }
    
    public int randomi(){
       Random r = new Random();
       int valeur = (0) + r.nextInt((8) - (0)); 
       return valeur;
    }
    
    public int randomj(){
        Random r = new Random();
        int valeur = (0) + r.nextInt((10) - (0));
        return valeur;
    }
    
}
