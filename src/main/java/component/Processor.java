package component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class Processor {

    private final ProcessorProducent producent;
    private final String model;

    @Override
    public String toString() {
        String producent = Arrays.stream(getProducent().toString().toLowerCase().split("_"))
                .map(StringUtils::capitalize)
                .collect(Collectors.joining(" "));
        return producent + " " + getModel();
    }

}
