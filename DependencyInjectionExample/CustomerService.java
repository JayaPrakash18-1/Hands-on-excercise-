package DependencyInjectionExample;

public class CustomerService{
    CustomerRepository cr;
    public CustomerService(CustomerRepository cr){
        this.cr=cr;
    }
    public void findCustomerById(){
        cr.findCustomerById();
    }
}
