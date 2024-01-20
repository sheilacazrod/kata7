package software.ulpgc.kata7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class CsvFileLoader implements  GameLoader{
    private  final File file;

    public CsvFileLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Game> load() {
        try{
            return load(new FileReader(file));

        }
        catch (Exception e){
            return Collections.emptyList();
        }
    }

    private List<Game> load(FileReader fileReader) {
        return load(new BufferedReader(fileReader));
    }

    private List<Game> load(BufferedReader bufferedReader) {
        return bufferedReader.lines().skip(1).map(this::toGame).collect(Collectors.toList());

    }
    private Game toGame(String s){
        return toGame(s.split(","));

    }

    private Game toGame(String[] split) {
        return new Game(split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9]);
    }
}
