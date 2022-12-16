package pairmatching.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CrewFileReader {

    public List<String> readBackendCrew() {
        ArrayList<String> backendCrews = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/backend-crew.md"));
            while (true) {
                String crew = br.readLine();
                if (crew == null) {
                    break;
                }
                backendCrews.add(crew);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return backendCrews;
    }

    public List<String> readFrontendCrew() {
        ArrayList<String> frontendCrews = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/frontend-crew.md"));
            while (true) {
                String crew = br.readLine();
                if (crew == null) {
                    break;
                }
                frontendCrews.add(crew);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return frontendCrews;
    }
}
