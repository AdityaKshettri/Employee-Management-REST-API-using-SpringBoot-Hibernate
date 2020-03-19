package SpringBoot.CRUDdemo.service;

import SpringBoot.CRUDdemo.dao.EmployeeDAO;
import SpringBoot.CRUDdemo.entity.Employee;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    private EmployeeDAO employeeDAO;
    
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO)
    {
        employeeDAO = theEmployeeDAO;
    }
    
    @Override
    @Transactional
    public List<Employee> findAll() 
    {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int theId) 
    {
        return employeeDAO.findById(theId);
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) 
    {
        employeeDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) 
    {
        employeeDAO.deleteById(theId);
    }
}
