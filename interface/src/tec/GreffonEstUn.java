//Greffon va récupérer les infos de Autobus
//qui implémente Transport et Véhicule en tant qu'interfaces.
//cette classe va HERITER d'AUTOBUS.(elle va étendre Autobus) EXTENDS!!

package tec;
//on aura besoin de la collection pour faire la propagation d'infos.

import collecte.*; //dans le même dossier 2 packages.

class GreffonEstUn extends Autobus{


    private Collecte collecteur;
    //le voilà linkage avec le constructeur(attribution d'objets).
    //\\!//.

    
    public GreffonEstUn(int nbPlaceAssise, int nbPlaceDebout,Collecte col){
	super(nbPlaceAssise,nbPlaceDebout);
	collecteur=col;
    }


    //reste le constructeur..
			/*
Raisonnons un peu, ce greffon dois propager de l'information 
quand on fait collecteur.uneEntree, on appelle un attribut
soit un lien a-UN avec la collecte de manière générale qui sera 
un interface d'après les fcts. suivantes bien claires dans les @Override.
			*/

    //sans oublier les @O O majuscule!!
    @Override
        public void arretDemanderSortie(Passager p) {
                super.arretDemanderSortie(p);
                collecteur.uneSortie();
        }

        @Override
        public void monteeDemanderAssis(Passager p) {
                super.monteeDemanderAssis(p);
                collecteur.uneEntree();
        }

        @Override
        public void monteeDemanderDebout(Passager p) {
                super.monteeDemanderDebout(p);
                collecteur.uneEntree();
        }

        @Override
        public void allerArretSuivant() {
                super.allerArretSuivant();
                collecteur.changerArret();
        }
}
