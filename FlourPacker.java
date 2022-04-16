public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int remBigCount = goal % 5;
        int newGoal = (bigCount * 5) + smallCount;

        if(newGoal >= goal) {
            return remBigCount <= smallCount;
        }
        return false;
    }
}
