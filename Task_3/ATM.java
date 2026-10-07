import java.awt.*;
import java.awt.event.*;
class ATM extends bankAccount{
    bankAccount account = new bankAccount();
    ATM(bankAccount account){
        this.account = account;
    }
    ATM(){
        account.newBal(10000.00);
    }
    public void window(){
        Frame frame = new Frame("ATM");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setBackground(new Color(120,200,200));
        Label title = new Label("ATM",Label.CENTER);
        title.setBounds(75,30,250,50);
        title.setFont(new Font("Arial",Font.BOLD,28));
        title.setForeground(new Color(40,70,120));
        frame.add(title);
        Button b1 = new Button("WITHDRAW");
        b1.setBounds(100,100,200,50);
        b1.setFont(new Font("Arial",Font.BOLD,20));
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.black);
        frame.add(b1);
        Button b2 = new Button("Deposit");
        b2.setBounds(100,170,200,50);
        b2.setFont(new Font("Arial",Font.BOLD,20));
        b2.setBackground(Color.yellow);
        b2.setForeground(Color.black);
        frame.add(b2);
        Button b3 = new Button("Check Balance");
        b3.setBounds(100,240,200,50);
        b3.setFont(new Font("Arial",Font.BOLD,20));
        b3.setBackground(Color.yellow);
        b3.setForeground(Color.black);
        frame.add(b3);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                withdraw w = new withdraw(account);
                w.withdraw();
                frame.dispose();
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                deposit d = new deposit(account);
                d.deposit();
                frame.dispose();
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                currentBalance cb = new currentBalance(account);
                cb.currentBalance();
                frame.dispose();
            }
        });

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
    }

    
    public static void main(String args[]){
        new ATM().window();
    }
}

class withdraw extends ATM{
    bankAccount account;
    withdraw(bankAccount account){
        this.account = account;
    }
    public void withdraw(){
        Frame withdrawFrame = new Frame("Withdraw");
        withdrawFrame.setSize(450,675);
        withdrawFrame.setLayout(null);
        withdrawFrame.setBackground(new Color(120,200,200));

        //Title

        Label wtitle = new Label("Withdraw",Label.CENTER);
        wtitle.setBounds(150,30,150,50);
        wtitle.setFont(new Font("Arial",Font.BOLD,28));
        wtitle.setForeground(new Color(40,70,120));
        withdrawFrame.add(wtitle);

        //Text Field

        TextField winput = new TextField();
        winput.setBounds(50,100,350,65);
        winput.setFont(new Font("Arial",Font.PLAIN,18));
        winput.setBackground(Color.white);
        winput.setForeground(Color.black);
        withdrawFrame.add(winput);

        //Button

        Button back = new Button("BACK");
        back.setBounds(30,50,90,30);
        back.setFont(new Font("Arial",Font.BOLD,20));
        back.setBackground(Color.RED);
        back.setForeground(Color.black);
        withdrawFrame.add(back);

        Button b1 = new Button("1");
        b1.setBounds(50,190,100,70);
        b1.setFont(new Font("Arial",Font.BOLD,20));
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.black);
        withdrawFrame.add(b1);

        Button b2 = new Button("2");
        b2.setBounds(175,190,100,70);
        b2.setFont(new Font("Arial",Font.BOLD,20));
        b2.setBackground(Color.yellow);
        b2.setForeground(Color.black);
        withdrawFrame.add(b2);

        Button b3 = new Button("3");
        b3.setBounds(300,190,100,70);
        b3.setFont(new Font("Arial",Font.BOLD,20));
        b3.setBackground(Color.yellow);
        b3.setForeground(Color.black);
        withdrawFrame.add(b3);

        Button b4 = new Button("4");
        b4.setBounds(50,285,100,70);
        b4.setFont(new Font("Arial",Font.BOLD,20));
        b4.setBackground(Color.yellow);
        b4.setForeground(Color.black);
        withdrawFrame.add(b4);

