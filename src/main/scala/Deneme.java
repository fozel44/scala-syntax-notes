
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
       /* 
        // Create two new BigDecimals 
        BigDecimal bd1 =  
               new BigDecimal("124567890.0987654321"); 
        BigDecimal bd2 =  
               new BigDecimal("987654321.123456789"); 
          
        // Addition of two BigDecimals 
        bd1 = bd1.add(bd2); 
        System.out.println("BigDecimal1 = " + bd1); 
  
        // Multiplication of two BigDecimals 
        bd1 = bd1.multiply(bd2); 
        System.out.println("BigDecimal1 = " + bd1); 
  
        // Subtraction of two BigDecimals 
        bd1 = bd1.subtract(bd2); 
        System.out.println("BigDecimal1 = " + bd1); 
  
        // Division of two BigDecimals 
        bd1 = bd1.divide(bd2); 
        System.out.println("BigDecimal1 = " + bd1); 
  
        // BigDecima1 raised to the power of 2 
        bd1 = bd1.pow(2); 
        System.out.println("BigDecimal1 = " + bd1); 
  
        // Negate value of BigDecimal1 
        bd1 = bd1.negate(); 
        System.out.println("BigDecimal1 = " + bd1); 
         */


        List<BigDecimal> n =new ArrayList<>();
        //BigDecimal[] n = new BigDecimal[3];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci BD : ");
        BigDecimal a = scanner.nextBigDecimal();
        System.out.print("İkinci BD : ");
        BigDecimal b = scanner.nextBigDecimal();
        System.out.print("Üçüncü BD : ");
        BigDecimal c =scanner.nextBigDecimal();

        n.set(0,a);
        n.set(1,b);
        n.set(2,c);

        System.out.println(n.toString());
        System.out.println("minimum : " + getMin(n));
        System.out.println("maximum : " + getMax(n));
        System.out.println("ortalama : " + getAvg(n));
    }

    static BigDecimal getMax(List<BigDecimal> n){
        BigDecimal  maxValue = n.get(0);
        for(int i=1; i < n.size(); i++){
            if(maxValue.compareTo(n.get(i)) == -1){
                maxValue= n.get(i);
            }
        }

        return maxValue;
    }

    static BigDecimal getMin(List<BigDecimal> n){
        BigDecimal  minValue = n.get(0);
        for(int i=1; i < n.size(); i++){
            if(minValue.compareTo(n.get(i)) == 1){
                minValue= n.get(i);
            }
        }

        return minValue;
    }
    static BigDecimal getAvg(List<BigDecimal> n){
        BigDecimal ort = new BigDecimal(0);
        BigDecimal sum = new BigDecimal(0);
        //BigDecimal i = new BigDecimal(0);
        for(int i =0; i > n.size(); i++){
            sum.add(n.get(i)) ;
        }
        return sum.divide(BigDecimal.valueOf(n.size()));
    }
}