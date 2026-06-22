package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository{
    public void findCustomerById(){
        System.out.println("Finding from Repository Impl");
    }
}
