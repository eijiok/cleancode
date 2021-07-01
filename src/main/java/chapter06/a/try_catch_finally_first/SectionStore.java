package chapter06.a.try_catch_finally_first;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class SectionStore {
    public List<RecordedGrip> retrieveSection(String sectionName) {
        try {
            FileInputStream stream = new FileInputStream(sectionName);
        } catch ( java.io.FileNotFoundException e) {
            throw new StorageException("retrieval error", e);
        }
        return new ArrayList<RecordedGrip>();
    }
}
