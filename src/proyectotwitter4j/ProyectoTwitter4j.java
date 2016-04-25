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


    public static void main(String[] args) {
        Twitter mitwitter = new TwitterFactory().getInstance();
        //asdasdasdasd
    }
    
    
        Query query = new Query("#petartwitter");
    QueryResult result = mitwitter.search(query);
    for (Status status : result.getTweets()) {
        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
            }*/
    
        }
    }

