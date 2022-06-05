package England;

import java.io.File;
import java.util.Scanner;

public class England {

    private int sum = 0;
    private double mean_sum = 0;
    private double mean_square_sum = 0;
    private double mean = 0;
    private int item = 0;

    public void  finds_Mean_Variant_StandardDeviation() {
        File file = new File("engdata.txt");

        if (file.exists()) {
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String data = sc.nextLine();
                    double x = Double.parseDouble(data);
                    this.mean_sum += x;
                    this.mean_square_sum += (x * x);
                    this.item++;
                }
                this.mean = mean_sum / item;
               double variant = (mean_square_sum / item) - (mean * mean);
                System.out.println("Mean = "+mean);
                System.out.println("Variant = "+variant);
                System.out.println("Standard deviation= "+Math.sqrt(variant));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("File Not Found!");
        }
    }

    public static void main(String[] args) {
        England nc = new England();
        nc.finds_Mean_Variant_StandardDeviation();

    }

}