public class PaintJob {
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        int needBucket = 0;
        double area = 0;
        double availArea = 0;

        while (availArea <= area) {
            needBucket++;
            area = width * height;
            availArea = areaPerBucket * (extraBuckets + needBucket);
        }
        return needBucket;
    }
    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int needBucket = 0;
        double area = 0;
        double availArea = 0;

        while (availArea <= area) {
            needBucket++;
            area = width * height;
            availArea = areaPerBucket * needBucket;
        }
        return needBucket;
    }
    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}
