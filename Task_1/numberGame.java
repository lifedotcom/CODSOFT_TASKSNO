import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class numberGame {

    int randomNumber;
    int attempts;
    int score = 0;
    int maxAttempts = 7;

    Random random = new Random();

    public void window() {

        Frame frame = new Frame("Number Game");

        frame.setSize(450, 550);
        frame.setLayout(null);
        frame.setBackground(new Color(240, 244, 248));

        // ================= TITLE =================

        Label numberGame = new Label("NUMBER GAME", Label.CENTER);
        numberGame.setBounds(75, 30, 300, 50);
        numberGame.setFont(new Font("Arial", Font.BOLD, 28));
        numberGame.setForeground(new Color(40, 70, 120));
        frame.add(numberGame);


        // ================= INSTRUCTION =================

        Label show = new Label(
            "Guess a number between 1 and 100",
            Label.CENTER
        );

        show.setBounds(75, 85, 300, 30);
        show.setFont(new Font("Arial", Font.PLAIN, 16));
        show.setForeground(new Color(70, 70, 70));
        frame.add(show);


        // ================= INPUT =================

        TextField input = new TextField();
        input.setBounds(110, 125, 230, 45);
        input.setFont(new Font("Arial", Font.PLAIN, 18));
        input.setBackground(Color.WHITE);
        input.setForeground(Color.BLACK);
        frame.add(input);


        // ================= GUESS BUTTON =================

        Button guess = new Button("GUESS");

        guess.setBounds(155, 185, 140, 45);
        guess.setFont(new Font("Arial", Font.BOLD, 16));
        guess.setBackground(new Color(52, 152, 219));
        guess.setForeground(Color.WHITE);

        frame.add(guess);


        // ================= RESULT =================

        Label result = new Label("", Label.CENTER);

        result.setBounds(50, 245, 350, 35);
        result.setFont(new Font("Arial", Font.BOLD, 16));

        frame.add(result);


        // ================= ATTEMPTS =================

        Label attemptsLabel = new Label(
            "Attempts: 0 / " + maxAttempts,
            Label.CENTER
        );

        attemptsLabel.setBounds(60, 295, 150, 35);
        attemptsLabel.setFont(new Font("Arial", Font.BOLD, 14));
        attemptsLabel.setBackground(Color.WHITE);
        attemptsLabel.setForeground(new Color(70, 70, 70));

        frame.add(attemptsLabel);


        // ================= SCORE =================

        Label scoreLabel = new Label(
            "Score: 0",
            Label.CENTER
        );

        scoreLabel.setBounds(240, 295, 150, 35);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 14));
        scoreLabel.setBackground(Color.WHITE);
        scoreLabel.setForeground(new Color(70, 70, 70));

        frame.add(scoreLabel);


        // ================= NEW GAME =================

        Button newGame = new Button("NEW GAME");

        newGame.setBounds(145, 360, 160, 45);
        newGame.setFont(new Font("Arial", Font.BOLD, 15));
        newGame.setBackground(new Color(46, 204, 113));
        newGame.setForeground(Color.WHITE);

        frame.add(newGame);


        // ================= FOOTER =================

        Label footer = new Label(
            "Can you guess the number?",
            Label.CENTER
        );

        footer.setBounds(75, 430, 300, 30);
        footer.setFont(new Font("Arial", Font.ITALIC, 13));
        footer.setForeground(new Color(120, 120, 120));

        frame.add(footer);


        // ================= RANDOM NUMBER =================

        randomNumber = random.nextInt(100) + 1;
        attempts = 0;


        // ================= GUESS BUTTON ACTION =================

        guess.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String value = input.getText();

                try {

                    int userGuess = Integer.parseInt(value);


                    // Check range

                    if (userGuess < 1 || userGuess > 100) {

                        result.setText("Enter a number between 1 and 100");
                        result.setForeground(Color.RED);

                        return;
                    }


                    // Increase attempts

                    attempts++;

                    attemptsLabel.setText(
                        "Attempts: " + attempts + " / " + maxAttempts
                    );


                    // Compare number

                    if (userGuess == randomNumber) {

                        result.setText("Correct! You Won!");

                        result.setForeground(new Color(39, 174, 96));

                        score+=maxAttempts - attempts + 1;

                        scoreLabel.setText(
                            "Score: " + score
                        );

                        guess.setEnabled(false);

                    }

                    else if (userGuess > randomNumber) {

                        result.setText("Too High! Try Again");

                        result.setForeground(new Color(230, 126, 34));

                    }

                    else {

                        result.setText("Too Low! Try Again");

                        result.setForeground(new Color(52, 73, 94));
                    }


                    // Maximum attempts

                    if (attempts >= maxAttempts &&
                        userGuess != randomNumber) {

                        result.setText(
                            "Game Over! Number: " + randomNumber
                        );

                        result.setForeground(Color.RED);

                        guess.setEnabled(false);
                    }


                    input.setText("");

                }

                catch (NumberFormatException ex) {

                    result.setText(
                        "Please enter a valid number"
                    );

                    result.setForeground(Color.RED);
                }
            }
        });


        // ================= NEW GAME ACTION =================

        newGame.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                randomNumber = random.nextInt(100) + 1;

                attempts = 0;

                attemptsLabel.setText(
                    "Attempts: 0 / " + maxAttempts
                );

                result.setText("");

                input.setText("");

                guess.setEnabled(true);

                input.requestFocus();
            }
        });


        // ================= CLOSE WINDOW =================

        frame.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {

                frame.dispose();
            }
        });


        // ================= SHOW WINDOW =================

        frame.setVisible(true);
    }


    public static void main(String[] args) {

        new numberGame().window();
    }
}