        Button b5 = new Button("5");
        b5.setBounds(175,285,100,70);
        b5.setFont(new Font("Arial",Font.BOLD,20));
        b5.setBackground(Color.yellow);
        b5.setForeground(Color.black);
        withdrawFrame.add(b5);

        Button b6 = new Button("6");
        b6.setBounds(300,285,100,70);
        b6.setFont(new Font("Arial",Font.BOLD,20));
        b6.setBackground(Color.yellow);
        b6.setForeground(Color.black);
        withdrawFrame.add(b6);

        Button b7 = new Button("7");
        b7.setBounds(50,380,100,70);
        b7.setFont(new Font("Arial",Font.BOLD,20));
        b7.setBackground(Color.yellow);
        b7.setForeground(Color.black);
        withdrawFrame.add(b7);

        Button b8 = new Button("8");
        b8.setBounds(175,380,100,70);
        b8.setFont(new Font("Arial",Font.BOLD,20));
        b8.setBackground(Color.yellow);
        b8.setForeground(Color.black);
        withdrawFrame.add(b8);

        Button b9 = new Button("9");
        b9.setBounds(300,380,100,70);
        b9.setFont(new Font("Arial",Font.BOLD,20));
        b9.setBackground(Color.yellow);
        b9.setForeground(Color.black);
        withdrawFrame.add(b9);

        Button bd = new Button(".");
        bd.setBounds(50,475,100,70);
        bd.setFont(new Font("Arial",Font.BOLD,30));
        bd.setBackground(Color.yellow);
        bd.setForeground(Color.black);
        withdrawFrame.add(bd);

        Button b0 = new Button("0");
        b0.setBounds(175,475,100,70);
        b0.setFont(new Font("Arial",Font.BOLD,20));
        b0.setBackground(Color.yellow);
        b0.setForeground(Color.black);
        withdrawFrame.add(b0);

        Button bback = new Button("Bckspace");
        bback.setBounds(300,475,100,70);
        bback.setFont(new Font("Arial",Font.BOLD,20));
        bback.setBackground(Color.yellow);
        bback.setForeground(Color.black);
        withdrawFrame.add(bback);

        Button be = new Button("Enter");
        be.setBounds(50,570,350,70);
        be.setFont(new Font("Arial",Font.BOLD,20));
        be.setBackground(Color.yellow);
        be.setForeground(Color.black);
        withdrawFrame.add(be);

        withdrawFrame.setVisible(true);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                winput.setText(winput.getText()+"1");
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                winput.setText(winput.getText()+"2");
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                winput.setText(winput.getText()+"3");
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                winput.setText(winput.getText()+"4");
            }
        });
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                winput.setText(winput.getText()+"5");
            }
        });
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                winput.setText(winput.getText()+"6");
            }
        });
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                winput.setText(winput.getText()+"7");
            }
        });
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                winput.setText(winput.getText()+"8");
            }
        });
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                winput.setText(winput.getText()+"9");
            }
        });
        b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                winput.setText(winput.getText()+"0");
            }
        });
        bd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                winput.setText(winput.getText()+".");
            }
        });
        bback.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String currentText = winput.getText();
                if(currentText.length()>0){
                    winput.setText(currentText.substring(0,currentText.length()-1));
                }
            }
        });
        be.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String cText = winput.getText();
                if(cText.length()>0){
               double amount = Double.parseDouble(winput.getText());
                if(amount<account.getBalance()){
                    double newBalance = account.getBalance() - amount;
                    winput.setText("Withdrawn: "+ amount);
                    account.newBal(newBalance);                    
                }else{
                    winput.setText("Insufficient Balance");
                    winput.setForeground(Color.RED);
                }
            }}
        });

        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               ATM t = new ATM(account);
               t.window();
               withdrawFrame.dispose();
            }
        });

        withdrawFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                withdrawFrame.dispose();
            }
        });
    }
}
class deposit extends ATM{
    bankAccount account;
    deposit(bankAccount account){
        this.account = account;
    }
    public void deposit(){
        Frame depositFrame = new Frame("Deposit");
        depositFrame.setSize(450,665);
        depositFrame.setLayout(null);
        depositFrame.setBackground(new Color(120,200,200));

        //Title

        Label dtitle = new Label("Deposit",Label.CENTER);
        dtitle.setBounds(150,30,150,50);
        dtitle.setFont(new Font("Arial",Font.BOLD,28));
        dtitle.setForeground(new Color(40,70,120));
        depositFrame.add(dtitle);

        //Text Field

        TextField dinput = new TextField();
        dinput.setBounds(50,100,350,65);
        dinput.setFont(new Font("Arial",Font.PLAIN,18));
        dinput.setBackground(Color.white);
        dinput.setForeground(Color.black);
        depositFrame.add(dinput);

        //Button

        Button back = new Button("BACK");
        back.setBounds(30,50,90,30);
        back.setFont(new Font("Arial",Font.BOLD,20));
        back.setBackground(Color.RED);
        back.setForeground(Color.black);
        depositFrame.add(back);


        Button b1 = new Button("1");
        b1.setBounds(50,190,100,70);
        b1.setFont(new Font("Arial",Font.BOLD,20));
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.black);
        depositFrame.add(b1);

