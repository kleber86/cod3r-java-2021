package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<Object> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Ruby ", "Elixir \n" );
		langs.forEach(print);
		
		String[] langs2 = {"HTML ", "CSS ", "Javascript \n" };
		Stream.of(langs2).forEach(print);
		
		Arrays.stream(langs2).forEach(print);
		Arrays.stream(langs2, 1, 3).forEach(print);
		
		List<String> langs3 = Arrays.asList("C ", "C++ ", "C# \n");
		langs3.stream().forEach(print);
		langs3.parallelStream().forEach(print);
		
		//Stream.generate(() -> "a").forEach(print);
		//Stream.iterate(0, n -> n + 1).forEach(println);
	}

}
