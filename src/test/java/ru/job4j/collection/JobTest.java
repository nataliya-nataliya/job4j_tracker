package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenCompareByNameDesc() {
        Comparator<Job> cmpNameDesc =
                new JobDescByName();
        int rsl = cmpNameDesc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
                );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareByPriorityDesc() {
        Comparator<Job> cmpPriorityDesc =
                new JobDescByPriority();
        int rsl = cmpPriorityDesc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareByPriorityAscen() {
        Comparator<Job> cmpPriorityAscen =
                new JobAscenByPriority();
        int rsl = cmpPriorityAscen.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareByNameAscen() {
        Comparator<Job> cmpNameAscen =
                new JobAscenByName();
        int rsl = cmpNameAscen.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareByNameAndPriority() {
        Comparator<Job> cmpByNamePriority =
                new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpByNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareByPriorityAndName() {
        Comparator<Job> cmpByPriorityName =
                new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpByPriorityName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareToPriorityAndName() {
        Comparator<Job> cmpToPriorityName =
                new JobAscenByPriority().thenComparing(new JobAscenByPriority());
        int rsl = cmpToPriorityName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareToNameAndPriority() {
        Comparator<Job> cmpToNamePriority =
                new JobAscenByName().thenComparing(new JobAscenByPriority());
        int rsl = cmpToNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareToNameAndByPriority() {
        Comparator<Job> cmpToNameByPriority =
                new JobAscenByName().thenComparing(new JobDescByPriority());
        int rsl = cmpToNameByPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareByNameAndToPriority() {
        Comparator<Job> cmpByNameToPriority =
                new JobDescByName().thenComparing(new JobAscenByPriority());
        int rsl = cmpByNameToPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareByPriorityAndToName() {
        Comparator<Job> cmpByPriorityToName =
                new JobDescByPriority().thenComparing(new JobAscenByName());
        int rsl = cmpByPriorityToName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareToPriorityAndByName() {
        Comparator<Job> cmpToPriorityByName =
                new JobAscenByPriority().thenComparing(new JobDescByName());
        int rsl = cmpToPriorityByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}