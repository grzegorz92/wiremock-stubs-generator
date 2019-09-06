package grjk.wm.stubs.generator.main;

import grjk.wm.stubs.generator.model.*;
import grjk.wm.stubs.generator.utils.Utils;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

public class StubsGenerator {

    private static final String FILE_DIR = "C:\\STUBY\\test\\mappings";
    private static final String TEST_STUB_DIR = "C:\\STUBY\\test\\mappings\\scenario_";

    private static final String HTTP_METHOD = "GET";
    private static final String STUB_URL = "/test";
    private static final String BODY_MESSAGE = "Hello: ";
    private static final int HTTP_STATUS = 200;


    public static void main(String args[]) {

        System.out.println(LocalDate.now() + " " + LocalTime.now() + ": Process initialized");

        for (int i = 0; i < 500; i++) {

            Request request = Request.builder().method(HTTP_METHOD).url(STUB_URL + i).build();
            JsonBody jsonBody = JsonBody.builder().message(BODY_MESSAGE + i).build();
            Headers headers = Headers.builder().contentType("application/json").build();
            Response response = Response.builder().status(HTTP_STATUS).jsonBody(jsonBody).headers(headers).build();
            Stub stub = Stub.builder().request(request).response(response).build();

            File directory = new File(TEST_STUB_DIR + i);

            if (!directory.exists()) {
                Utils.createNewDirectory(directory);
            }

            Utils.mapObjectToJsonFile(TEST_STUB_DIR + i + "\\stub" + i + ".json", stub);
        }

        System.out.println(LocalDate.now() + " " + LocalTime.now() + ": Process finished");
    }
}
