import controller.BankController;
import dao.BankDAO;
import model.Account;

import java.util.List;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        String url = "/select-all";

        BankDAO dao = new BankDAO();
        BankController con = new BankController(dao); // 디펜던시 인젝션
        Dispatcher dis = new Dispatcher(con);
        dis.route(url);
    }
}