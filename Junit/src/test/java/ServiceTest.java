
import org.example.ExtApiMockExp;
import org.example.ServiceMockExp;
import org.testng.annotations.Test;


import static org.mockito.Mockito.*;
import static org.testng.AssertJUnit.assertEquals;

public class ServiceTest {
    @Test
    public void testApi(){
        //Mocking
        ExtApiMockExp mock= mock(ExtApiMockExp.class);
        //Stubbbing
        when(mock.getData()).thenReturn("Mock");
        ServiceMockExp service=new ServiceMockExp(mock);
        assertEquals(service.fetchData(),"Mock");
        assertEquals(service.fetchData(),"Mock");
        // Verifying Interactions
        verify(mock,times(2)).getData();

    }
}
