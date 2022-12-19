package tec;

import collecte.*;//c'est correct.(service de collecte non par fichier(choix.))
//mieux!!!!


//le greffon doit hériter de autobus.(extends autobus)//ici implements
//autobus, vehicule en majuscules(les deux).

//extends est un lien estUN car ca va heriter des methodes pre-definies
//et faire un @Overrride de quelques unes.

//ici, on a pas extends mais implements ca va implementer un ensemble d'interfaces d'où la nécessicité pas de notion d'héritage=>implements obligé dans cette fabrique pour implémenter le lien a-UN du greffon avec la collecte.java. (choix)


public class GreffonAUn implements Transport, Vehicule {

        private Vehicule v;
        private Transport t;
    private Collecte c;//lien a-UN
    //le constructeur doit y prendre compte. 
    //on rappelle: a chaque entree: numero d'arret, nombre d'entrees et nombre de sorties,ainsi de suite...
    
        public GreffonAUn(Vehicule v2, Collecte c2) {
                v = v2;
                t = (Transport) v2;
                c = c2;
        }

        @Override
        public void monteeDemanderAssis(Passager p) {
                if (!v.aPlaceAssise())
                        return;
                this.envoyerGreffon(p);
                v.monteeDemanderAssis(p);
                c.uneEntree();
        }

        @Override
        public void monteeDemanderDebout(Passager p) {
                if (!v.aPlaceDebout())
                        return;
                this.envoyerGreffon(p);
                v.monteeDemanderDebout(p);
                c.uneEntree();
        }

        @Override
        public void arretDemanderSortie(Passager p) {
                v.arretDemanderSortie(p);
                c.uneSortie();
        }

        @Override
        public boolean aPlaceAssise() {
                return v.aPlaceAssise();
        }

        @Override
        public boolean aPlaceDebout() {
                return v.aPlaceDebout();
        }

        @Override
        public void arretDemanderDebout(Passager p) {
                if (!v.aPlaceDebout())
                        return;
                v.arretDemanderDebout(p);
        }

        @Override
        public void arretDemanderAssis(Passager p) {
                if (!v.aPlaceAssise())
                        return;
                v.arretDemanderAssis(p);
        }

        @Override
        public void allerArretSuivant() {
                c.changerArret();
                t.allerArretSuivant();
        }

        public void envoyerGreffon(Passager p) {
	    p.setGreffon(this);
        }

        @Override
        public String toString() {
                return v.toString();
        }

}
