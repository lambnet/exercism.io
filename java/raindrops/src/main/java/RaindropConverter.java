class RaindropConverter {
    // this solution is ugly, need to find alternative

    String convert(int number) {
        String num = Integer.toString(number);
        //divided by all three number
        if(number % 105 == 0) return "PlingPlangPlong";
        if(number % 15 == 0) return "PlingPlang";
        if(number % 35 == 0) return "PlangPlong";
        if(number % 21 == 0) return "PlingPlong";

        if(number % 3==0 && number % 5 != 0  && number % 7 !=0){
            return "Pling";
        }
        if(number % 5==0 && number % 3 != 0 && number % 7 !=0){
            return "Plang";
        }
        if(number % 7==0 && number % 3 != 0  && number % 5 !=0){
            return "Plong";
        }
        return num;
    }

}
