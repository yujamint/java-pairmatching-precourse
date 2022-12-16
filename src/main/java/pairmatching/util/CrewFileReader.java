package pairmatching.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pairmatching.domain.Course;
import pairmatching.domain.Crew;

public class CrewFileReader {

    public List<Crew> readBackendCrew() {
        ArrayList<Crew> backendCrews = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/backend-crew.md"));
            while (true) {
                String name = br.readLine();
                if (name == null) {
                    break;
                }
                backendCrews.add(new Crew(Course.BACKEND, name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return backendCrews;
    }

    public List<Crew> readFrontendCrew() {
        ArrayList<Crew> frontendCrews = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/frontend-crew.md"));
            while (true) {
                String name = br.readLine();
                if (name == null) {
                    break;
                }
                frontendCrews.add(new Crew(Course.FRONTEND, name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return frontendCrews;
    }
}
