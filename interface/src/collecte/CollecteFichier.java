package collecte;

import java.io.Writer;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;
//import java.io;
import java.io.IOException;

public class CollecteFichier implements Collecte{
    private int arret;
    private int entree;
    private int sortie;
    //les 3 données phares de ce systeme de collecte au sein du package tec;(*)
    
    private FileWriter f;//celle-ci est importante.

    public CollecteFichier(){
	arret=0;
	entree=0;
	sortie=0;
	//les initialisations normaux.(*)
	try{
	    //la méthode car IOexception:
	    //FileWriter f=new FileWriter("${name}")
	    //puis pour ecrire on doit instancier un print writer
	    //de parametre Writer soit (Writer)f.
	    //puis faire: p.println applications.
	    //puis un p.flush : c'est la procédure(voir fichier d'exemple).
	    f=new FileWriter("Collecte.txt");
	    PrintWriter p=new PrintWriter((Writer)f);
	    p.println("Arrêt\tEntrée\tSortie\n");
	    p.flush();}catch(IOException e){
	    e.printStackTrace();
	}
    }

    public void uneEntree(){
	entree=entree+1;//augmentation
    }

    public void uneSortie(){
	sortie=sortie+1;//augmentation
    }

    public void changerArret(){
	PrintWriter p=new PrintWriter((Writer)f);
	p.println(arret+"\t"+entree+"\t"+sortie+"\n");
	p.flush();
	entree=0;
	sortie=0;
	arret=arret+1;
    }

    public void closeFile(){
	PrintWriter p=new PrintWriter((Writer)f);//toujours
	//obligé pour passer par un buffer qui nous relie a un flux d'ecriture
	//inline binaire en characteres ASCII utf-8[][].
	p.println(arret+"\t"+entree+"\t"+sortie+"\n");
	p.flush();
	try{	    f.close();
	}catch(IOException e){
	    e.printStackTrace();
	}
    }
}
