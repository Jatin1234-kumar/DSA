class Solution {
	int countPairs(int[] arr, int k) {
		Map<Integer, Integer> freq = new HashMap<>();
		int count = 0;
		
		for (int num : arr) {
			count += freq.getOrDefault(num - k, 0);
			count += freq.getOrDefault(num + k, 0);
			
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}
		
		return count;
	}
}
