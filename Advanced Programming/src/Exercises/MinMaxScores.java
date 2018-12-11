public class MinMaxScores {
    public static void main(String[] args) {

    }

    public static int getDiversityMeasure(int[] score){
        return getMax(score) - getMin(score);
    }

    public static int getMax(int[] score){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < score.length; i++) {
            if(score[i] > max){
                max = score[i];
            }
        }
        return max;
    }

    public static int getMin(int[] score){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < score.length; i++) {
            if(score[i] < min){
                min = score[i];
            }
        }
        return min;
    }

    public static double getProportionUpper(char[] student){
        int total = student.length;
        int countUpper = 0;
        for (int i = 0; i < student.length; i++) {
            if(student[i] == 'U') {
                countUpper += 1;
            }
        }
        return countUpper/total;
    }


}
