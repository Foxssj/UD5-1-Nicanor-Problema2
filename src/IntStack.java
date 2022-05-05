public class IntStack {
     private static final int CAPACIDAD_INICIAL = 5;
     private static final int TOP = 0;

     private Collection collection = new Collection(CAPACIDAD_INICIAL);

     public void push(int element) {
          collection.insert(element, 0);
     }

     public int pop(){
          return (int) collection.delete(TOP);
     }

}
