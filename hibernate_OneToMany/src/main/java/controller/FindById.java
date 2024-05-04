package controller;

import dao.CompanyDao;

public class FindById {

	public static void main(String[] args) {


		CompanyDao companyDao=new CompanyDao();
		companyDao.findById(1);
	}

}
