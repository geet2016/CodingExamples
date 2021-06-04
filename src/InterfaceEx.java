import java.util.function.Function;

@FunctionalInterface
public interface InterfaceEx<T,R> {

	R apply(T t);
}
