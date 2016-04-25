package proyectotwitter4j;

import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

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
    }
    
    
        Query query = new Query("#petartwitter");
    QueryResult result = mitwitter.search(query);
    for (Status status : result.getTweets()) {
        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
            }*/
    }
        }

