package hu.helix.WA.WA_1206;

import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        // write your code here
        // FileOutputStream fout =null;
        // FileInputStream fin = null;
       /* FileWriter fileWriter = null;
        try {
            // fout = new FileOutputStream( "/home/java1/Asztal/WA/test.txt");
            //String s = "Hello world!";
            //fout.write(s.getBytes());
            // fin = new FileInputStream("/home/java1/Asztal/WA/test.txt");

            //   int i;
            //  while ((i = fin.read()) != -1){
            //      System.out.println((char)i);
            fileWriter = new FileWriter("/home/java1/Asztal/WA/test.txt");
            fileWriter.write("Alma");


        } catch (FileNotFoundException e) {
            System.err.print(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            // if(fin !=null){

            //     try {
            //       fin.close();
            //   } catch (IOException e1) {
            //      e1.printStackTrace();
        }*/


        //kosztolányis

        FileReader fr = new FileReader("/home/java1/Asztal/WA/kosztolanyi_dezso_hajnali_reszegseg.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter writer = new FileWriter("/home/java1/Asztal/WA/testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);

        try {


            int i;
            while ((i = br.read()) != -1) {
                buffer.write((char) i);
            }

        } catch (FileNotFoundException e) {
            System.err.print(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);

        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }


        //matrix




       try (BufferedReader brmatrix = new BufferedReader(new FileReader("/home/java1/Asztal/WA/matrix.txt"))){
            String line;
            String [][] arr = new String[3][3];

            while ((line = brmatrix.readLine()) != null) {
                System.out.println(line);
                for (int i = 0; i <arr.length; i++) {
                    //ha intet akarok a stringből akkor Integer.parseInt....
                    arr[i] = line.split(" ");
                }


            }


        } catch (FileNotFoundException e) {
            System.err.print(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);

        }


    }

}




