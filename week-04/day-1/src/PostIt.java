public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt () {

        PostIt orange = new PostIt();
        orange.backgroundColor = "orange";
        orange.text = "Idea 1";
        orange.textColor = "blue";

        PostIt pink = new PostIt();
        pink.backgroundColor = "pink";
        pink.text = "Awesome";
        pink.textColor = "black";

        PostIt yellow = new PostIt();
        yellow.backgroundColor = "yellow";
        yellow.text = "Superb!";
        yellow.textColor = "green";

    }
}
