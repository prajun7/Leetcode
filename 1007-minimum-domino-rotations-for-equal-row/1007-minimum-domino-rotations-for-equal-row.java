class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        // search for top and bottom number separately
        int searchTop = searchFastestRotations(tops, bottoms, tops[0]);
        int searchButtom = searchFastestRotations(tops, bottoms, bottoms[0]);
        // decide the best solution
        if (searchTop>=0 && searchButtom>=0) return Math.min(searchTop,searchButtom);
        if (searchTop>=0) return searchTop;
        if (searchButtom>=0) return searchButtom;
        return -1;
    }
    public int searchFastestRotations(int[] tops, int[] bottoms, int num) {
        int toT = 0;
        int toB = 0;
        for(int i = 0; i<tops.length; i++) {
            if(tops[i]==num) {
                // found on top, recheck bottom for double
                if(bottoms[i]!=num) toB++;
            } else if(bottoms[i]==num) {
                // not found on top, found on bottom
                toT++;
            } else {
                // not found nor on top, nither on bottom
                return -1;
            }
        }
        return Math.min(toT, toB);
    }
}