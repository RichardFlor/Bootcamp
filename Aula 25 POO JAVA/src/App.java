import classes.Gafanhoto;
import classes.Pessoa;
import classes.Video;
import classes.Visualizacao;

public class App {
    public static void main(String[] args) throws Exception {
        //Vetor de video
        Video video[] = new Video[3];
        video[0] = new Video("Ultimas Aulas de POO");
        video[1] = new Video("Quase acabando");
        video[2] = new Video("Finalzinho");

        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Richard", 21, "Masc", "Ric");
        gafanhoto[1] = new Gafanhoto("Matheus", 21, "Masc", "Math");

        Visualizacao visualizacao[] = new Visualizacao[3];
        visualizacao[0] = new Visualizacao(gafanhoto[0], video[0]);
        visualizacao[0].avalir();
        System.out.println(visualizacao[0].toString());
        

        visualizacao[1] = new Visualizacao(gafanhoto[0], video[1]);
        visualizacao[0].avalir(87f);
        System.out.println(visualizacao[1].toString());

        // visualizacao[2] = new Visualizacao(gafanhoto[0], video[2]);
        // visualizacao[0].avalir();
        // System.out.println(visualizacao[2].toString());

        
    

        
       
        
        /* 
        System.out.println("Videos\n-----------------------------------");
        System.out.println(video[0].toString());
        System.out.println(video[1].toString());
        System.out.println(video[2].toString());
        System.out.println("\nGafanhotos\n-----------------------------------");  
        System.out.println(gafanhoto[0].toString());
        System.out.println(gafanhoto[1].toString());
        */
    }
}
