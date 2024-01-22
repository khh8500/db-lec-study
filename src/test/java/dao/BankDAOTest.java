package dao;

import model.Account;
import org.junit.jupiter.api.Test;

import java.util.List;


public class BankDAOTest {

    @Test
    public void selectAll_test() {
        // given

        // when
        BankDAO dao = new BankDAO();
        List<Account> accountList = dao.selectAll();

        System.out.println(accountList.size());
        System.out.println(accountList);
    }

    @Test
    public void selectByNumber_test() {
        int number = 6;

        BankDAO dao = new BankDAO();
        Account account = dao.selectByNumber(number);

        if (account == null) {
            System.out.println(number + "로 조회된 값이 없습니다");
        }else {
            System.out.println(account);
//            System.out.println(account.getNumber());
//            System.out.println(account.getPassword());
//            System.out.println(account.getBalance());
//            System.out.println(account.getCreatedAt());
        }
    }

    @Test
    public void ubdateByNumber_test() {
        // given
        int balance = 2000;
        int number = 1;


        // when
        BankDAO dao = new BankDAO();
        int result = dao.updateByNumber(2000, 4);

        // then
        if (result == 1) {
            System.out.println("성공");
        }else {
            System.out.println("실패");
        }
    }
}
