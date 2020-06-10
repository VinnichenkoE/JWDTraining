package test.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.service.LineService;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class LineServiceTest {

    @Test
    public void testLineToList() {
        LineService lineService = new LineService();
        List<String> actual = lineService.lineToList("  25 65    48  aaa   ");
        List<String> expected = new ArrayList<String>(){{
            add("25");
            add("65");
            add("48");
            add("aaa");
        }};
        assertEquals(actual,expected);
    }
}