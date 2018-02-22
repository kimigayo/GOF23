package behavior.iterator;

public interface MyIterator {
    boolean hasNext();
    boolean isFirst();
    boolean isLast();
    Object getCurrentObj();
    void next();
}
