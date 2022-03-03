/*
If I understand correctly, the way it works is:
i) We need minimum 3 indices to make arithmetic progression,
ii) So start at index 2, see if we got two diffs same, so we get a current 1 arith sequence
iii) At any index i, if we see it forms arith seq with former two, that means running (curr) sequence gets extended upto this index, at the same time we get one more sequence (the three numbers ending at i), so curr++. Any time this happens, add the curr value to total sum.
iv) Any time we find ith index does not form arith seq, make currently running no of seqs to zero.


sum += curr really does the trick. Brilliant!

I think the easy way to understand this is that adding current number to our existing arithmetic sequence, we will have curr additional combinations of new arithmetic slices.

Let's say if we have [1, 2, 3, 4] and currently we have 3 arithmetic slices (curr is 2). We are going to add 5 to our arithmetic sequence. So that we will have curr new slices (curr is 3), which is [3, 4, 5], [2, 3, 4, 5] and [1, 2, 3, 4, 5]. Now, the total valid arithmetic slices is 3 + curr = 6. That's exactly the same as sum += curr.


love the "curr += 1; sum += curr;" very much, that is amazing!!
For those guys who are confused about these two line:
"curr" the number of different "Arithmetic Slices" ends at index = i
a small example :
we have :[1, 2, 3, 4]
index = 2, we have curr = 1, sum = 1, which is [1,2,3];
index = 3, curr = 2, sum = 2 + 1 = 3; because we look back from index = 3 which is 4 , we will have two "Arithmetic Slices", which is [2,3,4] and [1,2,3,4]...
*/

class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int curr = 0, sum = 0;
        for (int i=2; i<A.length; i++)
            if (A[i]-A[i-1] == A[i-1]-A[i-2]) {
                curr += 1;
                sum += curr;
            } else {
                curr = 0;
            }
        return sum;
    }
}