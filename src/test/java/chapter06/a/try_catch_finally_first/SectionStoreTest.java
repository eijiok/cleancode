package chapter06.a.try_catch_finally_first;

import org.junit.Test;

public class SectionStoreTest {

    @Test(expected = StorageException.class)
    public void retrieveSectionShouldThrowOnInvalidFileName() {
        SectionStore sectionStore = new SectionStore();
        sectionStore.retrieveSection("invalid - file");
    }
}
