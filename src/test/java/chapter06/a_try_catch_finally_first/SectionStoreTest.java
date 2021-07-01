package chapter06.a_try_catch_finally_first;

import org.junit.Test;

import static org.junit.Assert.*;

public class SectionStoreTest {

    @Test(expected = StorageException.class)
    public void retrieveSectionShouldThrowOnInvalidFileName() {
        SectionStore sectionStore = new SectionStore();
        sectionStore.retrieveSection("invalid - file");
    }
}
