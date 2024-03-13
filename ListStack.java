// import java.util.*;

// public class ListStack<E> implements StackInt<E> {
    
//     private List<E> theData;

//     public ListStack() {
//         theData = new ArrayList<>();
//     }

//     @Override
//     public E push(E obj) {
//         theData.add(obj);
//         return obj;
//     }

//     @Override
//     public E peek() {
//         if (isEmpty()) {
//             throw new NoSuchElementException();
//         }
//         return theData.get(theData.size() - 1);
//     }

//     @Override
//     public E pop() {
//         if (isEmpty()) {
//             throw new NoSuchElementException();
//         }
//         return theData.remove(theData.size() - 1);
//     }

//     public boolean isEmpty() {
//         return theData.isEmpty();
//     }
    

// }

// interface StackInt<E> {
//     E push(E obj);
//     E peek();
//     E pop();
//     boolean isEmpty();

    
// }
// public static void main(String[] args) {
//     ListStack<String> mystackarray = new ListStack<String>();
//     mystackarray.push("A");
//     mystackarray.push("B");
//     mystackarray.push("C");
//     mystackarray.pop();
//     mystackarray.push("D");
//     mystackarray.push("E");
//     mystackarray.pop();
//     System.out.println(mystackarray.toString());
// }
import java.util.*;

public class ListStack<E> implements StackInt<E> {
    
    private List<E> theData;

    public ListStack() {
        theData = new ArrayList<>();
    }

    @Override
    public E push(E obj) {
        theData.add(obj);
        return obj;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return theData.get(theData.size() - 1);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return theData.remove(theData.size() - 1);
    }

    public boolean isEmpty() {
        return theData.isEmpty();
    }
    public String toString(){
        return theData.toString();
    }
    
    public static void main(String[] args) {
        ListStack<String> mystackarray = new ListStack<String>();
        mystackarray.push("A");
        mystackarray.push("B");
        mystackarray.push("C");
        mystackarray.pop();
        mystackarray.push("D");
        mystackarray.push("E");
        mystackarray.pop();
        System.out.println(mystackarray.toString());
    }
}

interface StackInt<E> {
    E push(E obj);
    E peek();
    E pop();
    boolean isEmpty();
}


