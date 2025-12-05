
class BirdWatcher {
    private int[] lastWeek = {0,2,5,3,7,8,4};
    private int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int bird : birdsPerDay){
            if (bird == 0){
                return true;
            }
        }
                return false;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int count = 0;
        int limit = 0;
        if (numberOfDays > birdsPerDay.length){
            limit = birdsPerDay.length;
        }else{
            limit = numberOfDays;
        };
        for(int i = 0; i<limit; i++){            
            count += birdsPerDay[i];
        }
            return count;
        }


    public int getBusyDays() {

        int bussy = 0;
        for(int bird : birdsPerDay){
            if(bird >= 5){
                bussy++;
            }
        }
            return bussy;
    }
}
