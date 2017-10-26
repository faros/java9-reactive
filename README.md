# java9-reactive
A project demonstrating reactive support in JDK 9

## Reactive streams
http://www.reactive-streams.org
* Reactive Streams is an initiative to provide a standard for asynchronous stream processing with non-blocking back pressure

### Java 9
* The interfaces in JDK9’s java.util.concurrent.Flow, are 1:1 semantically equivalent to their respective Reactive Streams counterparts
* java.util.concurrent.Flow
** public static interface Publisher<T>
** public static interface Subscriber<T>
** public static interface Subscription
** public static interface Processor<T,R> extends Subscriber<T>, Publisher<R>
*** Component that acts as both a Subscriber and Publisher
* SubmissionPublisher<T> implements Flow.Publisher<T>
** This is the only concrete class provided in the Reactive Streams API
** Implements the Publisher interface
** We can use its submit() method to publish the provided item to each subscriber

## Links
http://www.logicbig.com/tutorials/core-java-tutorial/java-9-changes/understanding-reactive-streams/