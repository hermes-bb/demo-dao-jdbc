package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== Begin TEST: department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		System.out.println("=== End   TEST: department findById ===\n");

		System.out.println("=== Begin TEST: department findAll ===");
		List<Department> list = departmentDao.findAll();
		System.out.println(list);
		System.out.println("=== End   TEST: department findAll ===\n");

		/*
		System.out.println("=== Begin TEST: department insert ==="); Department
		newDepartment = new Department(null, "D3");
		departmentDao.insert(newDepartment); 
		System.out.println("Inserted! New id = " + newDepartment.getId());
		System.out.println("=== End   TEST: department insert ===\n");
		*/
		
		/*
		System.out.println("=== Begin TEST: department update ==="); department =
		departmentDao.findById(9); 
		department.setName("Departamento 9");
		departmentDao.update(department);
		departmentDao.findById(6); 
		department.setName("Departamento 6");
		departmentDao.update(department);
		departmentDao.findById(8); 
		department.setName("Departamento 8");
		departmentDao.update(department);
		departmentDao.findById(9); 
		department.setName("Departamento 9");
		departmentDao.update(department);
		System.out.println("Update completed!");
		System.out.println("=== End   TEST: department update ===\n");
		*/
		
		System.out.println("=== Begin TEST: department findAll ===");
		List<Department> list1 = departmentDao.findAll();
		System.out.println(list1);
		System.out.println("=== End   TEST: department findAll ===\n");

		System.out.println("=== Begin TEST: department delete ===");
		System.out.println("Enter Id for delete test: "); int id = sc.nextInt();
		departmentDao.deleteById(id); System.out.println("Delete completed!");
		System.out.println("=== End   TEST: department delete ===\n");

		sc.close();
	}

}
