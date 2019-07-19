package com.streams.practise.StreamsDemo.StreamBuilder;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilder {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4), arrayOfStream = Stream.of(new Integer[] { 1, 2, 3, 4 });

		// Stream.of(val1, val2, val3….)
		stream.forEach(p -> System.out.println(p));

		// 2.2. Stream.of(arrayOfElements)
		arrayOfStream.forEach(p -> System.out.println(p));

		// 2.3. List.stream()

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> st = list.stream();

		st.forEach(p -> System.out.println(p));

		// Stream.generate() or Stream.iterate()

		Stream<Date> stream4 = Stream.generate(() -> {
			return new Date(0);
		});

//		stream4.forEach(p -> System.out.println(p));

		// 2.5. String chars or String tokens

		IntStream str = "123456_abcdef".chars();
		str.forEach(p -> System.out.println(p));

		// or

		Stream<String> st5 = Stream.of("A$B$C$".split("\\$"));
		st5.forEach(p -> System.out.println(p));

//		3. Convert streams to collections

//		3.1. Convert Stream to List – Stream.collect( Collectors.toList() )

		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			l.add(i);
		}

		Stream<Integer> str31 = l.stream();
		List<Integer> evenNumber = str31.filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(evenNumber);

//		3.2. Convert Stream to array – Stream.toArray( EntryType[]::new )

		List<Integer> list32 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list32.add(i);
		}

		Stream<Integer> stream32 = list32.parallelStream();

		Integer[] evenNum = stream32.filter(i -> i % 2 == 0).toArray(Integer[]::new);

		System.out.println(evenNum.toString());

//		4. Core stream operations

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

//		4.1. Intermediate operations
//		Intermediate operations return the stream 
//		itself so you can chain multiple method calls in a row. Let’s learn important ones.

//		4.1.1. Stream.filter()

		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

//		4.1.2. Stream.map()

		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

//		4.1.2. Stream.sorted()

		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

//		4.2. Terminal operations
//		Terminal operations return a result of a certain type instead of again a Stream.

//		4.2.1. Stream.forEach()

		memberNames.forEach(System.out::println);

//		4.2.2. Stream.collect()
//		collect() method used to receive elements from a steam and store them in a collection and mentioned in parameter function.

		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.print(memNamesInUppercase);

//		4.2.3. Stream.match()

//		Various matching operations can be used to check whether a certain predicate matches the stream. All of those operations are terminal and return a boolean result.

		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

//		4.2.4. Stream.count()
//		Count is a terminal operation returning the number of elements in the stream as a long.

		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();

		System.out.println(totalMatched);

//		4.2.5. Stream.reduce()

//		This terminal operation performs a reduction on the elements of the stream with the given function. The result is an Optional holding the reduced value.

		Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);

//		5. Stream short-circuit operations
//		Though, stream operations are performed on all elements inside a collection satisfying a predicate, It is often desired to break the operation whenever a matching element is encountered during iteration. In external iteration, you will do with if-else block. In internal iteration, there are certain methods you can use for this purpose. Let’s see example of two such methods:

//		5.1. Stream.anyMatch(

		System.out.println(memberNames);

		boolean matched = memberNames.stream().anyMatch((s) -> s.startsWith("A"));

		System.out.println(matched);

//5.2. Stream.findFirst()

//		It will return first element from stream and then will not process any more element.
		String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();

		System.out.println(firstMatchedName);

//		6. Parallelism in Java Steam

//		With the Fork/Join framework added in Java SE 7, we have efficient machinery for implementing parallel operations in our applications. But implementing this framework is itself a complex task; and if not done right; is a source of complex multi-threading bugs having potential to crash the application. With the introduction of internal iteration, we got the possibility of operations to be done in parallel.
//
//				To enable parallelism, all you have to do is to create a parallel stream, instead of sequential stream. And to surprise you, this is really very easy. In any of above listed stream examples, anytime you want to particular job using multiple threads in parallel cores, all you have to call method parallelStream() method instead of stream() method.

		List<Integer> li6 = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			li6.add(i);
		}
		// Here creating a parallel stream
		Stream<Integer> stream6 = li6.parallelStream();
		Integer[] evenNumbersArr = stream6.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.print(Arrays.asList(evenNumbersArr));

//        Intermediate Operations

//        Java Stream filter() example
//        Stream.filter(Predicate condition)
//        This is a intermediate operation.
//        Returns a stream consisting of the elements of this stream that match the given predicate.
//        The filter() argument shall be stateless predicate to apply to each element to determine if it should be included.
//        Predicate is a functional interface. So, we can also pass lambda expression also.
//        It returns a new stream so we can use other operations applicable to any stream.

//        3.1. Find all even numbers – Lambda expression

		List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		list4.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

//		3.2. Find all even numbers – Predicate class

		List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Predicate<Integer> condition = new Predicate<Integer>() {
			@Override
			public boolean test(Integer n) {
				if (n % 2 == 0) {
					return true;
				}
				return false;
			}
		};

		list5.stream().filter(condition).forEach(System.out::println);

//		3.3. Filter even numbers and collect into new list

		List<Integer> evenNumbers = list5.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		System.out.println(evenNumbers);

		// 3.4. Filter even numbers and get squares

		List<Integer> evenNumbersr = list5.stream().filter(n -> n % 2 == 0).map(n -> n * n)
				.collect(Collectors.toList());

		System.out.println(evenNumbersr);

//		2 Java Stream map() example

//		Learn to use Stream map() method which produces one output value of a different type 'X' for each input value of type 'Y'.
//		IntStream mapToInt(ToIntFunction<? super T> mapper)
//		LongStream mapToLong(ToLongFunction<? super T> mapper)
//		DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper)

//		2.1. Stream of strings to Stream of Integers

		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");

		List<Integer> listOfIntegers = listOfStrings.stream().map(Integer::valueOf).collect(Collectors.toList());

		System.out.println(listOfIntegers);

	}

}
