class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0; 
        int size = 0; 
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i]) == false) 
            { 
                map.put(arr[i], 1); 
                size++; 
            } 
            else map.put(arr[i], map.get(arr[i]) + 1); 
        }
        Map<Integer, Integer> sortedMap = map.entrySet().stream()
                                        .sorted(Map.Entry.comparingByValue())
                                        .collect(Collectors.toMap(
          Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        for (Map.Entry<Integer, Integer> entry:sortedMap.entrySet()) 
        { 
            if (entry.getValue() <= k) 
            { 
                k -= entry.getValue(); 
                count++; 
            } 
            else return size - count; 
        }
        return size-count;
    }
}