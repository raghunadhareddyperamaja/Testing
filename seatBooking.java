package arrays.strings;

public class seatBooking {
    public static void main(String[] args) {
        int count = 0;
        int cinema[][] = {{0,0,0,0,0},{0,1,0,1,0},{1,0,1,0,1},{1,1,0,1,1},{1,1,1,1,1}};
        for (int i = 0; i< cinema.length; i++){
            for (int j = 0; j< cinema.length; j++){
                System.out.print(cinema[i][j]+" ");
                if (cinema[i][j]==0){
                 count++;
                }
            }
            System.out.println();
        }
        System.out.println("number of remaining seats: "+count);
    }
}