        Button b2 = new Button("2");
        b2.setBounds(175,190,100,70);
        b2.setFont(new Font("Arial",Font.BOLD,20));
        b2.setBackground(Color.yellow);
        b2.setForeground(Color.black);
        depositFrame.add(b2);

        Button b3 = new Button("3");
        b3.setBounds(300,190,100,70);
        b3.setFont(new Font("Arial",Font.BOLD,20));
        b3.setBackground(Color.yellow);
        b3.setForeground(Color.black);
        depositFrame.add(b3);

        Button b4 = new Button("4");
        b4.setBounds(50,285,100,70);
        b4.setFont(new Font("Arial",Font.BOLD,20));
        b4.setBackground(Color.yellow);
        b4.setForeground(Color.black);
        depositFrame.add(b4);

        Button b5 = new Button("5");
        b5.setBounds(175,285,100,70);
        b5.setFont(new Font("Arial",Font.BOLD,20));
        b5.setBackground(Color.yellow);
        b5.setForeground(Color.black);
        depositFrame.add(b5);

        Button b6 = new Button("6");
        b6.setBounds(300,285,100,70);
        b6.setFont(new Font("Arial",Font.BOLD,20));
        b6.setBackground(Color.yellow);
        b6.setForeground(Color.black);
        depositFrame.add(b6);

        Button b7 = new Button("7");
        b7.setBounds(50,380,100,70);
        b7.setFont(new Font("Arial",Font.BOLD,20));
        b7.setBackground(Color.yellow);
        b7.setForeground(Color.black);
        depositFrame.add(b7);

        Button b8 = new Button("8");
        b8.setBounds(175,380,100,70);
        b8.setFont(new Font("Arial",Font.BOLD,20));
        b8.setBackground(Color.yellow);
        b8.setForeground(Color.black);
        depositFrame.add(b8);

        Button b9 = new Button("9");
        b9.setBounds(300,380,100,70);
        b9.setFont(new Font("Arial",Font.BOLD,20));
        b9.setBackground(Color.yellow);
        b9.setForeground(Color.black);
        depositFrame.add(b9);

        Button bd = new Button(".");
        bd.setBounds(50,475,100,70);
        bd.setFont(new Font("Arial",Font.BOLD,30));
        bd.setBackground(Color.yellow);
        bd.setForeground(Color.black);
        depositFrame.add(bd);

        Button b0 = new Button("0");
        b0.setBounds(175,475,100,70);
        b0.setFont(new Font("Arial",Font.BOLD,20));
        b0.setBackground(Color.yellow);
        b0.setForeground(Color.black);
        depositFrame.add(b0);

