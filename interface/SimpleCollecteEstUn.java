import tec.Usager;
import tec.Transport;
import tec.FabriqueTec;
import tec.TecException;
import collecte.*;
//import tec.*;//non!!=>en COMMENT!!!!!!!


class SimpleCollecteEstUn {
        static private void deboguerEtat(Transport t, Usager p) {
                System.out.println(p);
                System.out.println(t);
        }

        static public void main(String[] args) throws TecException {
                Collecte col = new CollecteCollection();
                Transport serenity = FabriqueTec.faireGreffonsEstUnAutobus(1, 2, col);

                Usager kaylee = FabriqueTec.fairePassager("Kaylee", 4,1);
                Usager jayne = FabriqueTec.fairePassager("Jayne", 4,1);
                Usager inara = FabriqueTec.fairePassager("Inara", 5,1);

                // 0
                System.out.println(serenity);

                serenity.allerArretSuivant();
                // 1
                kaylee.monterDans(serenity);
                inara.monterDans(serenity);

                System.out.println(serenity);
                System.out.println(kaylee);
                System.out.println(jayne);
                System.out.println(inara);

                serenity.allerArretSuivant();
                // 2

                jayne.monterDans(serenity);

                System.out.println(serenity);
                System.out.println(kaylee);
                System.out.println(jayne);
                System.out.println(inara);

                serenity.allerArretSuivant();
                // 3

                System.out.println(serenity);
                System.out.println(kaylee);
                System.out.println(jayne);
                System.out.println(inara);

                serenity.allerArretSuivant();
                // 4
                System.out.println(serenity);
                System.out.println(kaylee);
                System.out.println(jayne);
                System.out.println(inara);

                serenity.allerArretSuivant();
                // 5
                System.out.println(serenity);
                System.out.println(kaylee);
                System.out.println(jayne);
                System.out.println(inara);

                System.out.println(col);
        }
}
