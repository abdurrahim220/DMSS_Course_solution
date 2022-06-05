package London;

import java.io.*;
import java.util.StringTokenizer;

public class FileAnalysis2 {
    public static void main(String[] args) {
        String filecon = "";
        int i;
        int sum = 0;
        try {
            FileReader fr = new FileReader("numbers.txt");

            while ((i = fr.read()) != -1)
                filecon += (char) i;
            fr.close();
        } catch (Exception err) {
            System.out.println("File not found ..." + err);
        }
        StringTokenizer st = new StringTokenizer(filecon, ",");
        while (st.hasMoreTokens()) {
            int n =0;
            for(i = 0; i <= n; i++){
                if((i%2) == 1){
                    sum += i;
                }
                }
            }
            try {
                FileWriter fw = new FileWriter("result.txt");
                fw.write(" sum of odd  : " + sum);
                fw.close();
            } catch (Exception e) {
                System.out.print("Error : " + e);
            }
        }
    }
