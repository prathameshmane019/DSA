public class RemoveExeptAlphabet {
    // Capitalize first and last character of each word of a string
    public static void main(String[] args) {
        String str = "Take u Forward is Awesome";
        String[] words= str.split(" ");
        StringBuilder sb = new StringBuilder();

       for (int i = 0; i < words.length; i++) {
            if (words[i].length()<=1) {
                words[i]= words[i].toUpperCase();
            }
            else {
                String first = words[i].substring(0, 1).toUpperCase();
                String last = words[i].substring(words[i].length() - 1).toUpperCase();
                String middle = words[i].substring(1, words[i].length() - 1).toLowerCase();
                words[i] = first + middle + last;
            }
       }
        System.out.println(String.join(" ", words));
    }
}
