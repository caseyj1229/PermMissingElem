//https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
public class PermMissingElem {
    public static int solution(int[] A){
        int arraySum = 0;
        int runningSum = 0;
        for(int i = 0; i<A.length;i++){
            arraySum += A[i];
            runningSum += i+1;
        }
        runningSum += A.length+1;

        return (runningSum-arraySum);
    }
}
