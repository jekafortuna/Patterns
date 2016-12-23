package patterns.iterator_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Tasks implements Container {

    private String [] tasks = {"Build a house", "Born a son", "Plant a tree"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator{

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < tasks.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
