package proyectotwitter4j;


import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


/**
 *
 * @author agomezcastro
 */
public class ProyectoTwitter4j {



    public static void main(String[] args) throws TwitterException {
        
        TwitterFactory tf = new TwitterFactory();
        Twitter mitwitter = tf.getInstance();
        Status miStatus = mitwitter.updateStatus("que opinas del nuevo episodio de juego de tronos? @PokemonArray");
        System.out.println(miStatus.getText());
        
        
        /*List<Status> statuses = mitwitter.getHomeTimeline();
    System.out.println("Showing home timeline.");
    for (Status status : statuses) {
        System.out.println(status.getUser().getName() + ":" +
        status.getText());
=======
    public static void main(String[] args) {
        Twitter mitwitter = new TwitterFactory().getInstance();
        //asdasdasdasd
        
        //yo creo que tu proyecto esta bugeado porque leblanc deletea gente
>>>>>>> 048390bc47e047549b0c552afc2e92c97741c86b
    }
    
    
        Query query = new Query("#petartwitter");
    QueryResult result = mitwitter.search(query);
    for (Status status : result.getTweets()) {
        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
            }*/
    }
        }

