package london;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

    public class London {
        private int sum = 0;

        private int item = 0;
        private int odd = 0;

        public void getDataFromFileSecond()

        {
            File file = new File("dondata.txt");

            if (file.exists()) {
                try {
                    Scanner sc = new Scanner(file);
                    while (sc.hasNextLine()) {
                        String data = sc.nextLine();
                        getSum(data);
                    }
                    setDataIntoFile(String.valueOf(this.odd));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("File Not Found!");
            }
        }

        public int getSum(String data) {
            String temp[] = null;
            for (int i = 0; i < data.length(); i++) {
                temp = data.split(";");
            }
            for (int i = 0; i < temp.length; i++) {
                int num = Integer.parseInt(temp[i]);
                if (num % 2 != 0) {
                    this.sum += num;
                }
            }
            return sum;
        }

        public void setDataIntoFile(String data) {
            File file = new File("donout.txt");


            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                try {
                    FileWriter fileWriter = new FileWriter("donout.txt", true);
                    fileWriter.write(data);
                    fileWriter.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        public static void main(String[] args) {

            London nc = new London();
            nc.getDataFromFileSecond();

        }
    }


    
