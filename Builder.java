public class Main {
    public static void main(String[] args) {
        Text text = new Text.Builder()
                .setTitile("제목")
                .setItems("항목1", "항목2", "항목3")
                .build();

        System.out.println(text);
    }
}