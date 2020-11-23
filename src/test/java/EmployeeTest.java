import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void setUp(){
        employee = new Developer("Graham Grahamson", "GG696969", 69699.69);
    }

    @Test
    public void employeeCanHaveName(){
        assertEquals("Graham Grahamson", employee.getName());
    }

    @Test
    public void employeeCanHaveNiNumber(){
        assertEquals("GG696969", employee.getNumber());
    }

    @Test
    public void employeeHasSalary(){
        assertEquals(69699.69, employee.getSalary(), 0.01);
    }

}
