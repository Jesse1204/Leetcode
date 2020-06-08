class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int m = (arr.length - 1) / 2;
        int mid = arr[m];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a1,a2) -> Math.abs(a1-mid) == Math.abs(a2 - mid)?a1-a2:Math.abs(a1-mid) - Math.abs(a2 - mid));
        for(int num:arr){
            pq.add(num);
            if(pq.size()>k) pq.poll();
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = pq.poll();
        }
        return res;
    }
}