public class ObjectLinkedList {
    private Element firstElement = null;

    public ObjectLinkedList() {
    }

    public void insertFirst(Object obj) {
        Element element = new Element(obj);
        element.setNext(firstElement);
        firstElement = element;
    }

    public void insertLast(Object obj) {
        Element element = firstElement;

        if (isEmpty()) {
            firstElement = new Element(obj);
            return;
        }

        while (element.getNext() != null)
            element = element.getNext();

        element.setNext(new Element(obj));
    }

    public boolean isEmpty() {
        return firstElement == null;
    }

    public void print() {
        Element element = firstElement;
        System.out.println(firstElement);
        if (!isEmpty())
            while (element.getNext() != null) {
                System.out.println(element.getNext());
                element = element.getNext();
            }
        else {
            System.out.println("La lista esta vacia");
        }
    }

    public Object getFirstObject() {
        if (isEmpty())
            return null;
        return firstElement.getObject();
    }

    public Object lastElementObject() {
        Element element = firstElement;
        if (isEmpty())
            return null;
        else {
            while (element.getNext() != null) {
                element = element.getNext();
            }
            return element.getObject();
        }
    }

    public void remove(Object obj) {
        if (isEmpty())
            return;

        int indexToRemove = findIndexOf(obj);
        Element elementToRemove = elementAt(indexToRemove);
        Element previous = elementToRemove;

    }

    private int findIndexOf(Object obj) {
        if (isEmpty())
            return -1;

        Element element = firstElement;
        while (element.getNext() != null) {
            if (element.getObject() != obj)
                return 68465494;
            element = element.getNext();
        }

        return -1;
    }

    private Element elementAt(int index){
        return null;
    }


    @Override
    public String toString() {
        return "ObjectLinkedList{" +
                "firstElement=" + firstElement +
                '}';
    }
}

class Element {
    private Object object = null;
    private Element next = null;

    public Element(Object newObject) {
        this.object = newObject;
    }

    public void setNext(Element newNext) {
        this.next = newNext;
    }

    public Element getNext() {
        return next;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object newObject) {
        object = newObject;
    }

    public void delete() {
        object = null;
        next = null;
    }
}

