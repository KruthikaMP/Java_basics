package MN_221047014;

import java.io.*;
import java.util.*;

public class Operations implements ProductStore{

    @Override
    public void addProduct(int product_id, String product_name, int product_price)throws IOException{

        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        FileReader reader = new FileReader("names.properties");
    	Properties p = new Properties();
    	p.load(reader);
        String filepath=p.getProperty("path");
        try (FileWriter f = new FileWriter(filepath, true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter pi = new PrintWriter(b);)
        {
            pi.print(product_id+ " ");
            pi.print(product_name+" ");
            pi.println(product_price);
            System.out.println("Product added to file succesfully");
        }
        catch (IOException i)
        {
            i.printStackTrace();
        }


    }


    @Override
    public void upDate(int product_id, String product_name, int product_price) throws IOException {
    	FileReader reader = new FileReader("names.properties");
    	Properties p = new Properties();
    	p.load(reader);
        String oldLine = "";
        String filepath=p.getProperty("path");
        Scanner sc = new Scanner(new File(filepath));
        StringBuffer buffer = new StringBuffer();
        while (sc.hasNextLine()) {
           String line = sc.nextLine()+System.lineSeparator();
            String[] parts = line.split(" ");
            if(Integer.parseInt(parts[0])==product_id)
            {
                 oldLine=line;
            }
            buffer.append(line);
        }
        String fileContents = buffer.toString();
        System.out.println("old Contents of the file:\n "+fileContents);
        sc.close();

        String newLine = product_id+" "+ product_name+" "+product_price +"\n";
        //Replacing the old line with new line
        fileContents = fileContents.replaceAll(oldLine, newLine);
        //instantiating the FileWriter class
        FileWriter writer = new FileWriter(filepath);
        System.out.println("");
        System.out.println("File content after update: \n"+fileContents);
        writer.append(fileContents);
        writer.flush();

    }
    public void Display() throws IOException {

    	FileReader reader = new FileReader("names.properties");
    	  
        // create properties object
        Properties p = new Properties();
  
        // Add a wrapper around reader object
        p.load(reader);
  
        String filepath=p.getProperty("path");
        
        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        }
           } 

