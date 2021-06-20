
class ReverseString {
    String reverse(String inputString) {
        char[] inputArr = inputString.toCharArray();
        int left = 0;
        int right = inputArr.length-1;
        for(left=0; left<right ; left++, right--){
            char tmp = inputArr[left];
            inputArr[left] = inputArr[right];
            inputArr[right] = tmp;
        }
        return String.valueOf(inputArr);
    }
}
