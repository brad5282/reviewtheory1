
package part2;

import java.text.NumberFormat;


public class PopulationGrowth {

    
    public static void main(String[] args) {
        /*
        Barrie's pop in 202 is 160000
        grows by 6% every 10 years
        how much will it be by 2120?
        */
        int pop = 160000;
        int growth;
        NumberFormat nf = NumberFormat.getNumberInstance();
        
        //print column headings 
        System.out.format("%5s", "YEAR");
        System.out.format("%20s", "POPULATION");
        System.out.format("%15s", "GROWTH");
        System.out.format("%20s\n", "NEW POPULATION");
        
        System.out.format("%5s", "======");
        System.out.format("%20s", "============");
        System.out.format("%15s", "========");
        System.out.format("%20s\n", "================");
        
        for (int year = 2020; year <= 2120; year+=10) {
            System.out.format("%5d", year);
            System.out.format("%20s",nf.format(pop));
            growth = (int)(.06*pop);//have to cast to intger
            System.out.format("%15s",nf.format(growth));
            pop += growth;
            System.out.format("%20s\n",nf.format(pop));
            
        }
    }
    
}
