
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
    
    List<Integer> list = new ArrayList<Integer>(nums);

    Collections.sort(list);

    int min = Collections.min(list);
    int max = Collections.max(list);

    int diff = max - min;

    return diff;





    }
}
