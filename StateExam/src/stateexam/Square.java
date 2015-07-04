package stateexam;

public class Square {
    public static void FindSquare(int size, float[] x, float[] y) {
        float minX = Float.MAX_VALUE;
        float minY = Float.MAX_VALUE;
        
        float maxX = Float.MIN_VALUE;
        float maxY = Float.MIN_VALUE;
        
        for(int i =0;i<size;i++) {
            if(x[i] < minX) {
                minX = x[i];
            }
            if(y[i] < minY) {
                minY = y[i];
            }
            if(x[i] > maxX) {
                maxX = x[i];
            }
            if(y[i] > maxY) {
                maxY = y[i];
            }
        }
        
        float sideSize = Math.max(maxX - minX, maxY - minY);
        
        float centerX = minX + sideSize/2;
        float centerY = minY + sideSize/2;
        
        System.out.println("center of square is (" + centerX + ", " + centerY + ")");
        System.out.println("size of square is " + sideSize);
    }
}
