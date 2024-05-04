package controller;

import dao.CompanyDao;

public class DeleteById {

	public static void main(String[] args) {


		CompanyDao companyDao=new CompanyDao();
		companyDao.deleteById(1);
	}

}
