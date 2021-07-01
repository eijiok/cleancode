package chapter06.a_try_catch_finally_first;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class SectionStore {
    public List<RecordedGrip> retrieveSection(String sectionName) {
        try {
            FileInputStream stream = new FileInputStream(sectionName);
        } catch (Exception e) {
            throw new StorageException("retrieval error", e);
        }
        return new ArrayList<RecordedGrip>();
    }
}
