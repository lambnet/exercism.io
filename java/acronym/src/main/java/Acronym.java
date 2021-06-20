import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = acronymGen(phrase);
    }

    private String acronymGen(String phrase){
        return Arrays.stream(phrase.trim().replace("_","").split(" "))
                .map(word -> word.split("-"))
                .flatMap(Arrays::stream)
                .map(c -> c.charAt(0))
                .map(c -> c.toString().toUpperCase())
                .collect(Collectors.joining());
    }

    String get() {
        return phrase;
    }

}
