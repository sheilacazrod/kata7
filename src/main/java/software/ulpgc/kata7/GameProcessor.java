package software.ulpgc.kata7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameProcessor implements Processor{
    @Override
    public Map<String, Integer> process(List<Game> games) {
        Map<String, Integer> result = new HashMap<>();

        for(Game game : games){
            String name = game.getPlatform();
            result.put(name, result.getOrDefault(name,0)+1);
        }
        return  result;
    }
}
