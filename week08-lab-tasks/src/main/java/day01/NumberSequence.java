package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

    private List<Integer> nums = new ArrayList<>();

    public NumberSequence(List<Integer> nums) {
        this.nums = nums;
    }

    public NumberSequence(int count, int min, int max) {
        Random random = new Random();
        for (int i = 0; i<count; i++){
            nums.add(random.nextInt(min,max+1));
        }
    }

    public List<Integer> closeToAverage(int value){
        List<Integer> result = new ArrayList<>();
        double avg = calculateAverage();

        for (int i: nums){
            if(Math.abs(i - avg) <= value){
                result.add(i);
            }
        }
        return result;
    }

    private double calculateAverage(){
        double sum = 0;
        for(Integer i: nums){
            sum+=i;
        }
        return sum/nums.size();
    }
}
