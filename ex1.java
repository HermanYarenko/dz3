public class ex1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);    
        numbers.add(5);
        numbers.add(6);

        Iterarot<Integer> iterarot= numbers.iterarot();
        while (iterarot.hasNext()){
            Integer number=iterarot.next();
            if (number%2==0){
                iterarot.remove();
            }
        }
        System.out.println(numbers);       
       }
}