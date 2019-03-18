package application;

import view.MessageBoardMenu;

public class MessageBoardApp {


    private void run() {

        MessageBoardMenu msgBrdMenu = new MessageBoardMenu();

        msgBrdMenu.displayMessageBoardMenu();

    }

    public static void main(String[] args){

        MessageBoardApp myApp = new MessageBoardApp();

        myApp.run();

    }
}
