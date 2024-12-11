public class HealthRecord {
    private int height;
    private static final int MIN_PERMITTED_HEIGHT = 50;
    private static final int MAX_PERMITTED_HEIGHT = 175;
    private static final int DEFAULT_HEIGHT = 100;
    private static int tallestHeight = 50 ;
    private static int shortestHeight = 175 ;
    private static int counter = 0;
    private static double averageHeight;

    public HealthRecord(int height){

        setHeight(height);

    }

    public void setHeight(int height) {
        if (height > MIN_PERMITTED_HEIGHT && height < MAX_PERMITTED_HEIGHT){
            this.height = height;

    }
        else
            this.height = DEFAULT_HEIGHT ;

        counter++;
        averageHeight = (averageHeight*(counter-1) + this.height)/counter;
        if ( this.height > tallestHeight )
            tallestHeight = this.height ;
        if ( this.height < shortestHeight )
            shortestHeight = this.height;

    }
    public int getHeight() {
        return this.height;
    }

    public static int getTallestHeight() {
        return tallestHeight;
    }
    public static int getShortestHeight(){
        return shortestHeight;
    }
    public static double getAverageHeight(){

        return averageHeight;

    }
    public void displayDetails() {
        System.out.println("Height (cm): " + getHeight());
    }
    public static void displayClassDetails() {
        System.out.println("The tallest height (cm): " + getTallestHeight());
        System.out.println("The shortest height (cm): " + getShortestHeight());
        System.out.println("AverangeHeight : " + getAverageHeight());
    }

}
