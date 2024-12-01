package org.cicd.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<String> readInput() throws IOException {
        List<String> res = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
            String line ;
            while((line = br.readLine())!= null){
                res.add(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return res;
    }
}
