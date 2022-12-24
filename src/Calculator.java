public class Calculator {
    public int bestDigit(int num){
        int d0 = 0, d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, d8 = 0, d9 = 0;
        int max = 0, digit = 0, bestDigit = 0;
        while(num != 0){
            digit = num % 10;
            switch(digit){
                case 0:
                    d0++;
                    if(d0>max){
                        max = d0;
                        bestDigit = 0;
                    }
                    break;
                case 1:
                    d1++;
                    if(d1>max){
                        max = d1;
                        bestDigit = 1;
                    }
                    break;
                case 2:
                    d2++;
                    if(d2>max){
                        max = d2;
                        bestDigit = 2;
                    }
                    break;
                case 3:
                    d3++;
                    if(d3>max){
                        max = d3;
                        bestDigit = 3;
                    }
                    break;
                case 4:
                    d4++;
                    if(d4>max){
                        max = d4;
                        bestDigit = 4;
                    }
                    break;
                case 5:
                    d5++;
                    if(d5>max){
                        max = d5;
                        bestDigit = 5;
                    }
                    break;
                case 6:
                    d6++;
                    if(d6>max){
                        max = d6;
                        bestDigit = 6;
                    }
                    break;
                case 7:
                    d7++;
                    if(d7>max){
                        max = d7;
                        bestDigit = 7;
                    }
                    break;
                case 8:
                    d8++;
                    if(d8>max){
                        max = d8;
                        bestDigit = 8;
                    }
                    break;
                case 9:
                    d9++;
                    if(d9>max){
                        max = d9;
                        bestDigit = 9;
                    }
                    break;
            } 
            num = num / 10;
        }
        return bestDigit;

    }
}
