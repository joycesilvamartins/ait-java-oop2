package hdip.news;

import java.util.ArrayList;
import java.util.List;

public class NewsPortal {

    public static void main(String[] args) {

        List<NewsMedia> nm = new ArrayList<>();

        NewsMedia blog = new Blog("Huff Puff", "Joe Bloggs");
        NewsMedia broads = new BroadSheet("The Times", "Tara Lee");

        nm.add(blog);
        nm.add(broads);

        processNewsMedia(nm);
    }

    public static void processNewsMedia(List<NewsMedia> mediaItems) {
        //Type   ref : array - cada rodada o ref será atribuido com a próx posição do array
        for (NewsMedia n : mediaItems) {
            System.out.print(n);

            if (n instanceof Subjective) {
                System.out.println(" - Subjective Journalism");
            }
            System.out.println();
        }
    }
}
