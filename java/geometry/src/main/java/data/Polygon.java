package data;

import java.util.*;
import java.util.stream.Collectors;

public class Polygon extends Form {

    private List<Point> summits;

    public Polygon(String name, Collection<? extends Point> summits) {
        super(name);
        this.summits = new ArrayList<>(summits);
    }

    public Polygon(String name, Point... summits) {
        this(name, Arrays.asList(summits));
    }


    @Override
    public void translate(double deltaX, double deltaY) {
        summits.forEach(s -> s.translate(deltaX, deltaY));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getName());
        return sb.append("/")
                .append(summits.stream()
                        .map(Form::getName)
                        .collect(Collectors.joining("-"))
                )
                .append('\\')
                .toString();
    }
}
