public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public int maxArea(int[] height) {
        int result = 0;

        for(int i=0;i < height.length - 1;i++) {
            for(int j=i+1;j < height.length;j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                result = Math.max(result, area);
            }
        }

        return result;
    }

     public int maxAreaq(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, area);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
