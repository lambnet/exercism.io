class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        // convert numberToCheck to string and get each char (it's in ASCII) and then map them to get the numeric value and convert stream to array
        int[] arr = String.valueOf(numberToCheck).chars().map(Character::getNumericValue).toArray();

        // need to cast it to int since Math.pow return double
        int sum = 0;
        for(int i=0;i<arr.length;i++){
           sum = sum + (int)Math.pow(arr[i], arr.length);
        }

        return (numberToCheck == sum) ? true : false;
    }

}