        Button bback = new Button("Bckspace");
        bback.setBounds(300,475,100,70);
        bback.setFont(new Font("Arial",Font.BOLD,20));
        bback.setBackground(Color.yellow);
        bback.setForeground(Color.black);
        depositFrame.add(bback);

        Button be = new Button("Enter");
        be.setBounds(50,570,350,70);
        be.setFont(new Font("Arial",Font.BOLD,20));
        be.setBackground(Color.yellow);
        be.setForeground(Color.black);
        depositFrame.add(be);

        depositFrame.setVisible(true);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dinput.setText(dinput.getText()+"1");
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dinput.setText(dinput.getText()+"2");
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dinput.setText(dinput.getText()+"3");
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dinput.setText(dinput.getText()+"4");
            }
        });
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dinput.setText(dinput.getText()+"5");
            }
        });
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dinput.setText(dinput.getText()+"6");
            }
        });
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dinput.setText(dinput.getText()+"7");
            }
        });
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dinput.setText(dinput.getText()+"8");
            }
        });
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dinput.setText(dinput.getText()+"9");
            }
        });
        b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dinput.setText(dinput.getText()+"0");
            }
        });
        bd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dinput.setText(dinput.getText()+".");
            }
        });
        bback.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String currentText = dinput.getText();
                if(currentText.length()>0){
                    dinput.setText(currentText.substring(0,currentText.length()-1));
                }
            }
        });
        be.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String cText = dinput.getText();
                if(cText.length()>0){
                double amount = Double.parseDouble(dinput.getText());
                double newBalance = account.getBalance() + amount;
                dinput.setText("Deposited: "+ amount);
                account.newBal(newBalance);
            }}
        });

        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               ATM t = new ATM(account);
               t.window();
               depositFrame.dispose();
            }
        });

        depositFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                depositFrame.dispose();
            }
        });
    }
}
class currentBalance extends ATM{
    bankAccount account;
    currentBalance(bankAccount account){
        this.account = account;
    }
    public void currentBalance(){
        Frame balanceFrame = new Frame("Current Balance");
        balanceFrame.setSize(450,570);
        balanceFrame.setLayout(null);
        balanceFrame.setBackground(new Color(120,200,200));

        //Title

        Label cbtitle = new Label("Current Balance",Label.CENTER);
        cbtitle.setBounds(75,80,300,50);
        cbtitle.setFont(new Font("Arial",Font.BOLD,28));
        cbtitle.setForeground(new Color(40,70,120));
        balanceFrame.add(cbtitle);

        //Text Field

        TextField cbinput = new TextField();
        cbinput.setBounds(50,150,350,65);
        cbinput.setFont(new Font("Arial",Font.PLAIN,25));
        cbinput.setBackground(Color.white);
        cbinput.setForeground(Color.black);
        balanceFrame.add(cbinput);

        //Button

        Button back = new Button("BACK");
        back.setBounds(30,50,90,30);
        back.setFont(new Font("Arial",Font.BOLD,20));
        back.setBackground(Color.RED);
        back.setForeground(Color.black);
        balanceFrame.add(back);

        Button cb = new Button("Check Balance");
        cb.setBounds(50,240,350,70);
        cb.setFont(new Font("Arial",Font.BOLD,20));
        cb.setBackground(Color.yellow);
        cb.setForeground(Color.black);
        balanceFrame.add(cb);

        balanceFrame.setVisible(true);

        cb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               cbinput.setText("Current Balance: "+ account.getBalance());
            }
        });

        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               ATM t = new ATM(account);
               t.window();
               balanceFrame.dispose();
            }
        });


        balanceFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                balanceFrame.dispose();
            }
        });
    }
}

class bankAccount{
    private double balance;
    public void newBal(double newBalance){
        balance = newBalance;
    }
    public double getBalance(){
        return balance;
    }

}