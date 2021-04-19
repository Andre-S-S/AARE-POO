package br.com;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class CashMachine {
    
    String agency;
    int terminal;
    int control;
    String hours;
    String date;
    int numberNoteHundred;
    int numberNoteFifty;
    int numberNoteTwenty;
    int numberNoteTen;
    
    void InsertBallots() {
        if (numberNoteHundred > 0) {
            System.out.println("Cédulas de R$100,00 disponível: " + numberNoteHundred);
        }
        if (numberNoteFifty > 0) {
            System.out.println("Cédulas de R$50,00 disponível: " + numberNoteFifty);
        }
        if (numberNoteTwenty > 0) {
            System.out.println("Cédulas de R$20,00 disponível: " + numberNoteTwenty);
        }
        if (numberNoteTen > 0) {
            System.out.println("Cédulas de R$10,00 disponível: " + numberNoteTen);
        } 
    }
    
    double withdraw(double withdrawalAmount) {
        if (withdrawalAmount <= 0) {
            System.out.println("Saldo insuficiente para essa operação!");
        }
        
        int noteHundred;
        int noteFifty;
        int noteTwenty;
        int noteTen;
        
        noteHundred = (int) (withdrawalAmount / 100);
        withdrawalAmount %= 100;
        numberNoteHundred -= noteHundred;
        
        noteFifty = (int) (withdrawalAmount / 50);
        withdrawalAmount %= 50;
        numberNoteFifty -= noteFifty;
        
        noteTwenty = (int) (withdrawalAmount / 20);
        withdrawalAmount %= 20;
        numberNoteTwenty -= noteTwenty;
                
        noteTen = (int) (withdrawalAmount / 10);
        withdrawalAmount %= 10;
        numberNoteTen -= noteTen;
                
        InsertBallots();
        
        return withdrawalAmount; 
        
    }
    
    double deposit(double depositedAmount) {
        if (depositedAmount < 10) {
            System.out.println("Não pode ser efetuado este depósito, valor minimo R$10,00!");
        }
        
        int noteHundred;
        int noteFifty;
        int noteTwenty;
        int noteTen;
        
        noteHundred = (int) (depositedAmount / 100);
        depositedAmount %= 100; 
        numberNoteHundred += noteHundred;
        
        noteFifty = (int) (depositedAmount / 50);
        depositedAmount %= 50;
        numberNoteFifty += noteFifty;
        
        noteTwenty = (int) (depositedAmount / 20);
        depositedAmount %= 20;
        numberNoteTwenty += noteTwenty;
        
        noteTen = (int) (depositedAmount / 10);
        depositedAmount %= 10;
        numberNoteTen += noteTen;
        
        InsertBallots();
        
        return depositedAmount;
        
    }
    
    public static void main(String[] args) {
        
        Date dateHourCurrent = new Date();
        Scanner read = new Scanner(System.in);
        
        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();
        CashMachine cashMachineThree = new CashMachine();
        
        System.out.print("[1]Banco do Brasil  \n"
                       + "[2]Caixa Econômica Federal \n"
                       + "[3]Banco do Itaú \n"
                       + "Qual agência deseja utilizar: ");
        
        int choice = read.nextInt();
        
        System.out.println("------------------------------------------------");
        
        switch (choice) {
            case 1:
                cashMachineOne.agency = "Banco do Brasil";
                cashMachineOne.terminal = 12345678;
                cashMachineOne.control = 123789456;
                cashMachineOne.date = new SimpleDateFormat("dd/MM/yyyy").format(dateHourCurrent);
                cashMachineOne.hours = new SimpleDateFormat("HH:mm:ss").format(dateHourCurrent);
                cashMachineOne.numberNoteHundred = 20;
                cashMachineOne.numberNoteFifty = 10;
                cashMachineOne.numberNoteTwenty = 5;
                cashMachineOne.numberNoteTen = 5;
                
                cashMachineOne.InsertBallots();
                
                System.out.println("Agência: " + cashMachineOne.agency);
                System.out.println("Terminal: " + cashMachineOne.terminal);
                System.out.println("Controle: " + cashMachineOne.control);
                System.out.println("Data: " + cashMachineOne.date);
                System.out.println("Hora: " + cashMachineOne.hours);  
                break;
                
            case 2:    
                cashMachineTwo.agency = "Caixa Econômica Federal";
                cashMachineTwo.terminal = 12345645;
                cashMachineTwo.control = 123789489;
                cashMachineTwo.date = new SimpleDateFormat("dd/MM/yyyy").format(dateHourCurrent);
                cashMachineTwo.hours = new SimpleDateFormat("HH:mm:ss").format(dateHourCurrent);
                cashMachineTwo.numberNoteHundred = 10;
                cashMachineTwo.numberNoteFifty = 10;
                cashMachineTwo.numberNoteTwenty = 9;
                cashMachineTwo.numberNoteTen = 5;
                
                cashMachineTwo.InsertBallots();
                
                System.out.println("Agência: " + cashMachineTwo.agency);
                System.out.println("Terminal: " + cashMachineTwo.terminal);
                System.out.println("Controle: " + cashMachineTwo.control);
                System.out.println("Data: " + cashMachineTwo.date);
                System.out.println("Hora: " + cashMachineTwo.hours);    
                break;
                
            case 3:    
                cashMachineThree.agency = "Banco do Itaú";
                cashMachineThree.terminal = 12345612;
                cashMachineThree.control = 123789412;
                cashMachineThree.date = new SimpleDateFormat("dd/MM/yyyy").format(dateHourCurrent);
                cashMachineThree.hours = new SimpleDateFormat("HH:mm:ss").format(dateHourCurrent);
                cashMachineThree.numberNoteHundred = 10;
                cashMachineThree.numberNoteFifty = 20;
                cashMachineThree.numberNoteTwenty = 30;
                cashMachineThree.numberNoteTen = 40;
                
                cashMachineThree.InsertBallots();
                
                System.out.println("Agência: " + cashMachineThree.agency);
                System.out.println("Terminal: " + cashMachineThree.terminal);
                System.out.println("Controle: " + cashMachineThree.control);
                System.out.println("Data: " + cashMachineThree.date);
                System.out.println("Hora: " + cashMachineThree.hours);    
                break;
        } 
        
        System.out.println("------------------------------------------------");
        System.out.print("Deseja fazer um saque[1] ou depósito[2]? [1 / 2] ");
        int option = read.nextInt();
        
        switch (option) {
            case 1:
                System.out.print("Digite o valor do saque: R$");
                double withdrawalAmount = read.nextDouble();
                switch (choice) {
                    case 1:
                        cashMachineOne.withdraw(withdrawalAmount);
                        break;

                    case 2:
                        cashMachineTwo.withdraw(withdrawalAmount);
                        break;

                    case 3:
                        cashMachineThree.withdraw(withdrawalAmount);
                        break;
                }
                break;
                
            case 2:
                System.out.print("Digite o valor do depósito: R$");
                double depositedAmount = read.nextDouble();
                switch (choice) {
                    case 1:
                        cashMachineOne.deposit(depositedAmount);
                        break;
                        
                    case 2:
                        cashMachineTwo.deposit(depositedAmount);
                        break;
                        
                    case 3:
                        cashMachineThree.deposit(depositedAmount);
                        break;
                }
                break;
        }     
    }  
}
