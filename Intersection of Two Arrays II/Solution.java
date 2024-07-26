class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int[] small;
        int[] large;

        if (nums1.length > nums2.length) {
            small = nums2;
            large = nums1;
        }
        else {
            small = nums1;
            large = nums2;
        }

        for (int i = 0; i < small.length; i++) {
            if (mp1.containsKey(small[i])) mp1.put(small[i], mp1.get(small[i]) + 1);
            else mp1.put(small[i], 1);
        }
        for (int i = 0; i < large.length; i++) {
            if (mp1.containsKey(large[i])) {
                if (mp2.containsKey(large[i])) mp2.put(large[i], mp2.get(large[i]) + 1);
                else mp2.put(large[i], 1);
            }
        }
        for (int key : mp2.keySet()) {
            int freq = Math.min(mp1.get(key), mp2.get(key));
            while (freq != 0) {
                list.add(key);
                freq--;
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
        
    }
}