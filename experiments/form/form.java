import java.awt.*;
import java.awt.event.*;

public class form {
    private Frame frame;
    private Label nameLabel, emailLabel, phoneLabel;
    private TextField nameTextField, emailTextField, phoneTextField;
    private Button submitButton;

    public form() {
        frame = new Frame("Experiment 1.2");
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2));

        nameLabel = new Label("Name: ");
        emailLabel = new Label("Email: ");
        phoneLabel = new Label("Phone No: ");

        nameTextField = new TextField();
        emailTextField = new TextField();
        phoneTextField = new TextField();

        submitButton = new Button("Submit");;

        frame.add(nameLabel);
        frame.add(nameTextField);
        frame.add(emailLabel);
        frame.add(emailTextField);
        frame.add(phoneLabel);
        frame.add(phoneTextField);
        frame.add(new Label()); // Empty label for spacing
        frame.add(submitButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new form();
    }
}
