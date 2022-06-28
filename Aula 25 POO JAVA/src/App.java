import classes.Gafanhoto;
import classes.Pessoa;
import classes.Video;

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

        System.out.println(gafanhoto[0].toString());
        System.out.println(video[0].toString());
    }
}
