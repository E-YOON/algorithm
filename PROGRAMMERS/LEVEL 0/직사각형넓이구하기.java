public class 직사각형넓이구하기 {
    public int solution(int[][] dots) {
        int minX = 256;
        int maxX = -256;
        int minY = 256; 
        int maxY = -256;
        for(int i=0; i<dots.length; i++) {
            if(dots[i][0] < minX) {
                minX = dots[i][0];
            } else if(maxX < dots[i][0]) {
                maxX = dots[i][0];
            }
            
            if(dots[i][1] < minY) {
                minY = dots[i][1];
            } else if(maxY < dots[i][1]) {
                maxY = dots[i][1];
            }
        }
        System.out.println(maxX);
        System.out.println(minX);
        System.out.println(maxY);
        System.out.println(minY);
        int width = maxX - minX;
        int length = maxY - minY;
        return width * length;
    }
}
