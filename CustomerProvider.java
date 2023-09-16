package Homework4;

public class CustomerProvider {
    private DataBase dataBase;

    public CustomerProvider(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public Customer getCustomer(String login, String password) throws Exception {
        if (login != null && password != null) {
            return new Customer();
        }
        throw new RuntimeException("Неверно введены данные");
    }
}

