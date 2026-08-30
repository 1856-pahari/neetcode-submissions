class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for (int num:nums) {
            count.put(num, count.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1,n2) -> count.get(n1) - count.get(n2));

        for(int num : count.keySet()) {
            minHeap.add(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        //Extracting results
        int[] res = new int[k];
        for(int i=0;i<k;i++) {
            res[i] = minHeap.poll();
        }
    
    return res;
    }
    }
