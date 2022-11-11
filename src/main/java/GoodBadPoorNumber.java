public class GoodBadPoorNumber {
    public String goodBadPoorNumber(int M) {

        if(M != 0) {
            if (M % 7 == 0 && M % 9 == 0) {
                return "Good Number";
            } else if (M % 9 == 0) {
                return "Bad Number";
            } else if (M % 11 == 0){
                return "Poor Number";
            } else {
                return "-1";
            }
        } else {
            return "Zero is always multiple of every number";
        }

    }

}
