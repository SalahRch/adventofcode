package org.cicd.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<String> readInput() throws IOException {
        List<String> res = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lorem\\Downloads\\09032024182838979401625562 (1)\\chp 2 servlets\\Codes des exemples\\adventofcode\\src\\main\\java\\org\\cicd\\uno\\input.txt"))){
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
