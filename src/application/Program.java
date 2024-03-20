package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== Begin TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("=== End   TEST 1: seller findById ===\n");

		System.out.println("=== Begin TEST 2: seller findByDepartment ===");
		Department department = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("=== End   TEST 2: seller findByDepartment ===\n");

		System.out.println("=== Begin TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("=== End   TEST 3: seller findAll ===\n");
		
		System.out.println("=== Begin TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Gregor", "gregor@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		System.out.println("=== End   TEST 4: seller insert ===\n");
		
		System.out.println("=== Begin TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");		
		sellerDao.update(seller);		
		System.out.println("Update completed!");
		System.out.println("=== End   TEST 5: seller update ===\n");
		
		System.out.println("=== Begin TEST 6: seller delete ===");
		System.out.println("Enter Id for delete test: ");
		int id = sc.nextInt();	
		sellerDao.deleteById(id);		
		System.out.println("Delete completed!");
		System.out.println("=== End   TEST 6: seller delete ===\n");
		
		sc.close();
	}

}
