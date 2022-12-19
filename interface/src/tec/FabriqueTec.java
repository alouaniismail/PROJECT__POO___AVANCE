package tec;
import collecte.*;
public final class FabriqueTec
{

    private FabriqueTec()
    {
    }
    
    /*public static Usager fairePassagerStandard(String nom, int dst)
    {
	return new PassagerStandard(nom,dst);
    }

     public static Usager fairePassagerIndecis(String nom, int dst)
    {
	return new PassagerIndecis(nom,dst);
    }

     public static Usager fairePassagerStresse(String nom, int dst)
    {
	return new PassagerStresse(nom,dst);
	}*/

    public static Usager fairePassager(String nom, int dst, int nbr)
    {
	if(nbr==0) {
	    return new PassagerStandard(nom,dst);}
	else if(nbr==1) {
	    return new PassagerIndecis(nom,dst);}
	else {return new PassagerStresse(nom,dst);}
	//pour eviter l'erreur du retour statement...
    }
    
    /*public static Transport faireAutobus(int nbr_1, int nbr2)
    {
	return new Autobus(nbr_1,nbr2);
    }
    */
    //pas besoin maintenant.


    public static Transport faireGreffonsAUnAutobus(int nbPlaceAssise, int nbPlaceDebout, Collecte col) {
                return new GreffonAUn(new Autobus(nbPlaceAssise, nbPlaceDebout), col);
        };

        public static Transport faireGreffonsEstUnAutobus(int nbPlaceAssise, int nbPlaceDebout, Collecte col) {
                return new GreffonEstUn(nbPlaceAssise, nbPlaceDebout, col);
        };


    //ajouts importants si on veut initialiser via un lien est-UN un autobus
    //avec sa collecte à lui.
}
