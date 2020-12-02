package Class9;

public class Architecture {
    // all of my methods in Methods (except Main method)

    int windows = 14;
    String houseName = "My House";
    int doors = 4;
    int rooms = 7;

    public double arrayAvg(int[] arr) {
        double sum = 0;
        for (int i=0 ; i<arr.length ; i++) {
            sum = sum + arr[i];
        }
        int count = arr.length;
        return sum/count;
    }

    // method to give user option to change windows count
    public void changeWindowsCount(int newCount) {
        windows = newCount;
    }

    // method to return windows count to user
    public int getWindowsCount() {
        return windows;
    }

    // method to give user option to change doors count
    public void changeDoorsCount(int newCount) {
        doors = newCount;
    }

    // method to return doors count to user
    public int getDoorsCount() {
        return doors;
    }

    public String getHouseName() {
        return houseName;
    }







}
