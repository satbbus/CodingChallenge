package hackerrank;

@FunctionalInterface
public interface FunctionalInterfaceTest {

    void runTest();
    default void runTest2(){};
}
