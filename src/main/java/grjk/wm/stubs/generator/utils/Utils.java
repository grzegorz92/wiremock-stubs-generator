package grjk.wm.stubs.generator.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Utils {

    public static void createNewDirectory(File directory){

        try {
            FileUtils.forceMkdir(directory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mapObjectToJsonFile(String dir, Object stub){

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File(dir), stub);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
