package RomanNums;

public class Solution {
    public int romanToInt(String s) {
        boolean skip = false;
        int num = 0;
        char array[] = s.toCharArray();
        if(s.length() == 1){
            if(array[0] == 'M') num +=1000;
            if(array[0] == 'D') num+= 500;
            if(array[0] == 'C') num+=100;
            if(array[0] == 'L') num+=50;
            if(array[0] == 'X') num+=10;
            if(array[0] == 'V') num+=5;
            if(array[0] == 'I') num+=1;
            return num;
        }

        else for(int i = 0; i<array.length; i++){
            if(skip){
                skip = false;
                continue;
            }
            if(i+1<=array.length-1){
                if(array[i] == 'M') num +=1000;
                if(array[i] == 'C' && array[i+1] == 'M') {num+=900; skip = true;}
                else if(array[i] == 'C' && array[i+1] == 'D') {num+=400;skip = true;}
                else if(array[i] == 'C') num+=100;
                else if(array[i] == 'D') num+=500;
                if(array[i] == 'X' && array[i+1] == 'C') {num+=90;skip = true;}
                else if(array[i] == 'X' && array[i+1] == 'L') {num+=40;skip = true;}
                else if(array[i] == 'X') num +=10;
                else if(array[i] == 'L') num +=50;
                if(array[i] == 'I' && array[i+1] == 'X') {num+=9;skip = true;}
                else if(array[i] == 'I' && array[i+1] == 'V') {num+=4;skip = true;}
                else if(array[i] == 'I') num +=1;
                else if(array[i] == 'V') num +=5;
            }
            else{
                if(array[i] == 'M') num +=1000;
                else if(array[i] == 'C') num+=100;
                else if(array[i] == 'D') num+=500;
                else if(array[i] == 'X') num +=10;
                else if(array[i] == 'L') num +=50;
                else if(array[i] == 'I') num +=1;
                else if(array[i] == 'V') num +=5;
            }


        }
        return num;
    }
}
