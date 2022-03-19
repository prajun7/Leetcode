// https://www.youtube.com/watch?v=Jv5_J1fSju0

/* Algorithm
1. Create HashMap to keep track of the frequency of the element
that is, <element, frequency>

2. List of Stack. The index of the List will act as the frequency of the list
If index of the List is 0, then all the element present at this level will have frequency 1
If index of the List is 1, then all the element present at this level will have frequency 2
If index of the List is 2, then all the element present at this level will have frequency 3
... and so on,
SO, we need to subtract 1 from the frequency
The list will store Stack in each of its index
Watch the above video for more explanation
*/

class FreqStack {

    // SC : O(n)
    // TC : O(1)
    
    List<Stack<Integer>> stList = null;
    Map<Integer, Integer> map = null;

    public FreqStack() {
        map = new HashMap<>();          // Initiate the map and List
        stList = new ArrayList<>();
    }

    public void push(int x) {
        map.put(x, map.getOrDefault(x, 0)+1);   // Keep track of the frequency in the HashMap
        int freq = map.get(x);
        if(freq -1 >= stList.size()){
            stList.add(new Stack<Integer>());
        }
        stList.get(freq-1).add(x);

    }

    public int pop() {
        int size = stList.size();
        int x = stList.get(size-1).pop();
        if(stList.get(size-1).empty()){
            stList.remove(size-1);
        }

        map.put(x, map.get(x)-1);
        if(map.get(x) == 0){
            map.remove(x);
        }

        return x;

    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */