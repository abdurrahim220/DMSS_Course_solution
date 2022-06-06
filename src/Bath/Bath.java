package Bath;


import java.io.File;

import java.util.Scanner;

public class Bath {
    public void find_all_dates(){
        File file = new File("bathtext.txt");

        if (file.exists()) {
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String data = sc.nextLine();
                    this.date_continer(data, ' ');
                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("File Not Found!");
        }
    }

    public void date_continer(String data, Character separator) {
        String temp[] = null;
        for (int i = 0; i < data.length(); i++) {
            temp = data.split(String.valueOf(separator));
        }

        String format = "";
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].contains("/") && (temp[i].length() == 8 || temp[i].length() == 10)) {
               System.out.println(temp[i]);
                format += temp[i] + "\n";
            }
        }

    }
    public void setDataIntoFile(String data){
        setDataIntoFile("format");
    }

    public static void main(String[] args) {
        Bath nc = new Bath();
        nc.find_all_dates();
    }
}
