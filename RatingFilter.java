package src.mrsim;

import java.util.ArrayList;
import java.util.List;


/**
 * Example of a RatingFilter that does nothing at the moment.
 * Your task is to finish the constructor, so that the user id can be configured,
 * and to implement the filter method so that all ratings of the given user are filtered.
 * The filter method shall return a Record that contains a key and a rating value
 * for further processing by our MR-simulator.
 */
public class RatingFilter extends Filter<String, String, Integer>{
    String userid="";
    public RatingFilter(String search_key) {
    	// to be done
    	this.userid = search_key;
    }

    public Record<String, Integer> filter ( String line ) {
    	// to be done
    	String[] uid=line.split("\t");
    	if(userid.equals(uid[0]))
        {
    		int i =Integer.parseInt(uid[2]);
            Record<String,Integer> rec = new Record(userid,i);
            return rec;
    	}
    	else
    	{
          return null;
    	}
    }

}
