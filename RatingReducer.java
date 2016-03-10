package src.mrsim;

import java.util.*;

/**
 * Example Reducer that averages the Integers in the values.
 *
 */
public class RatingReducer implements Reducer<String, Integer, Float> {

	@Override
	public Float reduce(String key, List<Integer> values) {
		// reduce method to be done
		double sum =0.0;
		for(int i=0;i<values.size();i++){
		    double number = (double) values.get(i);
		    sum +=number;
		}
		System.out.println(sum/values.size());
		return null;
	}
}
