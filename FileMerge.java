import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class FileMerge {
     public static void main(String[] args) {
        String[] files = {
            "C:\\Users\\DELL\\Documents\\PRAKTEK.PBO\\students.csv",
            "C:\\Users\\DELL\\Documents\\PRAKTEK.PBO\\new_students.csv"
        };
        String mergedFile = "C:\\Users\\DELL\\Documents\\PRAKTEK.PBO\\merge_students.csv";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))){
            for (String file : files){
                try (BufferedReader br = new BufferedReader(new FileReader(file))){
                    String line;
                    while ((line = br.readLine()) != null){
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
    
    

