package example.project.CodeClones;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {

        Set intersection = new HashSet(set1);
        intersection.retainAll(set2);

        Set union = new HashSet(set1);
        union.addAll(set2);

        return (double)intersection.size() / (double)union.size();

    }

}
