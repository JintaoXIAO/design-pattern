package abstractdocument;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class AbstractDocument implements Document{
  
  private final Map<String, Object> properties;
  
  protected AbstractDocument(Map<String, Object> properties) {
    this.properties = properties;
  }
  
  @Override
  public Void put(String key, Object value) {
    properties.put(key, value);
    return null;
  }
  
  @Override
  public Object get(String key) {
    return properties.get(key);
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
    return Stream.ofNullable(get(key))
        .filter(Objects::nonNull)
        .map(e -> (List<Map<String, Object>>) e)
        .findAny()
        .stream()
        .flatMap(Collection::stream)
        .map(constructor);
  }
  
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(getClass().getName()).append('[');
    properties.forEach((k, v) -> builder.append('[').append(k).append(':').append(v).append(']'));
    builder.append(']');
    return builder.toString();
  }
}
