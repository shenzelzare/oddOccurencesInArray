import java.util.*;

public class OddOccurrencesInArray {
    private int solution(int [] A){
        HashSet<Integer> zeki = new HashSet<>();
        for (int i=0; i<A.length;i++){
            int a= A[i];
            if (zeki.contains(a)){
                zeki.remove(a);
            }
            else {
                zeki.add(a);
            }
        }
        return zeki.iterator().next();
    }
    public static void main(String[] args) {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        System.out.println(oddOccurrencesInArray.solution(new int[]{9,3,9,3,9,7,9}));
    }
}
