
public class RemoveElement {
public static void main(String[] args) {
    int []nums = {1,2,3,4,1,2,3,4};

    System.out.println(removeElement(nums, 2)); 
}

public static byte removeElement(int[] nums, int val) {
    byte count = 0;
    byte newIndex = 0;
    for(byte i = 0; i < nums.length; i++){
        if(nums[i] != val){
            nums[newIndex++] = nums[i];
            count++;
        }
    }

    return count;    
}
    
}