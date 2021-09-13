package com.alphabank.work4;

import java.io.IOException;

public class Runner {
    public void run(String[] args) throws IOException {
        AccountingUser user = new AccountingUser();
        user.addUsers("Sidorov");
        user.addUsers("Danilina");
        user.addUsers("Govga");
        user.addUsers("Danilina");

        user.printFile();
        user.finalize();

    }
}
