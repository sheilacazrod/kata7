package software.ulpgc.kata7;

import java.util.Map;

public record Chart(String title, String xAxis, String yAxis, Map<String, Integer> data) {
}
