package no_empty_collection;

import java.util.List;
import java.util.Set;

public class FromDto {
    private Set<String> tests;

    private List<String> test2;

    public List<String> getTest2() {
        return test2;
    }

    public void setTest2(List<String> test2) {
        this.test2 = test2;
    }

    public Set<String> getTests() {
        return tests;
    }

    public void setTests(Set<String> tests) {
        this.tests = tests;
    }
}
