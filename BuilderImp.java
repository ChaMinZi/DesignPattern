public class Text {
    private String string;

    @Override
    public String toString() {
        return string;
    }

    /*
        1. Text class에 영향을 받지 않기 위해서 static을 붙여줘야 한다.
        2. static 메모리 영역에 이미 올라가 있기 때문에
           따로 class를 생성한 경우와 같이 생각하고 사용하여도 된다.
        3. 하지만 사용을 하는 경우에는 Text.Builder와 같이 Text class를 통해서 접근할 수 있다.
    */
    public static class Builder {
        private String title;
        private String content;
        private String[] items;

        public Builder setTitle(String title) {
            this.title = title;
            return this; // 자기 자신을 return
        }

        public Builder setContent(String content) {
            this.content = content;
            return this; // 자기 자신을 return
        }

        // ...은 가변 인자로 여러 개의 값을 받을 수 있다. ( 개수 제한 x )
        public Builder setTitle(String... items) {
            this.items = items;
            return this; // 자기 자신을 return
        }
    }

    public Text build() {
        Text text = new Text();
        
        StringBuilder sb = new StringBuilder();
        sb.append("타이틀 : ").append(title).append("\n");
        sb.append("내용 : ").append(content).append("\n");
        sb.append("항목 : ").append("\n");
        for (String item : items) {
            sb.append(" - ").append(item).append("\n");
        }

        text.string = sb.toString();

        return string;
    }
}