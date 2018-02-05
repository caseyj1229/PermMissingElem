import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {
    @Test
    void solution() {
        int[] A = {1,2,3,5,6,7,8,9};
        assertEquals(4,PermMissingElem.solution(A));

        int[] B = {1,3,5,4};
        assertEquals(2,PermMissingElem.solution(B));

        int[] C = {2,3,4,5,6,7,8,9};
        assertEquals(1,PermMissingElem.solution(C));

        int[] D = new int[100000];
        for(int i = 0;i<D.length;i++){
            D[i] = i+1;
        }
        D[752] = 100001;
        assertEquals(753,PermMissingElem.solution(D));

        int[] E = {2};
        assertEquals(1,PermMissingElem.solution(E));

        int[] F = {};
        assertEquals(1,PermMissingElem.solution(F));

    }
}