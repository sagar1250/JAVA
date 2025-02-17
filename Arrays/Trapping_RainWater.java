package Arrays;

public class Trapping_RainWater {
    public static int rainWater(int height[]){
       // int n = height.length;
        // first create one auxilary arry or helper array, for left to right 
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //created another aucilary arry for the right to left 
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        //add the logic in the llop for Trapping rain water
        int rainWater = 0;
        for(int i=0;i<height.length;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            rainWater += waterLevel - height[i];
        }
        return rainWater;
    }
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(rainWater(height));
    }
}
