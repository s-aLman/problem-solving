package practice.Arrays.easy;

import java.util.*;

public class TwoSums {
    public static void printMap(Map<Integer, List<Integer>> mp){
        for(Map.Entry<Integer, List<Integer>> e : mp.entrySet()){
            System.out.println("Key : "+e.getKey()+" Value : "+e.getValue().toString());
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(mp.containsKey(nums[i]))
            {
                List<Integer> v = new ArrayList<>();
                v.addAll(mp.get(nums[i]));
                v.add(i);
                mp.replace(nums[i], v);
            } else
                mp.put(nums[i], Arrays.asList(i));
        }
        printMap(mp);
        System.out.print("Indices Pair : ");
        for(int i=0; i<nums.length; i++){
            if(mp.containsKey(target-nums[i])){
                if(nums[i]!=(target-nums[i])){
                    res[0]=i;
                    res[1]=mp.get(target-nums[i]).get(0);
                    return res;
                } else {
                    int val = mp.get(target-nums[i]).size();
                    if(val>1){
                        res[0]=i;
                        res[1]=mp.get(nums[i]).get(1);;
                        return res;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[]{1,2,5,4,5}, 9)).forEach((n)->{System.out.print(n+" ");});
    }
}
