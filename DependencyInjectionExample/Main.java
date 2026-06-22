package DependencyInjectionExample;

public class Main {
    public static void main(String[] args) {
        CustomerRepository cr=new CustomerRepositoryImpl();
        CustomerService cs=new CustomerService(cr);
        cs.findCustomerById();
    }
}
