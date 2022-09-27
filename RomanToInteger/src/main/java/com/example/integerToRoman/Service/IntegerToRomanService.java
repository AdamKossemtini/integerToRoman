package com.example.integerToRoman.Service;

//import com.example.integerToRoman.repository.IntegerToRomanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegerToRomanService {

//    @Autowired
//    private IntegerToRomanRepository romanRepository;

    public String convertToRoman(int num){
        String roman ="";
        int []digits = new int[4];
        String []symbol = new String[]{"M","D","C","L","X","V","I"};
        int divisor = 1000;
        for(int i=0; i<4; i++)
        {
            digits[i] = num/divisor;
            num = num%divisor;
            divisor = divisor/10;
        }
        if(digits[0]>0 || digits[0]<4)
        {
            for(int i=0; i<digits[0]; i++)
                roman += "M";
        }
        for(int i=1, j=1; i<digits.length; i++,j+=2)
        {
            roman += getValue(digits[i],symbol[j-1],symbol[j],symbol[j+1]);
        }

        return roman;

    }

    private String getValue(int digit, String sym3, String sym2, String sym1)
    {
        String result = "";
        switch(digit)
        {
            case 0: result = "";
                break;
            case 1: result += sym1;
                break;
            case 2: result += sym1+sym1;
                break;
            case 3: result += sym1+sym1+sym1;
                break;
            case 4: result += sym1+sym2;
                break;
            case 5: result += sym2;
                break;
            case 6: result += sym2+sym1;
                break;
            case 7: result += sym2+sym1+sym1;
                break;
            case 8: result += sym2+sym1+sym1+sym1;
                break;
            case 9: result += sym1+sym3;
                break;
            default: break;
        }
        return result;
    }


}
